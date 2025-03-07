// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListLivePackageChannelGroupsResponseBody extends TeaModel {
    /**
     * <p>The channel groups returned.</p>
     */
    @NameInMap("LivePackageChannelGroups")
    public java.util.List<ListLivePackageChannelGroupsResponseBodyLivePackageChannelGroups> livePackageChannelGroups;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5D87B753-0250-5D9D-B248-D40C3271F864</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The sort order.</p>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListLivePackageChannelGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLivePackageChannelGroupsResponseBody self = new ListLivePackageChannelGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLivePackageChannelGroupsResponseBody setLivePackageChannelGroups(java.util.List<ListLivePackageChannelGroupsResponseBodyLivePackageChannelGroups> livePackageChannelGroups) {
        this.livePackageChannelGroups = livePackageChannelGroups;
        return this;
    }
    public java.util.List<ListLivePackageChannelGroupsResponseBodyLivePackageChannelGroups> getLivePackageChannelGroups() {
        return this.livePackageChannelGroups;
    }

    public ListLivePackageChannelGroupsResponseBody setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public ListLivePackageChannelGroupsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListLivePackageChannelGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLivePackageChannelGroupsResponseBody setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListLivePackageChannelGroupsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListLivePackageChannelGroupsResponseBodyLivePackageChannelGroups extends TeaModel {
        /**
         * <p>The time when the channel group was created. It is in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format and displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-01T12:00:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The channel group description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The channel group name.</p>
         * 
         * <strong>example:</strong>
         * <p>testChannelGroup</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The time when the channel group was last modified. It is in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format and displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-02T12:00:00Z</p>
         */
        @NameInMap("LastModified")
        public String lastModified;

        /**
         * <p>The origin domain.</p>
         * 
         * <strong>example:</strong>
         * <p>origin.example.com</p>
         */
        @NameInMap("OriginDomain")
        public String originDomain;

        public static ListLivePackageChannelGroupsResponseBodyLivePackageChannelGroups build(java.util.Map<String, ?> map) throws Exception {
            ListLivePackageChannelGroupsResponseBodyLivePackageChannelGroups self = new ListLivePackageChannelGroupsResponseBodyLivePackageChannelGroups();
            return TeaModel.build(map, self);
        }

        public ListLivePackageChannelGroupsResponseBodyLivePackageChannelGroups setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListLivePackageChannelGroupsResponseBodyLivePackageChannelGroups setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListLivePackageChannelGroupsResponseBodyLivePackageChannelGroups setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ListLivePackageChannelGroupsResponseBodyLivePackageChannelGroups setLastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public String getLastModified() {
            return this.lastModified;
        }

        public ListLivePackageChannelGroupsResponseBodyLivePackageChannelGroups setOriginDomain(String originDomain) {
            this.originDomain = originDomain;
            return this;
        }
        public String getOriginDomain() {
            return this.originDomain;
        }

    }

}
