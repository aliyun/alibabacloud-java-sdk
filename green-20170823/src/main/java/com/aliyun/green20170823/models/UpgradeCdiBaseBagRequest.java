// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class UpgradeCdiBaseBagRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("CommodityCode")
    public String commodityCode;

    @NameInMap("FlowOutSpec")
    public Integer flowOutSpec;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static UpgradeCdiBaseBagRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeCdiBaseBagRequest self = new UpgradeCdiBaseBagRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeCdiBaseBagRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpgradeCdiBaseBagRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public UpgradeCdiBaseBagRequest setFlowOutSpec(Integer flowOutSpec) {
        this.flowOutSpec = flowOutSpec;
        return this;
    }
    public Integer getFlowOutSpec() {
        return this.flowOutSpec;
    }

    public UpgradeCdiBaseBagRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpgradeCdiBaseBagRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public UpgradeCdiBaseBagRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
