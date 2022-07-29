// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListAlertsRequest extends TeaModel {
    @NameInMap("AlertName")
    public String alertName;

    @NameInMap("DispatchRuleId")
    public Long dispatchRuleId;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("IntegrationType")
    public String integrationType;

    @NameInMap("Page")
    public Long page;

    @NameInMap("Severity")
    public String severity;

    @NameInMap("ShowActivities")
    public Boolean showActivities;

    @NameInMap("ShowEvents")
    public Boolean showEvents;

    @NameInMap("Size")
    public Long size;

    @NameInMap("StartTime")
    public String startTime;

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
