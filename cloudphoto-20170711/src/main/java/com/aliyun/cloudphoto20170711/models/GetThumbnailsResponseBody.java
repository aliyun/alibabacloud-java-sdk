// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class GetThumbnailsResponseBody extends TeaModel {
    @NameInMap("Action")
    public String action;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public GetThumbnailsResponseBodyResults results;

    @NameInMap("Code")
    public String code;

    public static GetThumbnailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetThumbnailsResponseBody self = new GetThumbnailsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetThumbnailsResponseBody setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public GetThumbnailsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetThumbnailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetThumbnailsResponseBody setResults(GetThumbnailsResponseBodyResults results) {
        this.results = results;
        return this;
    }
    public GetThumbnailsResponseBodyResults getResults() {
        return this.results;
    }

    public GetThumbnailsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class GetThumbnailsResponseBodyResultsResult extends TeaModel {
        @NameInMap("ThumbnailUrl")
        public String thumbnailUrl;

        @NameInMap("PhotoIdStr")
        public String photoIdStr;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("PhotoId")
        public Long photoId;

        public static GetThumbnailsResponseBodyResultsResult build(java.util.Map<String, ?> map) throws Exception {
            GetThumbnailsResponseBodyResultsResult self = new GetThumbnailsResponseBodyResultsResult();
            return TeaModel.build(map, self);
        }

        public GetThumbnailsResponseBodyResultsResult setThumbnailUrl(String thumbnailUrl) {
            this.thumbnailUrl = thumbnailUrl;
            return this;
        }
        public String getThumbnailUrl() {
            return this.thumbnailUrl;
        }

        public GetThumbnailsResponseBodyResultsResult setPhotoIdStr(String photoIdStr) {
            this.photoIdStr = photoIdStr;
            return this;
        }
        public String getPhotoIdStr() {
            return this.photoIdStr;
        }

        public GetThumbnailsResponseBodyResultsResult setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetThumbnailsResponseBodyResultsResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetThumbnailsResponseBodyResultsResult setPhotoId(Long photoId) {
            this.photoId = photoId;
            return this;
        }
        public Long getPhotoId() {
            return this.photoId;
        }

    }

    public static class GetThumbnailsResponseBodyResults extends TeaModel {
        @NameInMap("Result")
        public java.util.List<GetThumbnailsResponseBodyResultsResult> result;

        public static GetThumbnailsResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            GetThumbnailsResponseBodyResults self = new GetThumbnailsResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public GetThumbnailsResponseBodyResults setResult(java.util.List<GetThumbnailsResponseBodyResultsResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<GetThumbnailsResponseBodyResultsResult> getResult() {
            return this.result;
        }

    }

}
