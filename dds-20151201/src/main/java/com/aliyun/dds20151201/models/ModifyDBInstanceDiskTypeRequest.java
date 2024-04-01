// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceDiskTypeRequest extends TeaModel {
    @NameInMap("AutoPay")
    public Boolean autoPay;

    @NameInMap("AutoRenew")
    public String autoRenew;

    @NameInMap("BusinessInfo")
    public String businessInfo;

    @NameInMap("CouponNo")
    public String couponNo;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("DbInstanceStorageType")
    public String dbInstanceStorageType;

    @NameInMap("ExtraParam")
    public String extraParam;

    @NameInMap("OrderType")
    public String orderType;

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
