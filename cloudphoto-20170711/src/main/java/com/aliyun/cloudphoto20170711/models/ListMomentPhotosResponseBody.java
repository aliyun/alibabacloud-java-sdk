// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class ListMomentPhotosResponseBody extends TeaModel {
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
    public java.util.List<ListMomentPhotosResponseBodyResults> results;

    @NameInMap("Code")
    public String code;

    public static ListMomentPhotosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMomentPhotosResponseBody self = new ListMomentPhotosResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMomentPhotosResponseBody setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public ListMomentPhotosResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListMomentPhotosResponseBody setNextCursor(String nextCursor) {
        this.nextCursor = nextCursor;
        return this;
    }
    public String getNextCursor() {
        return this.nextCursor;
    }

    public ListMomentPhotosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMomentPhotosResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListMomentPhotosResponseBody setResults(java.util.List<ListMomentPhotosResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<ListMomentPhotosResponseBodyResults> getResults() {
        return this.results;
    }

    public ListMomentPhotosResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class ListMomentPhotosResponseBodyResults extends TeaModel {
        @NameInMap("PhotoIdStr")
        public String photoIdStr;

        @NameInMap("State")
        public String state;

        @NameInMap("PhotoId")
        public Long photoId;

        public static ListMomentPhotosResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            ListMomentPhotosResponseBodyResults self = new ListMomentPhotosResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public ListMomentPhotosResponseBodyResults setPhotoIdStr(String photoIdStr) {
            this.photoIdStr = photoIdStr;
            return this;
        }
        public String getPhotoIdStr() {
            return this.photoIdStr;
        }

        public ListMomentPhotosResponseBodyResults setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListMomentPhotosResponseBodyResults setPhotoId(Long photoId) {
            this.photoId = photoId;
            return this;
        }
        public Long getPhotoId() {
            return this.photoId;
        }

    }

}
