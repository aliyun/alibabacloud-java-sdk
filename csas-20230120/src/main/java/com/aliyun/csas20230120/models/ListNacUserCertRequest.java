// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListNacUserCertRequest extends TeaModel {
    /**
     * <p>Page number of the current page in a paged query. Valid values: 1 to 10000.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    /**
     * <p>Department that the user belongs to. The value must be 1 to 128 characters in length. It can contain Chinese characters, uppercase and lowercase letters, digits, periods (.), commas (,), semicolons (;), hyphens (-), underscores (_), forward slashes (/), at signs (@), and spaces.</p>
     * 
     * <strong>example:</strong>
     * <p>测试部</p>
     */
    @NameInMap("Department")
    public String department;

    /**
     * <p>Operating system type of the endpoint device. Valid values:</p>
     * <ul>
     * <li><p><strong>windows</strong>: Windows.</p>
     * </li>
     * <li><p><strong>macos</strong>: macOS.</p>
     * </li>
     * <li><p><strong>linux</strong>: Linux.</p>
     * </li>
     * <li><p><strong>android</strong>: Android.</p>
     * </li>
     * <li><p><strong>ios</strong>: iOS.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>windows</p>
     */
    @NameInMap("DeviceType")
    public String deviceType;

    /**
     * <p>End time.</p>
     * 
     * <strong>example:</strong>
     * <p>1702770400</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>Number of entries per page for a paged query. Valid values: 1 to 1000.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>Start time.</p>
     * 
     * <strong>example:</strong>
     * <p>1702260834</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>Certificate status. Valid values:</p>
     * <ul>
     * <li><p><strong>Enabled</strong>: Enabled.</p>
     * </li>
     * <li><p><strong>Disabled</strong>: Disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Username.</p>
     * 
     * <strong>example:</strong>
     * <p>zhang**</p>
     */
    @NameInMap("Username")
    public String username;

    public static ListNacUserCertRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNacUserCertRequest self = new ListNacUserCertRequest();
        return TeaModel.build(map, self);
    }

    public ListNacUserCertRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public ListNacUserCertRequest setDepartment(String department) {
        this.department = department;
        return this;
    }
    public String getDepartment() {
        return this.department;
    }

    public ListNacUserCertRequest setDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }
    public String getDeviceType() {
        return this.deviceType;
    }

    public ListNacUserCertRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListNacUserCertRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListNacUserCertRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListNacUserCertRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListNacUserCertRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
