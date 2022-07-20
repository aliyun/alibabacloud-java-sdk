// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SearchMediaResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    // 符合要求的媒资集合
    @NameInMap("MediaInfoList")
    public java.util.List<SearchMediaResponseBodyMediaInfoList> mediaInfoList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    @NameInMap("Total")
    public Long total;

    public static SearchMediaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchMediaResponseBody self = new SearchMediaResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchMediaResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SearchMediaResponseBody setMediaInfoList(java.util.List<SearchMediaResponseBodyMediaInfoList> mediaInfoList) {
        this.mediaInfoList = mediaInfoList;
        return this;
    }
    public java.util.List<SearchMediaResponseBodyMediaInfoList> getMediaInfoList() {
        return this.mediaInfoList;
    }

    public SearchMediaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchMediaResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public SearchMediaResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class SearchMediaResponseBodyMediaInfoListFileInfoListFileBasicInfo extends TeaModel {
        // 码率
        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("CreateTime")
        public String createTime;

        // 时长
        @NameInMap("Duration")
        public String duration;

        // 文件名
        @NameInMap("FileName")
        public String fileName;

        // 文件大小（字节）
        @NameInMap("FileSize")
        public String fileSize;

        // 文件状态
        @NameInMap("FileStatus")
        public String fileStatus;

        @NameInMap("FileType")
        public String fileType;

        // 文件oss地址
        @NameInMap("FileUrl")
        public String fileUrl;

        // 封装格式
        @NameInMap("FormatName")
        public String formatName;

        // 高
        @NameInMap("Height")
        public String height;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        // 文件存储区域
        @NameInMap("Region")
        public String region;

        // 宽
        @NameInMap("Width")
        public String width;

        public static SearchMediaResponseBodyMediaInfoListFileInfoListFileBasicInfo build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaResponseBodyMediaInfoListFileInfoListFileBasicInfo self = new SearchMediaResponseBodyMediaInfoListFileInfoListFileBasicInfo();
            return TeaModel.build(map, self);
        }

        public SearchMediaResponseBodyMediaInfoListFileInfoListFileBasicInfo setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public SearchMediaResponseBodyMediaInfoListFileInfoListFileBasicInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public SearchMediaResponseBodyMediaInfoListFileInfoListFileBasicInfo setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public SearchMediaResponseBodyMediaInfoListFileInfoListFileBasicInfo setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public SearchMediaResponseBodyMediaInfoListFileInfoListFileBasicInfo setFileSize(String fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public String getFileSize() {
            return this.fileSize;
        }

        public SearchMediaResponseBodyMediaInfoListFileInfoListFileBasicInfo setFileStatus(String fileStatus) {
            this.fileStatus = fileStatus;
            return this;
        }
        public String getFileStatus() {
            return this.fileStatus;
        }

        public SearchMediaResponseBodyMediaInfoListFileInfoListFileBasicInfo setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

        public SearchMediaResponseBodyMediaInfoListFileInfoListFileBasicInfo setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public SearchMediaResponseBodyMediaInfoListFileInfoListFileBasicInfo setFormatName(String formatName) {
            this.formatName = formatName;
            return this;
        }
        public String getFormatName() {
            return this.formatName;
        }

        public SearchMediaResponseBodyMediaInfoListFileInfoListFileBasicInfo setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public SearchMediaResponseBodyMediaInfoListFileInfoListFileBasicInfo setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public SearchMediaResponseBodyMediaInfoListFileInfoListFileBasicInfo setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public SearchMediaResponseBodyMediaInfoListFileInfoListFileBasicInfo setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class SearchMediaResponseBodyMediaInfoListFileInfoList extends TeaModel {
        // 文件基础信息，包含时长，大小等
        @NameInMap("FileBasicInfo")
        public SearchMediaResponseBodyMediaInfoListFileInfoListFileBasicInfo fileBasicInfo;

        public static SearchMediaResponseBodyMediaInfoListFileInfoList build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaResponseBodyMediaInfoListFileInfoList self = new SearchMediaResponseBodyMediaInfoListFileInfoList();
            return TeaModel.build(map, self);
        }

        public SearchMediaResponseBodyMediaInfoListFileInfoList setFileBasicInfo(SearchMediaResponseBodyMediaInfoListFileInfoListFileBasicInfo fileBasicInfo) {
            this.fileBasicInfo = fileBasicInfo;
            return this;
        }
        public SearchMediaResponseBodyMediaInfoListFileInfoListFileBasicInfo getFileBasicInfo() {
            return this.fileBasicInfo;
        }

    }

    public static class SearchMediaResponseBodyMediaInfoListMediaBasicInfo extends TeaModel {
        @NameInMap("Biz")
        public String biz;

        // 媒资业务类型
        @NameInMap("BusinessType")
        public String businessType;

        @NameInMap("CateId")
        public Long cateId;

        @NameInMap("CateName")
        public String cateName;

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

        // 待注册的媒资在相应系统中的地址
        @NameInMap("InputURL")
        public String inputURL;

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

        // 截图
        @NameInMap("Snapshots")
        public String snapshots;

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

        // 转码状态
        @NameInMap("TranscodeStatus")
        public String transcodeStatus;

        @NameInMap("UploadSource")
        public String uploadSource;

        // 用户数据
        @NameInMap("UserData")
        public String userData;

        public static SearchMediaResponseBodyMediaInfoListMediaBasicInfo build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaResponseBodyMediaInfoListMediaBasicInfo self = new SearchMediaResponseBodyMediaInfoListMediaBasicInfo();
            return TeaModel.build(map, self);
        }

        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo setBiz(String biz) {
            this.biz = biz;
            return this;
        }
        public String getBiz() {
            return this.biz;
        }

        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo setBusinessType(String businessType) {
            this.businessType = businessType;
            return this;
        }
        public String getBusinessType() {
            return this.businessType;
        }

        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo setCateId(Long cateId) {
            this.cateId = cateId;
            return this;
        }
        public Long getCateId() {
            return this.cateId;
        }

        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo setCateName(String cateName) {
            this.cateName = cateName;
            return this;
        }
        public String getCateName() {
            return this.cateName;
        }

        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo setCoverURL(String coverURL) {
            this.coverURL = coverURL;
            return this;
        }
        public String getCoverURL() {
            return this.coverURL;
        }

        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo setDeletedTime(String deletedTime) {
            this.deletedTime = deletedTime;
            return this;
        }
        public String getDeletedTime() {
            return this.deletedTime;
        }

        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo setInputURL(String inputURL) {
            this.inputURL = inputURL;
            return this;
        }
        public String getInputURL() {
            return this.inputURL;
        }

        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo setMediaTags(String mediaTags) {
            this.mediaTags = mediaTags;
            return this;
        }
        public String getMediaTags() {
            return this.mediaTags;
        }

        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo setMediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public String getMediaType() {
            return this.mediaType;
        }

        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo setSnapshots(String snapshots) {
            this.snapshots = snapshots;
            return this;
        }
        public String getSnapshots() {
            return this.snapshots;
        }

        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo setSpriteImages(String spriteImages) {
            this.spriteImages = spriteImages;
            return this;
        }
        public String getSpriteImages() {
            return this.spriteImages;
        }

        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo setTranscodeStatus(String transcodeStatus) {
            this.transcodeStatus = transcodeStatus;
            return this;
        }
        public String getTranscodeStatus() {
            return this.transcodeStatus;
        }

        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo setUploadSource(String uploadSource) {
            this.uploadSource = uploadSource;
            return this;
        }
        public String getUploadSource() {
            return this.uploadSource;
        }

        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

    public static class SearchMediaResponseBodyMediaInfoList extends TeaModel {
        // FileInfos
        @NameInMap("FileInfoList")
        public java.util.List<SearchMediaResponseBodyMediaInfoListFileInfoList> fileInfoList;

        // BasicInfo
        @NameInMap("MediaBasicInfo")
        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo mediaBasicInfo;

        // 媒资ID
        @NameInMap("MediaId")
        public String mediaId;

        public static SearchMediaResponseBodyMediaInfoList build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaResponseBodyMediaInfoList self = new SearchMediaResponseBodyMediaInfoList();
            return TeaModel.build(map, self);
        }

        public SearchMediaResponseBodyMediaInfoList setFileInfoList(java.util.List<SearchMediaResponseBodyMediaInfoListFileInfoList> fileInfoList) {
            this.fileInfoList = fileInfoList;
            return this;
        }
        public java.util.List<SearchMediaResponseBodyMediaInfoListFileInfoList> getFileInfoList() {
            return this.fileInfoList;
        }

        public SearchMediaResponseBodyMediaInfoList setMediaBasicInfo(SearchMediaResponseBodyMediaInfoListMediaBasicInfo mediaBasicInfo) {
            this.mediaBasicInfo = mediaBasicInfo;
            return this;
        }
        public SearchMediaResponseBodyMediaInfoListMediaBasicInfo getMediaBasicInfo() {
            return this.mediaBasicInfo;
        }

        public SearchMediaResponseBodyMediaInfoList setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

    }

}
