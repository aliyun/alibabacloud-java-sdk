// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeL2VipsByDomainResponseBody extends TeaModel {
    /**
     * <p>The domain name.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of VIPs.</p>
     */
    @NameInMap("Vips")
    public DescribeL2VipsByDomainResponseBodyVips vips;

    public static DescribeL2VipsByDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeL2VipsByDomainResponseBody self = new DescribeL2VipsByDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeL2VipsByDomainResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeL2VipsByDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeL2VipsByDomainResponseBody setVips(DescribeL2VipsByDomainResponseBodyVips vips) {
        this.vips = vips;
        return this;
    }
    public DescribeL2VipsByDomainResponseBodyVips getVips() {
        return this.vips;
    }

    public static class DescribeL2VipsByDomainResponseBodyVips extends TeaModel {
        @NameInMap("Vip")
        public java.util.List<String> vip;

        public static DescribeL2VipsByDomainResponseBodyVips build(java.util.Map<String, ?> map) throws Exception {
            DescribeL2VipsByDomainResponseBodyVips self = new DescribeL2VipsByDomainResponseBodyVips();
            return TeaModel.build(map, self);
        }

        public DescribeL2VipsByDomainResponseBodyVips setVip(java.util.List<String> vip) {
            this.vip = vip;
            return this;
        }
        public java.util.List<String> getVip() {
            return this.vip;
        }

    }

}
