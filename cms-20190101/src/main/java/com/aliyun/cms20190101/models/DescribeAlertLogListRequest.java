// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeAlertLogListRequest extends TeaModel {
    /**
     * <p>The alert contact group.</p>
     */
    @NameInMap("ContactGroup")
    public String contactGroup;

    /**
     * <p>The end timestamp of the alert logs to be queried. Unit: milliseconds.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("EventType")
    public String eventType;

    /**
     * <p>The dimension based on which data is aggregated. This parameter is equivalent to the GROUP BY clause in SQL. Valid values:</p>
     * <br>
     * <p>*   `product`: aggregates data by cloud service.</p>
     * <p>*   `level`: aggregates data by alert level.</p>
     * <p>*   `groupId`: aggregates data by application group.</p>
     * <p>*   `contactGroup`: aggregates data by alert contact group.</p>
     * <p>*   `product,metricName`: aggregates data both by cloud service and by metric.</p>
     */
    @NameInMap("GroupBy")
    public String groupBy;

    /**
     * <p>The ID of the application group.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The statistical period of alert logs. Unit: minutes.</p>
     */
    @NameInMap("LastMin")
    public String lastMin;

    /**
     * <p>The severity level and notification methods of the alert. Valid values:</p>
     * <br>
     * <p>*   P4: Alert notifications are sent by using emails and DingTalk chatbots.</p>
     * <p>*   OK: No alert is generated.</p>
     */
    @NameInMap("Level")
    public String level;

    /**
     * <p>The metric name.</p>
     * <br>
     * <p>> For more information about the metrics of different cloud services, see [Appendix 1: Metrics](~~163515~~).</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>The namespace of the cloud service.</p>
     * <br>
     * <p>> For more information about the namespaces of different cloud services, see [Appendix 1: Metrics](~~163515~~).</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The page number. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The abbreviation of the cloud service name.</p>
     */
    @NameInMap("Product")
    public String product;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the alert rule. For more information about how to query the ID of an alert rule, see [DescribeMetricRuleList](~~114941~~).</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    /**
     * <p>The name of the alert rule.</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The search keyword that is used to query alert logs.</p>
     */
    @NameInMap("SearchKey")
    public String searchKey;

    /**
     * <p>The status of the alert. Valid values:</p>
     * <br>
     * <p>*   0: The alert is triggered or cleared.</p>
     * <p>*   1: The alert is ineffective.</p>
     * <p>*   2: The alert is muted.</p>
     * <p>*   3: The host is restarting.</p>
     * <p>*   4: No alert notification is sent.</p>
     * <br>
     * <p>If the value of the SendStatus parameter is 0, the value P4 of the Level parameter indicates a triggered alert and the value OK indicates a cleared alert.</p>
     */
    @NameInMap("SendStatus")
    public String sendStatus;

    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The start timestamp of the alert logs to be queried. Unit: milliseconds.</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeAlertLogListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertLogListRequest self = new DescribeAlertLogListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAlertLogListRequest setContactGroup(String contactGroup) {
        this.contactGroup = contactGroup;
        return this;
    }
    public String getContactGroup() {
        return this.contactGroup;
    }

    public DescribeAlertLogListRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeAlertLogListRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public DescribeAlertLogListRequest setGroupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }
    public String getGroupBy() {
        return this.groupBy;
    }

    public DescribeAlertLogListRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeAlertLogListRequest setLastMin(String lastMin) {
        this.lastMin = lastMin;
        return this;
    }
    public String getLastMin() {
        return this.lastMin;
    }

    public DescribeAlertLogListRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public DescribeAlertLogListRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public DescribeAlertLogListRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DescribeAlertLogListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAlertLogListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAlertLogListRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public DescribeAlertLogListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAlertLogListRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public DescribeAlertLogListRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public DescribeAlertLogListRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public DescribeAlertLogListRequest setSendStatus(String sendStatus) {
        this.sendStatus = sendStatus;
        return this;
    }
    public String getSendStatus() {
        return this.sendStatus;
    }

    public DescribeAlertLogListRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public DescribeAlertLogListRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
