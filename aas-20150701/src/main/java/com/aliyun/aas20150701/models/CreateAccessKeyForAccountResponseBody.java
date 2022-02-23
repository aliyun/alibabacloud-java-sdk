// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aas20150701.models;

import com.aliyun.tea.*;

public class CreateAccessKeyForAccountResponseBody extends TeaModel {
    @NameInMap("AccessKey")
    public CreateAccessKeyForAccountResponseBodyAccessKey accessKey;

    @NameInMap("PK")
    public String PK;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateAccessKeyForAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAccessKeyForAccountResponseBody self = new CreateAccessKeyForAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAccessKeyForAccountResponseBody setAccessKey(CreateAccessKeyForAccountResponseBodyAccessKey accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    public CreateAccessKeyForAccountResponseBodyAccessKey getAccessKey() {
        return this.accessKey;
    }

    public CreateAccessKeyForAccountResponseBody setPK(String PK) {
        this.PK = PK;
        return this;
    }
    public String getPK() {
        return this.PK;
    }

    public CreateAccessKeyForAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateAccessKeyForAccountResponseBodyAccessKey extends TeaModel {
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        @NameInMap("AccessKeySecret")
        public String accessKeySecret;

        @NameInMap("AccessKeyStatus")
        public String accessKeyStatus;

        @NameInMap("AccessKeyType")
        public String accessKeyType;

        @NameInMap("CreateTime")
        public String createTime;

        public static CreateAccessKeyForAccountResponseBodyAccessKey build(java.util.Map<String, ?> map) throws Exception {
            CreateAccessKeyForAccountResponseBodyAccessKey self = new CreateAccessKeyForAccountResponseBodyAccessKey();
            return TeaModel.build(map, self);
        }

        public CreateAccessKeyForAccountResponseBodyAccessKey setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public CreateAccessKeyForAccountResponseBodyAccessKey setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public CreateAccessKeyForAccountResponseBodyAccessKey setAccessKeyStatus(String accessKeyStatus) {
            this.accessKeyStatus = accessKeyStatus;
            return this;
        }
        public String getAccessKeyStatus() {
            return this.accessKeyStatus;
        }

        public CreateAccessKeyForAccountResponseBodyAccessKey setAccessKeyType(String accessKeyType) {
            this.accessKeyType = accessKeyType;
            return this;
        }
        public String getAccessKeyType() {
            return this.accessKeyType;
        }

        public CreateAccessKeyForAccountResponseBodyAccessKey setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

    }

}
