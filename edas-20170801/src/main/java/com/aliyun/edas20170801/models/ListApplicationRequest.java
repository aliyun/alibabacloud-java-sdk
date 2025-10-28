// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListApplicationRequest extends TeaModel {
    /**
     * <p>The application IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>[
     *       &quot;5657d271-<strong><strong>-4f03-9bb2-431f942886bb&quot;,
     *       &quot;5657d271-</strong></strong>-4f03-9bb2-431f942bbddd&quot;
     * ]</p>
     */
    @NameInMap("AppIds")
    public String appIds;

    /**
     * <p>The name of the application. Specify this parameter if you want to filter applications by application name.</p>
     * 
     * <strong>example:</strong>
     * <p>testapp</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The cluster ID. Specify this parameter if you want to filter applications by cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>c37aec2a-bcca-4ec1-<strong><strong>-</strong></strong>********</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The namespace ID. Specify this parameter if you want to filter applications by namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing:test</p>
     */
    @NameInMap("LogicalRegionId")
    public String logicalRegionId;

    /**
     * <p>The ID of the namespace that you use in the exact search to filter applications.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing:test</p>
     */
    @NameInMap("LogicalRegionIdFilter")
    public String logicalRegionIdFilter;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the resource group. Specify this parameter if you want to filter applications by resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aek24j4s4b*****</p>
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
