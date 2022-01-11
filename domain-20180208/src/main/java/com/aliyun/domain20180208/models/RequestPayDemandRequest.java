// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class RequestPayDemandRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("Message")
    public String message;

    @NameInMap("Price")
    public Float price;

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
