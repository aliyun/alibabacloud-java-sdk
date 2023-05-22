// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainPropertyRequest extends TeaModel {
    /**
     * <p>The ID of the request.</p>
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
