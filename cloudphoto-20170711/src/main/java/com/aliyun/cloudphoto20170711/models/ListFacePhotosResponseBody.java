// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class ListFacePhotosResponseBody extends TeaModel {
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
    public java.util.List<ListFacePhotosResponseBodyResults> results;

    @NameInMap("Code")
    public String code;

    public static ListFacePhotosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFacePhotosResponseBody self = new ListFacePhotosResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFacePhotosResponseBody setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public ListFacePhotosResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListFacePhotosResponseBody setNextCursor(String nextCursor) {
        this.nextCursor = nextCursor;
        return this;
    }
    public String getNextCursor() {
        return this.nextCursor;
    }

    public ListFacePhotosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFacePhotosResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListFacePhotosResponseBody setResults(java.util.List<ListFacePhotosResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<ListFacePhotosResponseBodyResults> getResults() {
        return this.results;
    }

    public ListFacePhotosResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class ListFacePhotosResponseBodyResults extends TeaModel {
        @NameInMap("PhotoIdStr")
        public String photoIdStr;

        @NameInMap("Mtime")
        public Long mtime;

        @NameInMap("State")
        public String state;

        @NameInMap("PhotoId")
        public Long photoId;

        public static ListFacePhotosResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            ListFacePhotosResponseBodyResults self = new ListFacePhotosResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public ListFacePhotosResponseBodyResults setPhotoIdStr(String photoIdStr) {
            this.photoIdStr = photoIdStr;
            return this;
        }
        public String getPhotoIdStr() {
            return this.photoIdStr;
        }

        public ListFacePhotosResponseBodyResults setMtime(Long mtime) {
            this.mtime = mtime;
            return this;
        }
        public Long getMtime() {
            return this.mtime;
        }

        public ListFacePhotosResponseBodyResults setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListFacePhotosResponseBodyResults setPhotoId(Long photoId) {
            this.photoId = photoId;
            return this;
        }
        public Long getPhotoId() {
            return this.photoId;
        }

    }

}
