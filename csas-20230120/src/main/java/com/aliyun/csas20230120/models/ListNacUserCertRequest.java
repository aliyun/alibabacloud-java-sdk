// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListNacUserCertRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    @NameInMap("Department")
    public String department;

    /**
     * <strong>example:</strong>
     * <p>windows</p>
     */
    @NameInMap("DeviceType")
    public String deviceType;

    /**
     * <strong>example:</strong>
     * <p>1702770400</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <strong>example:</strong>
     * <p>1702260834</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("Status")
    public String status;

    /**
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
