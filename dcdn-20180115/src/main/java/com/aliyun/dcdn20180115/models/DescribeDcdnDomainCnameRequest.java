// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainCnameRequest extends TeaModel {
    /**
     * <p>The names of the accelerated domains. If you need to specify multiple accelerated domain names, separate them with commas (,).</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    public static DescribeDcdnDomainCnameRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainCnameRequest self = new DescribeDcdnDomainCnameRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainCnameRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

}
