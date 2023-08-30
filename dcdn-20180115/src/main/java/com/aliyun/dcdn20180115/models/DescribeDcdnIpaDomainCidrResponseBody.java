// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnIpaDomainCidrResponseBody extends TeaModel {
    @NameInMap("Cidr")
    public java.util.List<String> cidr;

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
