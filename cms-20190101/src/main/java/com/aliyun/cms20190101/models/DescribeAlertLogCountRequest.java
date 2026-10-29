// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeAlertLogCountRequest extends TeaModel {
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
     * <p>You can query only the alert history within the last year. If the query time range exceeds one year, the <code>AlertLogCount</code> response parameter is empty.</p>
     * <blockquote>
     * <p>The interval between the start time (StartTime) and end time (EndTime) must be less than or equal to 15 days. Both parameters must be specified or left empty at the same time. If neither is specified, the alert history of the last 15 minutes is queried by default.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1610074409694</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The alert type. Valid values:</p>
     * <ul>
     * <li><p>TRIGGERED: The alert is triggered.</p>
     * </li>
     * <li><p>RESOLVED: The alert recovers.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>TRIGGERED</p>
     */
    @NameInMap("EventType")
    public String eventType;

    /**
     * <p>Aggregates data by a spatial dimension, which is equivalent to the Group By clause in SQL. Valid values:</p>
     * <ul>
     * <li><code>product</code>: aggregates by Alibaba Cloud service.</li>
     * <li><code>level</code>: aggregates by alert level.</li>
     * <li><code>groupId</code>: aggregates by application group.</li>
     * <li><code>contactGroup</code>: aggregates by alert contact group.</li>
     * <li><code>product,metricName</code>: aggregates by Alibaba Cloud service and metric.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>product</p>
     */
    @NameInMap("GroupBy")
    public String groupBy;

    /**
     * <p>The application group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7301****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The period for obtaining logs. Unit: minutes.</p>
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
     * <p>The metric name.</p>
     * <blockquote>
     * <p>For information about the metrics of Alibaba Cloud services, see <a href="https://help.aliyun.com/document_detail/163515.html">Cloud service metrics</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cpu_total</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>The namespace of the Alibaba Cloud service.</p>
     * <blockquote>
     * <p>For information about the namespaces of Alibaba Cloud services, see <a href="https://help.aliyun.com/document_detail/163515.html">Cloud service metrics</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>acs_ecs_dashboard</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The abbreviation of the Alibaba Cloud service name.</p>
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
     * <p>For information about how to obtain the alert rule ID, see <a href="https://help.aliyun.com/document_detail/114941.html">DescribeMetricRuleList</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>bfae2ca5b4e07d2c7278772e***********</p>
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
     * <p>The search keyword for querying alert history statistics.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("SearchKey")
    public String searchKey;

    /**
     * <p>The alert status. Valid values:</p>
     * <ul>
     * <li>0: An alert is triggered or the alert recovers to Normal.</li>
     * <li>1: The alert rule is not effective.</li>
     * <li>2: The mute period.</li>
     * <li>3: The host is restarting.</li>
     * <li>4: Alerts are not send.</li>
     * </ul>
     * <p>&lt;props=&quot;china&quot;&gt;When the alert status is 0, if the value of Level is P2, P3, or P4, an alert is triggered. If the value of Level is OK, the alert recovers to Normal.
     * &lt;props=&quot;intl&quot;&gt;When the alert status is 0, if the value of Level is P4, an alert is triggered. If the value of Level is OK, the alert recovers to Normal.
     * &lt;props=&quot;partner&quot;&gt;When the alert status is 0, if the value of Level is P4, an alert is triggered. If the value of Level is OK, the alert recovers to Normal.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SendStatus")
    public String sendStatus;

    /**
     * <p><strong>[Deprecated]</strong> This parameter is deprecated and does not need to be specified.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("SourceType")
    @Deprecated
    public String sourceType;

    /**
     * <p>The start timestamp for querying alert history.</p>
     * <p>Unit: milliseconds.</p>
     * <p>You can query only the alert history within the last year. If the query time range exceeds one year, the <code>AlertLogCount</code> response parameter is empty.</p>
     * <blockquote>
     * <p>The interval between the start time (StartTime) and end time (EndTime) must be less than or equal to 15 days. Both parameters must be specified or left empty at the same time. If neither is specified, the alert history of the last 15 minutes is queried by default.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1609988009694</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeAlertLogCountRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertLogCountRequest self = new DescribeAlertLogCountRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAlertLogCountRequest setContactGroup(String contactGroup) {
        this.contactGroup = contactGroup;
        return this;
    }
    public String getContactGroup() {
        return this.contactGroup;
    }

    public DescribeAlertLogCountRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeAlertLogCountRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public DescribeAlertLogCountRequest setGroupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }
    public String getGroupBy() {
        return this.groupBy;
    }

    public DescribeAlertLogCountRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeAlertLogCountRequest setLastMin(String lastMin) {
        this.lastMin = lastMin;
        return this;
    }
    public String getLastMin() {
        return this.lastMin;
    }

    public DescribeAlertLogCountRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public DescribeAlertLogCountRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public DescribeAlertLogCountRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DescribeAlertLogCountRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAlertLogCountRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAlertLogCountRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public DescribeAlertLogCountRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAlertLogCountRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public DescribeAlertLogCountRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public DescribeAlertLogCountRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public DescribeAlertLogCountRequest setSendStatus(String sendStatus) {
        this.sendStatus = sendStatus;
        return this;
    }
    public String getSendStatus() {
        return this.sendStatus;
    }

    @Deprecated
    public DescribeAlertLogCountRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public DescribeAlertLogCountRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
