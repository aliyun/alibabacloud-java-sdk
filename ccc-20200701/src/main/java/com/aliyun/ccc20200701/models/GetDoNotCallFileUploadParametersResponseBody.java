// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetDoNotCallFileUploadParametersResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetDoNotCallFileUploadParametersResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetDoNotCallFileUploadParametersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDoNotCallFileUploadParametersResponseBody self = new GetDoNotCallFileUploadParametersResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDoNotCallFileUploadParametersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDoNotCallFileUploadParametersResponseBody setData(GetDoNotCallFileUploadParametersResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDoNotCallFileUploadParametersResponseBodyData getData() {
        return this.data;
    }

    public GetDoNotCallFileUploadParametersResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetDoNotCallFileUploadParametersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDoNotCallFileUploadParametersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDoNotCallFileUploadParametersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDoNotCallFileUploadParametersResponseBodyData extends TeaModel {
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

        public static GetDoNotCallFileUploadParametersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDoNotCallFileUploadParametersResponseBodyData self = new GetDoNotCallFileUploadParametersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDoNotCallFileUploadParametersResponseBodyData setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public GetDoNotCallFileUploadParametersResponseBodyData setExpireTime(Integer expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Integer getExpireTime() {
            return this.expireTime;
        }

        public GetDoNotCallFileUploadParametersResponseBodyData setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public GetDoNotCallFileUploadParametersResponseBodyData setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GetDoNotCallFileUploadParametersResponseBodyData setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public GetDoNotCallFileUploadParametersResponseBodyData setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

    }

}
