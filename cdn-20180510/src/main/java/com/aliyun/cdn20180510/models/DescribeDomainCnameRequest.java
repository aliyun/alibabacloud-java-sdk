// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainCnameRequest extends TeaModel {
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
