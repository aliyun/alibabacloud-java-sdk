// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class RegisterPhotoResponseBody extends TeaModel {
    @NameInMap("Action")
    public String action;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Photo")
    public RegisterPhotoResponseBodyPhoto photo;

    @NameInMap("Code")
    public String code;

    public static RegisterPhotoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RegisterPhotoResponseBody self = new RegisterPhotoResponseBody();
        return TeaModel.build(map, self);
    }

    public RegisterPhotoResponseBody setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public RegisterPhotoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RegisterPhotoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RegisterPhotoResponseBody setPhoto(RegisterPhotoResponseBodyPhoto photo) {
        this.photo = photo;
        return this;
    }
    public RegisterPhotoResponseBodyPhoto getPhoto() {
        return this.photo;
    }

    public RegisterPhotoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class RegisterPhotoResponseBodyPhoto extends TeaModel {
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

        public static RegisterPhotoResponseBodyPhoto build(java.util.Map<String, ?> map) throws Exception {
            RegisterPhotoResponseBodyPhoto self = new RegisterPhotoResponseBodyPhoto();
            return TeaModel.build(map, self);
        }

        public RegisterPhotoResponseBodyPhoto setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public RegisterPhotoResponseBodyPhoto setTakenAt(Long takenAt) {
            this.takenAt = takenAt;
            return this;
        }
        public Long getTakenAt() {
            return this.takenAt;
        }

        public RegisterPhotoResponseBodyPhoto setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public RegisterPhotoResponseBodyPhoto setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

        public RegisterPhotoResponseBodyPhoto setShareExpireTime(Long shareExpireTime) {
            this.shareExpireTime = shareExpireTime;
            return this;
        }
        public Long getShareExpireTime() {
            return this.shareExpireTime;
        }

        public RegisterPhotoResponseBodyPhoto setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public RegisterPhotoResponseBodyPhoto setIdStr(String idStr) {
            this.idStr = idStr;
            return this;
        }
        public String getIdStr() {
            return this.idStr;
        }

        public RegisterPhotoResponseBodyPhoto setCtime(Long ctime) {
            this.ctime = ctime;
            return this;
        }
        public Long getCtime() {
            return this.ctime;
        }

        public RegisterPhotoResponseBodyPhoto setMtime(Long mtime) {
            this.mtime = mtime;
            return this;
        }
        public Long getMtime() {
            return this.mtime;
        }

        public RegisterPhotoResponseBodyPhoto setWidth(Long width) {
            this.width = width;
            return this;
        }
        public Long getWidth() {
            return this.width;
        }

        public RegisterPhotoResponseBodyPhoto setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public RegisterPhotoResponseBodyPhoto setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public RegisterPhotoResponseBodyPhoto setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public RegisterPhotoResponseBodyPhoto setIsVideo(Boolean isVideo) {
            this.isVideo = isVideo;
            return this;
        }
        public Boolean getIsVideo() {
            return this.isVideo;
        }

        public RegisterPhotoResponseBodyPhoto setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public RegisterPhotoResponseBodyPhoto setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

    }

}
