// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceSpecRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic payment. Default value: true. Valid values:</p>
     * <br>
     * <p>*   **true**: enables automatic payment. Make sure that your Alibaba Cloud account has a sufficient balance.</p>
     * <p>*   **false**: disables automatic payment. You can perform the following operations to pay for the instance: Log on to the ApsaraDB for MongoDB console. In the upper-right corner of the page, choose **Expenses** > **User Center**. In the left-side navigation pane, choose **Order Management** > **Order**. On the **Orders for Services** tab, find the order and pay for the order.</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The business information.</p>
     */
    @NameInMap("BusinessInfo")
    public String businessInfo;

    /**
     * <p>The coupon code. Default value: `youhuiquan_promotion_option_id_for_blank`.</p>
     */
    @NameInMap("CouponNo")
    public String couponNo;

    /**
     * <p>The instance type. For more information, see [Instance types](~~57141~~). You can also call the [DescribeAvailableResource](~~149719~~) operation to view instance types.</p>
     * <br>
     * <p>> You must specify at least one of the DBInstanceClass and **DBInstanceStorage** parameters.</p>
     */
    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The storage capacity of the instance. Valid values: 10 to 3000. The value must be a multiple of 10. Unit: GB. The values that can be specified for this parameter are subject to the instance types. For more information, see [Instance types](~~57141~~).</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   You must specify at least one of the DBInstanceStorage and **DBInstanceClass** parameters.</p>
     * <br>
     * <p>*   Storage capacity can be scaled down only for pay-as-you-go replica set instances. The new storage capacity you specify must be greater than the used storage capacity.</p>
     */
    @NameInMap("DBInstanceStorage")
    public String DBInstanceStorage;

    /**
     * <p>The time when the changed configurations take effect. Default value: Immediately. Valid values:</p>
     * <br>
     * <p>*   **Immediately**: The configurations immediately take effect.</p>
     * <p>*   **MaintainTime**: The configurations take effect during the maintenance window of the instance.</p>
     */
    @NameInMap("EffectiveTime")
    public String effectiveTime;

    /**
     * <p>Additional parameter</p>
     */
    @NameInMap("ExtraParam")
    public String extraParam;

    /**
     * <p>The type of the configuration change. Default value: DOWNGRADE. Valid values:</p>
     * <br>
     * <p>*   **UPGRADE**</p>
     * <p>*   **DOWNGRADE**</p>
     * <br>
     * <p>> This parameter can be configured only when the billing method of the instance is subscription.</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of read-only nodes. Valid values: **0** to **5**.</p>
     * <br>
     * <p>If your instance has only **Classic Network** and **VPC** endpoints, you must apply for a public endpoint or release the classic network endpoint for the instance before you can change the **Read-only Nodes** value.</p>
     * <br>
     * <p>> You can go to the **Database Connections** page to view the types of networks that are enabled.</p>
     */
    @NameInMap("ReadonlyReplicas")
    public String readonlyReplicas;

    /**
     * <p>The number of nodes in the instance.</p>
     * <br>
     * <p>*   Valid values of replica set instances: **3**, **5**, and **7**</p>
     * <p>*   Valid values of standalone instances: **1**</p>
     * <br>
     * <p>> This parameter is not required for a serverless instance which is only available on the China site (aliyun.com).</p>
     */
    @NameInMap("ReplicationFactor")
    public String replicationFactor;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyDBInstanceSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceSpecRequest self = new ModifyDBInstanceSpecRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceSpecRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public ModifyDBInstanceSpecRequest setBusinessInfo(String businessInfo) {
        this.businessInfo = businessInfo;
        return this;
    }
    public String getBusinessInfo() {
        return this.businessInfo;
    }

    public ModifyDBInstanceSpecRequest setCouponNo(String couponNo) {
        this.couponNo = couponNo;
        return this;
    }
    public String getCouponNo() {
        return this.couponNo;
    }

    public ModifyDBInstanceSpecRequest setDBInstanceClass(String DBInstanceClass) {
        this.DBInstanceClass = DBInstanceClass;
        return this;
    }
    public String getDBInstanceClass() {
        return this.DBInstanceClass;
    }

    public ModifyDBInstanceSpecRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyDBInstanceSpecRequest setDBInstanceStorage(String DBInstanceStorage) {
        this.DBInstanceStorage = DBInstanceStorage;
        return this;
    }
    public String getDBInstanceStorage() {
        return this.DBInstanceStorage;
    }

    public ModifyDBInstanceSpecRequest setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }
    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    public ModifyDBInstanceSpecRequest setExtraParam(String extraParam) {
        this.extraParam = extraParam;
        return this;
    }
    public String getExtraParam() {
        return this.extraParam;
    }

    public ModifyDBInstanceSpecRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public ModifyDBInstanceSpecRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyDBInstanceSpecRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDBInstanceSpecRequest setReadonlyReplicas(String readonlyReplicas) {
        this.readonlyReplicas = readonlyReplicas;
        return this;
    }
    public String getReadonlyReplicas() {
        return this.readonlyReplicas;
    }

    public ModifyDBInstanceSpecRequest setReplicationFactor(String replicationFactor) {
        this.replicationFactor = replicationFactor;
        return this;
    }
    public String getReplicationFactor() {
        return this.replicationFactor;
    }

    public ModifyDBInstanceSpecRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDBInstanceSpecRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
