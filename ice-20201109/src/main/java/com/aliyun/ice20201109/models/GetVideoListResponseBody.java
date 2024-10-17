// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetVideoListResponseBody extends TeaModel {
    /**
     * <p>The status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The information about the audio and video files.</p>
     */
    @NameInMap("MediaList")
    public java.util.List<GetVideoListResponseBodyMediaList> mediaList;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    /**
     * <p>The total number of audio and video files that meet the conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>163</p>
     */
    @NameInMap("Total")
    public Long total;

    public static GetVideoListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVideoListResponseBody self = new GetVideoListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVideoListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetVideoListResponseBody setMediaList(java.util.List<GetVideoListResponseBodyMediaList> mediaList) {
        this.mediaList = mediaList;
        return this;
    }
    public java.util.List<GetVideoListResponseBodyMediaList> getMediaList() {
        return this.mediaList;
    }

    public GetVideoListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVideoListResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public GetVideoListResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class GetVideoListResponseBodyMediaList extends TeaModel {
        /**
         * <p>The ID of the application. Default value: app-1000000.</p>
         * 
         * <strong>example:</strong>
         * <p>app-1000000</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The ID of the category.</p>
         * 
         * <strong>example:</strong>
         * <p>3679</p>
         */
        @NameInMap("CateId")
        public Long cateId;

        /**
         * <p>The name of the category.</p>
         */
        @NameInMap("CateName")
        public String cateName;

        /**
         * <p>The URL of the thumbnail.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example.aliyundoc.com/snapshot/****.jpg?auth_key=1498476426-0-0-f00b9455c49a423ce69cf4e27333">http://example.aliyundoc.com/snapshot/****.jpg?auth_key=1498476426-0-0-f00b9455c49a423ce69cf4e27333</a>****</p>
         */
        @NameInMap("CoverUrl")
        public String coverUrl;

        /**
         * <p>The time when the audio or video file was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-11-14T09:15:50Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the audio or video file.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The duration. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>135.6</p>
         */
        @NameInMap("Duration")
        public Float duration;

        /**
         * <p>The ID of the audio or video file.</p>
         * 
         * <strong>example:</strong>
         * <p>1c6ce34007d571ed94667630a6bc****</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <p>The time when the audio or video file was updated. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-11-14T09:16:50Z</p>
         */
        @NameInMap("ModificationTime")
        public String modificationTime;

        /**
         * <p>The size of the source file. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>10897890</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <p>The array of video snapshot URLs.</p>
         */
        @NameInMap("Snapshots")
        public java.util.List<String> snapshots;

        /**
         * <p>The status of the video.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>PrepareFail: The file is abnormal.</li>
         * <li>UploadFail: The video failed to be uploaded.</li>
         * <li>UploadSucc: The video is uploaded.</li>
         * <li>Transcoding: The video is being transcoded.</li>
         * <li>TranscodeFail: The video failed to be transcoded.</li>
         * <li>ProduceFail: The video failed to be produced.</li>
         * <li>Normal: The video is normal.</li>
         * <li>Uploading: The video is being uploaded.</li>
         * <li>Preparing: The file is being generated.</li>
         * <li>Blocked: The video is blocked.</li>
         * <li>checking: The video is being reviewed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The storage address.</p>
         * 
         * <strong>example:</strong>
         * <p>out-****.oss-cn-shanghai.aliyuncs.com</p>
         */
        @NameInMap("StorageLocation")
        public String storageLocation;

        /**
         * <p>The tags of the audio or video file.</p>
         */
        @NameInMap("Tags")
        public String tags;

        /**
         * <p>The title of the audio or video file.</p>
         */
        @NameInMap("Title")
        public String title;

        public static GetVideoListResponseBodyMediaList build(java.util.Map<String, ?> map) throws Exception {
            GetVideoListResponseBodyMediaList self = new GetVideoListResponseBodyMediaList();
            return TeaModel.build(map, self);
        }

        public GetVideoListResponseBodyMediaList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetVideoListResponseBodyMediaList setCateId(Long cateId) {
            this.cateId = cateId;
            return this;
        }
        public Long getCateId() {
            return this.cateId;
        }

        public GetVideoListResponseBodyMediaList setCateName(String cateName) {
            this.cateName = cateName;
            return this;
        }
        public String getCateName() {
            return this.cateName;
        }

        public GetVideoListResponseBodyMediaList setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public GetVideoListResponseBodyMediaList setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetVideoListResponseBodyMediaList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetVideoListResponseBodyMediaList setDuration(Float duration) {
            this.duration = duration;
            return this;
        }
        public Float getDuration() {
            return this.duration;
        }

        public GetVideoListResponseBodyMediaList setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public GetVideoListResponseBodyMediaList setModificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }
        public String getModificationTime() {
            return this.modificationTime;
        }

        public GetVideoListResponseBodyMediaList setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public GetVideoListResponseBodyMediaList setSnapshots(java.util.List<String> snapshots) {
            this.snapshots = snapshots;
            return this;
        }
        public java.util.List<String> getSnapshots() {
            return this.snapshots;
        }

        public GetVideoListResponseBodyMediaList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetVideoListResponseBodyMediaList setStorageLocation(String storageLocation) {
            this.storageLocation = storageLocation;
            return this;
        }
        public String getStorageLocation() {
            return this.storageLocation;
        }

        public GetVideoListResponseBodyMediaList setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public GetVideoListResponseBodyMediaList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
