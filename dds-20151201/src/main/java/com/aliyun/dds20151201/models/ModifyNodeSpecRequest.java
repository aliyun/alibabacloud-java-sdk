// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyNodeSpecRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically align the primary node to the primary zone after operations such as specification changes for multi-zone instances. If you choose not to align the node, one primary/secondary switchover (transient disconnection) is avoided. Default value: true.</p>
     */
    @NameInMap("AlignPrimaryZone")
    public Boolean alignPrimaryZone;

    /**
     * <p>Specifies whether to enable automatic payment. Valid values:</p>
     * <ul>
     * <li><strong>true</strong> (default): Automatic payment is enabled. Make sure that your account has sufficient balance.</li>
     * <li><strong>false</strong>: Manual payment is enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The additional parameter that contains business information.</p>
     * 
     * <strong>example:</strong>
     * <p>{“ActivityId&quot;:&quot;000000000&quot;}</p>
     */
    @NameInMap("BusinessInfo")
    public String businessInfo;

    /**
     * <p>The client token that is used to ensure the idempotence of the request and prevent duplicate submissions. You can generate the value of this parameter on the client side. Make sure that the value is unique across different requests and contains a maximum of 64 ASCII characters. The value cannot contain non-ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCz****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to use a coupon. Valid values:</p>
     * <ul>
     * <li><strong>default</strong> or <strong>null</strong> (default): Use a coupon.</li>
     * <li><strong>youhuiquan_promotion_option_id_for_blank</strong>: Do not use a coupon.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("CouponNo")
    public String couponNo;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dds-bp1c0b990184****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The effective period of the configuration change. Valid values: </p>
     * <ul>
     * <li><strong>Immediately</strong> (default): The configuration change takes effect immediately.</li>
     * <li><strong>MaintainTime</strong>: The configuration change takes effect within the maintenance window of the instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Immediately</p>
     */
    @NameInMap("EffectiveTime")
    public String effectiveTime;

    /**
     * <p>The source of the request. Valid values:</p>
     * <ul>
     * <li><strong>OpenApi</strong>: The request is sent from OpenAPI.</li>
     * <li><strong>mongo_buy</strong>: The request is sent from the console.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OpenApi</p>
     */
    @NameInMap("FromApp")
    public String fromApp;

    /**
     * <p>The specifications of the shard or mongos node. For more information, see <a href="https://help.aliyun.com/document_detail/57141.html">Instance specifications</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>dds.mongos.standard</p>
     */
    @NameInMap("NodeClass")
    public String nodeClass;

    /**
     * <p>The ID of the shard or mongos node in the sharded cluster instance. You can call the <a href="https://help.aliyun.com/document_detail/62010.html">DescribeDBInstanceAttribute</a> operation to query the node ID.</p>
     * <blockquote>
     * <p>If the value is a shard node ID, you must also specify the <strong>NodeStorage</strong> parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>s-bp143e1b1637****</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The storage space of the shard node. The step size is 10 GB.</p>
     * <ul>
     * <li>For local SSDs, valid values: <strong>10</strong> to <strong>2000</strong>.</li>
     * <li>For PL1 ESSDs, valid values: <strong>20</strong> to <strong>16000</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("NodeStorage")
    public Integer nodeStorage;

    /**
     * <p>The order type. Valid values:</p>
     * <ul>
     * <li><strong>UPGRADE</strong>: Upgrade.</li>
     * <li><strong>DOWNGRADE</strong>: Downgrade.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>UPGRADE</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of read-only nodes in the shard node.</p>
     * <p>Valid values: <strong>0</strong> to <strong>5</strong>. The value must be an integer.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ReadonlyReplicas")
    public Integer readonlyReplicas;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The time when the configuration change is executed. Specify the time in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format. The time must be in UTC.</p>
     * <blockquote>
     * <p><strong>[Deprecated]</strong> This parameter is deprecated. Use the EffectiveTime parameter instead.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2022-01-05T03:18:53Z</p>
     */
    @NameInMap("SwitchTime")
    public String switchTime;

    /**
     * <p>The destination hidden zone for zone migration.</p>
     * <blockquote>
     * <p>Notice: This parameter is supported only for cloud disk instances.</notice></p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-j</p>
     */
    @NameInMap("TargetHiddenZoneId")
    public String targetHiddenZoneId;

    /**
     * <p>The destination secondary zone for zone migration.</p>
     * <blockquote>
     * <p>Notice: This parameter is supported only for cloud disk instances.</notice></p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-e</p>
     */
    @NameInMap("TargetSecondaryZoneId")
    public String targetSecondaryZoneId;

    /**
     * <p>The ID of the destination vSwitch for zone migration.</p>
     * <blockquote>
     * <p>Notice: This parameter is supported only for cloud disk instances.</notice></p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vsw-xxxxxxxx</p>
     */
    @NameInMap("TargetVswitchId")
    public String targetVswitchId;

    /**
     * <p>The destination primary zone for zone migration.</p>
     * <blockquote>
     * <p>Notice: This parameter is supported only for cloud disk instances.</notice></p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-h</p>
     */
    @NameInMap("TargetZoneId")
    public String targetZoneId;

    public static ModifyNodeSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyNodeSpecRequest self = new ModifyNodeSpecRequest();
        return TeaModel.build(map, self);
    }

    public ModifyNodeSpecRequest setAlignPrimaryZone(Boolean alignPrimaryZone) {
        this.alignPrimaryZone = alignPrimaryZone;
        return this;
    }
    public Boolean getAlignPrimaryZone() {
        return this.alignPrimaryZone;
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

    public ModifyNodeSpecRequest setTargetHiddenZoneId(String targetHiddenZoneId) {
        this.targetHiddenZoneId = targetHiddenZoneId;
        return this;
    }
    public String getTargetHiddenZoneId() {
        return this.targetHiddenZoneId;
    }

    public ModifyNodeSpecRequest setTargetSecondaryZoneId(String targetSecondaryZoneId) {
        this.targetSecondaryZoneId = targetSecondaryZoneId;
        return this;
    }
    public String getTargetSecondaryZoneId() {
        return this.targetSecondaryZoneId;
    }

    public ModifyNodeSpecRequest setTargetVswitchId(String targetVswitchId) {
        this.targetVswitchId = targetVswitchId;
        return this;
    }
    public String getTargetVswitchId() {
        return this.targetVswitchId;
    }

    public ModifyNodeSpecRequest setTargetZoneId(String targetZoneId) {
        this.targetZoneId = targetZoneId;
        return this;
    }
    public String getTargetZoneId() {
        return this.targetZoneId;
    }

}
