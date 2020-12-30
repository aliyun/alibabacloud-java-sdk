// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class GetPrivateAccessUrlsResponseBody extends TeaModel {
    @NameInMap("Action")
    public String action;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public java.util.List<GetPrivateAccessUrlsResponseBodyResults> results;

    @NameInMap("Code")
    public String code;

    public static GetPrivateAccessUrlsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPrivateAccessUrlsResponseBody self = new GetPrivateAccessUrlsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPrivateAccessUrlsResponseBody setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public GetPrivateAccessUrlsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPrivateAccessUrlsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPrivateAccessUrlsResponseBody setResults(java.util.List<GetPrivateAccessUrlsResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<GetPrivateAccessUrlsResponseBodyResults> getResults() {
        return this.results;
    }

    public GetPrivateAccessUrlsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class GetPrivateAccessUrlsResponseBodyResults extends TeaModel {
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

        public static GetPrivateAccessUrlsResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            GetPrivateAccessUrlsResponseBodyResults self = new GetPrivateAccessUrlsResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public GetPrivateAccessUrlsResponseBodyResults setPhotoIdStr(String photoIdStr) {
            this.photoIdStr = photoIdStr;
            return this;
        }
        public String getPhotoIdStr() {
            return this.photoIdStr;
        }

        public GetPrivateAccessUrlsResponseBodyResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetPrivateAccessUrlsResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetPrivateAccessUrlsResponseBodyResults setPhotoId(Long photoId) {
            this.photoId = photoId;
            return this;
        }
        public Long getPhotoId() {
            return this.photoId;
        }

        public GetPrivateAccessUrlsResponseBodyResults setAccessUrl(String accessUrl) {
            this.accessUrl = accessUrl;
            return this;
        }
        public String getAccessUrl() {
            return this.accessUrl;
        }

    }

}
