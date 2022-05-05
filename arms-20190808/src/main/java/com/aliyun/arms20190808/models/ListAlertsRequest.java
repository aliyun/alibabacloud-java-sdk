// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListAlertsRequest extends TeaModel {
    // 告警名称
    @NameInMap("AlertName")
    public String alertName;

    // 通知策略ID
    @NameInMap("DispatchRuleId")
    public Long dispatchRuleId;

    // 查询告警发送历史记录的开始时间，时间格式：YYYY-MM-DD HH:mm:ss
    @NameInMap("EndTime")
    public String endTime;

    // 集成类型
    @NameInMap("IntegrationType")
    public String integrationType;

    // 页数
    @NameInMap("Page")
    public Long page;

    // 告警等级(P1~P6)
    @NameInMap("Severity")
    public String severity;

    // 默认不查活动记录，showActivities=true才查，只查最近3天的内容
    @NameInMap("ShowActivities")
    public Boolean showActivities;

    // 默认不查事件，showEvents=true才查
    @NameInMap("ShowEvents")
    public Boolean showEvents;

    // 每页展示数目
    @NameInMap("Size")
    public Long size;

    // 查询告警发送历史记录的开始时间，时间格式：YYYY-MM-DD HH:mm:ss
    @NameInMap("StartTime")
    public String startTime;

    // 告警状态(0 - 待处理， 1 - 处理中， 2 - 已处理)
    @NameInMap("State")
    public Long state;

    public static ListAlertsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAlertsRequest self = new ListAlertsRequest();
        return TeaModel.build(map, self);
    }

    public ListAlertsRequest setAlertName(String alertName) {
        this.alertName = alertName;
        return this;
    }
    public String getAlertName() {
        return this.alertName;
    }

    public ListAlertsRequest setDispatchRuleId(Long dispatchRuleId) {
        this.dispatchRuleId = dispatchRuleId;
        return this;
    }
    public Long getDispatchRuleId() {
        return this.dispatchRuleId;
    }

    public ListAlertsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListAlertsRequest setIntegrationType(String integrationType) {
        this.integrationType = integrationType;
        return this;
    }
    public String getIntegrationType() {
        return this.integrationType;
    }

    public ListAlertsRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListAlertsRequest setSeverity(String severity) {
        this.severity = severity;
        return this;
    }
    public String getSeverity() {
        return this.severity;
    }

    public ListAlertsRequest setShowActivities(Boolean showActivities) {
        this.showActivities = showActivities;
        return this;
    }
    public Boolean getShowActivities() {
        return this.showActivities;
    }

    public ListAlertsRequest setShowEvents(Boolean showEvents) {
        this.showEvents = showEvents;
        return this;
    }
    public Boolean getShowEvents() {
        return this.showEvents;
    }

    public ListAlertsRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public ListAlertsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListAlertsRequest setState(Long state) {
        this.state = state;
        return this;
    }
    public Long getState() {
        return this.state;
    }

}
