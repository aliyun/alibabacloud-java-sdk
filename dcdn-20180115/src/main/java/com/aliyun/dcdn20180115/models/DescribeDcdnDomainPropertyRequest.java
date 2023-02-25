// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainPropertyRequest extends TeaModel {
    /**
     * <p>The accelerated domain name that you want to query. You can specify only one domain name in each call.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    public static DescribeDcdnDomainPropertyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainPropertyRequest self = new DescribeDcdnDomainPropertyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainPropertyRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

}
