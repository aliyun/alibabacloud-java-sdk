// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceSpecRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic payment for the instance. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables automatic payment. Make sure that your account has a sufficient balance. This is the default value.</li>
     * </ul>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li><strong>false</strong>: disables automatic payment. You can log on to the ApsaraDB for MongoDB console to pay for the instance. In the upper-right corner of the page, choose <strong>Billing Management</strong> &gt; <strong>Billing Management</strong>. In the left-side navigation pane, choose <strong>Orders</strong> &gt; <strong>My Orders</strong>. On the <strong>Product Orders</strong> tab, find the order and complete the payment.</li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <ul>
     * <li><strong>false</strong>: disables automatic payment. You can log on to the ApsaraDB for MongoDB console to pay for the instance. In the upper-right corner of the page, choose <strong>Billing Management</strong> &gt; <strong>Billing Management</strong>. In the left-side navigation pane, click <strong>Orders</strong>. On the <strong>Product Orders</strong> page, find the order and complete the payment.</li>
     * </ul>
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
     * <p>Specifies whether to use a coupon. Valid values:</p>
     * <ul>
     * <li><p><strong>default</strong> or <strong>null</strong> (default): A coupon is used.</p>
     * </li>
     * <li><p><strong>youhuiquan_promotion_option_id_for_blank</strong>: No coupon is used.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("CouponNo")
    public String couponNo;

    /**
     * <p>The instance type. &lt;props=&quot;intl&quot;&gt;For more information, see <a href="https://help.aliyun.com/document_detail/57141.html">Instance types</a>. You can also call the <a href="https://help.aliyun.com/document_detail/149719.html">DescribeAvailableResource</a> operation to query instance types.&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li><p>For a standalone instance or a replica set instance, this parameter specifies the instance type. For more information, see <a href="https://help.aliyun.com/document_detail/57141.html">Instance types</a>. You can also call the <a href="https://help.aliyun.com/document_detail/149719.html">DescribeAvailableResource</a> operation to query the instance types of standalone and replica set instances.</p>
     * </li>
     * <li><p>For a serverless instance, this parameter specifies the computing capacity of the instance. Valid values: 100 to 8000.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>You must configure one of the <strong>DBInstanceStorage</strong> and DBInstanceClass parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>dds.sn4.xlarge.1</p>
     */
    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dds-bp1ea17b41ab****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The storage capacity of the instance. &lt;props=&quot;intl&quot;&gt;The value must be an integer that is greater than or equal to 10. The value increases in increments of 10. Unit: GB. The values that can be specified for this parameter are subject to the instance type. For more information, see <a href="https://help.aliyun.com/document_detail/57141.html">Instance types</a>.</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li><p>The storage capacity of a standalone instance or a replica set instance must be a multiple of 10. The valid values are 10 to 3000. Unit: GB. The values that can be specified for this parameter are subject to the instance type. For more information, see <a href="https://help.aliyun.com/document_detail/57141.html">Instance types</a>.</p>
     * </li>
     * <li><p>The storage capacity of a serverless instance must be a multiple of 1. The valid values are 1 to 100. Unit: GB.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><p>You must configure one of the <strong>DBInstanceClass</strong> and DBInstanceStorage parameters.</p>
     * </li>
     * <li><p>You cannot decrease the storage capacity of an instance.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("DBInstanceStorage")
    public String DBInstanceStorage;

    /**
     * <p>The effective time of the configuration change. Valid values:</p>
     * <ul>
     * <li><p><strong>Immediately</strong>: The configuration change immediately takes effect. This is the default value.</p>
     * </li>
     * <li><p><strong>MaintainTime</strong>: The configuration change takes effect during the maintenance window of the instance.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Immediately</p>
     */
    @NameInMap("EffectiveTime")
    public String effectiveTime;

    /**
     * <p>Additional parameters. Valid values:</p>
     * <ul>
     * <li><p><strong>async</strong>: The result is returned after the specification change order is created.</p>
     * </li>
     * <li><p><strong>sync</strong>: The result is returned after the instance specification change is delivered.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>async</p>
     */
    @NameInMap("ExtraParam")
    public String extraParam;

    /**
     * <p>The specification change type. Valid values:</p>
     * <ul>
     * <li><p><strong>UPGRADE</strong>: upgrades the specifications. This is the default value.</p>
     * </li>
     * <li><p><strong>DOWNGRADE</strong>: downgrades the specifications.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is available only for subscription instances.</p>
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
     * <p>The number of read-only nodes. Valid values: <strong>0</strong> to <strong>5</strong>.</p>
     * <p>If the network type of the instance is set to only <strong>classic network</strong> and <strong>VPC</strong>, you need to enable public access or release the classic network endpoint before you can change the <strong>number of read-only nodes</strong>.</p>
     * <blockquote>
     * <p>You can log on to the ApsaraDB for MongoDB console and go to the <strong>Database Connections</strong> page to view the network types that have been enabled.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ReadonlyReplicas")
    public String readonlyReplicas;

    /**
     * <p>The number of nodes in the instance. Default value: 3.</p>
     * <ul>
     * <li><p>Valid values for replica set instances: <strong>3</strong>, <strong>5</strong>, and <strong>7</strong>.</p>
     * </li>
     * <li><p>The value for standalone instances is fixed at <strong>1</strong>.</p>
     * </li>
     * <li><p>The value for replica set instances with shared storage (available only in the China site) is fixed at <strong>2</strong>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is not required for serverless instances (available only in the China site).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ReplicationFactor")
    public String replicationFactor;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The specifications of the Search node to be changed.</p>
     * 
     * <strong>example:</strong>
     * <p>mdb.shard.2x.xlarge.d</p>
     */
    @NameInMap("SearchNodeClass")
    public String searchNodeClass;

    /**
     * <p>The number of Search nodes to be changed.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("SearchNodeCount")
    public Long searchNodeCount;

    /**
     * <p>The capacity of the Search node to be changed.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("SearchNodeStorage")
    public Long searchNodeStorage;

    /**
     * <p>The destination zone for the hidden node when you change the specifications and migrate the instance across zones.</p>
     * <blockquote>
     * <p>Notice: This parameter applies only to cloud disk instances.
     * Notice: The value of this parameter cannot be the same as the value of the TargetZoneId or TargetSecondaryZoneId parameter.</p>
     * </blockquote>
     * <blockquote>
     * <ul>
     * <li><p>You must specify this parameter only when you change the specifications and migrate the instance across zones.</p>
     * </li>
     * <li><p>This parameter is available only for multi-zone migration.</p>
     * </li>
     * <li><p>The destination zone and the current zone must be in the same region.</p>
     * </li>
     * <li><p>You can call the <a href="https://help.aliyun.com/document_detail/61933.html">DescribeRegions</a> operation to query zone IDs.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-i</p>
     */
    @NameInMap("TargetHiddenZoneId")
    public String targetHiddenZoneId;

    /**
     * <p>The destination secondary zone for the secondary node when you change the specifications and migrate the instance across zones.</p>
     * <blockquote>
     * <p>Notice: This parameter applies only to cloud disk instances.
     * Notice: The value of this parameter cannot be the same as the value of the TargetZoneId or TargetHiddenZoneId parameter.</p>
     * </blockquote>
     * <blockquote>
     * <ul>
     * <li><p>You must specify this parameter only when you change the specifications and migrate the instance across zones.</p>
     * </li>
     * <li><p>This parameter is available only for multi-zone migration.</p>
     * </li>
     * <li><p>The destination zone and the current zone must be in the same region.</p>
     * </li>
     * <li><p>You can call the <a href="https://help.aliyun.com/document_detail/61933.html">DescribeRegions</a> operation to query zone IDs.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-h</p>
     */
    @NameInMap("TargetSecondaryZoneId")
    public String targetSecondaryZoneId;

    /**
     * <p>The destination vSwitch ID when you change the specifications and migrate the instance across zones.</p>
     * <blockquote>
     * <p>Notice: This parameter applies only to cloud disk instances.</p>
     * </blockquote>
     * <blockquote>
     * <ul>
     * <li>You must specify this parameter only when you change the specifications and migrate the instance across zones.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1buy0h9myt5i9e7****</p>
     */
    @NameInMap("TargetVswitchId")
    public String targetVswitchId;

    /**
     * <p>The destination zone to which you want to migrate the instance when you change the specifications and migrate the instance across zones.</p>
     * <blockquote>
     * <p>Notice: This parameter applies only to cloud disk instances.
     * Notice: The value of this parameter cannot be the same as the value of the TargetSecondaryZoneId or TargetHiddenZoneId parameter.</p>
     * </blockquote>
     * <blockquote>
     * <ul>
     * <li><p>You must specify this parameter only when you change the specifications and migrate the instance across zones.</p>
     * </li>
     * <li><p>The destination zone and the current zone must be in the same region.</p>
     * </li>
     * <li><p>You can call the <a href="https://help.aliyun.com/document_detail/61933.html">DescribeRegions</a> operation to query zone IDs.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-j</p>
     */
    @NameInMap("TargetZoneId")
    public String targetZoneId;

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

    public ModifyDBInstanceSpecRequest setSearchNodeClass(String searchNodeClass) {
        this.searchNodeClass = searchNodeClass;
        return this;
    }
    public String getSearchNodeClass() {
        return this.searchNodeClass;
    }

    public ModifyDBInstanceSpecRequest setSearchNodeCount(Long searchNodeCount) {
        this.searchNodeCount = searchNodeCount;
        return this;
    }
    public Long getSearchNodeCount() {
        return this.searchNodeCount;
    }

    public ModifyDBInstanceSpecRequest setSearchNodeStorage(Long searchNodeStorage) {
        this.searchNodeStorage = searchNodeStorage;
        return this;
    }
    public Long getSearchNodeStorage() {
        return this.searchNodeStorage;
    }

    public ModifyDBInstanceSpecRequest setTargetHiddenZoneId(String targetHiddenZoneId) {
        this.targetHiddenZoneId = targetHiddenZoneId;
        return this;
    }
    public String getTargetHiddenZoneId() {
        return this.targetHiddenZoneId;
    }

    public ModifyDBInstanceSpecRequest setTargetSecondaryZoneId(String targetSecondaryZoneId) {
        this.targetSecondaryZoneId = targetSecondaryZoneId;
        return this;
    }
    public String getTargetSecondaryZoneId() {
        return this.targetSecondaryZoneId;
    }

    public ModifyDBInstanceSpecRequest setTargetVswitchId(String targetVswitchId) {
        this.targetVswitchId = targetVswitchId;
        return this;
    }
    public String getTargetVswitchId() {
        return this.targetVswitchId;
    }

    public ModifyDBInstanceSpecRequest setTargetZoneId(String targetZoneId) {
        this.targetZoneId = targetZoneId;
        return this;
    }
    public String getTargetZoneId() {
        return this.targetZoneId;
    }

}
