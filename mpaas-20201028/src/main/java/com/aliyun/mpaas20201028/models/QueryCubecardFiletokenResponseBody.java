// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryCubecardFiletokenResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>11E66B29-9E5E-5C10-B64E-B5A0E0F26355</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public QueryCubecardFiletokenResponseBodyResultContent resultContent;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>LTAI5tFgfNzJFDn4Y4BhoRnc</p>
         */
        @NameInMap("Accessid")
        public String accessid;

        /**
         * <strong>example:</strong>
         * <p>/home/ecs-assist-user/proof/alert</p>
         */
        @NameInMap("Dir")
        public String dir;

        /**
         * <strong>example:</strong>
         * <p>1760583447</p>
         */
        @NameInMap("Expire")
        public String expire;

        /**
         * <strong>example:</strong>
         * <p>172.23.129.55</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <strong>example:</strong>
         * <p>Permit</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <strong>example:</strong>
         * <p>yKplu9LQwgKBTDhxp0YozAeCy9c=</p>
         */
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

        /**
         * <strong>example:</strong>
         * <p>NONE</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("ResultMsg")
        public String resultMsg;

        /**
         * <strong>example:</strong>
         * <p>True</p>
         */
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

        /**
         * <strong>example:</strong>
         * <p>11E66B29-9E5E-5C10-B64E-B5A0E0F26355</p>
         */
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
