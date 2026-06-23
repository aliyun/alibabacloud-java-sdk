// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryCubecardFiletokenResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public QueryCubecardFiletokenResponseBodyResultContent resultContent;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static QueryCubecardFiletokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCubecardFiletokenResponseBody self = new QueryCubecardFiletokenResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCubecardFiletokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCubecardFiletokenResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCubecardFiletokenResponseBody setResultContent(QueryCubecardFiletokenResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryCubecardFiletokenResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public QueryCubecardFiletokenResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class QueryCubecardFiletokenResponseBodyResultContentDataContent extends TeaModel {
        @NameInMap("Accessid")
        public String accessid;

        @NameInMap("Dir")
        public String dir;

        @NameInMap("Expire")
        public String expire;

        @NameInMap("Host")
        public String host;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("Signature")
        public String signature;

        public static QueryCubecardFiletokenResponseBodyResultContentDataContent build(java.util.Map<String, ?> map) throws Exception {
            QueryCubecardFiletokenResponseBodyResultContentDataContent self = new QueryCubecardFiletokenResponseBodyResultContentDataContent();
            return TeaModel.build(map, self);
        }

        public QueryCubecardFiletokenResponseBodyResultContentDataContent setAccessid(String accessid) {
            this.accessid = accessid;
            return this;
        }
        public String getAccessid() {
            return this.accessid;
        }

        public QueryCubecardFiletokenResponseBodyResultContentDataContent setDir(String dir) {
            this.dir = dir;
            return this;
        }
        public String getDir() {
            return this.dir;
        }

        public QueryCubecardFiletokenResponseBodyResultContentDataContent setExpire(String expire) {
            this.expire = expire;
            return this;
        }
        public String getExpire() {
            return this.expire;
        }

        public QueryCubecardFiletokenResponseBodyResultContentDataContent setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public QueryCubecardFiletokenResponseBodyResultContentDataContent setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public QueryCubecardFiletokenResponseBodyResultContentDataContent setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

    }

    public static class QueryCubecardFiletokenResponseBodyResultContentData extends TeaModel {
        @NameInMap("Content")
        public QueryCubecardFiletokenResponseBodyResultContentDataContent content;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public Boolean success;

        public static QueryCubecardFiletokenResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryCubecardFiletokenResponseBodyResultContentData self = new QueryCubecardFiletokenResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryCubecardFiletokenResponseBodyResultContentData setContent(QueryCubecardFiletokenResponseBodyResultContentDataContent content) {
            this.content = content;
            return this;
        }
        public QueryCubecardFiletokenResponseBodyResultContentDataContent getContent() {
            return this.content;
        }

        public QueryCubecardFiletokenResponseBodyResultContentData setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public QueryCubecardFiletokenResponseBodyResultContentData setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public QueryCubecardFiletokenResponseBodyResultContentData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class QueryCubecardFiletokenResponseBodyResultContent extends TeaModel {
        @NameInMap("Data")
        public QueryCubecardFiletokenResponseBodyResultContentData data;

        @NameInMap("RequestId")
        public String requestId;

        public static QueryCubecardFiletokenResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryCubecardFiletokenResponseBodyResultContent self = new QueryCubecardFiletokenResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryCubecardFiletokenResponseBodyResultContent setData(QueryCubecardFiletokenResponseBodyResultContentData data) {
            this.data = data;
            return this;
        }
        public QueryCubecardFiletokenResponseBodyResultContentData getData() {
            return this.data;
        }

        public QueryCubecardFiletokenResponseBodyResultContent setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

    }

}
