// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryLiveStreamingResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Data")
    @Validation(required = true)
    public QueryLiveStreamingResponseData data;

    public static QueryLiveStreamingResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLiveStreamingResponse self = new QueryLiveStreamingResponse();
        return TeaModel.build(map, self);
    }

    public QueryLiveStreamingResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLiveStreamingResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLiveStreamingResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryLiveStreamingResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryLiveStreamingResponse setData(QueryLiveStreamingResponseData data) {
        this.data = data;
        return this;
    }
    public QueryLiveStreamingResponseData getData() {
        return this.data;
    }

    public static class QueryLiveStreamingResponseData extends TeaModel {
        @NameInMap("Path")
        @Validation(required = true)
        public String path;

        @NameInMap("DecryptKey")
        @Validation(required = true)
        public String decryptKey;

        public static QueryLiveStreamingResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryLiveStreamingResponseData self = new QueryLiveStreamingResponseData();
            return TeaModel.build(map, self);
        }

        public QueryLiveStreamingResponseData setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public QueryLiveStreamingResponseData setDecryptKey(String decryptKey) {
            this.decryptKey = decryptKey;
            return this;
        }
        public String getDecryptKey() {
            return this.decryptKey;
        }

    }

}
