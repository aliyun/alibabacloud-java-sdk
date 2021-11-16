// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListAlertsRequest extends TeaModel {
    // 报警等级 P1 P2 P3 P4
    @NameInMap("alertLevel")
    public String alertLevel;

    // 报警名称
    @NameInMap("alertName")
    public String alertName;

    // 报警来源
    @NameInMap("alertSourceName")
    public String alertSourceName;

    // 结束时间
    @NameInMap("endTime")
    public String endTime;

    // 当前页
    @NameInMap("pageNumber")
    public Long pageNumber;

    // 页大小
    @NameInMap("pageSize")
    public Long pageSize;

    // 服务id
    @NameInMap("relatedServiceId")
    public Long relatedServiceId;

    // 开始时间
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

    public ListAlertsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
