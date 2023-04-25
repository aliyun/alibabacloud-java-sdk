// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnL2VipsRequest extends TeaModel {
    /**
     * <p>The domain name. You can specify only one domain name in each request. If you do not specify this parameter, the origin CIDR blocks of all domain names in your account in the whitelist are returned.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    public static DescribeDcdnL2VipsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnL2VipsRequest self = new DescribeDcdnL2VipsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnL2VipsRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

}
