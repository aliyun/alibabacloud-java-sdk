// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeUserVipsByDomainResponseBody extends TeaModel {
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
    public DescribeUserVipsByDomainResponseBodyVips vips;

    public static DescribeUserVipsByDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserVipsByDomainResponseBody self = new DescribeUserVipsByDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserVipsByDomainResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeUserVipsByDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUserVipsByDomainResponseBody setVips(DescribeUserVipsByDomainResponseBodyVips vips) {
        this.vips = vips;
        return this;
    }
    public DescribeUserVipsByDomainResponseBodyVips getVips() {
        return this.vips;
    }

    public static class DescribeUserVipsByDomainResponseBodyVips extends TeaModel {
        @NameInMap("Vip")
        public java.util.List<String> vip;

        public static DescribeUserVipsByDomainResponseBodyVips build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserVipsByDomainResponseBodyVips self = new DescribeUserVipsByDomainResponseBodyVips();
            return TeaModel.build(map, self);
        }

        public DescribeUserVipsByDomainResponseBodyVips setVip(java.util.List<String> vip) {
            this.vip = vip;
            return this;
        }
        public java.util.List<String> getVip() {
            return this.vip;
        }

    }

}
