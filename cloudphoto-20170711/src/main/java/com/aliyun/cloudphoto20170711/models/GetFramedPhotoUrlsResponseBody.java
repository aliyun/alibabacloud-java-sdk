// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class GetFramedPhotoUrlsResponseBody extends TeaModel {
    @NameInMap("Action")
    public String action;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public GetFramedPhotoUrlsResponseBodyResults results;

    @NameInMap("Code")
    public String code;

    public static GetFramedPhotoUrlsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFramedPhotoUrlsResponseBody self = new GetFramedPhotoUrlsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFramedPhotoUrlsResponseBody setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public GetFramedPhotoUrlsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetFramedPhotoUrlsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFramedPhotoUrlsResponseBody setResults(GetFramedPhotoUrlsResponseBodyResults results) {
        this.results = results;
        return this;
    }
    public GetFramedPhotoUrlsResponseBodyResults getResults() {
        return this.results;
    }

    public GetFramedPhotoUrlsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class GetFramedPhotoUrlsResponseBodyResultsResult extends TeaModel {
        @NameInMap("PhotoIdStr")
        public String photoIdStr;

        @NameInMap("FramedPhotoUrl")
        public String framedPhotoUrl;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("PhotoId")
        public Long photoId;

        public static GetFramedPhotoUrlsResponseBodyResultsResult build(java.util.Map<String, ?> map) throws Exception {
            GetFramedPhotoUrlsResponseBodyResultsResult self = new GetFramedPhotoUrlsResponseBodyResultsResult();
            return TeaModel.build(map, self);
        }

        public GetFramedPhotoUrlsResponseBodyResultsResult setPhotoIdStr(String photoIdStr) {
            this.photoIdStr = photoIdStr;
            return this;
        }
        public String getPhotoIdStr() {
            return this.photoIdStr;
        }

        public GetFramedPhotoUrlsResponseBodyResultsResult setFramedPhotoUrl(String framedPhotoUrl) {
            this.framedPhotoUrl = framedPhotoUrl;
            return this;
        }
        public String getFramedPhotoUrl() {
            return this.framedPhotoUrl;
        }

        public GetFramedPhotoUrlsResponseBodyResultsResult setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetFramedPhotoUrlsResponseBodyResultsResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetFramedPhotoUrlsResponseBodyResultsResult setPhotoId(Long photoId) {
            this.photoId = photoId;
            return this;
        }
        public Long getPhotoId() {
            return this.photoId;
        }

    }

    public static class GetFramedPhotoUrlsResponseBodyResults extends TeaModel {
        @NameInMap("Result")
        public java.util.List<GetFramedPhotoUrlsResponseBodyResultsResult> result;

        public static GetFramedPhotoUrlsResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            GetFramedPhotoUrlsResponseBodyResults self = new GetFramedPhotoUrlsResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public GetFramedPhotoUrlsResponseBodyResults setResult(java.util.List<GetFramedPhotoUrlsResponseBodyResultsResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<GetFramedPhotoUrlsResponseBodyResultsResult> getResult() {
            return this.result;
        }

    }

}
