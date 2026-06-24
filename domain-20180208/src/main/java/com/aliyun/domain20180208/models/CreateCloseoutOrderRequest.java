// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class CreateCloseoutOrderRequest extends TeaModel {
    @NameInMap("ContactId")
    public Long contactId;

    @NameInMap("DomainName")
    public String domainName;

    public static CreateCloseoutOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCloseoutOrderRequest self = new CreateCloseoutOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateCloseoutOrderRequest setContactId(Long contactId) {
        this.contactId = contactId;
        return this;
    }
    public Long getContactId() {
        return this.contactId;
    }

    public CreateCloseoutOrderRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

}
