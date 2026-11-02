// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListVodPackagingConfigurationsRequest extends TeaModel {
    /**
     * <p>The name of the video-on-demand packaging group.</p>
     * 
     * <strong>example:</strong>
     * <p>vod_hls</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The search keyword. The system returns the video-on-demand packaging configurations whose names contain the specified keyword.</p>
     * 
     * <strong>example:</strong>
     * <p>hls</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The page number for paging. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <p>The number of entries to return on each page for paging. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The sort order. Default value: desc. Valid values:</p>
     * <ul>
     * <li>desc: Sorts the list in descending order of creation time.</li>
     * <li>asc: Sorts the list in ascending order of creation time.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    public static ListVodPackagingConfigurationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVodPackagingConfigurationsRequest self = new ListVodPackagingConfigurationsRequest();
        return TeaModel.build(map, self);
    }

    public ListVodPackagingConfigurationsRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public ListVodPackagingConfigurationsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListVodPackagingConfigurationsRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public ListVodPackagingConfigurationsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListVodPackagingConfigurationsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

}
