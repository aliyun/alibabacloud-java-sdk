// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ModifyConsumptionTimestampRequest extends TeaModel {
    /**
     * <p>The ID of the Alibaba Cloud account. You do not need to specify this parameter because this parameter will be removed in the future.</p>
     * 
     * <strong>example:</strong>
     * <p>12323344****</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    /**
     * <p>The consumption checkpoint. The format is <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z. The time is displayed in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-10-15T17:20:03Z</p>
     */
    @NameInMap("ConsumptionTimestamp")
    public String consumptionTimestamp;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the change tracking instance. You can call the <strong>DescribeSubscriptionInstances</strong> operation to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dtsg2m10r1x15a****</p>
     */
    @NameInMap("SubscriptionInstanceId")
    public String subscriptionInstanceId;

    public static ModifyConsumptionTimestampRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyConsumptionTimestampRequest self = new ModifyConsumptionTimestampRequest();
        return TeaModel.build(map, self);
    }

    public ModifyConsumptionTimestampRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public ModifyConsumptionTimestampRequest setConsumptionTimestamp(String consumptionTimestamp) {
        this.consumptionTimestamp = consumptionTimestamp;
        return this;
    }
    public String getConsumptionTimestamp() {
        return this.consumptionTimestamp;
    }

    public ModifyConsumptionTimestampRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public ModifyConsumptionTimestampRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyConsumptionTimestampRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ModifyConsumptionTimestampRequest setSubscriptionInstanceId(String subscriptionInstanceId) {
        this.subscriptionInstanceId = subscriptionInstanceId;
        return this;
    }
    public String getSubscriptionInstanceId() {
        return this.subscriptionInstanceId;
    }

}
