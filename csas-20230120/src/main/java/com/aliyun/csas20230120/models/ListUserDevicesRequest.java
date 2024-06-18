// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListUserDevicesRequest extends TeaModel {
    @NameInMap("AppStatuses")
    public java.util.List<String> appStatuses;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("Department")
    public String department;

    /**
     * <strong>example:</strong>
     * <p>Company</p>
     */
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

    /**
     * <strong>example:</strong>
     * <p>win10-64bit</p>
     */
    @NameInMap("Hostname")
    public String hostname;

    @NameInMap("IaStatuses")
    public java.util.List<String> iaStatuses;

    @NameInMap("InnerIp")
    public String innerIp;

    /**
     * <strong>example:</strong>
     * <p>00:16:XX:XX:7c:46</p>
     */
    @NameInMap("Mac")
    public String mac;

    @NameInMap("NacStatuses")
    public java.util.List<String> nacStatuses;

    @NameInMap("PaStatuses")
    public java.util.List<String> paStatuses;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>su_e8f218fb171edd167c2ad917d21f53148bdefc510ca1f3c3cc0249d3643d****</p>
     */
    @NameInMap("SaseUserId")
    public String saseUserId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SharingStatus")
    public Boolean sharingStatus;

    @NameInMap("SortBy")
    public String sortBy;

    @NameInMap("Username")
    public String username;

    public static ListUserDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserDevicesRequest self = new ListUserDevicesRequest();
        return TeaModel.build(map, self);
    }

    public ListUserDevicesRequest setAppStatuses(java.util.List<String> appStatuses) {
        this.appStatuses = appStatuses;
        return this;
    }
    public java.util.List<String> getAppStatuses() {
        return this.appStatuses;
    }

    public ListUserDevicesRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListUserDevicesRequest setDepartment(String department) {
        this.department = department;
        return this;
    }
    public String getDepartment() {
        return this.department;
    }

    public ListUserDevicesRequest setDeviceBelong(String deviceBelong) {
        this.deviceBelong = deviceBelong;
        return this;
    }
    public String getDeviceBelong() {
        return this.deviceBelong;
    }

    public ListUserDevicesRequest setDeviceStatuses(java.util.List<String> deviceStatuses) {
        this.deviceStatuses = deviceStatuses;
        return this;
    }
    public java.util.List<String> getDeviceStatuses() {
        return this.deviceStatuses;
    }

    public ListUserDevicesRequest setDeviceTags(java.util.List<String> deviceTags) {
        this.deviceTags = deviceTags;
        return this;
    }
    public java.util.List<String> getDeviceTags() {
        return this.deviceTags;
    }

    public ListUserDevicesRequest setDeviceTypes(java.util.List<String> deviceTypes) {
        this.deviceTypes = deviceTypes;
        return this;
    }
    public java.util.List<String> getDeviceTypes() {
        return this.deviceTypes;
    }

    public ListUserDevicesRequest setDlpStatuses(java.util.List<String> dlpStatuses) {
        this.dlpStatuses = dlpStatuses;
        return this;
    }
    public java.util.List<String> getDlpStatuses() {
        return this.dlpStatuses;
    }

    public ListUserDevicesRequest setHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }
    public String getHostname() {
        return this.hostname;
    }

    public ListUserDevicesRequest setIaStatuses(java.util.List<String> iaStatuses) {
        this.iaStatuses = iaStatuses;
        return this;
    }
    public java.util.List<String> getIaStatuses() {
        return this.iaStatuses;
    }

    public ListUserDevicesRequest setInnerIp(String innerIp) {
        this.innerIp = innerIp;
        return this;
    }
    public String getInnerIp() {
        return this.innerIp;
    }

    public ListUserDevicesRequest setMac(String mac) {
        this.mac = mac;
        return this;
    }
    public String getMac() {
        return this.mac;
    }

    public ListUserDevicesRequest setNacStatuses(java.util.List<String> nacStatuses) {
        this.nacStatuses = nacStatuses;
        return this;
    }
    public java.util.List<String> getNacStatuses() {
        return this.nacStatuses;
    }

    public ListUserDevicesRequest setPaStatuses(java.util.List<String> paStatuses) {
        this.paStatuses = paStatuses;
        return this;
    }
    public java.util.List<String> getPaStatuses() {
        return this.paStatuses;
    }

    public ListUserDevicesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListUserDevicesRequest setSaseUserId(String saseUserId) {
        this.saseUserId = saseUserId;
        return this;
    }
    public String getSaseUserId() {
        return this.saseUserId;
    }

    public ListUserDevicesRequest setSharingStatus(Boolean sharingStatus) {
        this.sharingStatus = sharingStatus;
        return this;
    }
    public Boolean getSharingStatus() {
        return this.sharingStatus;
    }

    public ListUserDevicesRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListUserDevicesRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
