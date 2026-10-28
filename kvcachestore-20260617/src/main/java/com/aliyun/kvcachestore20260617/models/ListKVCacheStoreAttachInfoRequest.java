// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kvcachestore20260617.models;

import com.aliyun.tea.*;

public class ListKVCacheStoreAttachInfoRequest extends TeaModel {
    /**
     * <p>The list of KvcsIds of the KVCacheStores to query. You can specify up to 100 KvcsIds.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("KvcsIds")
    public java.util.List<String> kvcsIds;

    /**
     * <p>The maximum number of entries to return in a single call. Valid values: 1 to 500.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The query token. Set the value to the NextToken value returned from the last call to this operation. You do not need to specify this parameter for the first call. If NextToken is specified, the PageSize and PageNumber request parameters become invalid, and the TotalCount value in the response is invalid.</p>
     * 
     * <strong>example:</strong>
     * <p>your-client-token</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number for a paging query. This parameter is used together with PageSize. If the specified page number exceeds the total number of pages, the last page is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page for a paging query.</p>
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

    /**
     * <p>The ID of the compute-side VSC. If you specify this parameter, the mount records are filtered by the specified VSC.</p>
     * 
     * <strong>example:</strong>
     * <p>vsc-dhag651dsda</p>
     */
    @NameInMap("VscId")
    public String vscId;

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

    public ListKVCacheStoreAttachInfoRequest setVscId(String vscId) {
        this.vscId = vscId;
        return this;
    }
    public String getVscId() {
        return this.vscId;
    }

}
