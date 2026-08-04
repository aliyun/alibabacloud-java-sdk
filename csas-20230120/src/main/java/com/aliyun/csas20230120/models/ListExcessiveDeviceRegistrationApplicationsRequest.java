// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListExcessiveDeviceRegistrationApplicationsRequest extends TeaModel {
    /**
     * <p>The IDs of the excessive device registration applications.</p>
     */
    @NameInMap("ApplicationIds")
    public java.util.List<String> applicationIds;

    /**
     * <p>The page number. Valid values: 1 to 10,000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    /**
     * <p>The user\&quot;s department. The value must be 1 to 128 characters long and can contain Chinese characters, uppercase and lowercase letters, digits, periods (.), commas (,), semicolons (;), hyphens (-), underscores (_), forward slashes (/), at signs (@), and spaces.</p>
     * 
     * <strong>example:</strong>
     * <p>测试部</p>
     */
    @NameInMap("Department")
    public String department;

    /**
     * <p>The device ID. You can get the device ID from the <code>DeviceTag</code> parameter returned by the following operations:</p>
     * <ul>
     * <li><p><a href="~~GetUserDevice~~">GetUserDevice</a>: Queries the details of a user\&quot;s device.</p>
     * </li>
     * <li><p><a href="~~ListUserDevices~~">ListUserDevices</a>: Queries a list of devices for a user.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>36efa42d-2c32-c4dc-e3fc-8541e33a****</p>
     */
    @NameInMap("DeviceTag")
    public String deviceTag;

    /**
     * <p>The hostname of the device. The value must be 1 to 128 characters long and can contain Chinese characters, uppercase and lowercase letters, digits, periods (.), commas (,), semicolons (;), hyphens (-), underscores (<em>), forward slashes (/), at signs (@), and spaces. If you specify only an underscore (</em>), the query is extended to include devices whose hostnames contain 4-byte UTF-8 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>win10-64bit</p>
     */
    @NameInMap("Hostname")
    public String hostname;

    /**
     * <p>The MAC address of the device.</p>
     * 
     * <strong>example:</strong>
     * <p>00:16:XX:XX:7c:46</p>
     */
    @NameInMap("Mac")
    public String mac;

    /**
     * <p>The number of entries on each page. Valid values: 1 to 500.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The user ID. You can get the user ID from the <code>SaseUserId</code> parameter returned by the following operations:</p>
     * <ul>
     * <li><p><a href="~~GetUserDevice~~">GetUserDevice</a>: Queries the details of a user\&quot;s device.</p>
     * </li>
     * <li><p><a href="~~ListUserDevices~~">ListUserDevices</a>: Queries a list of devices for a user.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>su_e8f218fb171edd167c2ad917d21f53148bdefc510ca1f3c3cc0249d3643d****</p>
     */
    @NameInMap("SaseUserId")
    public String saseUserId;

    /**
     * <p>The statuses of excessive device registration applications.</p>
     */
    @NameInMap("Statuses")
    public java.util.List<String> statuses;

    /**
     * <p>The username. The value must be 1 to 128 characters long and can contain Chinese characters, uppercase and lowercase letters, digits, periods (.), underscores (_), hyphens (-), asterisks (\*), at signs (@), and spaces.</p>
     * 
     * <strong>example:</strong>
     * <p>王先生</p>
     */
    @NameInMap("Username")
    public String username;

    public static ListExcessiveDeviceRegistrationApplicationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListExcessiveDeviceRegistrationApplicationsRequest self = new ListExcessiveDeviceRegistrationApplicationsRequest();
        return TeaModel.build(map, self);
    }

    public ListExcessiveDeviceRegistrationApplicationsRequest setApplicationIds(java.util.List<String> applicationIds) {
        this.applicationIds = applicationIds;
        return this;
    }
    public java.util.List<String> getApplicationIds() {
        return this.applicationIds;
    }

    public ListExcessiveDeviceRegistrationApplicationsRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListExcessiveDeviceRegistrationApplicationsRequest setDepartment(String department) {
        this.department = department;
        return this;
    }
    public String getDepartment() {
        return this.department;
    }

    public ListExcessiveDeviceRegistrationApplicationsRequest setDeviceTag(String deviceTag) {
        this.deviceTag = deviceTag;
        return this;
    }
    public String getDeviceTag() {
        return this.deviceTag;
    }

    public ListExcessiveDeviceRegistrationApplicationsRequest setHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }
    public String getHostname() {
        return this.hostname;
    }

    public ListExcessiveDeviceRegistrationApplicationsRequest setMac(String mac) {
        this.mac = mac;
        return this;
    }
    public String getMac() {
        return this.mac;
    }

    public ListExcessiveDeviceRegistrationApplicationsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListExcessiveDeviceRegistrationApplicationsRequest setSaseUserId(String saseUserId) {
        this.saseUserId = saseUserId;
        return this;
    }
    public String getSaseUserId() {
        return this.saseUserId;
    }

    public ListExcessiveDeviceRegistrationApplicationsRequest setStatuses(java.util.List<String> statuses) {
        this.statuses = statuses;
        return this;
    }
    public java.util.List<String> getStatuses() {
        return this.statuses;
    }

    public ListExcessiveDeviceRegistrationApplicationsRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
