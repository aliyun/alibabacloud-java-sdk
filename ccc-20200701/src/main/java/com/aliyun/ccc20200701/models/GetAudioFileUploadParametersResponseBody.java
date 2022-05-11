// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetAudioFileUploadParametersResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetAudioFileUploadParametersResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetAudioFileUploadParametersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAudioFileUploadParametersResponseBody self = new GetAudioFileUploadParametersResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAudioFileUploadParametersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAudioFileUploadParametersResponseBody setData(GetAudioFileUploadParametersResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAudioFileUploadParametersResponseBodyData getData() {
        return this.data;
    }

    public GetAudioFileUploadParametersResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetAudioFileUploadParametersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAudioFileUploadParametersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAudioFileUploadParametersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAudioFileUploadParametersResponseBodyData extends TeaModel {
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        @NameInMap("ExpireTime")
        public Integer expireTime;

        @NameInMap("FilePath")
        public String filePath;

        @NameInMap("Host")
        public String host;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("Signature")
        public String signature;

        public static GetAudioFileUploadParametersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAudioFileUploadParametersResponseBodyData self = new GetAudioFileUploadParametersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAudioFileUploadParametersResponseBodyData setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public GetAudioFileUploadParametersResponseBodyData setExpireTime(Integer expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Integer getExpireTime() {
            return this.expireTime;
        }

        public GetAudioFileUploadParametersResponseBodyData setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public GetAudioFileUploadParametersResponseBodyData setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GetAudioFileUploadParametersResponseBodyData setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public GetAudioFileUploadParametersResponseBodyData setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

    }

}
