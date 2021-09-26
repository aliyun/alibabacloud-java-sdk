// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eslengine20190120.models;

import com.aliyun.tea.*;

public class ActiveMboxDeviceRequest extends TeaModel {
    // deviceType
    @NameInMap("DeviceType")
    public String deviceType;

    // companyId
    @NameInMap("CompanyId")
    public String companyId;

    // groupName
    @NameInMap("GroupName")
    public String groupName;

    // appVersion
    @NameInMap("AppVersion")
    public String appVersion;

    // productCode
    @NameInMap("ProductCode")
    public String productCode;

    // registerId
    @NameInMap("RegisterId")
    public String registerId;

    // accountName
    @NameInMap("AccountName")
    public String accountName;

    // groupId
    @NameInMap("GroupId")
    public String groupId;

    // deviceMac
    @NameInMap("DeviceMac")
    public String deviceMac;

    // appCode
    @NameInMap("AppCode")
    public String appCode;

    // deviceName
    @NameInMap("DeviceName")
    public String deviceName;

    public static ActiveMboxDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        ActiveMboxDeviceRequest self = new ActiveMboxDeviceRequest();
        return TeaModel.build(map, self);
    }

    public ActiveMboxDeviceRequest setDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }
    public String getDeviceType() {
        return this.deviceType;
    }

    public ActiveMboxDeviceRequest setCompanyId(String companyId) {
        this.companyId = companyId;
        return this;
    }
    public String getCompanyId() {
        return this.companyId;
    }

    public ActiveMboxDeviceRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public ActiveMboxDeviceRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public ActiveMboxDeviceRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ActiveMboxDeviceRequest setRegisterId(String registerId) {
        this.registerId = registerId;
        return this;
    }
    public String getRegisterId() {
        return this.registerId;
    }

    public ActiveMboxDeviceRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public ActiveMboxDeviceRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ActiveMboxDeviceRequest setDeviceMac(String deviceMac) {
        this.deviceMac = deviceMac;
        return this;
    }
    public String getDeviceMac() {
        return this.deviceMac;
    }

    public ActiveMboxDeviceRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public ActiveMboxDeviceRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

}
