// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class DescribeAlarmsForResourcesRequest extends TeaModel {
    @NameInMap("AlertState")
    public String alertState;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Dimensions")
    public String dimensions;

    @NameInMap("EnableState")
    public Boolean enableState;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Page")
    public String page;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeAlarmsForResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlarmsForResourcesRequest self = new DescribeAlarmsForResourcesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAlarmsForResourcesRequest setAlertState(String alertState) {
        this.alertState = alertState;
        return this;
    }
    public String getAlertState() {
        return this.alertState;
    }

    public DescribeAlarmsForResourcesRequest setDimensions(String dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public String getDimensions() {
        return this.dimensions;
    }

    public DescribeAlarmsForResourcesRequest setEnableState(Boolean enableState) {
        this.enableState = enableState;
        return this;
    }
    public Boolean getEnableState() {
        return this.enableState;
    }

    public DescribeAlarmsForResourcesRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeAlarmsForResourcesRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public DescribeAlarmsForResourcesRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DescribeAlarmsForResourcesRequest setPage(String page) {
        this.page = page;
        return this;
    }
    public String getPage() {
        return this.page;
    }

    public DescribeAlarmsForResourcesRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeAlarmsForResourcesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
