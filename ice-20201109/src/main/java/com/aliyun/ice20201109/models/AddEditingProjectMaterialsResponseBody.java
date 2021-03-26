// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class AddEditingProjectMaterialsResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ProjectId")
    public String projectId;

    // 符合要求的媒资集合
    @NameInMap("MediaInfos")
    public java.util.List<AddEditingProjectMaterialsResponseBodyMediaInfos> mediaInfos;

    public static AddEditingProjectMaterialsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddEditingProjectMaterialsResponseBody self = new AddEditingProjectMaterialsResponseBody();
        return TeaModel.build(map, self);
    }

    public AddEditingProjectMaterialsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddEditingProjectMaterialsResponseBody setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public AddEditingProjectMaterialsResponseBody setMediaInfos(java.util.List<AddEditingProjectMaterialsResponseBodyMediaInfos> mediaInfos) {
        this.mediaInfos = mediaInfos;
        return this;
    }
    public java.util.List<AddEditingProjectMaterialsResponseBodyMediaInfos> getMediaInfos() {
        return this.mediaInfos;
    }

    public static class AddEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo extends TeaModel {
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

        public static AddEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo build(java.util.Map<String, ?> map) throws Exception {
            AddEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo self = new AddEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo();
            return TeaModel.build(map, self);
        }

        public AddEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public AddEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo setInputURL(String inputURL) {
            this.inputURL = inputURL;
            return this;
        }
        public String getInputURL() {
            return this.inputURL;
        }

        public AddEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo setMediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public String getMediaType() {
            return this.mediaType;
        }

        public AddEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo setBusinessType(String businessType) {
            this.businessType = businessType;
            return this;
        }
        public String getBusinessType() {
            return this.businessType;
        }

        public AddEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public AddEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public AddEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public AddEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public AddEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo setMediaTags(String mediaTags) {
            this.mediaTags = mediaTags;
            return this;
        }
        public String getMediaTags() {
            return this.mediaTags;
        }

        public AddEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo setCoverURL(String coverURL) {
            this.coverURL = coverURL;
            return this;
        }
        public String getCoverURL() {
            return this.coverURL;
        }

        public AddEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public AddEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo setSnapshots(String snapshots) {
            this.snapshots = snapshots;
            return this;
        }
        public String getSnapshots() {
            return this.snapshots;
        }

        public AddEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public AddEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo setTranscodeStatus(String transcodeStatus) {
            this.transcodeStatus = transcodeStatus;
            return this;
        }
        public String getTranscodeStatus() {
            return this.transcodeStatus;
        }

        public AddEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public AddEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public AddEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo setDeletedTime(String deletedTime) {
            this.deletedTime = deletedTime;
            return this;
        }
        public String getDeletedTime() {
            return this.deletedTime;
        }

    }

    public static class AddEditingProjectMaterialsResponseBodyMediaInfosFileInfoListFileBasicInfo extends TeaModel {
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

        public static AddEditingProjectMaterialsResponseBodyMediaInfosFileInfoListFileBasicInfo build(java.util.Map<String, ?> map) throws Exception {
            AddEditingProjectMaterialsResponseBodyMediaInfosFileInfoListFileBasicInfo self = new AddEditingProjectMaterialsResponseBodyMediaInfosFileInfoListFileBasicInfo();
            return TeaModel.build(map, self);
        }

        public AddEditingProjectMaterialsResponseBodyMediaInfosFileInfoListFileBasicInfo setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public AddEditingProjectMaterialsResponseBodyMediaInfosFileInfoListFileBasicInfo setFileStatus(String fileStatus) {
            this.fileStatus = fileStatus;
            return this;
        }
        public String getFileStatus() {
            return this.fileStatus;
        }

        public AddEditingProjectMaterialsResponseBodyMediaInfosFileInfoListFileBasicInfo setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

        public AddEditingProjectMaterialsResponseBodyMediaInfosFileInfoListFileBasicInfo setFileSize(String fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public String getFileSize() {
            return this.fileSize;
        }

        public AddEditingProjectMaterialsResponseBodyMediaInfosFileInfoListFileBasicInfo setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public AddEditingProjectMaterialsResponseBodyMediaInfosFileInfoListFileBasicInfo setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public AddEditingProjectMaterialsResponseBodyMediaInfosFileInfoListFileBasicInfo setFormatName(String formatName) {
            this.formatName = formatName;
            return this;
        }
        public String getFormatName() {
            return this.formatName;
        }

        public AddEditingProjectMaterialsResponseBodyMediaInfosFileInfoListFileBasicInfo setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public AddEditingProjectMaterialsResponseBodyMediaInfosFileInfoListFileBasicInfo setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public AddEditingProjectMaterialsResponseBodyMediaInfosFileInfoListFileBasicInfo setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

        public AddEditingProjectMaterialsResponseBodyMediaInfosFileInfoListFileBasicInfo setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

    }

    public static class AddEditingProjectMaterialsResponseBodyMediaInfosFileInfoList extends TeaModel {
        // 文件基础信息，包含时长，大小等
        @NameInMap("FileBasicInfo")
        public AddEditingProjectMaterialsResponseBodyMediaInfosFileInfoListFileBasicInfo fileBasicInfo;

        public static AddEditingProjectMaterialsResponseBodyMediaInfosFileInfoList build(java.util.Map<String, ?> map) throws Exception {
            AddEditingProjectMaterialsResponseBodyMediaInfosFileInfoList self = new AddEditingProjectMaterialsResponseBodyMediaInfosFileInfoList();
            return TeaModel.build(map, self);
        }

        public AddEditingProjectMaterialsResponseBodyMediaInfosFileInfoList setFileBasicInfo(AddEditingProjectMaterialsResponseBodyMediaInfosFileInfoListFileBasicInfo fileBasicInfo) {
            this.fileBasicInfo = fileBasicInfo;
            return this;
        }
        public AddEditingProjectMaterialsResponseBodyMediaInfosFileInfoListFileBasicInfo getFileBasicInfo() {
            return this.fileBasicInfo;
        }

    }

    public static class AddEditingProjectMaterialsResponseBodyMediaInfos extends TeaModel {
        // 媒资ID
        @NameInMap("MediaId")
        public String mediaId;

        // BasicInfo
        @NameInMap("MediaBasicInfo")
        public AddEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo mediaBasicInfo;

        // FileInfos
        @NameInMap("FileInfoList")
        public java.util.List<AddEditingProjectMaterialsResponseBodyMediaInfosFileInfoList> fileInfoList;

        public static AddEditingProjectMaterialsResponseBodyMediaInfos build(java.util.Map<String, ?> map) throws Exception {
            AddEditingProjectMaterialsResponseBodyMediaInfos self = new AddEditingProjectMaterialsResponseBodyMediaInfos();
            return TeaModel.build(map, self);
        }

        public AddEditingProjectMaterialsResponseBodyMediaInfos setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public AddEditingProjectMaterialsResponseBodyMediaInfos setMediaBasicInfo(AddEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo mediaBasicInfo) {
            this.mediaBasicInfo = mediaBasicInfo;
            return this;
        }
        public AddEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo getMediaBasicInfo() {
            return this.mediaBasicInfo;
        }

        public AddEditingProjectMaterialsResponseBodyMediaInfos setFileInfoList(java.util.List<AddEditingProjectMaterialsResponseBodyMediaInfosFileInfoList> fileInfoList) {
            this.fileInfoList = fileInfoList;
            return this;
        }
        public java.util.List<AddEditingProjectMaterialsResponseBodyMediaInfosFileInfoList> getFileInfoList() {
            return this.fileInfoList;
        }

    }

}
