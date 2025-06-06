// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListEnterpriseAccelerateLogsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Department")
    public String department;

    @NameInMap("DstAddr")
    public String dstAddr;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1748422694</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SearchMode")
    public String searchMode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1748419094</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("Username")
    public String username;

    public static ListEnterpriseAccelerateLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEnterpriseAccelerateLogsRequest self = new ListEnterpriseAccelerateLogsRequest();
        return TeaModel.build(map, self);
    }

    public ListEnterpriseAccelerateLogsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListEnterpriseAccelerateLogsRequest setDepartment(String department) {
        this.department = department;
        return this;
    }
    public String getDepartment() {
        return this.department;
    }

    public ListEnterpriseAccelerateLogsRequest setDstAddr(String dstAddr) {
        this.dstAddr = dstAddr;
        return this;
    }
    public String getDstAddr() {
        return this.dstAddr;
    }

    public ListEnterpriseAccelerateLogsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListEnterpriseAccelerateLogsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListEnterpriseAccelerateLogsRequest setSearchMode(String searchMode) {
        this.searchMode = searchMode;
        return this;
    }
    public String getSearchMode() {
        return this.searchMode;
    }

    public ListEnterpriseAccelerateLogsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListEnterpriseAccelerateLogsRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
