// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class CreateFixedPriceSelectedOrderRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>DX123456</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>11935401</p>
     */
    @NameInMap("ContactId")
    public String contactId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20.00</p>
     */
    @NameInMap("ExpectedPrice")
    public Double expectedPrice;

    /**
     * <strong>example:</strong>
     * <p>partnername</p>
     */
    @NameInMap("Source")
    public String source;

    public static CreateFixedPriceSelectedOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFixedPriceSelectedOrderRequest self = new CreateFixedPriceSelectedOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateFixedPriceSelectedOrderRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateFixedPriceSelectedOrderRequest setContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }
    public String getContactId() {
        return this.contactId;
    }

    public CreateFixedPriceSelectedOrderRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public CreateFixedPriceSelectedOrderRequest setExpectedPrice(Double expectedPrice) {
        this.expectedPrice = expectedPrice;
        return this;
    }
    public Double getExpectedPrice() {
        return this.expectedPrice;
    }

    public CreateFixedPriceSelectedOrderRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
