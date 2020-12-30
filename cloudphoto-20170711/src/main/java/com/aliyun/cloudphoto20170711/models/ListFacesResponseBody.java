// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class ListFacesResponseBody extends TeaModel {
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

    @NameInMap("Faces")
    public java.util.List<ListFacesResponseBodyFaces> faces;

    public static ListFacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFacesResponseBody self = new ListFacesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFacesResponseBody setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public ListFacesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListFacesResponseBody setNextCursor(String nextCursor) {
        this.nextCursor = nextCursor;
        return this;
    }
    public String getNextCursor() {
        return this.nextCursor;
    }

    public ListFacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFacesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListFacesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListFacesResponseBody setFaces(java.util.List<ListFacesResponseBodyFaces> faces) {
        this.faces = faces;
        return this;
    }
    public java.util.List<ListFacesResponseBodyFaces> getFaces() {
        return this.faces;
    }

    public static class ListFacesResponseBodyFacesCover extends TeaModel {
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

        public static ListFacesResponseBodyFacesCover build(java.util.Map<String, ?> map) throws Exception {
            ListFacesResponseBodyFacesCover self = new ListFacesResponseBodyFacesCover();
            return TeaModel.build(map, self);
        }

        public ListFacesResponseBodyFacesCover setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListFacesResponseBodyFacesCover setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListFacesResponseBodyFacesCover setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

        public ListFacesResponseBodyFacesCover setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public ListFacesResponseBodyFacesCover setIdStr(String idStr) {
            this.idStr = idStr;
            return this;
        }
        public String getIdStr() {
            return this.idStr;
        }

        public ListFacesResponseBodyFacesCover setMtime(Long mtime) {
            this.mtime = mtime;
            return this;
        }
        public Long getMtime() {
            return this.mtime;
        }

        public ListFacesResponseBodyFacesCover setCtime(Long ctime) {
            this.ctime = ctime;
            return this;
        }
        public Long getCtime() {
            return this.ctime;
        }

        public ListFacesResponseBodyFacesCover setWidth(Long width) {
            this.width = width;
            return this;
        }
        public Long getWidth() {
            return this.width;
        }

        public ListFacesResponseBodyFacesCover setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public ListFacesResponseBodyFacesCover setIsVideo(Boolean isVideo) {
            this.isVideo = isVideo;
            return this;
        }
        public Boolean getIsVideo() {
            return this.isVideo;
        }

        public ListFacesResponseBodyFacesCover setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListFacesResponseBodyFacesCover setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class ListFacesResponseBodyFaces extends TeaModel {
        @NameInMap("IdStr")
        public String idStr;

        @NameInMap("PhotosCount")
        public Integer photosCount;

        @NameInMap("IsMe")
        public Boolean isMe;

        @NameInMap("Cover")
        public ListFacesResponseBodyFacesCover cover;

        @NameInMap("Mtime")
        public Long mtime;

        @NameInMap("Ctime")
        public Long ctime;

        @NameInMap("State")
        public String state;

        @NameInMap("Axis")
        public java.util.List<String> axis;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public Long id;

        public static ListFacesResponseBodyFaces build(java.util.Map<String, ?> map) throws Exception {
            ListFacesResponseBodyFaces self = new ListFacesResponseBodyFaces();
            return TeaModel.build(map, self);
        }

        public ListFacesResponseBodyFaces setIdStr(String idStr) {
            this.idStr = idStr;
            return this;
        }
        public String getIdStr() {
            return this.idStr;
        }

        public ListFacesResponseBodyFaces setPhotosCount(Integer photosCount) {
            this.photosCount = photosCount;
            return this;
        }
        public Integer getPhotosCount() {
            return this.photosCount;
        }

        public ListFacesResponseBodyFaces setIsMe(Boolean isMe) {
            this.isMe = isMe;
            return this;
        }
        public Boolean getIsMe() {
            return this.isMe;
        }

        public ListFacesResponseBodyFaces setCover(ListFacesResponseBodyFacesCover cover) {
            this.cover = cover;
            return this;
        }
        public ListFacesResponseBodyFacesCover getCover() {
            return this.cover;
        }

        public ListFacesResponseBodyFaces setMtime(Long mtime) {
            this.mtime = mtime;
            return this;
        }
        public Long getMtime() {
            return this.mtime;
        }

        public ListFacesResponseBodyFaces setCtime(Long ctime) {
            this.ctime = ctime;
            return this;
        }
        public Long getCtime() {
            return this.ctime;
        }

        public ListFacesResponseBodyFaces setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListFacesResponseBodyFaces setAxis(java.util.List<String> axis) {
            this.axis = axis;
            return this;
        }
        public java.util.List<String> getAxis() {
            return this.axis;
        }

        public ListFacesResponseBodyFaces setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListFacesResponseBodyFaces setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
