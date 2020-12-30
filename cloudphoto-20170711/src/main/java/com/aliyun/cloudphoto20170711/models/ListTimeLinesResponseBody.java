// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class ListTimeLinesResponseBody extends TeaModel {
    @NameInMap("Action")
    public String action;

    @NameInMap("NextCursor")
    public Integer nextCursor;

    @NameInMap("TimeLines")
    public java.util.List<ListTimeLinesResponseBodyTimeLines> timeLines;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    public static ListTimeLinesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTimeLinesResponseBody self = new ListTimeLinesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTimeLinesResponseBody setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public ListTimeLinesResponseBody setNextCursor(Integer nextCursor) {
        this.nextCursor = nextCursor;
        return this;
    }
    public Integer getNextCursor() {
        return this.nextCursor;
    }

    public ListTimeLinesResponseBody setTimeLines(java.util.List<ListTimeLinesResponseBodyTimeLines> timeLines) {
        this.timeLines = timeLines;
        return this;
    }
    public java.util.List<ListTimeLinesResponseBodyTimeLines> getTimeLines() {
        return this.timeLines;
    }

    public ListTimeLinesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTimeLinesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTimeLinesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class ListTimeLinesResponseBodyTimeLinesPhotos extends TeaModel {
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

        public static ListTimeLinesResponseBodyTimeLinesPhotos build(java.util.Map<String, ?> map) throws Exception {
            ListTimeLinesResponseBodyTimeLinesPhotos self = new ListTimeLinesResponseBodyTimeLinesPhotos();
            return TeaModel.build(map, self);
        }

        public ListTimeLinesResponseBodyTimeLinesPhotos setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListTimeLinesResponseBodyTimeLinesPhotos setTakenAt(Long takenAt) {
            this.takenAt = takenAt;
            return this;
        }
        public Long getTakenAt() {
            return this.takenAt;
        }

        public ListTimeLinesResponseBodyTimeLinesPhotos setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListTimeLinesResponseBodyTimeLinesPhotos setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

        public ListTimeLinesResponseBodyTimeLinesPhotos setShareExpireTime(Long shareExpireTime) {
            this.shareExpireTime = shareExpireTime;
            return this;
        }
        public Long getShareExpireTime() {
            return this.shareExpireTime;
        }

        public ListTimeLinesResponseBodyTimeLinesPhotos setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public ListTimeLinesResponseBodyTimeLinesPhotos setIdStr(String idStr) {
            this.idStr = idStr;
            return this;
        }
        public String getIdStr() {
            return this.idStr;
        }

        public ListTimeLinesResponseBodyTimeLinesPhotos setCtime(Long ctime) {
            this.ctime = ctime;
            return this;
        }
        public Long getCtime() {
            return this.ctime;
        }

        public ListTimeLinesResponseBodyTimeLinesPhotos setMtime(Long mtime) {
            this.mtime = mtime;
            return this;
        }
        public Long getMtime() {
            return this.mtime;
        }

        public ListTimeLinesResponseBodyTimeLinesPhotos setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public ListTimeLinesResponseBodyTimeLinesPhotos setWidth(Long width) {
            this.width = width;
            return this;
        }
        public Long getWidth() {
            return this.width;
        }

        public ListTimeLinesResponseBodyTimeLinesPhotos setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public ListTimeLinesResponseBodyTimeLinesPhotos setIsVideo(Boolean isVideo) {
            this.isVideo = isVideo;
            return this;
        }
        public Boolean getIsVideo() {
            return this.isVideo;
        }

        public ListTimeLinesResponseBodyTimeLinesPhotos setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListTimeLinesResponseBodyTimeLinesPhotos setLike(Long like) {
            this.like = like;
            return this;
        }
        public Long getLike() {
            return this.like;
        }

        public ListTimeLinesResponseBodyTimeLinesPhotos setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public ListTimeLinesResponseBodyTimeLinesPhotos setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class ListTimeLinesResponseBodyTimeLines extends TeaModel {
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("PhotosCount")
        public Integer photosCount;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Photos")
        public java.util.List<ListTimeLinesResponseBodyTimeLinesPhotos> photos;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListTimeLinesResponseBodyTimeLines build(java.util.Map<String, ?> map) throws Exception {
            ListTimeLinesResponseBodyTimeLines self = new ListTimeLinesResponseBodyTimeLines();
            return TeaModel.build(map, self);
        }

        public ListTimeLinesResponseBodyTimeLines setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListTimeLinesResponseBodyTimeLines setPhotosCount(Integer photosCount) {
            this.photosCount = photosCount;
            return this;
        }
        public Integer getPhotosCount() {
            return this.photosCount;
        }

        public ListTimeLinesResponseBodyTimeLines setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListTimeLinesResponseBodyTimeLines setPhotos(java.util.List<ListTimeLinesResponseBodyTimeLinesPhotos> photos) {
            this.photos = photos;
            return this;
        }
        public java.util.List<ListTimeLinesResponseBodyTimeLinesPhotos> getPhotos() {
            return this.photos;
        }

        public ListTimeLinesResponseBodyTimeLines setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
