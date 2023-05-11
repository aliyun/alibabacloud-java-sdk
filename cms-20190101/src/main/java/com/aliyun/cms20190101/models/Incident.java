// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class Incident extends TeaModel {
    @NameInMap("ActionTime")
    public Long actionTime;

    @NameInMap("AlertCount")
    public Long alertCount;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("GroupingData")
    public java.util.Map<String, ?> groupingData;

    @NameInMap("GroupingId")
    public String groupingId;

    @NameInMap("GroupingKey")
    public String groupingKey;

    @NameInMap("IncidentId")
    public String incidentId;

    @NameInMap("IncidentStatus")
    public String incidentStatus;

    @NameInMap("Severity")
    public String severity;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("StrategyUuid")
    public String strategyUuid;

    @NameInMap("UserId")
    public String userId;

    public static Incident build(java.util.Map<String, ?> map) throws Exception {
        Incident self = new Incident();
        return TeaModel.build(map, self);
    }

    public Incident setActionTime(Long actionTime) {
        this.actionTime = actionTime;
        return this;
    }
    public Long getActionTime() {
        return this.actionTime;
    }

    public Incident setAlertCount(Long alertCount) {
        this.alertCount = alertCount;
        return this;
    }
    public Long getAlertCount() {
        return this.alertCount;
    }

    public Incident setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public Incident setGroupingData(java.util.Map<String, ?> groupingData) {
        this.groupingData = groupingData;
        return this;
    }
    public java.util.Map<String, ?> getGroupingData() {
        return this.groupingData;
    }

    public Incident setGroupingId(String groupingId) {
        this.groupingId = groupingId;
        return this;
    }
    public String getGroupingId() {
        return this.groupingId;
    }

    public Incident setGroupingKey(String groupingKey) {
        this.groupingKey = groupingKey;
        return this;
    }
    public String getGroupingKey() {
        return this.groupingKey;
    }

    public Incident setIncidentId(String incidentId) {
        this.incidentId = incidentId;
        return this;
    }
    public String getIncidentId() {
        return this.incidentId;
    }

    public Incident setIncidentStatus(String incidentStatus) {
        this.incidentStatus = incidentStatus;
        return this;
    }
    public String getIncidentStatus() {
        return this.incidentStatus;
    }

    public Incident setSeverity(String severity) {
        this.severity = severity;
        return this;
    }
    public String getSeverity() {
        return this.severity;
    }

    public Incident setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public Incident setStrategyUuid(String strategyUuid) {
        this.strategyUuid = strategyUuid;
        return this;
    }
    public String getStrategyUuid() {
        return this.strategyUuid;
    }

    public Incident setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
