// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class CreateIntlFixedPriceDomainOrderRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <strong>example:</strong>
     * <p>13350500</p>
     */
    @NameInMap("ContactId")
    public Long contactId;

    /**
     * <strong>example:</strong>
     * <p>appp16.com</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <strong>example:</strong>
     * <p>58.00</p>
     */
    @NameInMap("ExpectedPrice")
    public Long expectedPrice;

    public static CreateIntlFixedPriceDomainOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIntlFixedPriceDomainOrderRequest self = new CreateIntlFixedPriceDomainOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateIntlFixedPriceDomainOrderRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateIntlFixedPriceDomainOrderRequest setContactId(Long contactId) {
        this.contactId = contactId;
        return this;
    }
    public Long getContactId() {
        return this.contactId;
    }

    public CreateIntlFixedPriceDomainOrderRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CreateIntlFixedPriceDomainOrderRequest setExpectedPrice(Long expectedPrice) {
        this.expectedPrice = expectedPrice;
        return this;
    }
    public Long getExpectedPrice() {
        return this.expectedPrice;
    }

}
