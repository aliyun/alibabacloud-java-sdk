// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class ListTagPhotosResponseBody extends TeaModel {
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
    public java.util.List<ListTagPhotosResponseBodyResults> results;

    @NameInMap("Code")
    public String code;

    public static ListTagPhotosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTagPhotosResponseBody self = new ListTagPhotosResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTagPhotosResponseBody setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public ListTagPhotosResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListTagPhotosResponseBody setNextCursor(String nextCursor) {
        this.nextCursor = nextCursor;
        return this;
    }
    public String getNextCursor() {
        return this.nextCursor;
    }

    public ListTagPhotosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTagPhotosResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTagPhotosResponseBody setResults(java.util.List<ListTagPhotosResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<ListTagPhotosResponseBodyResults> getResults() {
        return this.results;
    }

    public ListTagPhotosResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class ListTagPhotosResponseBodyResults extends TeaModel {
        @NameInMap("PhotoIdStr")
        public String photoIdStr;

        @NameInMap("State")
        public String state;

        @NameInMap("PhotoId")
        public Long photoId;

        public static ListTagPhotosResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            ListTagPhotosResponseBodyResults self = new ListTagPhotosResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public ListTagPhotosResponseBodyResults setPhotoIdStr(String photoIdStr) {
            this.photoIdStr = photoIdStr;
            return this;
        }
        public String getPhotoIdStr() {
            return this.photoIdStr;
        }

        public ListTagPhotosResponseBodyResults setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListTagPhotosResponseBodyResults setPhotoId(Long photoId) {
            this.photoId = photoId;
            return this;
        }
        public Long getPhotoId() {
            return this.photoId;
        }

    }

}
