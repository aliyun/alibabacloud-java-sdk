// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class PageServiceCustomerRequest extends TeaModel {
    @NameInMap("AuthStatus")
    public Integer authStatus;

    @NameInMap("CmAuthStatus")
    public Integer cmAuthStatus;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("MonitorAuthStatus")
    public Integer monitorAuthStatus;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("StartTime")
    public Long startTime;

    public static PageServiceCustomerRequest build(java.util.Map<String, ?> map) throws Exception {
        PageServiceCustomerRequest self = new PageServiceCustomerRequest();
        return TeaModel.build(map, self);
    }

    public PageServiceCustomerRequest setAuthStatus(Integer authStatus) {
        this.authStatus = authStatus;
        return this;
    }
    public Integer getAuthStatus() {
        return this.authStatus;
    }

    public PageServiceCustomerRequest setCmAuthStatus(Integer cmAuthStatus) {
        this.cmAuthStatus = cmAuthStatus;
        return this;
    }
    public Integer getCmAuthStatus() {
        return this.cmAuthStatus;
    }

    public PageServiceCustomerRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public PageServiceCustomerRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public PageServiceCustomerRequest setMonitorAuthStatus(Integer monitorAuthStatus) {
        this.monitorAuthStatus = monitorAuthStatus;
        return this;
    }
    public Integer getMonitorAuthStatus() {
        return this.monitorAuthStatus;
    }

    public PageServiceCustomerRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public PageServiceCustomerRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
