// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsRegionIdIpv6InfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SupportIpv6Info")
    @Validation(required = true)
    public DescribeEnsRegionIdIpv6InfoResponseSupportIpv6Info supportIpv6Info;

    public static DescribeEnsRegionIdIpv6InfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnsRegionIdIpv6InfoResponse self = new DescribeEnsRegionIdIpv6InfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEnsRegionIdIpv6InfoResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEnsRegionIdIpv6InfoResponse setSupportIpv6Info(DescribeEnsRegionIdIpv6InfoResponseSupportIpv6Info supportIpv6Info) {
        this.supportIpv6Info = supportIpv6Info;
        return this;
    }
    public DescribeEnsRegionIdIpv6InfoResponseSupportIpv6Info getSupportIpv6Info() {
        return this.supportIpv6Info;
    }

    public static class DescribeEnsRegionIdIpv6InfoResponseSupportIpv6Info extends TeaModel {
        @NameInMap("SupportIpv6")
        @Validation(required = true)
        public Boolean supportIpv6;

        @NameInMap("EnsRegionId")
        @Validation(required = true)
        public String ensRegionId;

        public static DescribeEnsRegionIdIpv6InfoResponseSupportIpv6Info build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnsRegionIdIpv6InfoResponseSupportIpv6Info self = new DescribeEnsRegionIdIpv6InfoResponseSupportIpv6Info();
            return TeaModel.build(map, self);
        }

        public DescribeEnsRegionIdIpv6InfoResponseSupportIpv6Info setSupportIpv6(Boolean supportIpv6) {
            this.supportIpv6 = supportIpv6;
            return this;
        }
        public Boolean getSupportIpv6() {
            return this.supportIpv6;
        }

        public DescribeEnsRegionIdIpv6InfoResponseSupportIpv6Info setEnsRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

    }

}
