// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchEventsRequest extends TeaModel {
    @NameInMap("ProxyUserId")
    public String proxyUserId;

    @NameInMap("AlertId")
    public Long alertId;

    @NameInMap("Pid")
    public String pid;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("AppType")
    public String appType;

    @NameInMap("AlertType")
    public Integer alertType;

    @NameInMap("IsTrigger")
    public Integer isTrigger;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("EndTime")
    public Long endTime;

    public static SearchEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchEventsRequest self = new SearchEventsRequest();
        return TeaModel.build(map, self);
    }

    public SearchEventsRequest setProxyUserId(String proxyUserId) {
        this.proxyUserId = proxyUserId;
        return this;
    }
    public String getProxyUserId() {
        return this.proxyUserId;
    }

    public SearchEventsRequest setAlertId(Long alertId) {
        this.alertId = alertId;
        return this;
    }
    public Long getAlertId() {
        return this.alertId;
    }

    public SearchEventsRequest setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

    public SearchEventsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public SearchEventsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchEventsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SearchEventsRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public SearchEventsRequest setAlertType(Integer alertType) {
        this.alertType = alertType;
        return this;
    }
    public Integer getAlertType() {
        return this.alertType;
    }

    public SearchEventsRequest setIsTrigger(Integer isTrigger) {
        this.isTrigger = isTrigger;
        return this;
    }
    public Integer getIsTrigger() {
        return this.isTrigger;
    }

    public SearchEventsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public SearchEventsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

}
