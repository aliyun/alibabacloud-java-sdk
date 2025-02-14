// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListVodPackagingAssetsResponseBody extends TeaModel {
    @NameInMap("Assets")
    public java.util.List<ListVodPackagingAssetsResponseBodyAssets> assets;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListVodPackagingAssetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVodPackagingAssetsResponseBody self = new ListVodPackagingAssetsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVodPackagingAssetsResponseBody setAssets(java.util.List<ListVodPackagingAssetsResponseBodyAssets> assets) {
        this.assets = assets;
        return this;
    }
    public java.util.List<ListVodPackagingAssetsResponseBodyAssets> getAssets() {
        return this.assets;
    }

    public ListVodPackagingAssetsResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListVodPackagingAssetsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListVodPackagingAssetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVodPackagingAssetsResponseBody setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListVodPackagingAssetsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListVodPackagingAssetsResponseBodyAssetsInput extends TeaModel {
        @NameInMap("Media")
        public String media;

        /**
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListVodPackagingAssetsResponseBodyAssetsInput build(java.util.Map<String, ?> map) throws Exception {
            ListVodPackagingAssetsResponseBodyAssetsInput self = new ListVodPackagingAssetsResponseBodyAssetsInput();
            return TeaModel.build(map, self);
        }

        public ListVodPackagingAssetsResponseBodyAssetsInput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public ListVodPackagingAssetsResponseBodyAssetsInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListVodPackagingAssetsResponseBodyAssets extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>30min_movie</p>
         */
        @NameInMap("AssetName")
        public String assetName;

        /**
         * <strong>example:</strong>
         * <p>2024-11-21T06:45:32Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>movie 30min</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>vod_hls</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("Input")
        public ListVodPackagingAssetsResponseBodyAssetsInput input;

        public static ListVodPackagingAssetsResponseBodyAssets build(java.util.Map<String, ?> map) throws Exception {
            ListVodPackagingAssetsResponseBodyAssets self = new ListVodPackagingAssetsResponseBodyAssets();
            return TeaModel.build(map, self);
        }

        public ListVodPackagingAssetsResponseBodyAssets setAssetName(String assetName) {
            this.assetName = assetName;
            return this;
        }
        public String getAssetName() {
            return this.assetName;
        }

        public ListVodPackagingAssetsResponseBodyAssets setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListVodPackagingAssetsResponseBodyAssets setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListVodPackagingAssetsResponseBodyAssets setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ListVodPackagingAssetsResponseBodyAssets setInput(ListVodPackagingAssetsResponseBodyAssetsInput input) {
            this.input = input;
            return this;
        }
        public ListVodPackagingAssetsResponseBodyAssetsInput getInput() {
            return this.input;
        }

    }

}
