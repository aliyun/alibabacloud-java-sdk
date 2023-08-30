// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnIpaDomainCidrRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    public static DescribeDcdnIpaDomainCidrRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnIpaDomainCidrRequest self = new DescribeDcdnIpaDomainCidrRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnIpaDomainCidrRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

}
