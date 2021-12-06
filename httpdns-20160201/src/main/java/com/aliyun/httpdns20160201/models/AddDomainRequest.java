// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.httpdns20160201.models;

import com.aliyun.tea.*;

public class AddDomainRequest extends TeaModel {
    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("DomainName")
    public String domainName;

    public static AddDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDomainRequest self = new AddDomainRequest();
        return TeaModel.build(map, self);
    }

    public AddDomainRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public AddDomainRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

}
