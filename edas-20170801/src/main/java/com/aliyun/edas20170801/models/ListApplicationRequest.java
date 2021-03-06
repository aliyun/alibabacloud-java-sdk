// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListApplicationRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("LogicalRegionId")
    public String logicalRegionId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("LogicalRegionIdFilter")
    public String logicalRegionIdFilter;

    public static ListApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationRequest self = new ListApplicationRequest();
        return TeaModel.build(map, self);
    }

    public ListApplicationRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListApplicationRequest setLogicalRegionId(String logicalRegionId) {
        this.logicalRegionId = logicalRegionId;
        return this;
    }
    public String getLogicalRegionId() {
        return this.logicalRegionId;
    }

    public ListApplicationRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListApplicationRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListApplicationRequest setLogicalRegionIdFilter(String logicalRegionIdFilter) {
        this.logicalRegionIdFilter = logicalRegionIdFilter;
        return this;
    }
    public String getLogicalRegionIdFilter() {
        return this.logicalRegionIdFilter;
    }

}
