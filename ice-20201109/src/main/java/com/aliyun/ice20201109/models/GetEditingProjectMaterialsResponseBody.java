// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetEditingProjectMaterialsResponseBody extends TeaModel {
    /**
     * <p>The materials associated with the live stream.</p>
     */
    @NameInMap("LiveMaterials")
    public java.util.List<GetEditingProjectMaterialsResponseBodyLiveMaterials> liveMaterials;

    /**
     * <p>The media assets that meet the specified conditions.</p>
     */
    @NameInMap("MediaInfos")
    public java.util.List<GetEditingProjectMaterialsResponseBodyMediaInfos> mediaInfos;

    /**
     * <p>The project ID.</p>
     * 
     * <strong>example:</strong>
     * <p><em><strong><strong>67ae06542b9b93e0d1c387</strong></strong></em></p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The materials associated with the editing project. A live stream editing project will be associated with a regular editing project after the live streaming ends.</p>
     * 
     * <strong>example:</strong>
     * <p><em><strong><strong>9b145c5cafc2e057304fcd</strong></strong></em></p>
     */
    @NameInMap("ProjectMaterials")
    public java.util.List<String> projectMaterials;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>89-C21D-4B78-AE24-3788B8</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetEditingProjectMaterialsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEditingProjectMaterialsResponseBody self = new GetEditingProjectMaterialsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEditingProjectMaterialsResponseBody setLiveMaterials(java.util.List<GetEditingProjectMaterialsResponseBodyLiveMaterials> liveMaterials) {
        this.liveMaterials = liveMaterials;
        return this;
    }
    public java.util.List<GetEditingProjectMaterialsResponseBodyLiveMaterials> getLiveMaterials() {
        return this.liveMaterials;
    }

    public GetEditingProjectMaterialsResponseBody setMediaInfos(java.util.List<GetEditingProjectMaterialsResponseBodyMediaInfos> mediaInfos) {
        this.mediaInfos = mediaInfos;
        return this;
    }
    public java.util.List<GetEditingProjectMaterialsResponseBodyMediaInfos> getMediaInfos() {
        return this.mediaInfos;
    }

    public GetEditingProjectMaterialsResponseBody setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public GetEditingProjectMaterialsResponseBody setProjectMaterials(java.util.List<String> projectMaterials) {
        this.projectMaterials = projectMaterials;
        return this;
    }
    public java.util.List<String> getProjectMaterials() {
        return this.projectMaterials;
    }

    public GetEditingProjectMaterialsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetEditingProjectMaterialsResponseBodyLiveMaterials extends TeaModel {
        /**
         * <p>The application name of the live stream.</p>
         * 
         * <strong>example:</strong>
         * <p>testrecord</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The domain name of the live stream.</p>
         * 
         * <strong>example:</strong>
         * <p>test.alivecdn.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The URL of the live stream.</p>
         * 
         * <strong>example:</strong>
         * <p>rtmp://test.alivecdn.com/testrecord/teststream</p>
         */
        @NameInMap("LiveUrl")
        public String liveUrl;

        /**
         * <p>The name of the live stream.</p>
         * 
         * <strong>example:</strong>
         * <p>testrecord</p>
         */
        @NameInMap("StreamName")
        public String streamName;

        public static GetEditingProjectMaterialsResponseBodyLiveMaterials build(java.util.Map<String, ?> map) throws Exception {
            GetEditingProjectMaterialsResponseBodyLiveMaterials self = new GetEditingProjectMaterialsResponseBodyLiveMaterials();
            return TeaModel.build(map, self);
        }

        public GetEditingProjectMaterialsResponseBodyLiveMaterials setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetEditingProjectMaterialsResponseBodyLiveMaterials setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public GetEditingProjectMaterialsResponseBodyLiveMaterials setLiveUrl(String liveUrl) {
            this.liveUrl = liveUrl;
            return this;
        }
        public String getLiveUrl() {
            return this.liveUrl;
        }

        public GetEditingProjectMaterialsResponseBodyLiveMaterials setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

    }

    public static class GetEditingProjectMaterialsResponseBodyMediaInfosFileInfoListFileBasicInfo extends TeaModel {
        /**
         * <p>The bitrate.</p>
         * 
         * <strong>example:</strong>
         * <p>1132.68</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The duration.</p>
         * 
         * <strong>example:</strong>
         * <p>216.206667</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The file name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.mp4</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The file size. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>30611502</p>
         */
        @NameInMap("FileSize")
        public String fileSize;

        /**
         * <p>The file status.</p>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("FileStatus")
        public String fileStatus;

        /**
         * <p>The file type.</p>
         * 
         * <strong>example:</strong>
         * <p>source_file</p>
         */
        @NameInMap("FileType")
        public String fileType;

        /**
         * <p>The Object Storage Service (OSS) URL of the file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4?Expires=">http://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4?Expires=</a><ExpireTime>&amp;OSSAccessKeyId=<OSSAccessKeyId>&amp;Signature=<Signature>&amp;security-token=<SecurityToken></p>
         */
        @NameInMap("FileUrl")
        public String fileUrl;

        /**
         * <p>The container format.</p>
         * 
         * <strong>example:</strong>
         * <p>mov,mp4,m4a,3gp,3g2,mj2</p>
         */
        @NameInMap("FormatName")
        public String formatName;

        /**
         * <p>The height.</p>
         * 
         * <strong>example:</strong>
         * <p>540</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>The region in which the file resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The width.</p>
         * 
         * <strong>example:</strong>
         * <p>960</p>
         */
        @NameInMap("Width")
        public String width;

        public static GetEditingProjectMaterialsResponseBodyMediaInfosFileInfoListFileBasicInfo build(java.util.Map<String, ?> map) throws Exception {
            GetEditingProjectMaterialsResponseBodyMediaInfosFileInfoListFileBasicInfo self = new GetEditingProjectMaterialsResponseBodyMediaInfosFileInfoListFileBasicInfo();
            return TeaModel.build(map, self);
        }

        public GetEditingProjectMaterialsResponseBodyMediaInfosFileInfoListFileBasicInfo setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public GetEditingProjectMaterialsResponseBodyMediaInfosFileInfoListFileBasicInfo setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public GetEditingProjectMaterialsResponseBodyMediaInfosFileInfoListFileBasicInfo setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetEditingProjectMaterialsResponseBodyMediaInfosFileInfoListFileBasicInfo setFileSize(String fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public String getFileSize() {
            return this.fileSize;
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

        public GetEditingProjectMaterialsResponseBodyMediaInfosFileInfoListFileBasicInfo setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public GetEditingProjectMaterialsResponseBodyMediaInfosFileInfoListFileBasicInfo setFormatName(String formatName) {
            this.formatName = formatName;
            return this;
        }
        public String getFormatName() {
            return this.formatName;
        }

        public GetEditingProjectMaterialsResponseBodyMediaInfosFileInfoListFileBasicInfo setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public GetEditingProjectMaterialsResponseBodyMediaInfosFileInfoListFileBasicInfo setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetEditingProjectMaterialsResponseBodyMediaInfosFileInfoListFileBasicInfo setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class GetEditingProjectMaterialsResponseBodyMediaInfosFileInfoList extends TeaModel {
        /**
         * <p>The basic information of the file, such as the duration and size.</p>
         */
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

    public static class GetEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo extends TeaModel {
        /**
         * <p>The business type of the media asset.</p>
         * 
         * <strong>example:</strong>
         * <p>general</p>
         */
        @NameInMap("BusinessType")
        public String businessType;

        /**
         * <p>The category of the media asset.</p>
         * 
         * <strong>example:</strong>
         * <p>video</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The thumbnail URL of the media asset.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://sample-bucket.oss-cn-shanghai.aliyuncs.com/sample-corver.jpg?Expires=1628670610&OSSAccessKeyId=AK&Signature=signature">http://sample-bucket.oss-cn-shanghai.aliyuncs.com/sample-corver.jpg?Expires=1628670610&amp;OSSAccessKeyId=AK&amp;Signature=signature</a></p>
         */
        @NameInMap("CoverURL")
        public String coverURL;

        /**
         * <p>The time when the media asset was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-26T04:11:08Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The time when the media asset was deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-26T04:11:08Z</p>
         */
        @NameInMap("DeletedTime")
        public String deletedTime;

        /**
         * <p>The description of the media asset.</p>
         * 
         * <strong>example:</strong>
         * <p>sample_description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The URL of the media asset in another service.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://bucket.oss-cn-shanghai.aliyuncs.com/file.mp4">http://bucket.oss-cn-shanghai.aliyuncs.com/file.mp4</a></p>
         */
        @NameInMap("InputURL")
        public String inputURL;

        /**
         * <p>The ID of the media asset.</p>
         * 
         * <strong>example:</strong>
         * <p><em><strong><strong>64623a94eca8516569c8f</strong></strong></em></p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <p>The tags of the media asset.</p>
         */
        @NameInMap("MediaTags")
        public String mediaTags;

        /**
         * <p>The type of the media asset.</p>
         * 
         * <strong>example:</strong>
         * <p>video</p>
         */
        @NameInMap("MediaType")
        public String mediaType;

        /**
         * <p>The time when the media asset was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-26T04:11:08Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The snapshots of the media asset.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Snapshots")
        public String snapshots;

        /**
         * <p>The source of the media asset.</p>
         * 
         * <strong>example:</strong>
         * <p>oss</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The sprite of the media asset</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("SpriteImages")
        public String spriteImages;

        /**
         * <p>The status of the media asset.</p>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The title of the media asset.</p>
         * 
         * <strong>example:</strong>
         * <p>file.mp4</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The transcoding status of the media asset.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>TranscodeSuccess: transcoding completed.</li>
         * <li>TranscodeFailed: transcoding failed.</li>
         * <li>Init: initializing.</li>
         * <li>Transcoding: transcoding in progress.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Init</p>
         */
        @NameInMap("TranscodeStatus")
        public String transcodeStatus;

        /**
         * <p>The user data.</p>
         * 
         * <strong>example:</strong>
         * <p>userData</p>
         */
        @NameInMap("UserData")
        public String userData;

        public static GetEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo build(java.util.Map<String, ?> map) throws Exception {
            GetEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo self = new GetEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo();
            return TeaModel.build(map, self);
        }

        public GetEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo setBusinessType(String businessType) {
            this.businessType = businessType;
            return this;
        }
        public String getBusinessType() {
            return this.businessType;
        }

        public GetEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public GetEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo setCoverURL(String coverURL) {
            this.coverURL = coverURL;
            return this;
        }
        public String getCoverURL() {
            return this.coverURL;
        }

        public GetEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo setDeletedTime(String deletedTime) {
            this.deletedTime = deletedTime;
            return this;
        }
        public String getDeletedTime() {
            return this.deletedTime;
        }

        public GetEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo setInputURL(String inputURL) {
            this.inputURL = inputURL;
            return this;
        }
        public String getInputURL() {
            return this.inputURL;
        }

        public GetEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public GetEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo setMediaTags(String mediaTags) {
            this.mediaTags = mediaTags;
            return this;
        }
        public String getMediaTags() {
            return this.mediaTags;
        }

        public GetEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo setMediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public String getMediaType() {
            return this.mediaType;
        }

        public GetEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo setSnapshots(String snapshots) {
            this.snapshots = snapshots;
            return this;
        }
        public String getSnapshots() {
            return this.snapshots;
        }

        public GetEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo setSpriteImages(String spriteImages) {
            this.spriteImages = spriteImages;
            return this;
        }
        public String getSpriteImages() {
            return this.spriteImages;
        }

        public GetEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo setTranscodeStatus(String transcodeStatus) {
            this.transcodeStatus = transcodeStatus;
            return this;
        }
        public String getTranscodeStatus() {
            return this.transcodeStatus;
        }

        public GetEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

    public static class GetEditingProjectMaterialsResponseBodyMediaInfos extends TeaModel {
        /**
         * <p>The information about the file.</p>
         */
        @NameInMap("FileInfoList")
        public java.util.List<GetEditingProjectMaterialsResponseBodyMediaInfosFileInfoList> fileInfoList;

        /**
         * <p>The basic information of the media asset.</p>
         */
        @NameInMap("MediaBasicInfo")
        public GetEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo mediaBasicInfo;

        /**
         * <p>The ID of the media asset.</p>
         * 
         * <strong>example:</strong>
         * <p><em><strong><strong>64623a94eca8516569c8fe</strong></strong></em></p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        public static GetEditingProjectMaterialsResponseBodyMediaInfos build(java.util.Map<String, ?> map) throws Exception {
            GetEditingProjectMaterialsResponseBodyMediaInfos self = new GetEditingProjectMaterialsResponseBodyMediaInfos();
            return TeaModel.build(map, self);
        }

        public GetEditingProjectMaterialsResponseBodyMediaInfos setFileInfoList(java.util.List<GetEditingProjectMaterialsResponseBodyMediaInfosFileInfoList> fileInfoList) {
            this.fileInfoList = fileInfoList;
            return this;
        }
        public java.util.List<GetEditingProjectMaterialsResponseBodyMediaInfosFileInfoList> getFileInfoList() {
            return this.fileInfoList;
        }

        public GetEditingProjectMaterialsResponseBodyMediaInfos setMediaBasicInfo(GetEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo mediaBasicInfo) {
            this.mediaBasicInfo = mediaBasicInfo;
            return this;
        }
        public GetEditingProjectMaterialsResponseBodyMediaInfosMediaBasicInfo getMediaBasicInfo() {
            return this.mediaBasicInfo;
        }

        public GetEditingProjectMaterialsResponseBodyMediaInfos setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

    }

}
