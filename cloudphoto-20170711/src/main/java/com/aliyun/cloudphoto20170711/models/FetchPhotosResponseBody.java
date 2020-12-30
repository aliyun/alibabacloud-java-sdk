// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class FetchPhotosResponseBody extends TeaModel {
    @NameInMap("Photos")
    public java.util.List<FetchPhotosResponseBodyPhotos> photos;

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

    public static FetchPhotosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FetchPhotosResponseBody self = new FetchPhotosResponseBody();
        return TeaModel.build(map, self);
    }

    public FetchPhotosResponseBody setPhotos(java.util.List<FetchPhotosResponseBodyPhotos> photos) {
        this.photos = photos;
        return this;
    }
    public java.util.List<FetchPhotosResponseBodyPhotos> getPhotos() {
        return this.photos;
    }

    public FetchPhotosResponseBody setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public FetchPhotosResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public FetchPhotosResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FetchPhotosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FetchPhotosResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class FetchPhotosResponseBodyPhotos extends TeaModel {
        @NameInMap("Remark")
        public String remark;

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

        @NameInMap("Size")
        public Long size;

        @NameInMap("Width")
        public Long width;

        @NameInMap("InactiveTime")
        public Long inactiveTime;

        @NameInMap("Md5")
        public String md5;

        @NameInMap("IsVideo")
        public Boolean isVideo;

        @NameInMap("Title")
        public String title;

        @NameInMap("Location")
        public String location;

        @NameInMap("Id")
        public Long id;

        public static FetchPhotosResponseBodyPhotos build(java.util.Map<String, ?> map) throws Exception {
            FetchPhotosResponseBodyPhotos self = new FetchPhotosResponseBodyPhotos();
            return TeaModel.build(map, self);
        }

        public FetchPhotosResponseBodyPhotos setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public FetchPhotosResponseBodyPhotos setTakenAt(Long takenAt) {
            this.takenAt = takenAt;
            return this;
        }
        public Long getTakenAt() {
            return this.takenAt;
        }

        public FetchPhotosResponseBodyPhotos setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public FetchPhotosResponseBodyPhotos setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

        public FetchPhotosResponseBodyPhotos setShareExpireTime(Long shareExpireTime) {
            this.shareExpireTime = shareExpireTime;
            return this;
        }
        public Long getShareExpireTime() {
            return this.shareExpireTime;
        }

        public FetchPhotosResponseBodyPhotos setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public FetchPhotosResponseBodyPhotos setIdStr(String idStr) {
            this.idStr = idStr;
            return this;
        }
        public String getIdStr() {
            return this.idStr;
        }

        public FetchPhotosResponseBodyPhotos setCtime(Long ctime) {
            this.ctime = ctime;
            return this;
        }
        public Long getCtime() {
            return this.ctime;
        }

        public FetchPhotosResponseBodyPhotos setMtime(Long mtime) {
            this.mtime = mtime;
            return this;
        }
        public Long getMtime() {
            return this.mtime;
        }

        public FetchPhotosResponseBodyPhotos setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public FetchPhotosResponseBodyPhotos setWidth(Long width) {
            this.width = width;
            return this;
        }
        public Long getWidth() {
            return this.width;
        }

        public FetchPhotosResponseBodyPhotos setInactiveTime(Long inactiveTime) {
            this.inactiveTime = inactiveTime;
            return this;
        }
        public Long getInactiveTime() {
            return this.inactiveTime;
        }

        public FetchPhotosResponseBodyPhotos setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public FetchPhotosResponseBodyPhotos setIsVideo(Boolean isVideo) {
            this.isVideo = isVideo;
            return this;
        }
        public Boolean getIsVideo() {
            return this.isVideo;
        }

        public FetchPhotosResponseBodyPhotos setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public FetchPhotosResponseBodyPhotos setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public FetchPhotosResponseBodyPhotos setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
