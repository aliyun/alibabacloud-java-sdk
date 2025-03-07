// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListVodPackagingAssetsResponseBody extends TeaModel {
    /**
     * <p>The VOD packaging assets.</p>
     */
    @NameInMap("Assets")
    public java.util.List<ListVodPackagingAssetsResponseBodyAssets> assets;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The sorting order of the assets based on the time when they were ingested. Valid values:</p>
     * <ul>
     * <li>desc: descending order.</li>
     * <li>asc: ascending order.</li>
     * </ul>
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
        /**
         * <p>The URL of the media file. Only M3U8 files stored in OSS are supported.</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The input type. Only Object Storage Service (OSS) is supported.</p>
         * 
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
         * <p>The name of the VOD packaging asset.</p>
         * 
         * <strong>example:</strong>
         * <p>30min_movie</p>
         */
        @NameInMap("AssetName")
        public String assetName;

        /**
         * <p>The time when the asset was ingested. It follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-21T06:45:32Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The asset description.</p>
         * 
         * <strong>example:</strong>
         * <p>movie 30min</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the packaging group.</p>
         * 
         * <strong>example:</strong>
         * <p>vod_hls</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The asset input configurations.</p>
         */
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
