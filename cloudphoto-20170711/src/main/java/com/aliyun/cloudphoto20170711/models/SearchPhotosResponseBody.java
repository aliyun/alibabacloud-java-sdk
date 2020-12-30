// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class SearchPhotosResponseBody extends TeaModel {
    @NameInMap("Photos")
    public java.util.List<SearchPhotosResponseBodyPhotos> photos;

    @NameInMap("Action")
    public String action;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    public static SearchPhotosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchPhotosResponseBody self = new SearchPhotosResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchPhotosResponseBody setPhotos(java.util.List<SearchPhotosResponseBodyPhotos> photos) {
        this.photos = photos;
        return this;
    }
    public java.util.List<SearchPhotosResponseBodyPhotos> getPhotos() {
        return this.photos;
    }

    public SearchPhotosResponseBody setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public SearchPhotosResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public SearchPhotosResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SearchPhotosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchPhotosResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class SearchPhotosResponseBodyPhotos extends TeaModel {
        @NameInMap("TakenAt")
        public Long takenAt;

        @NameInMap("State")
        public String state;

        @NameInMap("Height")
        public Long height;

        @NameInMap("ShareExpireTime")
        public Long shareExpireTime;

        @NameInMap("FileId")
        public String fileId;

        @NameInMap("IdStr")
        public String idStr;

        @NameInMap("Ctime")
        public Long ctime;

        @NameInMap("Mtime")
        public Long mtime;

        @NameInMap("Width")
        public Long width;

        @NameInMap("Size")
        public Long size;

        @NameInMap("Md5")
        public String md5;

        @NameInMap("Title")
        public String title;

        @NameInMap("IsVideo")
        public Boolean isVideo;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Location")
        public String location;

        public static SearchPhotosResponseBodyPhotos build(java.util.Map<String, ?> map) throws Exception {
            SearchPhotosResponseBodyPhotos self = new SearchPhotosResponseBodyPhotos();
            return TeaModel.build(map, self);
        }

        public SearchPhotosResponseBodyPhotos setTakenAt(Long takenAt) {
            this.takenAt = takenAt;
            return this;
        }
        public Long getTakenAt() {
            return this.takenAt;
        }

        public SearchPhotosResponseBodyPhotos setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public SearchPhotosResponseBodyPhotos setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

        public SearchPhotosResponseBodyPhotos setShareExpireTime(Long shareExpireTime) {
            this.shareExpireTime = shareExpireTime;
            return this;
        }
        public Long getShareExpireTime() {
            return this.shareExpireTime;
        }

        public SearchPhotosResponseBodyPhotos setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public SearchPhotosResponseBodyPhotos setIdStr(String idStr) {
            this.idStr = idStr;
            return this;
        }
        public String getIdStr() {
            return this.idStr;
        }

        public SearchPhotosResponseBodyPhotos setCtime(Long ctime) {
            this.ctime = ctime;
            return this;
        }
        public Long getCtime() {
            return this.ctime;
        }

        public SearchPhotosResponseBodyPhotos setMtime(Long mtime) {
            this.mtime = mtime;
            return this;
        }
        public Long getMtime() {
            return this.mtime;
        }

        public SearchPhotosResponseBodyPhotos setWidth(Long width) {
            this.width = width;
            return this;
        }
        public Long getWidth() {
            return this.width;
        }

        public SearchPhotosResponseBodyPhotos setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public SearchPhotosResponseBodyPhotos setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public SearchPhotosResponseBodyPhotos setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public SearchPhotosResponseBodyPhotos setIsVideo(Boolean isVideo) {
            this.isVideo = isVideo;
            return this;
        }
        public Boolean getIsVideo() {
            return this.isVideo;
        }

        public SearchPhotosResponseBodyPhotos setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SearchPhotosResponseBodyPhotos setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

    }

}
