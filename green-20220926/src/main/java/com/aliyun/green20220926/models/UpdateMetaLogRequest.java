// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class UpdateMetaLogRequest extends TeaModel {
    /**
     * <p>The commodity code.</p>
     * 
     * <strong>example:</strong>
     * <p>lvwang_guardrail_public_cn</p>
     */
    @NameInMap("CommodityCode")
    public String commodityCode;

    /**
     * <p>The delivery region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("DeliveryRegion")
    public String deliveryRegion;

    /**
     * <p>The storage capacity.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Storage")
    public Long storage;

    /**
     * <p>The time to live.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("Ttl")
    public Integer ttl;

    public static UpdateMetaLogRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMetaLogRequest self = new UpdateMetaLogRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMetaLogRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public UpdateMetaLogRequest setDeliveryRegion(String deliveryRegion) {
        this.deliveryRegion = deliveryRegion;
        return this;
    }
    public String getDeliveryRegion() {
        return this.deliveryRegion;
    }

    public UpdateMetaLogRequest setStorage(Long storage) {
        this.storage = storage;
        return this;
    }
    public Long getStorage() {
        return this.storage;
    }

    public UpdateMetaLogRequest setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

}
