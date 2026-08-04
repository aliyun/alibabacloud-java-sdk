// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListUserDevicesRequest extends TeaModel {
    /**
     * <p>The collection of client statuses.</p>
     */
    @NameInMap("AppStatuses")
    public java.util.List<String> appStatuses;

    /**
     * <p>The collection of client versions.</p>
     */
    @NameInMap("AppVersions")
    public java.util.List<String> appVersions;

    @NameInMap("AutoLoginStatuses")
    public java.util.List<String> autoLoginStatuses;

    /**
     * <p>The page number of the current page in a paging query. Valid values: 1 to 10000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    /**
     * <p>The department to which the user belongs. The value is 1 to 128 characters in length and supports Chinese characters and uppercase and lowercase letters. It can contain digits, periods (.), commas (,), semicolons (;), hyphens (-), underscores (_), forward slashes (/), at signs (@), and spaces.</p>
     * 
     * <strong>example:</strong>
     * <p>测试部</p>
     */
    @NameInMap("Department")
    public String department;

    /**
     * <p>The ownership of the endpoint device. Valid values:</p>
     * <ul>
     * <li><strong>Personal</strong>: personal device.</li>
     * <li><strong>Company</strong>: company device.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Company</p>
     */
    @NameInMap("DeviceBelong")
    public String deviceBelong;

    /**
     * <p>The device group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>device-group-5191cf830a5e****</p>
     */
    @NameInMap("DeviceGroupId")
    public String deviceGroupId;

    /**
     * <p>The collection of endpoint device statuses.</p>
     */
    @NameInMap("DeviceStatuses")
    public java.util.List<String> deviceStatuses;

    /**
     * <p>The collection of endpoint device IDs.</p>
     */
    @NameInMap("DeviceTags")
    public java.util.List<String> deviceTags;

    /**
     * <p>The collection of endpoint device operating system types.</p>
     */
    @NameInMap("DeviceTypes")
    public java.util.List<String> deviceTypes;

    /**
     * <p>The collection of office data protection statuses.</p>
     */
    @NameInMap("DlpStatuses")
    public java.util.List<String> dlpStatuses;

    /**
     * <p>The name of the endpoint device. The value is 1 to 128 characters in length and supports Chinese characters and uppercase and lowercase letters. It can contain digits, periods (.), commas (,), semicolons (;), hyphens (-), underscores (<em>), forward slashes (/), at signs (@), and spaces. If you enter only an underscore (</em>), endpoint devices whose names contain 4-byte UTF-8 characters are also queried.</p>
     * 
     * <strong>example:</strong>
     * <p>win10-64bit</p>
     */
    @NameInMap("Hostname")
    public String hostname;

    /**
     * <p>The collection of Internet access statuses.</p>
     */
    @NameInMap("IaStatuses")
    public java.util.List<String> iaStatuses;

    /**
     * <p>The internal IP address of the endpoint device.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("InnerIp")
    public String innerIp;

    /**
     * <p>The MAC address of the endpoint device.</p>
     * 
     * <strong>example:</strong>
     * <p>00:16:XX:XX:7c:46</p>
     */
    @NameInMap("Mac")
    public String mac;

    /**
     * <p>The collection of network access control statuses.</p>
     */
    @NameInMap("NacStatuses")
    public java.util.List<String> nacStatuses;

    /**
     * <p>The collection of private access statuses.</p>
     */
    @NameInMap("PaStatuses")
    public java.util.List<String> paStatuses;

    /**
     * <p>The number of entries per page in a paging query. Settings: 1 to 500.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The user ID. You can obtain this value from the following operations:</p>
     * <ul>
     * <li><a href="~~GetUserDevice~~">GetUserDevice</a>: Queries the details of a user endpoint device.</li>
     * <li><a href="~~ListUserDevices~~">ListUserDevices</a>: Lists user endpoint devices.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>su_e8f218fb171edd167c2ad917d21f53148bdefc510ca1f3c3cc0249d3643d****</p>
     */
    @NameInMap("SaseUserId")
    public String saseUserId;

    /**
     * <p>Specifies whether sharing is enabled for the device. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Sharing is enabled.</li>
     * <li><strong>false</strong>: Sharing is disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SharingStatus")
    public Boolean sharingStatus;

    /**
     * <p>The BIOS system serial number.</p>
     * 
     * <strong>example:</strong>
     * <p>5CG003****</p>
     */
    @NameInMap("SnBios")
    public String snBios;

    /**
     * <p>The system serial number.</p>
     * 
     * <strong>example:</strong>
     * <p>KVN9C9****</p>
     */
    @NameInMap("SnSystem")
    public String snSystem;

    /**
     * <p>The sort parameter. Valid values:</p>
     * <ul>
     * <li><strong>Username</strong>: sorted by Username in ascending order.</li>
     * <li><strong>AppVersion</strong>: sorted by AppVersion in descending order.</li>
     * <li><strong>UpdateTime</strong>: sorted by UpdateTime in descending order.</li>
     * <li><strong>CreateTime</strong>: sorted by CreateTime in descending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>UpdateTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The username. The value is 1 to 128 characters in length and supports Chinese characters and uppercase and lowercase letters. It can contain digits, periods (.), underscores (_), hyphens (-), asterisks (*), at signs (@), and spaces.</p>
     * 
     * <strong>example:</strong>
     * <p>王先生</p>
     */
    @NameInMap("Username")
    public String username;

    /**
     * <p>The name of the office area.</p>
     * 
     * <strong>example:</strong>
     * <p>测试办公区</p>
     */
    @NameInMap("Workshop")
    public String workshop;

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

    public ListUserDevicesRequest setAppVersions(java.util.List<String> appVersions) {
        this.appVersions = appVersions;
        return this;
    }
    public java.util.List<String> getAppVersions() {
        return this.appVersions;
    }

    public ListUserDevicesRequest setAutoLoginStatuses(java.util.List<String> autoLoginStatuses) {
        this.autoLoginStatuses = autoLoginStatuses;
        return this;
    }
    public java.util.List<String> getAutoLoginStatuses() {
        return this.autoLoginStatuses;
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

    public ListUserDevicesRequest setDeviceGroupId(String deviceGroupId) {
        this.deviceGroupId = deviceGroupId;
        return this;
    }
    public String getDeviceGroupId() {
        return this.deviceGroupId;
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

    public ListUserDevicesRequest setSnBios(String snBios) {
        this.snBios = snBios;
        return this;
    }
    public String getSnBios() {
        return this.snBios;
    }

    public ListUserDevicesRequest setSnSystem(String snSystem) {
        this.snSystem = snSystem;
        return this;
    }
    public String getSnSystem() {
        return this.snSystem;
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

    public ListUserDevicesRequest setWorkshop(String workshop) {
        this.workshop = workshop;
        return this;
    }
    public String getWorkshop() {
        return this.workshop;
    }

}
