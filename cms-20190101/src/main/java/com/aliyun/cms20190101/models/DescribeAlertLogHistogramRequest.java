// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeAlertLogHistogramRequest extends TeaModel {
    @NameInMap("ContactGroup")
    public String contactGroup;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("GroupBy")
    public String groupBy;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("LastMin")
    public String lastMin;

    @NameInMap("Level")
    public String level;

    @NameInMap("MetricName")
    public String metricName;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Product")
    public String product;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("SearchKey")
    public String searchKey;

    @NameInMap("SendStatus")
    public String sendStatus;

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

    public DescribeAlertLogHistogramRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
