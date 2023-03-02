// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListAlertsRequest extends TeaModel {
    @NameInMap("alertLevel")
    public String alertLevel;

    @NameInMap("alertName")
    public String alertName;

    @NameInMap("alertSourceName")
    public String alertSourceName;

    /**
     * <p>2020-09-10 21:00:00</p>
     */
    @NameInMap("endTime")
    public String endTime;

    @NameInMap("monitorSourceId")
    public String monitorSourceId;

    @NameInMap("pageNumber")
    public Long pageNumber;

    @NameInMap("pageSize")
    public Long pageSize;

    @NameInMap("relatedServiceId")
    public Long relatedServiceId;

    @NameInMap("ruleName")
    public String ruleName;

    /**
     * <p>2020-09-10 13:00:00</p>
     */
    @NameInMap("startTime")
    public String startTime;

    public static ListAlertsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAlertsRequest self = new ListAlertsRequest();
        return TeaModel.build(map, self);
    }

    public ListAlertsRequest setAlertLevel(String alertLevel) {
        this.alertLevel = alertLevel;
        return this;
    }
    public String getAlertLevel() {
        return this.alertLevel;
    }

    public ListAlertsRequest setAlertName(String alertName) {
        this.alertName = alertName;
        return this;
    }
    public String getAlertName() {
        return this.alertName;
    }

    public ListAlertsRequest setAlertSourceName(String alertSourceName) {
        this.alertSourceName = alertSourceName;
        return this;
    }
    public String getAlertSourceName() {
        return this.alertSourceName;
    }

    public ListAlertsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListAlertsRequest setMonitorSourceId(String monitorSourceId) {
        this.monitorSourceId = monitorSourceId;
        return this;
    }
    public String getMonitorSourceId() {
        return this.monitorSourceId;
    }

    public ListAlertsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListAlertsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAlertsRequest setRelatedServiceId(Long relatedServiceId) {
        this.relatedServiceId = relatedServiceId;
        return this;
    }
    public Long getRelatedServiceId() {
        return this.relatedServiceId;
    }

    public ListAlertsRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public ListAlertsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
