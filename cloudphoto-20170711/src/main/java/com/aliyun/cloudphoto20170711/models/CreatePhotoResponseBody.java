// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class CreatePhotoResponseBody extends TeaModel {
    @NameInMap("Action")
    public String action;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Photo")
    public CreatePhotoResponseBodyPhoto photo;

    @NameInMap("Code")
    public String code;

    public static CreatePhotoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePhotoResponseBody self = new CreatePhotoResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePhotoResponseBody setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public CreatePhotoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreatePhotoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePhotoResponseBody setPhoto(CreatePhotoResponseBodyPhoto photo) {
        this.photo = photo;
        return this;
    }
    public CreatePhotoResponseBodyPhoto getPhoto() {
        return this.photo;
    }

    public CreatePhotoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class CreatePhotoResponseBodyPhoto extends TeaModel {
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

        public static CreatePhotoResponseBodyPhoto build(java.util.Map<String, ?> map) throws Exception {
            CreatePhotoResponseBodyPhoto self = new CreatePhotoResponseBodyPhoto();
            return TeaModel.build(map, self);
        }

        public CreatePhotoResponseBodyPhoto setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public CreatePhotoResponseBodyPhoto setTakenAt(Long takenAt) {
            this.takenAt = takenAt;
            return this;
        }
        public Long getTakenAt() {
            return this.takenAt;
        }

        public CreatePhotoResponseBodyPhoto setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public CreatePhotoResponseBodyPhoto setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

        public CreatePhotoResponseBodyPhoto setShareExpireTime(Long shareExpireTime) {
            this.shareExpireTime = shareExpireTime;
            return this;
        }
        public Long getShareExpireTime() {
            return this.shareExpireTime;
        }

        public CreatePhotoResponseBodyPhoto setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public CreatePhotoResponseBodyPhoto setIdStr(String idStr) {
            this.idStr = idStr;
            return this;
        }
        public String getIdStr() {
            return this.idStr;
        }

        public CreatePhotoResponseBodyPhoto setCtime(Long ctime) {
            this.ctime = ctime;
            return this;
        }
        public Long getCtime() {
            return this.ctime;
        }

        public CreatePhotoResponseBodyPhoto setMtime(Long mtime) {
            this.mtime = mtime;
            return this;
        }
        public Long getMtime() {
            return this.mtime;
        }

        public CreatePhotoResponseBodyPhoto setWidth(Long width) {
            this.width = width;
            return this;
        }
        public Long getWidth() {
            return this.width;
        }

        public CreatePhotoResponseBodyPhoto setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public CreatePhotoResponseBodyPhoto setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public CreatePhotoResponseBodyPhoto setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public CreatePhotoResponseBodyPhoto setIsVideo(Boolean isVideo) {
            this.isVideo = isVideo;
            return this;
        }
        public Boolean getIsVideo() {
            return this.isVideo;
        }

        public CreatePhotoResponseBodyPhoto setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreatePhotoResponseBodyPhoto setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

    }

}
