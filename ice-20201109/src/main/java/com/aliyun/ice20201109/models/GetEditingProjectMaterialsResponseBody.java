// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetEditingProjectMaterialsResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ProjectId")
    public String projectId;

    // 符合要求的媒资集合
    @NameInMap("MediaInfos")
    public java.util.List<GetEditingProjectMaterialsResponseBodyMediaInfos> mediaInfos;

    public static GetEditingProjectMaterialsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEditingProjectMaterialsResponseBody self = new GetEditingProjectMaterialsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEditingProjectMaterialsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEditingProjectMaterialsResponseBody setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public GetEditingProjectMaterialsResponseBody setMediaInfos(java.util.List<GetEditingProjectMaterialsResponseBodyMediaInfos> mediaInfos) {
        this.mediaInfos = mediaInfos;
        return this;
    }
    public java.util.List<GetEditingProjectMaterialsResponseBodyMediaInfos> getMediaInfos() {
        return this.mediaInfos;
    }

    public static class GetEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo extends TeaModel {
        // MediaId
        @NameInMap("MediaId")
        public String mediaId;

        // 待注册的媒资在相应系统中的地址
        @NameInMap("InputURL")
        public String inputURL;

        // 媒资媒体类型
        @NameInMap("MediaType")
        public String mediaType;

        // 媒资业务类型
        @NameInMap("BusinessType")
        public String businessType;

        // 来源
        @NameInMap("Source")
        public String source;

        // 标题
        @NameInMap("Title")
        public String title;

        // 内容描述
        @NameInMap("Description")
        public String description;

        // 分类
        @NameInMap("Category")
        public String category;

        // 标签
        @NameInMap("MediaTags")
        public String mediaTags;

        // 封面地址
        @NameInMap("CoverURL")
        public String coverURL;

        // 用户数据
        @NameInMap("UserData")
        public String userData;

        // 截图
        @NameInMap("Snapshots")
        public String snapshots;

        // 资源状态
        @NameInMap("Status")
        public String status;

        // 转码状态
        @NameInMap("TranscodeStatus")
        public String transcodeStatus;

        // 媒资创建时间
        @NameInMap("CreateTime")
        public String createTime;

        // 媒资修改时间
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        // 媒资删除时间
        @NameInMap("DeletedTime")
        public String deletedTime;

        // 雪碧图
        @NameInMap("SpriteImages")
        public String spriteImages;

        public static GetEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo build(java.util.Map<String, ?> map) throws Exception {
            GetEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo self = new GetEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo();
            return TeaModel.build(map, self);
        }

        public GetEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public GetEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo setInputURL(String inputURL) {
            this.inputURL = inputURL;
            return this;
        }
        public String getInputURL() {
            return this.inputURL;
        }

        public GetEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo setMediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public String getMediaType() {
            return this.mediaType;
        }

        public GetEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo setBusinessType(String businessType) {
            this.businessType = businessType;
            return this;
        }
        public String getBusinessType() {
            return this.businessType;
        }

        public GetEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public GetEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo setMediaTags(String mediaTags) {
            this.mediaTags = mediaTags;
            return this;
        }
        public String getMediaTags() {
            return this.mediaTags;
        }

        public GetEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo setCoverURL(String coverURL) {
            this.coverURL = coverURL;
            return this;
        }
        public String getCoverURL() {
            return this.coverURL;
        }

        public GetEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public GetEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo setSnapshots(String snapshots) {
            this.snapshots = snapshots;
            return this;
        }
        public String getSnapshots() {
            return this.snapshots;
        }

        public GetEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo setTranscodeStatus(String transcodeStatus) {
            this.transcodeStatus = transcodeStatus;
            return this;
        }
        public String getTranscodeStatus() {
            return this.transcodeStatus;
        }

        public GetEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo setDeletedTime(String deletedTime) {
            this.deletedTime = deletedTime;
            return this;
        }
        public String getDeletedTime() {
            return this.deletedTime;
        }

        public GetEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo setSpriteImages(String spriteImages) {
            this.spriteImages = spriteImages;
            return this;
        }
        public String getSpriteImages() {
            return this.spriteImages;
        }

    }

    public static class GetEditingProjectMaterialsResponseBodyMediaInfosFileInfoListFileBasicInfo extends TeaModel {
        // 文件名
        @NameInMap("FileName")
        public String fileName;

        // 文件状态
        @NameInMap("FileStatus")
        public String fileStatus;

        // 文件类型
        @NameInMap("FileType")
        public String fileType;

        // 文件大小（字节）
        @NameInMap("FileSize")
        public String fileSize;

        // 文件oss地址
        @NameInMap("FileUrl")
        public String fileUrl;

        // 文件存储区域
        @NameInMap("Region")
        public String region;

        // 封装格式
        @NameInMap("FormatName")
        public String formatName;

        // 时长
        @NameInMap("Duration")
        public String duration;

        // 码率
        @NameInMap("Bitrate")
        public String bitrate;

        // 宽
        @NameInMap("Width")
        public String width;

        // 高
        @NameInMap("Height")
        public String height;

        public static GetEditingProjectMaterialsResponseBodyMediaInfosFileInfoListFileBasicInfo build(java.util.Map<String, ?> map) throws Exception {
            GetEditingProjectMaterialsResponseBodyMediaInfosFileInfoListFileBasicInfo self = new GetEditingProjectMaterialsResponseBodyMediaInfosFileInfoListFileBasicInfo();
            return TeaModel.build(map, self);
        }

        public GetEditingProjectMaterialsResponseBodyMediaInfosFileInfoListFileBasicInfo setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetEditingProjectMaterialsResponseBodyMediaInfosFileInfoListFileBasicInfo setFileStatus(String fileStatus) {
            this.fileStatus = fileStatus;
            return this;
        }
        public String getFileStatus() {
            return this.fileStatus;
        }

        public GetEditingProjectMaterialsResponseBodyMediaInfosFileInfoListFileBasicInfo setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

        public GetEditingProjectMaterialsResponseBodyMediaInfosFileInfoListFileBasicInfo setFileSize(String fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public String getFileSize() {
            return this.fileSize;
        }

        public GetEditingProjectMaterialsResponseBodyMediaInfosFileInfoListFileBasicInfo setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public GetEditingProjectMaterialsResponseBodyMediaInfosFileInfoListFileBasicInfo setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetEditingProjectMaterialsResponseBodyMediaInfosFileInfoListFileBasicInfo setFormatName(String formatName) {
            this.formatName = formatName;
            return this;
        }
        public String getFormatName() {
            return this.formatName;
        }

        public GetEditingProjectMaterialsResponseBodyMediaInfosFileInfoListFileBasicInfo setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public GetEditingProjectMaterialsResponseBodyMediaInfosFileInfoListFileBasicInfo setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public GetEditingProjectMaterialsResponseBodyMediaInfosFileInfoListFileBasicInfo setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

        public GetEditingProjectMaterialsResponseBodyMediaInfosFileInfoListFileBasicInfo setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

    }

    public static class GetEditingProjectMaterialsResponseBodyMediaInfosFileInfoList extends TeaModel {
        // 文件基础信息，包含时长，大小等
        @NameInMap("FileBasicInfo")
        public GetEditingProjectMaterialsResponseBodyMediaInfosFileInfoListFileBasicInfo fileBasicInfo;

        public static GetEditingProjectMaterialsResponseBodyMediaInfosFileInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetEditingProjectMaterialsResponseBodyMediaInfosFileInfoList self = new GetEditingProjectMaterialsResponseBodyMediaInfosFileInfoList();
            return TeaModel.build(map, self);
        }

        public GetEditingProjectMaterialsResponseBodyMediaInfosFileInfoList setFileBasicInfo(GetEditingProjectMaterialsResponseBodyMediaInfosFileInfoListFileBasicInfo fileBasicInfo) {
            this.fileBasicInfo = fileBasicInfo;
            return this;
        }
        public GetEditingProjectMaterialsResponseBodyMediaInfosFileInfoListFileBasicInfo getFileBasicInfo() {
            return this.fileBasicInfo;
        }

    }

    public static class GetEditingProjectMaterialsResponseBodyMediaInfos extends TeaModel {
        // 媒资ID
        @NameInMap("MediaId")
        public String mediaId;

        // BasicInfo
        @NameInMap("MediaBasicInfo")
        public GetEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo mediaBasicInfo;

        // FileInfos
        @NameInMap("FileInfoList")
        public java.util.List<GetEditingProjectMaterialsResponseBodyMediaInfosFileInfoList> fileInfoList;

        public static GetEditingProjectMaterialsResponseBodyMediaInfos build(java.util.Map<String, ?> map) throws Exception {
            GetEditingProjectMaterialsResponseBodyMediaInfos self = new GetEditingProjectMaterialsResponseBodyMediaInfos();
            return TeaModel.build(map, self);
        }

        public GetEditingProjectMaterialsResponseBodyMediaInfos setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public GetEditingProjectMaterialsResponseBodyMediaInfos setMediaBasicInfo(GetEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo mediaBasicInfo) {
            this.mediaBasicInfo = mediaBasicInfo;
            return this;
        }
        public GetEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo getMediaBasicInfo() {
            return this.mediaBasicInfo;
        }

        public GetEditingProjectMaterialsResponseBodyMediaInfos setFileInfoList(java.util.List<GetEditingProjectMaterialsResponseBodyMediaInfosFileInfoList> fileInfoList) {
            this.fileInfoList = fileInfoList;
            return this;
        }
        public java.util.List<GetEditingProjectMaterialsResponseBodyMediaInfosFileInfoList> getFileInfoList() {
            return this.fileInfoList;
        }

    }

}
