// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class PageServiceCustomerRequest extends TeaModel {
    /**
     * <p>Authorization status.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AuthStatus")
    public Integer authStatus;

    /**
     * <p>Cloud Monitoring - Alert authorization status.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CmAuthStatus")
    public Integer cmAuthStatus;

    /**
     * <p>The page number of the query result, default is 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>End time. The format is a Unix timestamp, which is the number of milliseconds since January 1, 1970.</p>
     * 
     * <strong>example:</strong>
     * <p>1710641101123</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>Cloud Security - Alert authorization status.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MonitorAuthStatus")
    public Integer monitorAuthStatus;

    /**
     * <p>Number of records per page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Start time. The format is a Unix timestamp, which is the number of milliseconds since January 1, 1970.</p>
     * 
     * <strong>example:</strong>
     * <p>1710641101000</p>
     */
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
