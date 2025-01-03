// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetWorkitemAttachmentCreatemetaResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Invalid.IdNotFound</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>Forbidden.UserNotInCurrentOrganization</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>ASSDS-ASSASX-XSAXSA-XSAXSAXS</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>xxxxxxx</p>
         */
        @NameInMap("accessid")
        public String accessid;

        /**
         * <strong>example:</strong>
         * <p>ddd/dddd</p>
         */
        @NameInMap("dir")
        public String dir;

        /**
         * <strong>example:</strong>
         * <p>xxxxx</p>
         */
        @NameInMap("host")
        public String host;

        /**
         * <strong>example:</strong>
         * <p>xxxxxxx</p>
         */
        @NameInMap("policy")
        public String policy;

        /**
         * <strong>example:</strong>
         * <p>xdWcrl/yTmIUA0kE7a3B0Ox4Vu8=</p>
         */
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
