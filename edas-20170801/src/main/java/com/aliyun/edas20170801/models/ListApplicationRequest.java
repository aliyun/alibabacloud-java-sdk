// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListApplicationRequest extends TeaModel {
    /**
     * <p>The application IDs.</p>
     */
    @NameInMap("AppIds")
    public String appIds;

    /**
     * <p>The name of the application. Specify this parameter if you want to filter applications by application name.</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The cluster ID. Specify this parameter if you want to filter applications by cluster.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The namespace ID. Specify this parameter if you want to filter applications by namespace.</p>
     */
    @NameInMap("LogicalRegionId")
    public String logicalRegionId;

    /**
     * <p>The ID of the namespace that you use in the exact search to filter applications.</p>
     */
    @NameInMap("LogicalRegionIdFilter")
    public String logicalRegionIdFilter;

    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the resource group. Specify this parameter if you want to filter applications by resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static ListApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationRequest self = new ListApplicationRequest();
        return TeaModel.build(map, self);
    }

    public ListApplicationRequest setAppIds(String appIds) {
        this.appIds = appIds;
        return this;
    }
    public String getAppIds() {
        return this.appIds;
    }

    public ListApplicationRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListApplicationRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListApplicationRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListApplicationRequest setLogicalRegionId(String logicalRegionId) {
        this.logicalRegionId = logicalRegionId;
        return this;
    }
    public String getLogicalRegionId() {
        return this.logicalRegionId;
    }

    public ListApplicationRequest setLogicalRegionIdFilter(String logicalRegionIdFilter) {
        this.logicalRegionIdFilter = logicalRegionIdFilter;
        return this;
    }
    public String getLogicalRegionIdFilter() {
        return this.logicalRegionIdFilter;
    }

    public ListApplicationRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListApplicationRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
