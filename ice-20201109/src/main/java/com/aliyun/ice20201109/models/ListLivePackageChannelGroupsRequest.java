// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListLivePackageChannelGroupsRequest extends TeaModel {
    /**
     * <p>The channel group name or description. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>channel-group</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The sort order by creation time. Default value: desc.</p>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    public static ListLivePackageChannelGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLivePackageChannelGroupsRequest self = new ListLivePackageChannelGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListLivePackageChannelGroupsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListLivePackageChannelGroupsRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public ListLivePackageChannelGroupsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListLivePackageChannelGroupsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

}
