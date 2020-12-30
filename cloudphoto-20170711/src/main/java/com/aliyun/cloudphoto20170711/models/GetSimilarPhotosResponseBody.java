// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class GetSimilarPhotosResponseBody extends TeaModel {
    @NameInMap("Photos")
    public java.util.List<GetSimilarPhotosResponseBodyPhotos> photos;

    @NameInMap("Action")
    public String action;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    public static GetSimilarPhotosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSimilarPhotosResponseBody self = new GetSimilarPhotosResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSimilarPhotosResponseBody setPhotos(java.util.List<GetSimilarPhotosResponseBodyPhotos> photos) {
        this.photos = photos;
        return this;
    }
    public java.util.List<GetSimilarPhotosResponseBodyPhotos> getPhotos() {
        return this.photos;
    }

    public GetSimilarPhotosResponseBody setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public GetSimilarPhotosResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSimilarPhotosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSimilarPhotosResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class GetSimilarPhotosResponseBodyPhotos extends TeaModel {
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

        @NameInMap("Like")
        public Long like;

        @NameInMap("Location")
        public String location;

        @NameInMap("Id")
        public Long id;

        public static GetSimilarPhotosResponseBodyPhotos build(java.util.Map<String, ?> map) throws Exception {
            GetSimilarPhotosResponseBodyPhotos self = new GetSimilarPhotosResponseBodyPhotos();
            return TeaModel.build(map, self);
        }

        public GetSimilarPhotosResponseBodyPhotos setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public GetSimilarPhotosResponseBodyPhotos setTakenAt(Long takenAt) {
            this.takenAt = takenAt;
            return this;
        }
        public Long getTakenAt() {
            return this.takenAt;
        }

        public GetSimilarPhotosResponseBodyPhotos setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetSimilarPhotosResponseBodyPhotos setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

        public GetSimilarPhotosResponseBodyPhotos setShareExpireTime(Long shareExpireTime) {
            this.shareExpireTime = shareExpireTime;
            return this;
        }
        public Long getShareExpireTime() {
            return this.shareExpireTime;
        }

        public GetSimilarPhotosResponseBodyPhotos setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public GetSimilarPhotosResponseBodyPhotos setIdStr(String idStr) {
            this.idStr = idStr;
            return this;
        }
        public String getIdStr() {
            return this.idStr;
        }

        public GetSimilarPhotosResponseBodyPhotos setCtime(Long ctime) {
            this.ctime = ctime;
            return this;
        }
        public Long getCtime() {
            return this.ctime;
        }

        public GetSimilarPhotosResponseBodyPhotos setMtime(Long mtime) {
            this.mtime = mtime;
            return this;
        }
        public Long getMtime() {
            return this.mtime;
        }

        public GetSimilarPhotosResponseBodyPhotos setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public GetSimilarPhotosResponseBodyPhotos setWidth(Long width) {
            this.width = width;
            return this;
        }
        public Long getWidth() {
            return this.width;
        }

        public GetSimilarPhotosResponseBodyPhotos setInactiveTime(Long inactiveTime) {
            this.inactiveTime = inactiveTime;
            return this;
        }
        public Long getInactiveTime() {
            return this.inactiveTime;
        }

        public GetSimilarPhotosResponseBodyPhotos setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public GetSimilarPhotosResponseBodyPhotos setIsVideo(Boolean isVideo) {
            this.isVideo = isVideo;
            return this;
        }
        public Boolean getIsVideo() {
            return this.isVideo;
        }

        public GetSimilarPhotosResponseBodyPhotos setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetSimilarPhotosResponseBodyPhotos setLike(Long like) {
            this.like = like;
            return this;
        }
        public Long getLike() {
            return this.like;
        }

        public GetSimilarPhotosResponseBodyPhotos setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public GetSimilarPhotosResponseBodyPhotos setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
