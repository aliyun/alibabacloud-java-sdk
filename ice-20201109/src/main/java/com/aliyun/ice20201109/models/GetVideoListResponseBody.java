// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetVideoListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("MediaList")
    public java.util.List<GetVideoListResponseBodyMediaList> mediaList;

    /**
     * <p>Id of the request。</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

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
        @NameInMap("AppId")
        public String appId;

        @NameInMap("CateId")
        public Long cateId;

        @NameInMap("CateName")
        public String cateName;

        @NameInMap("CoverUrl")
        public String coverUrl;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("Duration")
        public Float duration;

        @NameInMap("MediaId")
        public String mediaId;

        @NameInMap("ModificationTime")
        public String modificationTime;

        @NameInMap("Size")
        public Long size;

        @NameInMap("Snapshots")
        public java.util.List<String> snapshots;

        @NameInMap("Status")
        public String status;

        @NameInMap("StorageLocation")
        public String storageLocation;

        @NameInMap("Tags")
        public String tags;

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
