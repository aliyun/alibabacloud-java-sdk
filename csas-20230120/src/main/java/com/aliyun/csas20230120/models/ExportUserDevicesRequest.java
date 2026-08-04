// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ExportUserDevicesRequest extends TeaModel {
    /**
     * <p>Collection of client statuses.</p>
     */
    @NameInMap("AppStatuses")
    public java.util.List<String> appStatuses;

    /**
     * <p>Department name. Must be 1 to 128 characters long. Supports Chinese, uppercase and lowercase letters, digits, periods (.), commas (,), semicolons (;), hyphens (-), underscores (_), forward slashes (/), at signs (@), and spaces.</p>
     * 
     * <strong>example:</strong>
     * <p>测试部</p>
     */
    @NameInMap("Department")
    public String department;

    /**
     * <p>Terminal device ownership. Valid values:</p>
     * <ul>
     * <li><p><strong>Personal</strong>: Personal device.</p>
     * </li>
     * <li><p><strong>Company</strong>: Company device.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Company</p>
     */
    @NameInMap("DeviceBelong")
    public String deviceBelong;

    /**
     * <p>Collection of terminal device statuses.</p>
     */
    @NameInMap("DeviceStatuses")
    public java.util.List<String> deviceStatuses;

    /**
     * <p>Collection of terminal device IDs.</p>
     */
    @NameInMap("DeviceTags")
    public java.util.List<String> deviceTags;

    /**
     * <p>Collection of terminal device operating system types.</p>
     */
    @NameInMap("DeviceTypes")
    public java.util.List<String> deviceTypes;

    /**
     * <p>Collection of office data protection statuses.</p>
     */
    @NameInMap("DlpStatuses")
    public java.util.List<String> dlpStatuses;

    /**
     * <p>Terminal device name. Must be 1 to 128 characters long. Supports Chinese, uppercase and lowercase letters, digits, periods (.), commas (,), semicolons (;), hyphens (-), underscores (<em>), forward slashes (/), at signs (@), and spaces. If you enter only an underscore (</em>), the system returns all terminal devices whose names contain four-byte UTF-8 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>win10-64bit</p>
     */
    @NameInMap("Hostname")
    public String hostname;

    /**
     * <p>Collection of Internet access statuses.</p>
     */
    @NameInMap("IaStatuses")
    public java.util.List<String> iaStatuses;

    /**
     * <p>MAC address of the terminal device.</p>
     * 
     * <strong>example:</strong>
     * <p>00:16:7c:46:<strong>:</strong></p>
     */
    @NameInMap("Mac")
    public String mac;

    /**
     * <p>Collection of network admission statuses.</p>
     */
    @NameInMap("NacStatuses")
    public java.util.List<String> nacStatuses;

    /**
     * <p>Collection of private network access statuses.</p>
     */
    @NameInMap("PaStatuses")
    public java.util.List<String> paStatuses;

    /**
     * <p>User ID.</p>
     * 
     * <strong>example:</strong>
     * <p>su_e8f218fb171edd167c2ad917d21f53148bdefc510ca1f3c3cc0249d3643d****</p>
     */
    @NameInMap("SaseUserId")
    public String saseUserId;

    /**
     * <p>Whether device sharing is enabled. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Sharing is enabled.</p>
     * </li>
     * <li><p><strong>false</strong>: Sharing is disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SharingStatus")
    public Boolean sharingStatus;

    /**
     * <p>Username. Must be 1 to 128 characters long. Supports Chinese, uppercase and lowercase letters, digits, periods (.), underscores (_), hyphens (-), asterisks (\*), at signs (@), and spaces.</p>
     * 
     * <strong>example:</strong>
     * <p>王先生</p>
     */
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
