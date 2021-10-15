// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ModifyOrderDeliveryAddressRequest extends TeaModel {
    @NameInMap("BizId")
    @Validation(required = true)
    public String bizId;

    @NameInMap("DeliveryAddress")
    @Validation(required = true)
    public String deliveryAddress;

    @NameInMap("ExtJson")
    public String extJson;

    @NameInMap("LmOrderId")
    @Validation(required = true)
    public Long lmOrderId;

    public static ModifyOrderDeliveryAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyOrderDeliveryAddressRequest self = new ModifyOrderDeliveryAddressRequest();
        return TeaModel.build(map, self);
    }

    public ModifyOrderDeliveryAddressRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ModifyOrderDeliveryAddressRequest setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
        return this;
    }
    public String getDeliveryAddress() {
        return this.deliveryAddress;
    }

    public ModifyOrderDeliveryAddressRequest setExtJson(String extJson) {
        this.extJson = extJson;
        return this;
    }
    public String getExtJson() {
        return this.extJson;
    }

    public ModifyOrderDeliveryAddressRequest setLmOrderId(Long lmOrderId) {
        this.lmOrderId = lmOrderId;
        return this;
    }
    public Long getLmOrderId() {
        return this.lmOrderId;
    }

}
