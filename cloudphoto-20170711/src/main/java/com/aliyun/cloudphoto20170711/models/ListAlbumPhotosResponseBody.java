// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class ListAlbumPhotosResponseBody extends TeaModel {
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

    @NameInMap("Results")
    public java.util.List<ListAlbumPhotosResponseBodyResults> results;

    @NameInMap("Code")
    public String code;

    public static ListAlbumPhotosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAlbumPhotosResponseBody self = new ListAlbumPhotosResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAlbumPhotosResponseBody setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public ListAlbumPhotosResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListAlbumPhotosResponseBody setNextCursor(String nextCursor) {
        this.nextCursor = nextCursor;
        return this;
    }
    public String getNextCursor() {
        return this.nextCursor;
    }

    public ListAlbumPhotosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAlbumPhotosResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAlbumPhotosResponseBody setResults(java.util.List<ListAlbumPhotosResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<ListAlbumPhotosResponseBodyResults> getResults() {
        return this.results;
    }

    public ListAlbumPhotosResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class ListAlbumPhotosResponseBodyResults extends TeaModel {
        @NameInMap("PhotoIdStr")
        public String photoIdStr;

        @NameInMap("Mtime")
        public Long mtime;

        @NameInMap("State")
        public String state;

        @NameInMap("PhotoId")
        public Long photoId;

        public static ListAlbumPhotosResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            ListAlbumPhotosResponseBodyResults self = new ListAlbumPhotosResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public ListAlbumPhotosResponseBodyResults setPhotoIdStr(String photoIdStr) {
            this.photoIdStr = photoIdStr;
            return this;
        }
        public String getPhotoIdStr() {
            return this.photoIdStr;
        }

        public ListAlbumPhotosResponseBodyResults setMtime(Long mtime) {
            this.mtime = mtime;
            return this;
        }
        public Long getMtime() {
            return this.mtime;
        }

        public ListAlbumPhotosResponseBodyResults setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListAlbumPhotosResponseBodyResults setPhotoId(Long photoId) {
            this.photoId = photoId;
            return this;
        }
        public Long getPhotoId() {
            return this.photoId;
        }

    }

}
