// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ModifyOrderDeliveryAddressRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LMALL20190325****</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeliveryAddress")
    public String deliveryAddress;

    /**
     * <strong>example:</strong>
     * <p>{\&quot;mobileNo\&quot;:\&quot;123****8965\&quot;}</p>
     */
    @NameInMap("ExtJson")
    public String extJson;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>53396****</p>
     */
    @NameInMap("LmOrderId")
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
