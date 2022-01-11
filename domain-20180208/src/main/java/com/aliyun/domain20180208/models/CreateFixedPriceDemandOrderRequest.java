// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class CreateFixedPriceDemandOrderRequest extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("ContactId")
    public String contactId;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("Source")
    public String source;

    public static CreateFixedPriceDemandOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFixedPriceDemandOrderRequest self = new CreateFixedPriceDemandOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateFixedPriceDemandOrderRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateFixedPriceDemandOrderRequest setContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }
    public String getContactId() {
        return this.contactId;
    }

    public CreateFixedPriceDemandOrderRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CreateFixedPriceDemandOrderRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
