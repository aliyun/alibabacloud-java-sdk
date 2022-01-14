// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class GetFileTokenForUploadToMsaResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public GetFileTokenForUploadToMsaResponseBodyResultContent resultContent;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static GetFileTokenForUploadToMsaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFileTokenForUploadToMsaResponseBody self = new GetFileTokenForUploadToMsaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFileTokenForUploadToMsaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFileTokenForUploadToMsaResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetFileTokenForUploadToMsaResponseBody setResultContent(GetFileTokenForUploadToMsaResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public GetFileTokenForUploadToMsaResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public GetFileTokenForUploadToMsaResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class GetFileTokenForUploadToMsaResponseBodyResultContentContent extends TeaModel {
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

        public static GetFileTokenForUploadToMsaResponseBodyResultContentContent build(java.util.Map<String, ?> map) throws Exception {
            GetFileTokenForUploadToMsaResponseBodyResultContentContent self = new GetFileTokenForUploadToMsaResponseBodyResultContentContent();
            return TeaModel.build(map, self);
        }

        public GetFileTokenForUploadToMsaResponseBodyResultContentContent setAccessid(String accessid) {
            this.accessid = accessid;
            return this;
        }
        public String getAccessid() {
            return this.accessid;
        }

        public GetFileTokenForUploadToMsaResponseBodyResultContentContent setDir(String dir) {
            this.dir = dir;
            return this;
        }
        public String getDir() {
            return this.dir;
        }

        public GetFileTokenForUploadToMsaResponseBodyResultContentContent setExpire(String expire) {
            this.expire = expire;
            return this;
        }
        public String getExpire() {
            return this.expire;
        }

        public GetFileTokenForUploadToMsaResponseBodyResultContentContent setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GetFileTokenForUploadToMsaResponseBodyResultContentContent setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public GetFileTokenForUploadToMsaResponseBodyResultContentContent setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

    }

    public static class GetFileTokenForUploadToMsaResponseBodyResultContent extends TeaModel {
        @NameInMap("Content")
        public GetFileTokenForUploadToMsaResponseBodyResultContentContent content;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public String success;

        public static GetFileTokenForUploadToMsaResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            GetFileTokenForUploadToMsaResponseBodyResultContent self = new GetFileTokenForUploadToMsaResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public GetFileTokenForUploadToMsaResponseBodyResultContent setContent(GetFileTokenForUploadToMsaResponseBodyResultContentContent content) {
            this.content = content;
            return this;
        }
        public GetFileTokenForUploadToMsaResponseBodyResultContentContent getContent() {
            return this.content;
        }

        public GetFileTokenForUploadToMsaResponseBodyResultContent setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetFileTokenForUploadToMsaResponseBodyResultContent setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public GetFileTokenForUploadToMsaResponseBodyResultContent setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public GetFileTokenForUploadToMsaResponseBodyResultContent setSuccess(String success) {
            this.success = success;
            return this;
        }
        public String getSuccess() {
            return this.success;
        }

    }

}
