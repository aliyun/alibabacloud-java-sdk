// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListAlertEventsRequest extends TeaModel {
    /**
     * <p>The name of the alert.</p>
     * 
     * <strong>example:</strong>
     * <p>Test-triggered alert</p>
     */
    @NameInMap("AlertName")
    public String alertName;

    /**
     * <p>The end time of the alert events that you want to query. Specify the time in the YYYY-MM-DD HH:mm:ss format.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-12-22 23:59:59</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The list of matching conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>[         {           &quot;value&quot;: &quot;ARMS_NOTIFICATION&quot;,           &quot;key&quot;: &quot;clustername&quot;,           &quot;operator&quot;: &quot;eq&quot;         }       ]     },{       &quot;matchingConditions&quot;: [         {           &quot;value&quot;: &quot;test&quot;,           &quot;key&quot;: &quot;alertname&quot;,           &quot;operator&quot;: &quot;eq&quot;         }       ]</p>
     */
    @NameInMap("MatchingConditions")
    public String matchingConditions;

    /**
     * <p>The number of the page to return.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Page")
    public Long page;

    @NameInMap("ShowNotificationPolicies")
    public Boolean showNotificationPolicies;

    /**
     * <p>The number of entries to return on each page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("Size")
    public Long size;

    /**
     * <p>The start time of the alert events that you want to query. Specify the time in the YYYY-MM-DD HH:mm:ss format.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-12-19 00:00:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The status of the alert events. Valid values:</p>
     * <ul>
     * <li>Active</li>
     * <li>Silenced</li>
     * <li>Resolved</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListAlertEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAlertEventsRequest self = new ListAlertEventsRequest();
        return TeaModel.build(map, self);
    }

    public ListAlertEventsRequest setAlertName(String alertName) {
        this.alertName = alertName;
        return this;
    }
    public String getAlertName() {
        return this.alertName;
    }

    public ListAlertEventsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListAlertEventsRequest setMatchingConditions(String matchingConditions) {
        this.matchingConditions = matchingConditions;
        return this;
    }
    public String getMatchingConditions() {
        return this.matchingConditions;
    }

    public ListAlertEventsRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListAlertEventsRequest setShowNotificationPolicies(Boolean showNotificationPolicies) {
        this.showNotificationPolicies = showNotificationPolicies;
        return this;
    }
    public Boolean getShowNotificationPolicies() {
        return this.showNotificationPolicies;
    }

    public ListAlertEventsRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public ListAlertEventsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListAlertEventsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
