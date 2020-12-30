// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class GetAlbumsByNamesResponseBody extends TeaModel {
    @NameInMap("Action")
    public String action;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Albums")
    public java.util.List<GetAlbumsByNamesResponseBodyAlbums> albums;

    public static GetAlbumsByNamesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAlbumsByNamesResponseBody self = new GetAlbumsByNamesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAlbumsByNamesResponseBody setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public GetAlbumsByNamesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAlbumsByNamesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAlbumsByNamesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAlbumsByNamesResponseBody setAlbums(java.util.List<GetAlbumsByNamesResponseBodyAlbums> albums) {
        this.albums = albums;
        return this;
    }
    public java.util.List<GetAlbumsByNamesResponseBodyAlbums> getAlbums() {
        return this.albums;
    }

    public static class GetAlbumsByNamesResponseBodyAlbumsCover extends TeaModel {
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

        public static GetAlbumsByNamesResponseBodyAlbumsCover build(java.util.Map<String, ?> map) throws Exception {
            GetAlbumsByNamesResponseBodyAlbumsCover self = new GetAlbumsByNamesResponseBodyAlbumsCover();
            return TeaModel.build(map, self);
        }

        public GetAlbumsByNamesResponseBodyAlbumsCover setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public GetAlbumsByNamesResponseBodyAlbumsCover setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetAlbumsByNamesResponseBodyAlbumsCover setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

        public GetAlbumsByNamesResponseBodyAlbumsCover setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public GetAlbumsByNamesResponseBodyAlbumsCover setIdStr(String idStr) {
            this.idStr = idStr;
            return this;
        }
        public String getIdStr() {
            return this.idStr;
        }

        public GetAlbumsByNamesResponseBodyAlbumsCover setMtime(Long mtime) {
            this.mtime = mtime;
            return this;
        }
        public Long getMtime() {
            return this.mtime;
        }

        public GetAlbumsByNamesResponseBodyAlbumsCover setCtime(Long ctime) {
            this.ctime = ctime;
            return this;
        }
        public Long getCtime() {
            return this.ctime;
        }

        public GetAlbumsByNamesResponseBodyAlbumsCover setWidth(Long width) {
            this.width = width;
            return this;
        }
        public Long getWidth() {
            return this.width;
        }

        public GetAlbumsByNamesResponseBodyAlbumsCover setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public GetAlbumsByNamesResponseBodyAlbumsCover setIsVideo(Boolean isVideo) {
            this.isVideo = isVideo;
            return this;
        }
        public Boolean getIsVideo() {
            return this.isVideo;
        }

        public GetAlbumsByNamesResponseBodyAlbumsCover setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetAlbumsByNamesResponseBodyAlbumsCover setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class GetAlbumsByNamesResponseBodyAlbums extends TeaModel {
        @NameInMap("IdStr")
        public String idStr;

        @NameInMap("PhotosCount")
        public Long photosCount;

        @NameInMap("Cover")
        public GetAlbumsByNamesResponseBodyAlbumsCover cover;

        @NameInMap("Mtime")
        public Long mtime;

        @NameInMap("Ctime")
        public Long ctime;

        @NameInMap("State")
        public String state;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public Long id;

        public static GetAlbumsByNamesResponseBodyAlbums build(java.util.Map<String, ?> map) throws Exception {
            GetAlbumsByNamesResponseBodyAlbums self = new GetAlbumsByNamesResponseBodyAlbums();
            return TeaModel.build(map, self);
        }

        public GetAlbumsByNamesResponseBodyAlbums setIdStr(String idStr) {
            this.idStr = idStr;
            return this;
        }
        public String getIdStr() {
            return this.idStr;
        }

        public GetAlbumsByNamesResponseBodyAlbums setPhotosCount(Long photosCount) {
            this.photosCount = photosCount;
            return this;
        }
        public Long getPhotosCount() {
            return this.photosCount;
        }

        public GetAlbumsByNamesResponseBodyAlbums setCover(GetAlbumsByNamesResponseBodyAlbumsCover cover) {
            this.cover = cover;
            return this;
        }
        public GetAlbumsByNamesResponseBodyAlbumsCover getCover() {
            return this.cover;
        }

        public GetAlbumsByNamesResponseBodyAlbums setMtime(Long mtime) {
            this.mtime = mtime;
            return this;
        }
        public Long getMtime() {
            return this.mtime;
        }

        public GetAlbumsByNamesResponseBodyAlbums setCtime(Long ctime) {
            this.ctime = ctime;
            return this;
        }
        public Long getCtime() {
            return this.ctime;
        }

        public GetAlbumsByNamesResponseBodyAlbums setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetAlbumsByNamesResponseBodyAlbums setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAlbumsByNamesResponseBodyAlbums setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
