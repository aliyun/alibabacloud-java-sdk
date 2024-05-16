// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainCnameRequest extends TeaModel {
    /**
     * <p>The accelerated domain name that you want to query. Separate multiple domain names with commas (,). This parameter cannot be left empty.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    public static DescribeDomainCnameRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainCnameRequest self = new DescribeDomainCnameRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainCnameRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

}
