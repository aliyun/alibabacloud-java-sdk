// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListAlertsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>P1</p>
     */
    @NameInMap("alertLevel")
    public String alertLevel;

    /**
     * <strong>example:</strong>
     * <p>报警</p>
     */
    @NameInMap("alertName")
    public String alertName;

    /**
     * <strong>example:</strong>
     * <p>流转规则A</p>
     */
    @NameInMap("alertSourceName")
    public String alertSourceName;

    /**
     * <p>2020-09-10 21:00:00</p>
     * 
     * <strong>example:</strong>
     * <p>2020-10-01 23:59:59</p>
     */
    @NameInMap("endTime")
    public String endTime;

    @NameInMap("monitorSourceId")
    public String monitorSourceId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("relatedServiceId")
    public Long relatedServiceId;

    /**
     * <strong>example:</strong>
     * <p>zabbix</p>
     */
    @NameInMap("ruleName")
    public String ruleName;

    /**
     * <p>2020-09-10 13:00:00</p>
     * 
     * <strong>example:</strong>
     * <p>2020-10-01 00:00:00</p>
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
