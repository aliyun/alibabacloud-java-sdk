// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class GetPublicAccessUrlsResponseBody extends TeaModel {
    @NameInMap("Action")
    public String action;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public java.util.List<GetPublicAccessUrlsResponseBodyResults> results;

    @NameInMap("Code")
    public String code;

    public static GetPublicAccessUrlsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPublicAccessUrlsResponseBody self = new GetPublicAccessUrlsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPublicAccessUrlsResponseBody setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public GetPublicAccessUrlsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPublicAccessUrlsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPublicAccessUrlsResponseBody setResults(java.util.List<GetPublicAccessUrlsResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<GetPublicAccessUrlsResponseBodyResults> getResults() {
        return this.results;
    }

    public GetPublicAccessUrlsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class GetPublicAccessUrlsResponseBodyResults extends TeaModel {
        @NameInMap("PhotoIdStr")
        public String photoIdStr;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("PhotoId")
        public Long photoId;

        @NameInMap("AccessUrl")
        public String accessUrl;

        public static GetPublicAccessUrlsResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            GetPublicAccessUrlsResponseBodyResults self = new GetPublicAccessUrlsResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public GetPublicAccessUrlsResponseBodyResults setPhotoIdStr(String photoIdStr) {
            this.photoIdStr = photoIdStr;
            return this;
        }
        public String getPhotoIdStr() {
            return this.photoIdStr;
        }

        public GetPublicAccessUrlsResponseBodyResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetPublicAccessUrlsResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetPublicAccessUrlsResponseBodyResults setPhotoId(Long photoId) {
            this.photoId = photoId;
            return this;
        }
        public Long getPhotoId() {
            return this.photoId;
        }

        public GetPublicAccessUrlsResponseBodyResults setAccessUrl(String accessUrl) {
            this.accessUrl = accessUrl;
            return this;
        }
        public String getAccessUrl() {
            return this.accessUrl;
        }

    }

}
