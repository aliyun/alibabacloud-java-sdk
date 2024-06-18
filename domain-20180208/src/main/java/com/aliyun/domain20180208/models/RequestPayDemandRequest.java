// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class RequestPayDemandRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SE20183A0Q7C5556</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <strong>example:</strong>
     * <p>some message</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Price")
    public Float price;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ProduceType")
    public Integer produceType;

    public static RequestPayDemandRequest build(java.util.Map<String, ?> map) throws Exception {
        RequestPayDemandRequest self = new RequestPayDemandRequest();
        return TeaModel.build(map, self);
    }

    public RequestPayDemandRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public RequestPayDemandRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public RequestPayDemandRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RequestPayDemandRequest setPrice(Float price) {
        this.price = price;
        return this;
    }
    public Float getPrice() {
        return this.price;
    }

    public RequestPayDemandRequest setProduceType(Integer produceType) {
        this.produceType = produceType;
        return this;
    }
    public Integer getProduceType() {
        return this.produceType;
    }

}
