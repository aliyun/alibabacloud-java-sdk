// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetJobDataUploadParamsResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UploadParams")
    public GetJobDataUploadParamsResponseBodyUploadParams uploadParams;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static GetJobDataUploadParamsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJobDataUploadParamsResponseBody self = new GetJobDataUploadParamsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJobDataUploadParamsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetJobDataUploadParamsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetJobDataUploadParamsResponseBody setUploadParams(GetJobDataUploadParamsResponseBodyUploadParams uploadParams) {
        this.uploadParams = uploadParams;
        return this;
    }
    public GetJobDataUploadParamsResponseBodyUploadParams getUploadParams() {
        return this.uploadParams;
    }

    public GetJobDataUploadParamsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetJobDataUploadParamsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetJobDataUploadParamsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetJobDataUploadParamsResponseBodyUploadParams extends TeaModel {
        @NameInMap("Signature")
        public String signature;

        @NameInMap("Host")
        public String host;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("Folder")
        public String folder;

        @NameInMap("AccessId")
        public String accessId;

        @NameInMap("Expire")
        public Integer expire;

        public static GetJobDataUploadParamsResponseBodyUploadParams build(java.util.Map<String, ?> map) throws Exception {
            GetJobDataUploadParamsResponseBodyUploadParams self = new GetJobDataUploadParamsResponseBodyUploadParams();
            return TeaModel.build(map, self);
        }

        public GetJobDataUploadParamsResponseBodyUploadParams setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

        public GetJobDataUploadParamsResponseBodyUploadParams setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GetJobDataUploadParamsResponseBodyUploadParams setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public GetJobDataUploadParamsResponseBodyUploadParams setFolder(String folder) {
            this.folder = folder;
            return this;
        }
        public String getFolder() {
            return this.folder;
        }

        public GetJobDataUploadParamsResponseBodyUploadParams setAccessId(String accessId) {
            this.accessId = accessId;
            return this;
        }
        public String getAccessId() {
            return this.accessId;
        }

        public GetJobDataUploadParamsResponseBodyUploadParams setExpire(Integer expire) {
            this.expire = expire;
            return this;
        }
        public Integer getExpire() {
            return this.expire;
        }

    }

}
