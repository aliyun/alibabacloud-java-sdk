// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aas20150701.models;

import com.aliyun.tea.*;

public class CreateShortTermAccessKeyForAccountResponseBody extends TeaModel {
    @NameInMap("AccessKey")
    public CreateShortTermAccessKeyForAccountResponseBodyAccessKey accessKey;

    @NameInMap("PK")
    public String PK;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateShortTermAccessKeyForAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateShortTermAccessKeyForAccountResponseBody self = new CreateShortTermAccessKeyForAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateShortTermAccessKeyForAccountResponseBody setAccessKey(CreateShortTermAccessKeyForAccountResponseBodyAccessKey accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    public CreateShortTermAccessKeyForAccountResponseBodyAccessKey getAccessKey() {
        return this.accessKey;
    }

    public CreateShortTermAccessKeyForAccountResponseBody setPK(String PK) {
        this.PK = PK;
        return this;
    }
    public String getPK() {
        return this.PK;
    }

    public CreateShortTermAccessKeyForAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateShortTermAccessKeyForAccountResponseBodyAccessKey extends TeaModel {
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

        @NameInMap("ExpireTime")
        public String expireTime;

        public static CreateShortTermAccessKeyForAccountResponseBodyAccessKey build(java.util.Map<String, ?> map) throws Exception {
            CreateShortTermAccessKeyForAccountResponseBodyAccessKey self = new CreateShortTermAccessKeyForAccountResponseBodyAccessKey();
            return TeaModel.build(map, self);
        }

        public CreateShortTermAccessKeyForAccountResponseBodyAccessKey setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public CreateShortTermAccessKeyForAccountResponseBodyAccessKey setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public CreateShortTermAccessKeyForAccountResponseBodyAccessKey setAccessKeyStatus(String accessKeyStatus) {
            this.accessKeyStatus = accessKeyStatus;
            return this;
        }
        public String getAccessKeyStatus() {
            return this.accessKeyStatus;
        }

        public CreateShortTermAccessKeyForAccountResponseBodyAccessKey setAccessKeyType(String accessKeyType) {
            this.accessKeyType = accessKeyType;
            return this;
        }
        public String getAccessKeyType() {
            return this.accessKeyType;
        }

        public CreateShortTermAccessKeyForAccountResponseBodyAccessKey setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateShortTermAccessKeyForAccountResponseBodyAccessKey setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

    }

}
