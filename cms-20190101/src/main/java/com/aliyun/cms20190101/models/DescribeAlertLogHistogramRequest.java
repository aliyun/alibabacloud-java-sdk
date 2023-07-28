// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeAlertLogHistogramRequest extends TeaModel {
    /**
     * <p>The name of the metric.</p>
     * <br>
     * <p>>  For more information about the metrics of different cloud services, see [Appendix 1: Metrics](~~163515~~).</p>
     */
    @NameInMap("ContactGroup")
    public String contactGroup;

    /**
     * <p>The number of entries to return on each page. Default value: 10.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The error message.</p>
     */
    @NameInMap("GroupBy")
    public String groupBy;

    /**
     * <p>The namespace of the cloud service.</p>
     * <br>
     * <p>>  For more information about the namespaces of cloud services, see [Appendix 1: Metrics](~~163515~~).</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The HTTP status code.</p>
     * <br>
     * <p>>  The HTTP status code 200 indicates a success.</p>
     */
    @NameInMap("LastMin")
    public String lastMin;

    /**
     * <p>The alert group.</p>
     */
    @NameInMap("Level")
    public String level;

    /**
     * <p>The dimension based on which data is aggregated. This parameter is similar to the Group By clause of SQL statements. Valid values:</p>
     * <br>
     * <p>*   `product`: aggregates data by cloud service.</p>
     * <p>*   `level`: aggregates data by alert level.</p>
     * <p>*   `groupId`: aggregates data by application group.</p>
     * <p>*   `contactGroup`: aggregates data by alert group.</p>
     * <p>*   `product,metricName`: aggregates data both by cloud service and by metric.</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>The status of the alert. Valid values:</p>
     * <br>
     * <p>*   0: The alert is triggered or cleared.</p>
     * <p>*   1: The alert is generated not during the effective period.</p>
     * <p>*   2: The alert is muted and not triggered in a specified period.</p>
     * <p>*   3: The host is restarting.</p>
     * <p>*   4: Notifications are not sent for the alert.</p>
     * <br>
     * <p>When the value of the SendStatus parameter is 0, the value P4 of the Level parameter indicates a triggered alert and the value OK indicates a cleared alert.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The keyword based on which the alert logs to be queried are searched.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The ID of the application group.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The level and notification method of the alert. Valid values:</p>
     * <br>
     * <p>*   P4: Alert notifications are sent by using emails and DingTalk chatbots.</p>
     * <p>*   OK: No alert is generated.</p>
     */
    @NameInMap("Product")
    public String product;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The statistical period of alert logs. Unit: minutes.</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The abbreviation of the service name.</p>
     */
    @NameInMap("SearchKey")
    public String searchKey;

    /**
     * <p>The name of the alert rule.</p>
     */
    @NameInMap("SendStatus")
    public String sendStatus;

    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The number of the page to return. Default value: 1</p>
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
