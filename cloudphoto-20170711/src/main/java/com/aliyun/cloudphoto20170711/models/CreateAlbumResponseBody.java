// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class CreateAlbumResponseBody extends TeaModel {
    @NameInMap("Action")
    public String action;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Album")
    public CreateAlbumResponseBodyAlbum album;

    @NameInMap("Code")
    public String code;

    public static CreateAlbumResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAlbumResponseBody self = new CreateAlbumResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAlbumResponseBody setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public CreateAlbumResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateAlbumResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAlbumResponseBody setAlbum(CreateAlbumResponseBodyAlbum album) {
        this.album = album;
        return this;
    }
    public CreateAlbumResponseBodyAlbum getAlbum() {
        return this.album;
    }

    public CreateAlbumResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class CreateAlbumResponseBodyAlbumCover extends TeaModel {
        @NameInMap("Remark")
        public String remark;

        @NameInMap("State")
        public String state;

        @NameInMap("Height")
        public Long height;

        @NameInMap("FileId")
        public String fileId;

        @NameInMap("IdStr")
        public String idStr;

        @NameInMap("Mtime")
        public Long mtime;

        @NameInMap("Ctime")
        public Long ctime;

        @NameInMap("Width")
        public Long width;

        @NameInMap("Md5")
        public String md5;

        @NameInMap("IsVideo")
        public Boolean isVideo;

        @NameInMap("Title")
        public String title;

        @NameInMap("Id")
        public Long id;

        public static CreateAlbumResponseBodyAlbumCover build(java.util.Map<String, ?> map) throws Exception {
            CreateAlbumResponseBodyAlbumCover self = new CreateAlbumResponseBodyAlbumCover();
            return TeaModel.build(map, self);
        }

        public CreateAlbumResponseBodyAlbumCover setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public CreateAlbumResponseBodyAlbumCover setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public CreateAlbumResponseBodyAlbumCover setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

        public CreateAlbumResponseBodyAlbumCover setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public CreateAlbumResponseBodyAlbumCover setIdStr(String idStr) {
            this.idStr = idStr;
            return this;
        }
        public String getIdStr() {
            return this.idStr;
        }

        public CreateAlbumResponseBodyAlbumCover setMtime(Long mtime) {
            this.mtime = mtime;
            return this;
        }
        public Long getMtime() {
            return this.mtime;
        }

        public CreateAlbumResponseBodyAlbumCover setCtime(Long ctime) {
            this.ctime = ctime;
            return this;
        }
        public Long getCtime() {
            return this.ctime;
        }

        public CreateAlbumResponseBodyAlbumCover setWidth(Long width) {
            this.width = width;
            return this;
        }
        public Long getWidth() {
            return this.width;
        }

        public CreateAlbumResponseBodyAlbumCover setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public CreateAlbumResponseBodyAlbumCover setIsVideo(Boolean isVideo) {
            this.isVideo = isVideo;
            return this;
        }
        public Boolean getIsVideo() {
            return this.isVideo;
        }

        public CreateAlbumResponseBodyAlbumCover setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public CreateAlbumResponseBodyAlbumCover setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class CreateAlbumResponseBodyAlbum extends TeaModel {
        @NameInMap("IdStr")
        public String idStr;

        @NameInMap("PhotosCount")
        public Long photosCount;

        @NameInMap("Cover")
        public CreateAlbumResponseBodyAlbumCover cover;

        @NameInMap("Mtime")
        public Long mtime;

        @NameInMap("Ctime")
        public Long ctime;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("State")
        public String state;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public Long id;

        public static CreateAlbumResponseBodyAlbum build(java.util.Map<String, ?> map) throws Exception {
            CreateAlbumResponseBodyAlbum self = new CreateAlbumResponseBodyAlbum();
            return TeaModel.build(map, self);
        }

        public CreateAlbumResponseBodyAlbum setIdStr(String idStr) {
            this.idStr = idStr;
            return this;
        }
        public String getIdStr() {
            return this.idStr;
        }

        public CreateAlbumResponseBodyAlbum setPhotosCount(Long photosCount) {
            this.photosCount = photosCount;
            return this;
        }
        public Long getPhotosCount() {
            return this.photosCount;
        }

        public CreateAlbumResponseBodyAlbum setCover(CreateAlbumResponseBodyAlbumCover cover) {
            this.cover = cover;
            return this;
        }
        public CreateAlbumResponseBodyAlbumCover getCover() {
            return this.cover;
        }

        public CreateAlbumResponseBodyAlbum setMtime(Long mtime) {
            this.mtime = mtime;
            return this;
        }
        public Long getMtime() {
            return this.mtime;
        }

        public CreateAlbumResponseBodyAlbum setCtime(Long ctime) {
            this.ctime = ctime;
            return this;
        }
        public Long getCtime() {
            return this.ctime;
        }

        public CreateAlbumResponseBodyAlbum setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public CreateAlbumResponseBodyAlbum setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public CreateAlbumResponseBodyAlbum setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateAlbumResponseBodyAlbum setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
