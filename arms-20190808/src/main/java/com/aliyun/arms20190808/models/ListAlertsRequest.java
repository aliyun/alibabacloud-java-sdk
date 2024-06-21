// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListAlertsRequest extends TeaModel {
    /**
     * <p>The name of the alert rule.</p>
     * 
     * <strong>example:</strong>
     * <p>Test alert</p>
     */
    @NameInMap("AlertName")
    public String alertName;

    /**
     * <p>The ID of the notification policy.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("DispatchRuleId")
    public Long dispatchRuleId;

    /**
     * <p>The end time of the alert sending history that you want to query. Specify the time in the <code>YYYY-MM-DD HH:mm:ss</code> format.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-12-22 23:59:59</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The integration type.</p>
     * <ul>
     * <li>ARMS</li>
     * <li>CLOUD_MONITOR</li>
     * <li>MSE</li>
     * <li>ARMS_CLOUD_DIALTEST</li>
     * <li>PROMETHEUS</li>
     * <li>LOG_SERVICE</li>
     * <li>CUSTOM</li>
     * <li>ARMS_PROMETHEUS</li>
     * <li>ARMS_APP_MON</li>
     * <li>ARMS_FRONT_MON</li>
     * <li>ARMS_CUSTOM</li>
     * <li>XTRACE</li>
     * <li>GRAFANA</li>
     * <li>ZABBIX</li>
     * <li>SKYWALKING</li>
     * <li>EVENT_BRIDGE</li>
     * <li>NAGIOS</li>
     * <li>OPENFALCON</li>
     * <li>ARMS_INSIGHTS</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ARMS_APP_MON</p>
     */
    @NameInMap("IntegrationType")
    public String integrationType;

    /**
     * <p>The number of the page to return.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Page")
    public Long page;

    /**
     * <p>The ID of the region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The severity level of the alert. Valid values: P6, P5, P4, P3, P2, and P1. The preceding values are listed in ascending order of severity.</p>
     * 
     * <strong>example:</strong>
     * <p>P6</p>
     */
    @NameInMap("Severity")
    public String severity;

    /**
     * <p>Specifies whether to query the activities that correspond to alerts. Valid values:</p>
     * <ul>
     * <li><code>false</code> (default value): The activities are not queried.</li>
     * <li><code>true</code>: The activities in the last three days are queried.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ShowActivities")
    public Boolean showActivities;

    /**
     * <p>Specifies whether to query the events that correspond to alerts. Valid values:</p>
     * <ul>
     * <li><code>false</code> (default value): The events are not queried.</li>
     * <li><code>true</code>: The events are queried.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ShowEvents")
    public Boolean showEvents;

    /**
     * <p>The number of alerts to return on each page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("Size")
    public Long size;

    /**
     * <p>The start time of the alert sending history that you want to query. Specify the time in the <code>YYYY-MM-DD HH:mm:ss</code> format.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-12-10 00:00:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The status of the alert. Valid values:</p>
     * <ul>
     * <li>0: The alert is pending.</li>
     * <li>1: The alert is being handled.</li>
     * <li>2: The alert is handled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
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

    public ListAlertsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
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
