// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeAlertLogHistogramRequest extends TeaModel {
    /**
     * <p>The alert contact group.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS_Group</p>
     */
    @NameInMap("ContactGroup")
    public String contactGroup;

    /**
     * <p>The end timestamp for querying alert history.</p>
     * <p>Unit: milliseconds.</p>
     * <blockquote>
     * <ul>
     * <li>You can only query the alert history of the last year.</li>
     * <li>The time interval between the start time (<code>StartTime</code>) and the end time (<code>EndTime</code>) must be less than or equal to 15 days.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1609989009694</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The alert type. Valid values:</p>
     * <ul>
     * <li>TRIGGERED: The alert is triggered.</li>
     * <li>RESOLVED: The alert recovers.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RESOLVED</p>
     */
    @NameInMap("EventType")
    public String eventType;

    /**
     * <p>The dimension for data aggregation, which is equivalent to the GROUP BY clause in SQL. Valid values:</p>
     * <ul>
     * <li><code>product</code>: Aggregates data by cloud service.</li>
     * <li><code>level</code>: Aggregates data by alert level.</li>
     * <li><code>groupId</code>: Aggregates data by application group.</li>
     * <li><code>contactGroup</code>: Aggregates data by alert contact group.</li>
     * <li><code>product,metricName</code>: Aggregates data by cloud service and metric.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>product</p>
     */
    @NameInMap("GroupBy")
    public String groupBy;

    /**
     * <p>The ID of the application group.</p>
     * 
     * <strong>example:</strong>
     * <p>7301****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The period for retrieving logs. Unit: minutes.</p>
     * 
     * <strong>example:</strong>
     * <p>360</p>
     */
    @NameInMap("LastMin")
    public String lastMin;

    /**
     * <p>The alert level and notification method. Valid values:</p>
     * <p>&lt;props=&quot;china&quot;&gt;- P2: Phone call + text message + email + DingTalk chatbot.</p>
     * <p>&lt;props=&quot;china&quot;&gt;- P3: Text message + email + DingTalk chatbot.</p>
     * <p>&lt;props=&quot;china&quot;&gt;- P4: Email + DingTalk chatbot.</p>
     * <p>&lt;props=&quot;china&quot;&gt;- OK: No alert.</p>
     * <p>&lt;props=&quot;intl&quot;&gt;- P4: Email + DingTalk chatbot.</p>
     * <p>&lt;props=&quot;intl&quot;&gt;- OK: No alert.</p>
     * <p>&lt;props=&quot;partner&quot;&gt;- P4: Email + DingTalk chatbot.</p>
     * <p>&lt;props=&quot;partner&quot;&gt;- OK: No alert.</p>
     * 
     * <strong>example:</strong>
     * <p>P4</p>
     */
    @NameInMap("Level")
    public String level;

    /**
     * <p>The name of the metric.</p>
     * <blockquote>
     * <p>For more information about the metrics of cloud services, see <a href="https://help.aliyun.com/document_detail/163515.html">Cloud service metrics</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cpu_total</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>The namespace of the cloud service.</p>
     * <blockquote>
     * <p>For more information about the namespaces of cloud services, see <a href="https://help.aliyun.com/document_detail/163515.html">Cloud service metrics</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>acs_ecs_dashboard</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The page number.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The abbreviation of the cloud service name.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS</p>
     */
    @NameInMap("Product")
    public String product;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the alert rule.</p>
     * <p>For more information about how to obtain the ID of an alert rule, see <a href="https://help.aliyun.com/document_detail/114941.html">DescribeMetricRuleList</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>ae06917_75a8c43178ab66****</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    /**
     * <p>The name of the alert rule.</p>
     * 
     * <strong>example:</strong>
     * <p>test123</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The search keyword for querying alert history.</p>
     * 
     * <strong>example:</strong>
     * <p>alert</p>
     */
    @NameInMap("SearchKey")
    public String searchKey;

    /**
     * <p>The alert status. Valid values:</p>
     * <ul>
     * <li>0: An alert is triggered or the alert recovers to Normal.</li>
     * <li>1: Outside the effective period.</li>
     * <li>2: Mute epoch.</li>
     * <li>3: The host is restarting.</li>
     * <li>4: Does not send alert notifications.</li>
     * </ul>
     * <p>&lt;props=&quot;china&quot;&gt;If the alert status is 0 and the value of Level is P2, P3, or P4, an alert is triggered. If the value of Level is OK, the alert recovers to Normal.
     * &lt;props=&quot;intl&quot;&gt;If the alert status is 0 and the value of Level is P4, an alert is triggered. If the value of Level is OK, the alert recovers to Normal.
     * &lt;props=&quot;partner&quot;&gt;If the alert status is 0 and the value of Level is P4, an alert is triggered. If the value of Level is OK, the alert recovers to Normal.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SendStatus")
    public String sendStatus;

    /**
     * <p><strong>[Deprecated]</strong> This parameter is deprecated. You do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("SourceType")
    @Deprecated
    public String sourceType;

    /**
     * <p>The start timestamp for querying alert history.</p>
     * <p>Unit: milliseconds.</p>
     * <blockquote>
     * <ul>
     * <li>You can only query the alert history of the last year.</li>
     * <li>The time interval between the start time (<code>StartTime</code>) and the end time (<code>EndTime</code>) must be less than or equal to 15 days.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1609988009694</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeAlertLogHistogramRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertLogHistogramRequest self = new DescribeAlertLogHistogramRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAlertLogHistogramRequest setContactGroup(String contactGroup) {
        this.contactGroup = contactGroup;
        return this;
    }
    public String getContactGroup() {
        return this.contactGroup;
    }

    public DescribeAlertLogHistogramRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeAlertLogHistogramRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public DescribeAlertLogHistogramRequest setGroupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }
    public String getGroupBy() {
        return this.groupBy;
    }

    public DescribeAlertLogHistogramRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeAlertLogHistogramRequest setLastMin(String lastMin) {
        this.lastMin = lastMin;
        return this;
    }
    public String getLastMin() {
        return this.lastMin;
    }

    public DescribeAlertLogHistogramRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public DescribeAlertLogHistogramRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public DescribeAlertLogHistogramRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DescribeAlertLogHistogramRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAlertLogHistogramRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAlertLogHistogramRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public DescribeAlertLogHistogramRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAlertLogHistogramRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public DescribeAlertLogHistogramRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public DescribeAlertLogHistogramRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public DescribeAlertLogHistogramRequest setSendStatus(String sendStatus) {
        this.sendStatus = sendStatus;
        return this;
    }
    public String getSendStatus() {
        return this.sendStatus;
    }

    @Deprecated
    public DescribeAlertLogHistogramRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public DescribeAlertLogHistogramRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
