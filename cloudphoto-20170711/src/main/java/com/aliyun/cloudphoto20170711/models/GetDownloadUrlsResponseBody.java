// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class GetDownloadUrlsResponseBody extends TeaModel {
    @NameInMap("Action")
    public String action;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public GetDownloadUrlsResponseBodyResults results;

    @NameInMap("Code")
    public String code;

    public static GetDownloadUrlsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDownloadUrlsResponseBody self = new GetDownloadUrlsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDownloadUrlsResponseBody setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public GetDownloadUrlsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDownloadUrlsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDownloadUrlsResponseBody setResults(GetDownloadUrlsResponseBodyResults results) {
        this.results = results;
        return this;
    }
    public GetDownloadUrlsResponseBodyResults getResults() {
        return this.results;
    }

    public GetDownloadUrlsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class GetDownloadUrlsResponseBodyResultsResult extends TeaModel {
        @NameInMap("PhotoIdStr")
        public String photoIdStr;

        @NameInMap("DownloadUrl")
        public String downloadUrl;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("PhotoId")
        public Long photoId;

        public static GetDownloadUrlsResponseBodyResultsResult build(java.util.Map<String, ?> map) throws Exception {
            GetDownloadUrlsResponseBodyResultsResult self = new GetDownloadUrlsResponseBodyResultsResult();
            return TeaModel.build(map, self);
        }

        public GetDownloadUrlsResponseBodyResultsResult setPhotoIdStr(String photoIdStr) {
            this.photoIdStr = photoIdStr;
            return this;
        }
        public String getPhotoIdStr() {
            return this.photoIdStr;
        }

        public GetDownloadUrlsResponseBodyResultsResult setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public GetDownloadUrlsResponseBodyResultsResult setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetDownloadUrlsResponseBodyResultsResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetDownloadUrlsResponseBodyResultsResult setPhotoId(Long photoId) {
            this.photoId = photoId;
            return this;
        }
        public Long getPhotoId() {
            return this.photoId;
        }

    }

    public static class GetDownloadUrlsResponseBodyResults extends TeaModel {
        @NameInMap("Result")
        public java.util.List<GetDownloadUrlsResponseBodyResultsResult> result;

        public static GetDownloadUrlsResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            GetDownloadUrlsResponseBodyResults self = new GetDownloadUrlsResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public GetDownloadUrlsResponseBodyResults setResult(java.util.List<GetDownloadUrlsResponseBodyResultsResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<GetDownloadUrlsResponseBodyResultsResult> getResult() {
            return this.result;
        }

    }

}
