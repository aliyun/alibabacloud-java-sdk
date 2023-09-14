// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListExcessiveDeviceRegistrationApplicationsRequest extends TeaModel {
    @NameInMap("ApplicationIds")
    public java.util.List<String> applicationIds;

    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("Department")
    public String department;

    @NameInMap("DeviceTag")
    public String deviceTag;

    @NameInMap("Hostname")
    public String hostname;

    @NameInMap("Mac")
    public String mac;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("SaseUserId")
    public String saseUserId;

    @NameInMap("Statuses")
    public java.util.List<String> statuses;

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
