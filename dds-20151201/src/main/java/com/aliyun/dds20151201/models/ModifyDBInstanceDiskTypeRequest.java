// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceDiskTypeRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic payment. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables automatic payment. Make sure that your account has sufficient balance.
     * &lt;props=&quot;china&quot;&gt;- <strong>false</strong>: disables automatic payment. You can manually pay for the order in the console. Log on to the ApsaraDB for MongoDB console. In the upper-right corner of the page, choose <strong>Expenses</strong> &gt; <strong>Expenses and Costs</strong>. In the left-side navigation pane, choose <strong>Orders</strong> &gt; <strong>My Orders</strong>. On the <strong>Orders</strong> tab, find the target order and complete the payment.
     * &lt;props=&quot;intl&quot;&gt;- <strong>false</strong>: disables automatic payment. You can manually pay for the order in the console. Log on to the ApsaraDB for MongoDB console. In the upper-right corner of the page, choose <strong>Expenses</strong> &gt; <strong>Expenses and Costs</strong>. In the left-side navigation pane, click <strong>Order Management</strong>. On the <strong>Orders</strong> page, find the target order and complete the payment.</li>
     * </ul>
     * <p>Default value: <strong>true</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to enable auto-renewal. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables auto-renewal.</li>
     * <li><strong>false</strong>: disables auto-renewal.</li>
     * </ul>
     * <p>Default value: <strong>false</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenew")
    public String autoRenew;

    /**
     * <p>The additional parameter for business information.</p>
     * 
     * <strong>example:</strong>
     * <p>{“ActivityId&quot;:&quot;000000000&quot;}</p>
     */
    @NameInMap("BusinessInfo")
    public String businessInfo;

    /**
     * <p>The coupon code. Default value: <code>youhuiquan_promotion_option_id_for_blank</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>youhuiquan_promotion_option_id_for_blank</p>
     */
    @NameInMap("CouponNo")
    public String couponNo;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dds-bp1fa5efaa93****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The new disk type. Valid values:</p>
     * <ul>
     * <li><strong>cloud_auto</strong>: ESSD AutoPL cloud disk.</li>
     * </ul>
     * <blockquote>
     * <p>Prerequisite: The disk space of the instance must be at least 40 GB before you call this operation. If the disk space is insufficient, call ModifyDBInstanceSpec to expand the disk.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cloud_auto</p>
     */
    @NameInMap("DbInstanceStorageType")
    public String dbInstanceStorageType;

    /**
     * <p>The additional parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>async</p>
     */
    @NameInMap("ExtraParam")
    public String extraParam;

    /**
     * <p>The specification change type. Valid values:</p>
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

    /**
     * <p>The provisioned performance (IOPS). Valid values: 0 to 50,000.</p>
     * <blockquote>
     * <p>If DbInstanceStorageType is set to cloud_auto, this parameter is conditionally required and can be set to 0. If this parameter is not specified, the API returns InvalidParameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1960</p>
     */
    @NameInMap("ProvisionedIops")
    public Long provisionedIops;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyDBInstanceDiskTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceDiskTypeRequest self = new ModifyDBInstanceDiskTypeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceDiskTypeRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public ModifyDBInstanceDiskTypeRequest setAutoRenew(String autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public String getAutoRenew() {
        return this.autoRenew;
    }

    public ModifyDBInstanceDiskTypeRequest setBusinessInfo(String businessInfo) {
        this.businessInfo = businessInfo;
        return this;
    }
    public String getBusinessInfo() {
        return this.businessInfo;
    }

    public ModifyDBInstanceDiskTypeRequest setCouponNo(String couponNo) {
        this.couponNo = couponNo;
        return this;
    }
    public String getCouponNo() {
        return this.couponNo;
    }

    public ModifyDBInstanceDiskTypeRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyDBInstanceDiskTypeRequest setDbInstanceStorageType(String dbInstanceStorageType) {
        this.dbInstanceStorageType = dbInstanceStorageType;
        return this;
    }
    public String getDbInstanceStorageType() {
        return this.dbInstanceStorageType;
    }

    public ModifyDBInstanceDiskTypeRequest setExtraParam(String extraParam) {
        this.extraParam = extraParam;
        return this;
    }
    public String getExtraParam() {
        return this.extraParam;
    }

    public ModifyDBInstanceDiskTypeRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public ModifyDBInstanceDiskTypeRequest setProvisionedIops(Long provisionedIops) {
        this.provisionedIops = provisionedIops;
        return this;
    }
    public Long getProvisionedIops() {
        return this.provisionedIops;
    }

    public ModifyDBInstanceDiskTypeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
