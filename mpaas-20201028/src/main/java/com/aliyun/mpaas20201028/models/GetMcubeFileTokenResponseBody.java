// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class GetMcubeFileTokenResponseBody extends TeaModel {
    @NameInMap("GetFileTokenResult")
    public GetMcubeFileTokenResponseBodyGetFileTokenResult getFileTokenResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static GetMcubeFileTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMcubeFileTokenResponseBody self = new GetMcubeFileTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMcubeFileTokenResponseBody setGetFileTokenResult(GetMcubeFileTokenResponseBodyGetFileTokenResult getFileTokenResult) {
        this.getFileTokenResult = getFileTokenResult;
        return this;
    }
    public GetMcubeFileTokenResponseBodyGetFileTokenResult getGetFileTokenResult() {
        return this.getFileTokenResult;
    }

    public GetMcubeFileTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMcubeFileTokenResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetMcubeFileTokenResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class GetMcubeFileTokenResponseBodyGetFileTokenResultFileToken extends TeaModel {
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

        public static GetMcubeFileTokenResponseBodyGetFileTokenResultFileToken build(java.util.Map<String, ?> map) throws Exception {
            GetMcubeFileTokenResponseBodyGetFileTokenResultFileToken self = new GetMcubeFileTokenResponseBodyGetFileTokenResultFileToken();
            return TeaModel.build(map, self);
        }

        public GetMcubeFileTokenResponseBodyGetFileTokenResultFileToken setAccessid(String accessid) {
            this.accessid = accessid;
            return this;
        }
        public String getAccessid() {
            return this.accessid;
        }

        public GetMcubeFileTokenResponseBodyGetFileTokenResultFileToken setDir(String dir) {
            this.dir = dir;
            return this;
        }
        public String getDir() {
            return this.dir;
        }

        public GetMcubeFileTokenResponseBodyGetFileTokenResultFileToken setExpire(String expire) {
            this.expire = expire;
            return this;
        }
        public String getExpire() {
            return this.expire;
        }

        public GetMcubeFileTokenResponseBodyGetFileTokenResultFileToken setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GetMcubeFileTokenResponseBodyGetFileTokenResultFileToken setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public GetMcubeFileTokenResponseBodyGetFileTokenResultFileToken setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

    }

    public static class GetMcubeFileTokenResponseBodyGetFileTokenResult extends TeaModel {
        @NameInMap("FileToken")
        public GetMcubeFileTokenResponseBodyGetFileTokenResultFileToken fileToken;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public Boolean success;

        public static GetMcubeFileTokenResponseBodyGetFileTokenResult build(java.util.Map<String, ?> map) throws Exception {
            GetMcubeFileTokenResponseBodyGetFileTokenResult self = new GetMcubeFileTokenResponseBodyGetFileTokenResult();
            return TeaModel.build(map, self);
        }

        public GetMcubeFileTokenResponseBodyGetFileTokenResult setFileToken(GetMcubeFileTokenResponseBodyGetFileTokenResultFileToken fileToken) {
            this.fileToken = fileToken;
            return this;
        }
        public GetMcubeFileTokenResponseBodyGetFileTokenResultFileToken getFileToken() {
            return this.fileToken;
        }

        public GetMcubeFileTokenResponseBodyGetFileTokenResult setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public GetMcubeFileTokenResponseBodyGetFileTokenResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
