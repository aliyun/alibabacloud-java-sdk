// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class CreateIntlFixedPriceDomainOrderRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic payment. Valid values:</p>
     * <ul>
     * <li><p>false (default): manual payment.</p>
     * </li>
     * <li><p>true: automatic payment.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The contact ID.</p>
     * 
     * <strong>example:</strong>
     * <p>13350500</p>
     */
    @NameInMap("ContactId")
    public Long contactId;

    /**
     * <p>The domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>appp16.com</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The expected price.</p>
     * 
     * <strong>example:</strong>
     * <p>58.00</p>
     */
    @NameInMap("ExpectedPrice")
    public Long expectedPrice;

    @NameInMap("ProductType")
    public Integer productType;

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

    public CreateIntlFixedPriceDomainOrderRequest setProductType(Integer productType) {
        this.productType = productType;
        return this;
    }
    public Integer getProductType() {
        return this.productType;
    }

}
