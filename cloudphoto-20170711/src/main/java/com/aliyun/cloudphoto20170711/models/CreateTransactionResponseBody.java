// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class CreateTransactionResponseBody extends TeaModel {
    @NameInMap("Action")
    public String action;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Transaction")
    public CreateTransactionResponseBodyTransaction transaction;

    @NameInMap("Code")
    public String code;

    public static CreateTransactionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTransactionResponseBody self = new CreateTransactionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTransactionResponseBody setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public CreateTransactionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateTransactionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTransactionResponseBody setTransaction(CreateTransactionResponseBodyTransaction transaction) {
        this.transaction = transaction;
        return this;
    }
    public CreateTransactionResponseBodyTransaction getTransaction() {
        return this.transaction;
    }

    public CreateTransactionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class CreateTransactionResponseBodyTransactionUpload extends TeaModel {
        @NameInMap("ObjectKey")
        public String objectKey;

        @NameInMap("AccessKeySecret")
        public String accessKeySecret;

        @NameInMap("SessionId")
        public String sessionId;

        @NameInMap("AccessKeyId")
        public String accessKeyId;

        @NameInMap("StsToken")
        public String stsToken;

        @NameInMap("OssEndpoint")
        public String ossEndpoint;

        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("FileId")
        public String fileId;

        public static CreateTransactionResponseBodyTransactionUpload build(java.util.Map<String, ?> map) throws Exception {
            CreateTransactionResponseBodyTransactionUpload self = new CreateTransactionResponseBodyTransactionUpload();
            return TeaModel.build(map, self);
        }

        public CreateTransactionResponseBodyTransactionUpload setObjectKey(String objectKey) {
            this.objectKey = objectKey;
            return this;
        }
        public String getObjectKey() {
            return this.objectKey;
        }

        public CreateTransactionResponseBodyTransactionUpload setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public CreateTransactionResponseBodyTransactionUpload setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public CreateTransactionResponseBodyTransactionUpload setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public CreateTransactionResponseBodyTransactionUpload setStsToken(String stsToken) {
            this.stsToken = stsToken;
            return this;
        }
        public String getStsToken() {
            return this.stsToken;
        }

        public CreateTransactionResponseBodyTransactionUpload setOssEndpoint(String ossEndpoint) {
            this.ossEndpoint = ossEndpoint;
            return this;
        }
        public String getOssEndpoint() {
            return this.ossEndpoint;
        }

        public CreateTransactionResponseBodyTransactionUpload setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public CreateTransactionResponseBodyTransactionUpload setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

    }

    public static class CreateTransactionResponseBodyTransaction extends TeaModel {
        @NameInMap("Upload")
        public CreateTransactionResponseBodyTransactionUpload upload;

        public static CreateTransactionResponseBodyTransaction build(java.util.Map<String, ?> map) throws Exception {
            CreateTransactionResponseBodyTransaction self = new CreateTransactionResponseBodyTransaction();
            return TeaModel.build(map, self);
        }

        public CreateTransactionResponseBodyTransaction setUpload(CreateTransactionResponseBodyTransactionUpload upload) {
            this.upload = upload;
            return this;
        }
        public CreateTransactionResponseBodyTransactionUpload getUpload() {
            return this.upload;
        }

    }

}
