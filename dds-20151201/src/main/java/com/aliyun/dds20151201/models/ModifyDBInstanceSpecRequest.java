// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceSpecRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically align the primary node to the primary zone after operations such as configuration changes for a multi-zone instance. If you choose not to align the node, one primary/secondary switchover (transient disconnection) is avoided. Default value: true, which indicates that the node is aligned.</p>
     */
    @NameInMap("AlignPrimaryZone")
    public Boolean alignPrimaryZone;

    /**
     * <p>Specifies whether to enable automatic payment for the instance. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables automatic payment. This is the default value. Make sure that your account has sufficient balance.
     * &lt;props=&quot;china&quot;&gt;- <strong>false</strong>: disables automatic payment. You can manually pay for the order in the ApsaraDB for MongoDB console. Log on to the console, choose <strong>Expenses</strong> &gt; <strong>Expenses and Costs</strong> in the upper-right corner, choose <strong>Purchase Orders</strong> &gt; <strong>My Orders</strong> in the left-side navigation pane, and then find the target order on the <strong>Product Orders</strong> tab to complete the payment.
     * &lt;props=&quot;intl&quot;&gt;- <strong>false</strong>: disables automatic payment. You can manually pay for the order in the ApsaraDB for MongoDB console. Log on to the console, choose <strong>Expenses</strong> &gt; <strong>Expenses and Costs</strong> in the upper-right corner, click <strong>Order Management</strong> in the left-side navigation pane, and then find the target order on the <strong>Product Orders</strong> page to complete the payment.</li>
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
     * <p>The client token that is used to ensure the idempotence of the request and prevent duplicate submissions. You can generate the value of this parameter on the client side. The value must be unique across different requests and can be up to 64 ASCII characters in length. The value cannot contain non-ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>qwertyui1234567</p>
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
     * <p>The instance type. &lt;props=&quot;intl&quot;&gt;<ph>For more information, see <a href="https://help.aliyun.com/document_detail/57141.html">Instance types</a>. You can also call the <a href="https://help.aliyun.com/document_detail/149719.html">DescribeAvailableResource</a> operation to query instance types.</ph>
     * &lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>For standalone instances and replica set instances, this parameter specifies the instance type. For more information, see <a href="https://help.aliyun.com/document_detail/57141.html">Instance types</a>. You can also call the <a href="https://help.aliyun.com/document_detail/149719.html">DescribeAvailableResource</a> operation to query the instance types of standalone instances and replica set instances.</li>
     * <li>For serverless instances, this parameter specifies the compute specifications of the instance. Valid values: 100 to 8000.</li>
     * </ul>
     * <blockquote>
     * <p>You must specify at least one of the <strong>DBInstanceClass</strong> and <strong>DBInstanceStorage</strong> parameters.</p>
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
     * <p>The instance storage. &lt;props=&quot;intl&quot;&gt;<ph>Valid values: 10 to 3000. Unit: GB. Step size: 10 GB. The valid values are subject to the instance type. For details, see <a href="https://help.aliyun.com/document_detail/57141.html">Instance types</a>.</ph></p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>For standalone instances and replica set instances, valid values are 10 to 3000. Unit: GB. Step size: 10 GB. The valid values are subject to the instance type. For details, see <a href="https://help.aliyun.com/document_detail/57141.html">Instance types</a>.</li>
     * <li>For serverless instances, valid values are 1 to 100. Unit: GB. Step size: 1 GB.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>You must specify at least one of this parameter and the <strong>DBInstanceClass</strong> parameter.</li>
     * <li>You cannot decrease the quota of storage space.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("DBInstanceStorage")
    public String DBInstanceStorage;

    /**
     * <p>Specifies whether to perform a dry run on the request. Valid values:
     * true: performs a dry run without calling the operation. The system checks the request parameters, request format, business limits, and inventory. If the request fails the dry run, the corresponding error is returned. If the request passes the dry run, the DryRunOperation error code is returned.
     * false: sends the normal request and directly performs the operation after the request passes the check. This is the default value.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The effective period of the configuration change. Valid values:</p>
     * <ul>
     * <li><strong>Immediately</strong>: takes effect immediately. This is the default value.</li>
     * <li><strong>MaintainTime</strong>: takes effect during the maintenance window of the instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Immediately</p>
     */
    @NameInMap("EffectiveTime")
    public String effectiveTime;

    /**
     * <p>The additional parameter. Valid values:</p>
     * <ul>
     * <li><strong>async</strong>: returns the result after the configuration change order is created.</li>
     * <li><strong>sync</strong>: returns the result when the configuration change is delivered to the instance after the order is created.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>async</p>
     */
    @NameInMap("ExtraParam")
    public String extraParam;

    /**
     * <p>The type of the configuration change. Valid values:</p>
     * <ul>
     * <li><strong>UPGRADE</strong>: upgrades the configurations. This is the default value.</li>
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
     * <p>The number of read-only nodes. Valid values: <strong>0</strong> to <strong>5</strong>.</p>
     * <p>If the network type of the instance includes only the <strong>classic network</strong> and <strong>VPC</strong>, you must enable Internet access or release the classic network before you can change the <strong>number of read-only nodes</strong>.</p>
     * <blockquote>
     * <p>You can log on to the ApsaraDB for MongoDB console and view the enabled network types on the <strong>Database Connections</strong> page.</p>
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
     * <li>For a replica set instance, valid values are <strong>3</strong>, <strong>5</strong>, and <strong>7</strong>.</li>
     * <li>For a standalone instance, the value is fixed to <strong>1</strong>.</li>
     * <li>For a replica set instance that uses shared storage (supported only on the China site), the value is fixed to <strong>2</strong>.</li>
     * </ul>
     * <blockquote>
     * <p>You do not need to specify this parameter for a serverless instance (supported only on the China site).</p>
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
     * <p>The node specifications of the search node for the configuration change.</p>
     * 
     * <strong>example:</strong>
     * <p>mdb.shard.2x.xlarge.d</p>
     */
    @NameInMap("SearchNodeClass")
    public String searchNodeClass;

    /**
     * <p>The number of search nodes for the configuration change.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("SearchNodeCount")
    public Long searchNodeCount;

    /**
     * <p>The storage capacity of the search node for the configuration change.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("SearchNodeStorage")
    public Long searchNodeStorage;

    /**
     * <p>The destination zone for the hidden node when you cloud disk instance across zones and change its configurations at the same time.</p>
     * <blockquote>
     * <p>Notice: This parameter is supported only for instances that use cloud disks.</notice>
     * Notice: The value of this parameter cannot be the same as the value of the TargetZoneId or TargetSecondaryZoneId parameter.</notice></p>
     * </blockquote>
     * <blockquote>
     * <ul>
     * <li>You need to specify this parameter only when you cloud disk instance across zones and change its configurations at the same time.</li>
     * <li>This parameter is available only for multi-zone migration.</li>
     * <li>The destination zone and the current zone of the instance must be in the same region.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/61933.html">DescribeRegions</a> operation to query zone IDs.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-i</p>
     */
    @NameInMap("TargetHiddenZoneId")
    public String targetHiddenZoneId;

    /**
     * <p>The destination zone for the secondary node when you cloud disk instance across zones and change its configurations at the same time.</p>
     * <blockquote>
     * <p>Notice: This parameter is supported only for instances that use cloud disks.</notice>
     * Notice: The value of this parameter cannot be the same as the value of the TargetZoneId or TargetHiddenZoneId parameter.</notice></p>
     * <ul>
     * <li>You need to specify this parameter only when you cloud disk instance across zones and change its configurations at the same time.</li>
     * <li>This parameter is available only for multi-zone migration.</li>
     * <li>The destination zone and the current zone of the instance must be in the same region.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/61933.html">DescribeRegions</a> operation to query zone IDs.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-h</p>
     */
    @NameInMap("TargetSecondaryZoneId")
    public String targetSecondaryZoneId;

    /**
     * <p>The ID of the destination vSwitch when you cloud disk instance across zones and change its configurations at the same time.</p>
     * <blockquote>
     * <p>Notice: This parameter is supported only for instances that use cloud disks.</notice></p>
     * <ul>
     * <li>You need to specify this parameter only when you cloud disk instance across zones and change its configurations at the same time.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1buy0h9myt5i9e7****</p>
     */
    @NameInMap("TargetVswitchId")
    public String targetVswitchId;

    /**
     * <p>The destination active zone for instance migration during a configuration change across zones.</p>
     * <blockquote>
     * <p>Notice: This parameter is supported only for cloud disk instances.</notice>
     * Notice: The value of this parameter cannot be the same as the value of the TargetSecondaryZoneId or TargetHiddenZoneId parameter.</notice></p>
     * <ul>
     * <li>You need to specify this parameter only during a configuration change across zones.</li>
     * <li>The destination zone and the current zone of the instance must be in the same region.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/61933.html">DescribeRegions</a> operation to query zone IDs.</li>
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

    public ModifyDBInstanceSpecRequest setAlignPrimaryZone(Boolean alignPrimaryZone) {
        this.alignPrimaryZone = alignPrimaryZone;
        return this;
    }
    public Boolean getAlignPrimaryZone() {
        return this.alignPrimaryZone;
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

    public ModifyDBInstanceSpecRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
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

    public ModifyDBInstanceSpecRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
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
