// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsRegionIdIpv6InfoResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3703C4AC-9396-458C-8F25-1D701334D309</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>IPv6 support information.</p>
     */
    @NameInMap("SupportIpv6Info")
    public DescribeEnsRegionIdIpv6InfoResponseBodySupportIpv6Info supportIpv6Info;

    public static DescribeEnsRegionIdIpv6InfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnsRegionIdIpv6InfoResponseBody self = new DescribeEnsRegionIdIpv6InfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEnsRegionIdIpv6InfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEnsRegionIdIpv6InfoResponseBody setSupportIpv6Info(DescribeEnsRegionIdIpv6InfoResponseBodySupportIpv6Info supportIpv6Info) {
        this.supportIpv6Info = supportIpv6Info;
        return this;
    }
    public DescribeEnsRegionIdIpv6InfoResponseBodySupportIpv6Info getSupportIpv6Info() {
        return this.supportIpv6Info;
    }

    public static class DescribeEnsRegionIdIpv6InfoResponseBodySupportIpv6Info extends TeaModel {
        /**
         * <p>The ID of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-chengdu-xxxx-4</p>
         */
        @NameInMap("EnsRegionId")
        public String ensRegionId;

        /**
         * <p>Specifies whether IPv6 is supported. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupportIpv6")
        public Boolean supportIpv6;

        public static DescribeEnsRegionIdIpv6InfoResponseBodySupportIpv6Info build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnsRegionIdIpv6InfoResponseBodySupportIpv6Info self = new DescribeEnsRegionIdIpv6InfoResponseBodySupportIpv6Info();
            return TeaModel.build(map, self);
        }

        public DescribeEnsRegionIdIpv6InfoResponseBodySupportIpv6Info setEnsRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        public DescribeEnsRegionIdIpv6InfoResponseBodySupportIpv6Info setSupportIpv6(Boolean supportIpv6) {
            this.supportIpv6 = supportIpv6;
            return this;
        }
        public Boolean getSupportIpv6() {
            return this.supportIpv6;
        }

    }

}
