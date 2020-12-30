// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class ListAlbumsResponseBody extends TeaModel {
    @NameInMap("Action")
    public String action;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("NextCursor")
    public String nextCursor;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("Code")
    public String code;

    @NameInMap("Albums")
    public java.util.List<ListAlbumsResponseBodyAlbums> albums;

    public static ListAlbumsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAlbumsResponseBody self = new ListAlbumsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAlbumsResponseBody setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public ListAlbumsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListAlbumsResponseBody setNextCursor(String nextCursor) {
        this.nextCursor = nextCursor;
        return this;
    }
    public String getNextCursor() {
        return this.nextCursor;
    }

    public ListAlbumsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAlbumsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAlbumsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAlbumsResponseBody setAlbums(java.util.List<ListAlbumsResponseBodyAlbums> albums) {
        this.albums = albums;
        return this;
    }
    public java.util.List<ListAlbumsResponseBodyAlbums> getAlbums() {
        return this.albums;
    }

    public static class ListAlbumsResponseBodyAlbumsCover extends TeaModel {
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

        public static ListAlbumsResponseBodyAlbumsCover build(java.util.Map<String, ?> map) throws Exception {
            ListAlbumsResponseBodyAlbumsCover self = new ListAlbumsResponseBodyAlbumsCover();
            return TeaModel.build(map, self);
        }

        public ListAlbumsResponseBodyAlbumsCover setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListAlbumsResponseBodyAlbumsCover setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListAlbumsResponseBodyAlbumsCover setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

        public ListAlbumsResponseBodyAlbumsCover setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public ListAlbumsResponseBodyAlbumsCover setIdStr(String idStr) {
            this.idStr = idStr;
            return this;
        }
        public String getIdStr() {
            return this.idStr;
        }

        public ListAlbumsResponseBodyAlbumsCover setMtime(Long mtime) {
            this.mtime = mtime;
            return this;
        }
        public Long getMtime() {
            return this.mtime;
        }

        public ListAlbumsResponseBodyAlbumsCover setCtime(Long ctime) {
            this.ctime = ctime;
            return this;
        }
        public Long getCtime() {
            return this.ctime;
        }

        public ListAlbumsResponseBodyAlbumsCover setWidth(Long width) {
            this.width = width;
            return this;
        }
        public Long getWidth() {
            return this.width;
        }

        public ListAlbumsResponseBodyAlbumsCover setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public ListAlbumsResponseBodyAlbumsCover setIsVideo(Boolean isVideo) {
            this.isVideo = isVideo;
            return this;
        }
        public Boolean getIsVideo() {
            return this.isVideo;
        }

        public ListAlbumsResponseBodyAlbumsCover setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListAlbumsResponseBodyAlbumsCover setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class ListAlbumsResponseBodyAlbums extends TeaModel {
        @NameInMap("IdStr")
        public String idStr;

        @NameInMap("PhotosCount")
        public Long photosCount;

        @NameInMap("Cover")
        public ListAlbumsResponseBodyAlbumsCover cover;

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

        public static ListAlbumsResponseBodyAlbums build(java.util.Map<String, ?> map) throws Exception {
            ListAlbumsResponseBodyAlbums self = new ListAlbumsResponseBodyAlbums();
            return TeaModel.build(map, self);
        }

        public ListAlbumsResponseBodyAlbums setIdStr(String idStr) {
            this.idStr = idStr;
            return this;
        }
        public String getIdStr() {
            return this.idStr;
        }

        public ListAlbumsResponseBodyAlbums setPhotosCount(Long photosCount) {
            this.photosCount = photosCount;
            return this;
        }
        public Long getPhotosCount() {
            return this.photosCount;
        }

        public ListAlbumsResponseBodyAlbums setCover(ListAlbumsResponseBodyAlbumsCover cover) {
            this.cover = cover;
            return this;
        }
        public ListAlbumsResponseBodyAlbumsCover getCover() {
            return this.cover;
        }

        public ListAlbumsResponseBodyAlbums setMtime(Long mtime) {
            this.mtime = mtime;
            return this;
        }
        public Long getMtime() {
            return this.mtime;
        }

        public ListAlbumsResponseBodyAlbums setCtime(Long ctime) {
            this.ctime = ctime;
            return this;
        }
        public Long getCtime() {
            return this.ctime;
        }

        public ListAlbumsResponseBodyAlbums setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListAlbumsResponseBodyAlbums setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListAlbumsResponseBodyAlbums setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAlbumsResponseBodyAlbums setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
