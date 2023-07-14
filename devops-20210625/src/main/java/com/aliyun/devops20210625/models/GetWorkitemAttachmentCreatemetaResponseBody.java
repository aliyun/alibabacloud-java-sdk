// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetWorkitemAttachmentCreatemetaResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public String success;

    @NameInMap("uploadInfo")
    public GetWorkitemAttachmentCreatemetaResponseBodyUploadInfo uploadInfo;

    public static GetWorkitemAttachmentCreatemetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWorkitemAttachmentCreatemetaResponseBody self = new GetWorkitemAttachmentCreatemetaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWorkitemAttachmentCreatemetaResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetWorkitemAttachmentCreatemetaResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetWorkitemAttachmentCreatemetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWorkitemAttachmentCreatemetaResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public GetWorkitemAttachmentCreatemetaResponseBody setUploadInfo(GetWorkitemAttachmentCreatemetaResponseBodyUploadInfo uploadInfo) {
        this.uploadInfo = uploadInfo;
        return this;
    }
    public GetWorkitemAttachmentCreatemetaResponseBodyUploadInfo getUploadInfo() {
        return this.uploadInfo;
    }

    public static class GetWorkitemAttachmentCreatemetaResponseBodyUploadInfo extends TeaModel {
        @NameInMap("accessid")
        public String accessid;

        @NameInMap("dir")
        public String dir;

        @NameInMap("host")
        public String host;

        @NameInMap("policy")
        public String policy;

        @NameInMap("signature")
        public String signature;

        public static GetWorkitemAttachmentCreatemetaResponseBodyUploadInfo build(java.util.Map<String, ?> map) throws Exception {
            GetWorkitemAttachmentCreatemetaResponseBodyUploadInfo self = new GetWorkitemAttachmentCreatemetaResponseBodyUploadInfo();
            return TeaModel.build(map, self);
        }

        public GetWorkitemAttachmentCreatemetaResponseBodyUploadInfo setAccessid(String accessid) {
            this.accessid = accessid;
            return this;
        }
        public String getAccessid() {
            return this.accessid;
        }

        public GetWorkitemAttachmentCreatemetaResponseBodyUploadInfo setDir(String dir) {
            this.dir = dir;
            return this;
        }
        public String getDir() {
            return this.dir;
        }

        public GetWorkitemAttachmentCreatemetaResponseBodyUploadInfo setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GetWorkitemAttachmentCreatemetaResponseBodyUploadInfo setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public GetWorkitemAttachmentCreatemetaResponseBodyUploadInfo setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

    }

}
