// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeAlertLogListRequest extends TeaModel {
    /**
     * <p>The start timestamp of the alert logs to be queried. Unit: milliseconds.</p>
     */
    @NameInMap("ContactGroup")
    public String contactGroup;

    /**
     * <p>The alert contact group.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The alert information in a JSON string.</p>
     */
    @NameInMap("GroupBy")
    public String groupBy;

    /**
     * <p>The operation that you want to perform. Set the value to **DescribeAlertLogList**.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The name of the blacklist policy.</p>
     */
    @NameInMap("LastMin")
    public String lastMin;

    /**
     * <p>The webhook URLs of alert contacts.</p>
     */
    @NameInMap("Level")
    public String level;

    /**
     * <p>The message returned for the alert callback.</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>Indicates whether the call was successful.</p>
     * <br>
     * <p>*   true: The call was successful.</p>
     * <p>*   false: The call failed.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The HTTP status code.</p>
     * <br>
     * <p>>  The status code 200 indicates that the call was successful.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The severity level and notification methods of the alert. Valid values:</p>
     * <br>
     * <p>*   P4: Alert notifications are sent by using emails and DingTalk chatbots.</p>
     * <br>
     * <p><!----></p>
     * <br>
     * <p>*   OK: No alert is generated.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The email addresses of alert contacts.</p>
     */
    @NameInMap("Product")
    public String product;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The phone numbers of alert contacts that can receive alert text messages.</p>
     * <br>
     * <p>>  This parameter can be returned only on the China site (aliyun.com).</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    /**
     * <p>The identifier of the cloud service. Valid values:</p>
     * <br>
     * <p>*   If the cloud service is provided by Alibaba Cloud, the abbreviation of the service name is returned. Example: ECS.</p>
     * <p>*   If the cloud service is not provided by Alibaba Cloud, a value in the `acs_Service keyword` format is returned. Example: acs_networkmonitor.</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The ID of the log.</p>
     */
    @NameInMap("SearchKey")
    public String searchKey;

    /**
     * <p>The sending results of alert notifications.</p>
     */
    @NameInMap("SendStatus")
    public String sendStatus;

    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>Indicates whether the alert level was changed. Valid values:</p>
     * <br>
     * <p>*   `P4->OK`: The alert level was changed from P4 to OK.</p>
     * <p>*   `P4->P4`: The alert level was still P4.</p>
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
