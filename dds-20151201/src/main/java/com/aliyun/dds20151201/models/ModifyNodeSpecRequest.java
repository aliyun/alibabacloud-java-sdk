// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyNodeSpecRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic payment. Valid values:</p>
     * <br>
     * <p>*   **true** (default): enables automatic payment. Make sure that you have sufficient balance within your account.</p>
     * <p>*   **false**: disables automatic payment. In this case, you must manually pay for the instance.</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The business information. This is an additional parameter.</p>
     */
    @NameInMap("BusinessInfo")
    public String businessInfo;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The coupon code. Default value: `youhuiquan_promotion_option_id_for_blank`.</p>
     */
    @NameInMap("CouponNo")
    public String couponNo;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The time when the changed configurations take effect. Valid values:</p>
     * <br>
     * <p>*   **Immediately** (default): The new configurations immediately take effect</p>
     * <p>*   **MaintainTime**: The new configurations take effect during the maintenance window of the instance.</p>
     */
    @NameInMap("EffectiveTime")
    public String effectiveTime;

    /**
     * <p>The source of the request. Valid values:</p>
     * <br>
     * <p>*   **OpenApi**: the ApsaraDB for MongoDB API</p>
     * <p>*   **mongo_buy**: the ApsaraDB for MongoDB console</p>
     */
    @NameInMap("FromApp")
    public String fromApp;

    /**
     * <p>The specifications of the shard or mongos node. For more information, see [Instance types](~~57141~~).</p>
     */
    @NameInMap("NodeClass")
    public String nodeClass;

    /**
     * <p>The ID of the shard or mongos node in the sharded cluster instance. You can call the [DescribeDBInstanceAttribute](~~62010~~) operation to query the node ID.</p>
     * <br>
     * <p>> If you set this parameter to the ID of the shard node, you must also specify the **NodeStorage** parameter.</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The storage capacity of the shard node. Unit: GB.</p>
     * <br>
     * <p>*   Valid values are **10** to **2000** if the instance uses local SSDs.</p>
     * <p>*   Valid values are **20** to **16000** if the instance uses enhanced SSDs (ESSDs) at PL1.</p>
     * <br>
     * <p>> The value must be a multiple of 10.</p>
     */
    @NameInMap("NodeStorage")
    public Integer nodeStorage;

    /**
     * <p>The order type. Valid values:</p>
     * <br>
     * <p>*   **UPGRADE**</p>
     * <p>*   **DOWNGRADE**</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of read-only nodes in the shard node.</p>
     * <br>
     * <p>Valid values: **0** to **5**. The value must be an integer. Default value: **0**.</p>
     */
    @NameInMap("ReadonlyReplicas")
    public Integer readonlyReplicas;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The execution time. Specify the time in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.</p>
     */
    @NameInMap("SwitchTime")
    public String switchTime;

    public static ModifyNodeSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyNodeSpecRequest self = new ModifyNodeSpecRequest();
        return TeaModel.build(map, self);
    }

    public ModifyNodeSpecRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public ModifyNodeSpecRequest setBusinessInfo(String businessInfo) {
        this.businessInfo = businessInfo;
        return this;
    }
    public String getBusinessInfo() {
        return this.businessInfo;
    }

    public ModifyNodeSpecRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyNodeSpecRequest setCouponNo(String couponNo) {
        this.couponNo = couponNo;
        return this;
    }
    public String getCouponNo() {
        return this.couponNo;
    }

    public ModifyNodeSpecRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyNodeSpecRequest setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }
    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    public ModifyNodeSpecRequest setFromApp(String fromApp) {
        this.fromApp = fromApp;
        return this;
    }
    public String getFromApp() {
        return this.fromApp;
    }

    public ModifyNodeSpecRequest setNodeClass(String nodeClass) {
        this.nodeClass = nodeClass;
        return this;
    }
    public String getNodeClass() {
        return this.nodeClass;
    }

    public ModifyNodeSpecRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public ModifyNodeSpecRequest setNodeStorage(Integer nodeStorage) {
        this.nodeStorage = nodeStorage;
        return this;
    }
    public Integer getNodeStorage() {
        return this.nodeStorage;
    }

    public ModifyNodeSpecRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public ModifyNodeSpecRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyNodeSpecRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyNodeSpecRequest setReadonlyReplicas(Integer readonlyReplicas) {
        this.readonlyReplicas = readonlyReplicas;
        return this;
    }
    public Integer getReadonlyReplicas() {
        return this.readonlyReplicas;
    }

    public ModifyNodeSpecRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyNodeSpecRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyNodeSpecRequest setSwitchTime(String switchTime) {
        this.switchTime = switchTime;
        return this;
    }
    public String getSwitchTime() {
        return this.switchTime;
    }

}
