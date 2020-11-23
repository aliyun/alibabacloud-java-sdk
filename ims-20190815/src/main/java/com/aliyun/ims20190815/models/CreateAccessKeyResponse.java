// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class CreateAccessKeyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AccessKey")
    @Validation(required = true)
    public CreateAccessKeyResponseAccessKey accessKey;

    public static CreateAccessKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAccessKeyResponse self = new CreateAccessKeyResponse();
        return TeaModel.build(map, self);
    }

    public CreateAccessKeyResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAccessKeyResponse setAccessKey(CreateAccessKeyResponseAccessKey accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    public CreateAccessKeyResponseAccessKey getAccessKey() {
        return this.accessKey;
    }

    public static class CreateAccessKeyResponseAccessKey extends TeaModel {
        @NameInMap("AccessKeyId")
        @Validation(required = true)
        public String accessKeyId;

        @NameInMap("AccessKeySecret")
        @Validation(required = true)
        public String accessKeySecret;

        @NameInMap("CreateDate")
        @Validation(required = true)
        public String createDate;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        public static CreateAccessKeyResponseAccessKey build(java.util.Map<String, ?> map) throws Exception {
            CreateAccessKeyResponseAccessKey self = new CreateAccessKeyResponseAccessKey();
            return TeaModel.build(map, self);
        }

        public CreateAccessKeyResponseAccessKey setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public CreateAccessKeyResponseAccessKey setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public CreateAccessKeyResponseAccessKey setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public CreateAccessKeyResponseAccessKey setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
