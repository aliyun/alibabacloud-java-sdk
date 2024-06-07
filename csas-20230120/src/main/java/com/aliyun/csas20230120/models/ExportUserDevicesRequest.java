// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ExportUserDevicesRequest extends TeaModel {
    @NameInMap("AppStatuses")
    public java.util.List<String> appStatuses;

    @NameInMap("Department")
    public String department;

    @NameInMap("DeviceBelong")
    public String deviceBelong;

    @NameInMap("DeviceStatuses")
    public java.util.List<String> deviceStatuses;

    @NameInMap("DeviceTags")
    public java.util.List<String> deviceTags;

    @NameInMap("DeviceTypes")
    public java.util.List<String> deviceTypes;

    @NameInMap("DlpStatuses")
    public java.util.List<String> dlpStatuses;

    @NameInMap("Hostname")
    public String hostname;

    @NameInMap("IaStatuses")
    public java.util.List<String> iaStatuses;

    @NameInMap("Mac")
    public String mac;

    @NameInMap("NacStatuses")
    public java.util.List<String> nacStatuses;

    @NameInMap("PaStatuses")
    public java.util.List<String> paStatuses;

    @NameInMap("SaseUserId")
    public String saseUserId;

    @NameInMap("SharingStatus")
    public Boolean sharingStatus;

    @NameInMap("Username")
    public String username;

    public static ExportUserDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportUserDevicesRequest self = new ExportUserDevicesRequest();
        return TeaModel.build(map, self);
    }

    public ExportUserDevicesRequest setAppStatuses(java.util.List<String> appStatuses) {
        this.appStatuses = appStatuses;
        return this;
    }
    public java.util.List<String> getAppStatuses() {
        return this.appStatuses;
    }

    public ExportUserDevicesRequest setDepartment(String department) {
        this.department = department;
        return this;
    }
    public String getDepartment() {
        return this.department;
    }

    public ExportUserDevicesRequest setDeviceBelong(String deviceBelong) {
        this.deviceBelong = deviceBelong;
        return this;
    }
    public String getDeviceBelong() {
        return this.deviceBelong;
    }

    public ExportUserDevicesRequest setDeviceStatuses(java.util.List<String> deviceStatuses) {
        this.deviceStatuses = deviceStatuses;
        return this;
    }
    public java.util.List<String> getDeviceStatuses() {
        return this.deviceStatuses;
    }

    public ExportUserDevicesRequest setDeviceTags(java.util.List<String> deviceTags) {
        this.deviceTags = deviceTags;
        return this;
    }
    public java.util.List<String> getDeviceTags() {
        return this.deviceTags;
    }

    public ExportUserDevicesRequest setDeviceTypes(java.util.List<String> deviceTypes) {
        this.deviceTypes = deviceTypes;
        return this;
    }
    public java.util.List<String> getDeviceTypes() {
        return this.deviceTypes;
    }

    public ExportUserDevicesRequest setDlpStatuses(java.util.List<String> dlpStatuses) {
        this.dlpStatuses = dlpStatuses;
        return this;
    }
    public java.util.List<String> getDlpStatuses() {
        return this.dlpStatuses;
    }

    public ExportUserDevicesRequest setHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }
    public String getHostname() {
        return this.hostname;
    }

    public ExportUserDevicesRequest setIaStatuses(java.util.List<String> iaStatuses) {
        this.iaStatuses = iaStatuses;
        return this;
    }
    public java.util.List<String> getIaStatuses() {
        return this.iaStatuses;
    }

    public ExportUserDevicesRequest setMac(String mac) {
        this.mac = mac;
        return this;
    }
    public String getMac() {
        return this.mac;
    }

    public ExportUserDevicesRequest setNacStatuses(java.util.List<String> nacStatuses) {
        this.nacStatuses = nacStatuses;
        return this;
    }
    public java.util.List<String> getNacStatuses() {
        return this.nacStatuses;
    }

    public ExportUserDevicesRequest setPaStatuses(java.util.List<String> paStatuses) {
        this.paStatuses = paStatuses;
        return this;
    }
    public java.util.List<String> getPaStatuses() {
        return this.paStatuses;
    }

    public ExportUserDevicesRequest setSaseUserId(String saseUserId) {
        this.saseUserId = saseUserId;
        return this;
    }
    public String getSaseUserId() {
        return this.saseUserId;
    }

    public ExportUserDevicesRequest setSharingStatus(Boolean sharingStatus) {
        this.sharingStatus = sharingStatus;
        return this;
    }
    public Boolean getSharingStatus() {
        return this.sharingStatus;
    }

    public ExportUserDevicesRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
