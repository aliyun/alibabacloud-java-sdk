// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kvcachestore20260617.models;

import com.aliyun.tea.*;

public class ListKVCacheStoresRequest extends TeaModel {
    /**
     * <p>The list of KvcsId values. Separate multiple IDs with commas. A maximum of 100 IDs are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>kvcs-87djda131</p>
     */
    @NameInMap("KvcsIds")
    public String kvcsIds;

    /**
     * <p>The maximum number of entries per page for cursor-based pagination. Default value: 10. Maximum value: 100. This parameter is used together with NextToken.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The instance name filter. Prefix matching is used.</p>
     * 
     * <strong>example:</strong>
     * <p>obj-detect</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The pagination token. Do not specify this parameter for the first request. For subsequent requests, use the NextToken value returned in the previous response. This parameter is mutually exclusive with PageNumber.</p>
     * 
     * <strong>example:</strong>
     * <p>a24c3a9cc8e6da77b10cffc4c93c7922e0b5e8707e68181f</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number. Default value: 1. This parameter takes precedence over NextToken if both are specified.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10. Maximum value: 100. This parameter is used together with PageNumber.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID, such as cn-hangzhou.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The instance status filter. Valid values: Creating, Available, InUse, Stopping, Stopped, and Deleting.</p>
     * 
     * <strong>example:</strong>
     * <p>Available</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The zone ID, such as cn-hangzhou-a.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-k</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static ListKVCacheStoresRequest build(java.util.Map<String, ?> map) throws Exception {
        ListKVCacheStoresRequest self = new ListKVCacheStoresRequest();
        return TeaModel.build(map, self);
    }

    public ListKVCacheStoresRequest setKvcsIds(String kvcsIds) {
        this.kvcsIds = kvcsIds;
        return this;
    }
    public String getKvcsIds() {
        return this.kvcsIds;
    }

    public ListKVCacheStoresRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListKVCacheStoresRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListKVCacheStoresRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListKVCacheStoresRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListKVCacheStoresRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListKVCacheStoresRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListKVCacheStoresRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListKVCacheStoresRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
