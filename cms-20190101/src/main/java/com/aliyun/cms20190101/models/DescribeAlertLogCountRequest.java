// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeAlertLogCountRequest extends TeaModel {
    /**
     * <p>The alert group.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS_Group</p>
     */
    @NameInMap("ContactGroup")
    public String contactGroup;

    /**
     * <p>The end timestamp of the alert logs to be queried.</p>
     * <p>Unit: milliseconds.</p>
     * <p>You can query only the alert logs within the last year. If the query time is longer than one year, the return value of the <code>AlertLogCount</code> parameter is empty.</p>
     * <blockquote>
     * <p> The interval between the start time (StartTime) and end time (EndTime) must be less than or equal to 15 days. The start time and end time must be specified or left empty at the same time. If you do not specify the start time and end time, the alert logs within the last 15 minutes are queried by default.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1610074409694</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The type of the alert event. Valid values:</p>
     * <ul>
     * <li>TRIGGERED: The alert is triggered.</li>
     * <li>RESOLVED: The alert is resolved.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>TRIGGERED</p>
     */
    @NameInMap("EventType")
    public String eventType;

    /**
     * <p>The dimension based on which data is aggregated. This parameter is similar to the Group By clause of SQL statements. Valid values:</p>
     * <ul>
     * <li><code>product</code>: aggregates data by cloud service.</li>
     * <li><code>level</code>: aggregates data by alert level.</li>
     * <li><code>groupId</code>: aggregates data by application group.</li>
     * <li><code>contactGroup</code>: aggregates data by alert group.</li>
     * <li><code>product,metricName</code>: aggregates data both by cloud service and by metric.</li>
     * </ul>
     * <p>This parameter is required.</p>
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
     * <p>The statistical period of alert logs. Unit: minutes.</p>
     * 
     * <strong>example:</strong>
     * <p>360</p>
     */
    @NameInMap("LastMin")
    public String lastMin;

    /**
     * <p>The level and notification method of the alert. Valid values:</p>
     * <ul>
     * <li>P4: Alert notifications are sent by using emails and DingTalk chatbots.</li>
     * <li>OK: No alert is generated.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>P4</p>
     */
    @NameInMap("Level")
    public String level;

    /**
     * <p>The name of the metric.</p>
     * <blockquote>
     * <p> For more information about the metrics of different cloud services, see <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
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
     * <p> For more information about the namespaces of cloud services, see <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>acs_ecs_dashboard</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The dimension based on which data is aggregated. This parameter is equivalent to the GROUP BY clause in SQL. Valid values:</p>
     * <ul>
     * <li><code>product</code>: aggregates data by cloud service.</li>
     * <li><code>level</code>: aggregates data by alert level.</li>
     * <li><code>groupId</code>: aggregates data by application group.</li>
     * <li><code>contactGroup</code>: aggregates data by alert contact group.</li>
     * <li><code>product,metricName</code>: aggregates data both by cloud service and by metric.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The abbreviation of the service name.</p>
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
     * <p>The keyword based on which the alert logs to be counted are searched.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("SearchKey")
    public String searchKey;

    /**
     * <p>The status of the alert. Valid values:</p>
     * <ul>
     * <li>0: The alert is triggered or cleared.</li>
     * <li>1: The alert is generated not during the effective period.</li>
     * <li>2: The alert is muted and not triggered in a specified period.</li>
     * <li>3: The host is restarting.</li>
     * <li>4: Notifications are not sent for the alert.</li>
     * </ul>
     * <p>When the value of the SendStatus parameter is 0, the value P4 of the Level parameter indicates a triggered alert and the value OK indicates a cleared alert.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SendStatus")
    public String sendStatus;

    /**
     * <p>This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The start timestamp of the alert logs to be queried.</p>
     * <p>Unit: milliseconds.</p>
     * <p>You can query only the alert logs within the last year. If the query time is longer than one year, the return value of the <code>AlertLogCount</code> parameter is empty.</p>
     * <blockquote>
     * <p> The interval between the start time (StartTime) and end time (EndTime) must be less than or equal to 15 days. The start time and end time must be specified or left empty at the same time. If you do not specify the start time and end time, the alert logs within the last 15 minutes are queried by default.</p>
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
