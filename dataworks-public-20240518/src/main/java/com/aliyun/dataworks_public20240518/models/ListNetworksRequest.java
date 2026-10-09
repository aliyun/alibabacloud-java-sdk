// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListNetworksRequest extends TeaModel {
    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The unique identifier of the general resource group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Serverless_res_group_524257424564736_6831777003****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The sort fields. Supports fields such as scheduled time and start time. The format is sort field + sort order (Desc/Asc), where Asc can be omitted. Valid values for sort fields:</p>
     * <ul>
     * <li>Id (Desc/Asc): Network ID</li>
     * <li>Status (Desc/Asc): Network status</li>
     * <li>CreateUser (Desc/Asc): Creator</li>
     * <li>CreateTime (Desc/Asc): Creation time</li>
     * </ul>
     * <p>Default value: CreateTime Asc.</p>
     * 
     * <strong>example:</strong>
     * <p>CreateTime Asc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    public static ListNetworksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNetworksRequest self = new ListNetworksRequest();
        return TeaModel.build(map, self);
    }

    public ListNetworksRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListNetworksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListNetworksRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListNetworksRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

}
