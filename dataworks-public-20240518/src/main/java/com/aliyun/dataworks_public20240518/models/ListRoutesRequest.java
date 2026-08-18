// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListRoutesRequest extends TeaModel {
    /**
     * <p>The ID of the network resource.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("NetworkId")
    public Long networkId;

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
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The unique identifier of the general quota.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Serverless_res_group_524257424564736_6831777003XXXXX</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The list of sort fields. Fields such as scheduled time and start time are supported. The format is &quot;sort field + sort order (Desc/Asc)&quot; (Asc is the default if omitted). Valid values:</p>
     * <ul>
     * <li>Id (Desc/Asc): route ID</li>
     * <li>DestinationCidr (Desc/Asc): destination CIDR</li>
     * <li>CreateTime (Desc/Asc): creation time</li>
     * </ul>
     * <p>Default value: CreateTime Asc.</p>
     * 
     * <strong>example:</strong>
     * <p>CreateTime Asc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    public static ListRoutesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRoutesRequest self = new ListRoutesRequest();
        return TeaModel.build(map, self);
    }

    public ListRoutesRequest setNetworkId(Long networkId) {
        this.networkId = networkId;
        return this;
    }
    public Long getNetworkId() {
        return this.networkId;
    }

    public ListRoutesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListRoutesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRoutesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListRoutesRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

}
