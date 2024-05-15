// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetDocumentUploadParametersResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetDocumentUploadParametersResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("Params")
    public java.util.List<String> params;

    @NameInMap("RequestId")
    public String requestId;

    public static GetDocumentUploadParametersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDocumentUploadParametersResponseBody self = new GetDocumentUploadParametersResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDocumentUploadParametersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDocumentUploadParametersResponseBody setData(GetDocumentUploadParametersResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDocumentUploadParametersResponseBodyData getData() {
        return this.data;
    }

    public GetDocumentUploadParametersResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetDocumentUploadParametersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDocumentUploadParametersResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public GetDocumentUploadParametersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDocumentUploadParametersResponseBodyData extends TeaModel {
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        @NameInMap("ExpireTime")
        public Integer expireTime;

        @NameInMap("FilePath")
        public String filePath;

        /**
         * <p>oss host</p>
         */
        @NameInMap("Host")
        public String host;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("Signature")
        public String signature;

        public static GetDocumentUploadParametersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDocumentUploadParametersResponseBodyData self = new GetDocumentUploadParametersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDocumentUploadParametersResponseBodyData setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public GetDocumentUploadParametersResponseBodyData setExpireTime(Integer expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Integer getExpireTime() {
            return this.expireTime;
        }

        public GetDocumentUploadParametersResponseBodyData setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public GetDocumentUploadParametersResponseBodyData setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GetDocumentUploadParametersResponseBodyData setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public GetDocumentUploadParametersResponseBodyData setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

    }

}
