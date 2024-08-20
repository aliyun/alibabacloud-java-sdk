// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnIpaDomainCidrResponseBody extends TeaModel {
    /**
     * <p>The back-to-origin IPv4 and IPv6 CIDR blocks.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;1.1.1.0/24&quot;,&quot;2.2.2.0/24&quot;,&quot;1111:2222:3333:4444:5555:0:0:0/80&quot;]</p>
     */
    @NameInMap("Cidr")
    public java.util.List<String> cidr;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDcdnIpaDomainCidrResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnIpaDomainCidrResponseBody self = new DescribeDcdnIpaDomainCidrResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnIpaDomainCidrResponseBody setCidr(java.util.List<String> cidr) {
        this.cidr = cidr;
        return this;
    }
    public java.util.List<String> getCidr() {
        return this.cidr;
    }

    public DescribeDcdnIpaDomainCidrResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
