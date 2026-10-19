// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyNodeSpecBatchRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically align the primary node to the primary zone after operations such as configuration changes for a multi-zone instance. If you choose not to align the node, one primary/secondary switchover (transient connection) is prevented. Default value: true.</p>
     */
    @NameInMap("AlignPrimaryZone")
    public Boolean alignPrimaryZone;

    /**
     * <p>Specifies whether to enable automatic payment. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables automatic payment. Make sure that your account has sufficient balance.
     * &lt;props=&quot;china&quot;&gt;- <strong>false</strong>: disables automatic payment. You can log on to the ApsaraDB for MongoDB console, choose <strong>Expenses</strong> &gt; <strong>Expenses and Costs</strong> in the upper-right corner, choose <strong>Orders</strong> &gt; <strong>My Orders</strong> in the left-side navigation pane, and then find the target order on the <strong>Orders</strong> tab to complete the payment.
     * &lt;props=&quot;intl&quot;&gt;- <strong>false</strong>: disables automatic payment. You can log on to the ApsaraDB for MongoDB console, choose <strong>Expenses</strong> &gt; <strong>Expenses and Costs</strong> in the upper-right corner, click <strong>Order Management</strong> in the left-side navigation pane, and then find the target order on the <strong>Orders</strong> page to complete the payment.</li>
     * </ul>
     * <p>Default value: <strong>true</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The business information.</p>
     * 
     * <strong>example:</strong>
     * <p>{“ActivityId&quot;:&quot;000000000&quot;}</p>
     */
    @NameInMap("BusinessInfo")
    public String businessInfo;

    /**
     * <p>The client token that is used to ensure the idempotence of the request and prevent duplicate submissions. You can use the client to generate the token, but you must ensure that it is unique among different requests. The token can contain a maximum of 64 ASCII characters and cannot contain non-ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCz****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to use a coupon. Valid values:</p>
     * <ul>
     * <li><strong>default</strong> or <strong>null</strong>: uses a coupon. This is the default value.</li>
     * <li><strong>youhuiquan_promotion_option_id_for_blank</strong>: does not use a coupon.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("CouponNo")
    public String couponNo;

    /**
     * <p>The instance ID of the instance whose configurations you want to modify.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dds-bp1337621e8f****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The effective period of the configuration change. Valid values:</p>
     * <ul>
     * <li><strong>Immediately</strong>: The configuration change takes effect immediately.</li>
     * <li><strong>MaintainTime</strong>: The configuration change takes effect during the maintenance window of the instance.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>You can invoke the <a href="https://help.aliyun.com/document_detail/62008.html">ModifyDBInstanceMaintainTime</a> operation to modify the maintenance window of the instance.</li>
     * <li>You can invoke the <a href="https://help.aliyun.com/document_detail/62010.html">DescribeDBInstanceAttribute</a> operation to view the maintenance window of the instance.</li>
     * </ul>
     * </blockquote>
     * <p>Default value: <strong>Immediately</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>Immediately</p>
     */
    @NameInMap("EffectiveTime")
    public String effectiveTime;

    /**
     * <p>The specifications of the Mongos or shard nodes to be modified. For more information, see <a href="https://help.aliyun.com/document_detail/57141.html">Instance types</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Shards&quot;:[{&quot;DBInstanceClass&quot;:&quot;dds.shard.mid&quot;,&quot;DBInstanceName&quot;:&quot;d-bp14ae4572fd****&quot;,&quot;Storage&quot;:20},{&quot;DBInstanceClass&quot;:&quot;dds.shard.mid&quot;,&quot;DBInstanceName&quot;:&quot;d-bp19f4f92dc5****&quot;,&quot;Storage&quot;:30}]}</p>
     */
    @NameInMap("NodesInfo")
    public String nodesInfo;

    /**
     * <p>The type of the configuration change. Valid values:</p>
     * <ul>
     * <li><strong>UPGRADE</strong>: upgrades the configurations.</li>
     * <li><strong>DOWNGRADE</strong>: downgrades the configurations.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is available only when the billing method of the instance is subscription.</p>
     * </blockquote>
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
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/61933.html">DescribeRegions</a> operation to query available regions.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The destination zone of the hidden node when you migrate the instance across zones and change its configurations at the same time.</p>
     * <blockquote>
     * <p>Notice: This parameter is supported only for cloud disk instances.</notice>
     * Notice: The value of this parameter cannot be the same as the value of the TargetZoneId or TargetSecondaryZoneId parameter.</notice></p>
     * </blockquote>
     * <blockquote>
     * <ul>
     * <li>You must specify this parameter only when you migrate the instance across zones and change its configurations at the same time.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-e</p>
     */
    @NameInMap("TargetHiddenZoneId")
    public String targetHiddenZoneId;

    /**
     * <p>The destination zone of the secondary node when you migrate the instance across zones and change its configurations at the same time.</p>
     * <blockquote>
     * <p>Notice: This parameter is supported only for cloud disk instances.</notice>
     * Notice: The value of this parameter cannot be the same as the value of the TargetZoneId or TargetHiddenZoneId parameter.</notice></p>
     * <ul>
     * <li>You must specify this parameter only when you migrate the instance across zones and change its configurations at the same time.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-j</p>
     */
    @NameInMap("TargetSecondaryZoneId")
    public String targetSecondaryZoneId;

    /**
     * <p>The ID of the destination vSwitch when you migrate the instance across zones and change its configurations at the same time.</p>
     * <blockquote>
     * <p>Notice: This parameter is supported only for cloud disk instances.</notice></p>
     * <ul>
     * <li>You must specify this parameter only when you migrate the instance across zones and change its configurations at the same time.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vsw-xxxxxxxx</p>
     */
    @NameInMap("TargetVswitchId")
    public String targetVswitchId;

    /**
     * <p>The destination zone of the primary node when you migrate the instance across zones and change its configurations at the same time.</p>
     * <blockquote>
     * <p>Notice: This parameter is supported only for cloud disk instances.</notice>
     * Notice: The value of this parameter cannot be the same as the value of the TargetSecondaryZoneId or TargetHiddenZoneId parameter.</notice></p>
     * <ul>
     * <li>You must specify this parameter only when you migrate the instance across zones and change its configurations at the same time.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-h</p>
     */
    @NameInMap("TargetZoneId")
    public String targetZoneId;

    public static ModifyNodeSpecBatchRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyNodeSpecBatchRequest self = new ModifyNodeSpecBatchRequest();
        return TeaModel.build(map, self);
    }

    public ModifyNodeSpecBatchRequest setAlignPrimaryZone(Boolean alignPrimaryZone) {
        this.alignPrimaryZone = alignPrimaryZone;
        return this;
    }
    public Boolean getAlignPrimaryZone() {
        return this.alignPrimaryZone;
    }

    public ModifyNodeSpecBatchRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public ModifyNodeSpecBatchRequest setBusinessInfo(String businessInfo) {
        this.businessInfo = businessInfo;
        return this;
    }
    public String getBusinessInfo() {
        return this.businessInfo;
    }

    public ModifyNodeSpecBatchRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyNodeSpecBatchRequest setCouponNo(String couponNo) {
        this.couponNo = couponNo;
        return this;
    }
    public String getCouponNo() {
        return this.couponNo;
    }

    public ModifyNodeSpecBatchRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyNodeSpecBatchRequest setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }
    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    public ModifyNodeSpecBatchRequest setNodesInfo(String nodesInfo) {
        this.nodesInfo = nodesInfo;
        return this;
    }
    public String getNodesInfo() {
        return this.nodesInfo;
    }

    public ModifyNodeSpecBatchRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public ModifyNodeSpecBatchRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyNodeSpecBatchRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyNodeSpecBatchRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyNodeSpecBatchRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyNodeSpecBatchRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyNodeSpecBatchRequest setTargetHiddenZoneId(String targetHiddenZoneId) {
        this.targetHiddenZoneId = targetHiddenZoneId;
        return this;
    }
    public String getTargetHiddenZoneId() {
        return this.targetHiddenZoneId;
    }

    public ModifyNodeSpecBatchRequest setTargetSecondaryZoneId(String targetSecondaryZoneId) {
        this.targetSecondaryZoneId = targetSecondaryZoneId;
        return this;
    }
    public String getTargetSecondaryZoneId() {
        return this.targetSecondaryZoneId;
    }

    public ModifyNodeSpecBatchRequest setTargetVswitchId(String targetVswitchId) {
        this.targetVswitchId = targetVswitchId;
        return this;
    }
    public String getTargetVswitchId() {
        return this.targetVswitchId;
    }

    public ModifyNodeSpecBatchRequest setTargetZoneId(String targetZoneId) {
        this.targetZoneId = targetZoneId;
        return this;
    }
    public String getTargetZoneId() {
        return this.targetZoneId;
    }

}
