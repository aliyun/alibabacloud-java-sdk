// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SearchPublicMediaInfoResponseBody extends TeaModel {
    @NameInMap("PublicMediaInfos")
    public java.util.List<SearchPublicMediaInfoResponseBodyPublicMediaInfos> publicMediaInfos;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Data")
        public String data;

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
        // 媒资业务类型
        @NameInMap("BusinessType")
        public String businessType;

        // 分类
        @NameInMap("Category")
        public String category;

        // 封面地址
        @NameInMap("CoverURL")
        public String coverURL;

        // 媒资创建时间
        @NameInMap("CreateTime")
        public String createTime;

        // 媒资删除时间
        @NameInMap("DeletedTime")
        public String deletedTime;

        // 内容描述
        @NameInMap("Description")
        public String description;

        // MediaId
        @NameInMap("MediaId")
        public String mediaId;

        // 标签
        @NameInMap("MediaTags")
        public String mediaTags;

        // 媒资媒体类型
        @NameInMap("MediaType")
        public String mediaType;

        // 媒资修改时间
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        // 来源
        @NameInMap("Source")
        public String source;

        // 雪碧图
        @NameInMap("SpriteImages")
        public String spriteImages;

        // 资源状态
        @NameInMap("Status")
        public String status;

        // 标题
        @NameInMap("Title")
        public String title;

        // 用户数据
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

        // BasicInfo
        @NameInMap("MediaBasicInfo")
        public SearchPublicMediaInfoResponseBodyPublicMediaInfosMediaInfoMediaBasicInfo mediaBasicInfo;

        // 媒资ID
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
        @NameInMap("Authorized")
        public Boolean authorized;

        @NameInMap("Favorite")
        public Boolean favorite;

        @NameInMap("MediaInfo")
        public SearchPublicMediaInfoResponseBodyPublicMediaInfosMediaInfo mediaInfo;

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
