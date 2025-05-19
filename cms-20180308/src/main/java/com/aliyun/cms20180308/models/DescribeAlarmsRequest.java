// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class DescribeAlarmsRequest extends TeaModel {
    @NameInMap("AlertState")
    public String alertState;

    @NameInMap("DisplayName")
    public String displayName;

    @NameInMap("EnableState")
    public Boolean enableState;

    @NameInMap("GroupBy")
    public String groupBy;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("MetricName")
    public String metricName;

    @NameInMap("NameKeyword")
    public String nameKeyword;

    @NameInMap("Names")
    public String names;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Page")
    public String page;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeAlarmsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlarmsRequest self = new DescribeAlarmsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAlarmsRequest setAlertState(String alertState) {
        this.alertState = alertState;
        return this;
    }
    public String getAlertState() {
        return this.alertState;
    }

    public DescribeAlarmsRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public DescribeAlarmsRequest setEnableState(Boolean enableState) {
        this.enableState = enableState;
        return this;
    }
    public Boolean getEnableState() {
        return this.enableState;
    }

    public DescribeAlarmsRequest setGroupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }
    public String getGroupBy() {
        return this.groupBy;
    }

    public DescribeAlarmsRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeAlarmsRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public DescribeAlarmsRequest setNameKeyword(String nameKeyword) {
        this.nameKeyword = nameKeyword;
        return this;
    }
    public String getNameKeyword() {
        return this.nameKeyword;
    }

    public DescribeAlarmsRequest setNames(String names) {
        this.names = names;
        return this;
    }
    public String getNames() {
        return this.names;
    }

    public DescribeAlarmsRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DescribeAlarmsRequest setPage(String page) {
        this.page = page;
        return this;
    }
    public String getPage() {
        return this.page;
    }

    public DescribeAlarmsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeAlarmsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
