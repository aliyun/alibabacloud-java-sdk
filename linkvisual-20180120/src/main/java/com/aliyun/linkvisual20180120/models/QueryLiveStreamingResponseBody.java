// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryLiveStreamingResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryLiveStreamingResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryLiveStreamingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLiveStreamingResponseBody self = new QueryLiveStreamingResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLiveStreamingResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryLiveStreamingResponseBody setData(QueryLiveStreamingResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryLiveStreamingResponseBodyData getData() {
        return this.data;
    }

    public QueryLiveStreamingResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryLiveStreamingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLiveStreamingResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryLiveStreamingResponseBodyData extends TeaModel {
        @NameInMap("Path")
        public String path;

        @NameInMap("RelayDecryptKey")
        public String relayDecryptKey;

        @NameInMap("StunInfo")
        public String stunInfo;

        public static QueryLiveStreamingResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLiveStreamingResponseBodyData self = new QueryLiveStreamingResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLiveStreamingResponseBodyData setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public QueryLiveStreamingResponseBodyData setRelayDecryptKey(String relayDecryptKey) {
            this.relayDecryptKey = relayDecryptKey;
            return this;
        }
        public String getRelayDecryptKey() {
            return this.relayDecryptKey;
        }

        public QueryLiveStreamingResponseBodyData setStunInfo(String stunInfo) {
            this.stunInfo = stunInfo;
            return this;
        }
        public String getStunInfo() {
            return this.stunInfo;
        }

    }

}
