// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kvcachestore20260617.models;

import com.aliyun.tea.*;

public class ListKVCacheStoreAttachInfoRequest extends TeaModel {
    /**
     * <p>The list of KVCacheStore KvcsId values to query. A maximum of 100 values can be specified.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("KvcsIds")
    public java.util.List<String> kvcsIds;

    /**
     * <p>The maximum number of entries to return in a single request. Valid values: 1 to 500.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The pagination token. Set this parameter to the NextToken value returned in the previous call. You do not need to set this parameter for the first request. If you set NextToken, the PageSize and PageNumber request parameters become ineffective, and the TotalCount value in the response is invalid.</p>
     * 
     * <strong>example:</strong>
     * <p>your-client-token</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number for a paged query. Used together with PageSize. If the value exceeds the total number of pages, the last page of data is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page for a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
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

    public static ListKVCacheStoreAttachInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ListKVCacheStoreAttachInfoRequest self = new ListKVCacheStoreAttachInfoRequest();
        return TeaModel.build(map, self);
    }

    public ListKVCacheStoreAttachInfoRequest setKvcsIds(java.util.List<String> kvcsIds) {
        this.kvcsIds = kvcsIds;
        return this;
    }
    public java.util.List<String> getKvcsIds() {
        return this.kvcsIds;
    }

    public ListKVCacheStoreAttachInfoRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListKVCacheStoreAttachInfoRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListKVCacheStoreAttachInfoRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListKVCacheStoreAttachInfoRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListKVCacheStoreAttachInfoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
