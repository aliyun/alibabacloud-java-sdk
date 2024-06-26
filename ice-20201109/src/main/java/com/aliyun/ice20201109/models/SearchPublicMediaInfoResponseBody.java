// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SearchPublicMediaInfoResponseBody extends TeaModel {
    @NameInMap("PublicMediaInfos")
    public java.util.List<SearchPublicMediaInfoResponseBodyPublicMediaInfos> publicMediaInfos;

    /**
     * <strong>example:</strong>
     * <p><strong><strong>3CFB-2767-54FD-B311-BD15A4C1</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static SearchPublicMediaInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchPublicMediaInfoResponseBody self = new SearchPublicMediaInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchPublicMediaInfoResponseBody setPublicMediaInfos(java.util.List<SearchPublicMediaInfoResponseBodyPublicMediaInfos> publicMediaInfos) {
        this.publicMediaInfos = publicMediaInfos;
        return this;
    }
    public java.util.List<SearchPublicMediaInfoResponseBodyPublicMediaInfos> getPublicMediaInfos() {
        return this.publicMediaInfos;
    }

    public SearchPublicMediaInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchPublicMediaInfoResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class SearchPublicMediaInfoResponseBodyPublicMediaInfosMediaInfoDynamicMetaData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>&quot;{\&quot;AuditionUrl\&quot;: \&quot;<a href="http://xxx%5C%5C">http://xxx\\</a>&quot;, \&quot;AuditionCount\&quot;: 3...}&quot;</p>
         */
        @NameInMap("Data")
        public String data;

        /**
         * <strong>example:</strong>
         * <p>system</p>
         */
        @NameInMap("Type")
        public String type;

        public static SearchPublicMediaInfoResponseBodyPublicMediaInfosMediaInfoDynamicMetaData build(java.util.Map<String, ?> map) throws Exception {
            SearchPublicMediaInfoResponseBodyPublicMediaInfosMediaInfoDynamicMetaData self = new SearchPublicMediaInfoResponseBodyPublicMediaInfosMediaInfoDynamicMetaData();
            return TeaModel.build(map, self);
        }

        public SearchPublicMediaInfoResponseBodyPublicMediaInfosMediaInfoDynamicMetaData setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public SearchPublicMediaInfoResponseBodyPublicMediaInfosMediaInfoDynamicMetaData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SearchPublicMediaInfoResponseBodyPublicMediaInfosMediaInfoMediaBasicInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>general</p>
         */
        @NameInMap("BusinessType")
        public String businessType;

        /**
         * <strong>example:</strong>
         * <p>category</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <strong>example:</strong>
         * <p><a href="http://example-bucket.oss-cn-shanghai.aliyuncs.com/example.png?Expires=">http://example-bucket.oss-cn-shanghai.aliyuncs.com/example.png?Expires=</a><ExpireTime>&amp;OSSAccessKeyId=<OSSAccessKeyId>&amp;Signature=<Signature>&amp;security-token=<SecurityToken></p>
         */
        @NameInMap("CoverURL")
        public String coverURL;

        /**
         * <strong>example:</strong>
         * <p>2020-12-26T06:04:49Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>2020-12-29T06:04:49Z</p>
         */
        @NameInMap("DeletedTime")
        public String deletedTime;

        /**
         * <strong>example:</strong>
         * <p>description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>MediaId</p>
         * 
         * <strong>example:</strong>
         * <p>icepublic-<strong><strong>87b921bb4a55908a72a0537e</strong></strong></p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        @NameInMap("MediaTags")
        public String mediaTags;

        /**
         * <strong>example:</strong>
         * <p>audio</p>
         */
        @NameInMap("MediaType")
        public String mediaType;

        /**
         * <strong>example:</strong>
         * <p>2020-12-26T06:04:50Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <strong>example:</strong>
         * <p>oss</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p>[{&quot;bucket&quot;:&quot;example-bucket&quot;,&quot;count&quot;:&quot;32&quot;,&quot;iceJobId&quot;:&quot;<strong><strong><strong>83ec44d58b2069def2e</strong></strong></strong>&quot;,&quot;location&quot;:&quot;oss-cn-shanghai&quot;,&quot;snapshotRegular&quot;:&quot;example/example-{Count}.jpg&quot;,&quot;spriteRegular&quot;:&quot;example/example-{TileCount}.jpg&quot;,&quot;templateId&quot;:&quot;<strong><strong><strong>e438b14ff39293eaec25</strong></strong></strong>&quot;,&quot;tileCount&quot;:&quot;1&quot;}]</p>
         */
        @NameInMap("SpriteImages")
        public String spriteImages;

        /**
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>title</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>userDataTest</p>
         */
        @NameInMap("UserData")
        public String userData;

        public static SearchPublicMediaInfoResponseBodyPublicMediaInfosMediaInfoMediaBasicInfo build(java.util.Map<String, ?> map) throws Exception {
            SearchPublicMediaInfoResponseBodyPublicMediaInfosMediaInfoMediaBasicInfo self = new SearchPublicMediaInfoResponseBodyPublicMediaInfosMediaInfoMediaBasicInfo();
            return TeaModel.build(map, self);
        }

        public SearchPublicMediaInfoResponseBodyPublicMediaInfosMediaInfoMediaBasicInfo setBusinessType(String businessType) {
            this.businessType = businessType;
            return this;
        }
        public String getBusinessType() {
            return this.businessType;
        }

        public SearchPublicMediaInfoResponseBodyPublicMediaInfosMediaInfoMediaBasicInfo setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public SearchPublicMediaInfoResponseBodyPublicMediaInfosMediaInfoMediaBasicInfo setCoverURL(String coverURL) {
            this.coverURL = coverURL;
            return this;
        }
        public String getCoverURL() {
            return this.coverURL;
        }

        public SearchPublicMediaInfoResponseBodyPublicMediaInfosMediaInfoMediaBasicInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public SearchPublicMediaInfoResponseBodyPublicMediaInfosMediaInfoMediaBasicInfo setDeletedTime(String deletedTime) {
            this.deletedTime = deletedTime;
            return this;
        }
        public String getDeletedTime() {
            return this.deletedTime;
        }

        public SearchPublicMediaInfoResponseBodyPublicMediaInfosMediaInfoMediaBasicInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public SearchPublicMediaInfoResponseBodyPublicMediaInfosMediaInfoMediaBasicInfo setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public SearchPublicMediaInfoResponseBodyPublicMediaInfosMediaInfoMediaBasicInfo setMediaTags(String mediaTags) {
            this.mediaTags = mediaTags;
            return this;
        }
        public String getMediaTags() {
            return this.mediaTags;
        }

        public SearchPublicMediaInfoResponseBodyPublicMediaInfosMediaInfoMediaBasicInfo setMediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public String getMediaType() {
            return this.mediaType;
        }

        public SearchPublicMediaInfoResponseBodyPublicMediaInfosMediaInfoMediaBasicInfo setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public SearchPublicMediaInfoResponseBodyPublicMediaInfosMediaInfoMediaBasicInfo setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public SearchPublicMediaInfoResponseBodyPublicMediaInfosMediaInfoMediaBasicInfo setSpriteImages(String spriteImages) {
            this.spriteImages = spriteImages;
            return this;
        }
        public String getSpriteImages() {
            return this.spriteImages;
        }

        public SearchPublicMediaInfoResponseBodyPublicMediaInfosMediaInfoMediaBasicInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public SearchPublicMediaInfoResponseBodyPublicMediaInfosMediaInfoMediaBasicInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public SearchPublicMediaInfoResponseBodyPublicMediaInfosMediaInfoMediaBasicInfo setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

    public static class SearchPublicMediaInfoResponseBodyPublicMediaInfosMediaInfo extends TeaModel {
        @NameInMap("DynamicMetaData")
        public SearchPublicMediaInfoResponseBodyPublicMediaInfosMediaInfoDynamicMetaData dynamicMetaData;

        /**
         * <p>BasicInfo</p>
         */
        @NameInMap("MediaBasicInfo")
        public SearchPublicMediaInfoResponseBodyPublicMediaInfosMediaInfoMediaBasicInfo mediaBasicInfo;

        /**
         * <strong>example:</strong>
         * <p>icepublic-<strong><strong>87b921bb4a55908a72a0537e</strong></strong></p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        public static SearchPublicMediaInfoResponseBodyPublicMediaInfosMediaInfo build(java.util.Map<String, ?> map) throws Exception {
            SearchPublicMediaInfoResponseBodyPublicMediaInfosMediaInfo self = new SearchPublicMediaInfoResponseBodyPublicMediaInfosMediaInfo();
            return TeaModel.build(map, self);
        }

        public SearchPublicMediaInfoResponseBodyPublicMediaInfosMediaInfo setDynamicMetaData(SearchPublicMediaInfoResponseBodyPublicMediaInfosMediaInfoDynamicMetaData dynamicMetaData) {
            this.dynamicMetaData = dynamicMetaData;
            return this;
        }
        public SearchPublicMediaInfoResponseBodyPublicMediaInfosMediaInfoDynamicMetaData getDynamicMetaData() {
            return this.dynamicMetaData;
        }

        public SearchPublicMediaInfoResponseBodyPublicMediaInfosMediaInfo setMediaBasicInfo(SearchPublicMediaInfoResponseBodyPublicMediaInfosMediaInfoMediaBasicInfo mediaBasicInfo) {
            this.mediaBasicInfo = mediaBasicInfo;
            return this;
        }
        public SearchPublicMediaInfoResponseBodyPublicMediaInfosMediaInfoMediaBasicInfo getMediaBasicInfo() {
            return this.mediaBasicInfo;
        }

        public SearchPublicMediaInfoResponseBodyPublicMediaInfosMediaInfo setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

    }

    public static class SearchPublicMediaInfoResponseBodyPublicMediaInfos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Authorized")
        public Boolean authorized;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Favorite")
        public Boolean favorite;

        @NameInMap("MediaInfo")
        public SearchPublicMediaInfoResponseBodyPublicMediaInfosMediaInfo mediaInfo;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("RemainingAuthTime")
        public String remainingAuthTime;

        public static SearchPublicMediaInfoResponseBodyPublicMediaInfos build(java.util.Map<String, ?> map) throws Exception {
            SearchPublicMediaInfoResponseBodyPublicMediaInfos self = new SearchPublicMediaInfoResponseBodyPublicMediaInfos();
            return TeaModel.build(map, self);
        }

        public SearchPublicMediaInfoResponseBodyPublicMediaInfos setAuthorized(Boolean authorized) {
            this.authorized = authorized;
            return this;
        }
        public Boolean getAuthorized() {
            return this.authorized;
        }

        public SearchPublicMediaInfoResponseBodyPublicMediaInfos setFavorite(Boolean favorite) {
            this.favorite = favorite;
            return this;
        }
        public Boolean getFavorite() {
            return this.favorite;
        }

        public SearchPublicMediaInfoResponseBodyPublicMediaInfos setMediaInfo(SearchPublicMediaInfoResponseBodyPublicMediaInfosMediaInfo mediaInfo) {
            this.mediaInfo = mediaInfo;
            return this;
        }
        public SearchPublicMediaInfoResponseBodyPublicMediaInfosMediaInfo getMediaInfo() {
            return this.mediaInfo;
        }

        public SearchPublicMediaInfoResponseBodyPublicMediaInfos setRemainingAuthTime(String remainingAuthTime) {
            this.remainingAuthTime = remainingAuthTime;
            return this;
        }
        public String getRemainingAuthTime() {
            return this.remainingAuthTime;
        }

    }

}
