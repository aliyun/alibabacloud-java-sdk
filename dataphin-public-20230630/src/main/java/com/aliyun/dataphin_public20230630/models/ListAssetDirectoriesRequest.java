// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListAssetDirectoriesRequest extends TeaModel {
    /**
     * <p>The query parameters.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ListQuery")
    public ListAssetDirectoriesRequestListQuery listQuery;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>The ID of the operator user.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    public static ListAssetDirectoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAssetDirectoriesRequest self = new ListAssetDirectoriesRequest();
        return TeaModel.build(map, self);
    }

    public ListAssetDirectoriesRequest setListQuery(ListAssetDirectoriesRequestListQuery listQuery) {
        this.listQuery = listQuery;
        return this;
    }
    public ListAssetDirectoriesRequestListQuery getListQuery() {
        return this.listQuery;
    }

    public ListAssetDirectoriesRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public ListAssetDirectoriesRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public static class ListAssetDirectoriesRequestListQuery extends TeaModel {
        /**
         * <p>The folder name keyword. Maximum length: 128 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>Core Metrics</p>
         */
        @NameInMap("Keyword")
        public String keyword;

        /**
         * <p>The maximum number of expansion levels. This parameter takes effect only in browse mode. Valid values: 1 to 10.</p>
         * 
         * <strong>example:</strong>
         * <p>6470568</p>
         */
        @NameInMap("MaxLevel")
        public Integer maxLevel;

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>696844</p>
         */
        @NameInMap("Page")
        public Integer page;

        /**
         * <p>The number of entries per page. Default value: 50. Valid values: 1 to 200.</p>
         * 
         * <strong>example:</strong>
         * <p>7576639</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The parent folder ID. This parameter takes effect only in browse mode.</p>
         * 
         * <strong>example:</strong>
         * <p>466096149777</p>
         */
        @NameInMap("ParentDirectoryId")
        public Long parentDirectoryId;

        /**
         * <p>The topic ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>796027234512</p>
         */
        @NameInMap("TopicId")
        public Long topicId;

        public static ListAssetDirectoriesRequestListQuery build(java.util.Map<String, ?> map) throws Exception {
            ListAssetDirectoriesRequestListQuery self = new ListAssetDirectoriesRequestListQuery();
            return TeaModel.build(map, self);
        }

        public ListAssetDirectoriesRequestListQuery setKeyword(String keyword) {
            this.keyword = keyword;
            return this;
        }
        public String getKeyword() {
            return this.keyword;
        }

        public ListAssetDirectoriesRequestListQuery setMaxLevel(Integer maxLevel) {
            this.maxLevel = maxLevel;
            return this;
        }
        public Integer getMaxLevel() {
            return this.maxLevel;
        }

        public ListAssetDirectoriesRequestListQuery setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public ListAssetDirectoriesRequestListQuery setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListAssetDirectoriesRequestListQuery setParentDirectoryId(Long parentDirectoryId) {
            this.parentDirectoryId = parentDirectoryId;
            return this;
        }
        public Long getParentDirectoryId() {
            return this.parentDirectoryId;
        }

        public ListAssetDirectoriesRequestListQuery setTopicId(Long topicId) {
            this.topicId = topicId;
            return this;
        }
        public Long getTopicId() {
            return this.topicId;
        }

    }

}
