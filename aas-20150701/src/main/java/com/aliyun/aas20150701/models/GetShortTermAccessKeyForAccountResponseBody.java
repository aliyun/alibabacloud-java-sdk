// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aas20150701.models;

import com.aliyun.tea.*;

public class GetShortTermAccessKeyForAccountResponseBody extends TeaModel {
    @NameInMap("AccessKey")
    public GetShortTermAccessKeyForAccountResponseBodyAccessKey accessKey;

    @NameInMap("PK")
    public String PK;

    @NameInMap("RequestId")
    public String requestId;

    public static GetShortTermAccessKeyForAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetShortTermAccessKeyForAccountResponseBody self = new GetShortTermAccessKeyForAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public GetShortTermAccessKeyForAccountResponseBody setAccessKey(GetShortTermAccessKeyForAccountResponseBodyAccessKey accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    public GetShortTermAccessKeyForAccountResponseBodyAccessKey getAccessKey() {
        return this.accessKey;
    }

    public GetShortTermAccessKeyForAccountResponseBody setPK(String PK) {
        this.PK = PK;
        return this;
    }
    public String getPK() {
        return this.PK;
    }

    public GetShortTermAccessKeyForAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetShortTermAccessKeyForAccountResponseBodyAccessKey extends TeaModel {
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

        public static GetShortTermAccessKeyForAccountResponseBodyAccessKey build(java.util.Map<String, ?> map) throws Exception {
            GetShortTermAccessKeyForAccountResponseBodyAccessKey self = new GetShortTermAccessKeyForAccountResponseBodyAccessKey();
            return TeaModel.build(map, self);
        }

        public GetShortTermAccessKeyForAccountResponseBodyAccessKey setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public GetShortTermAccessKeyForAccountResponseBodyAccessKey setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public GetShortTermAccessKeyForAccountResponseBodyAccessKey setAccessKeyStatus(String accessKeyStatus) {
            this.accessKeyStatus = accessKeyStatus;
            return this;
        }
        public String getAccessKeyStatus() {
            return this.accessKeyStatus;
        }

        public GetShortTermAccessKeyForAccountResponseBodyAccessKey setAccessKeyType(String accessKeyType) {
            this.accessKeyType = accessKeyType;
            return this;
        }
        public String getAccessKeyType() {
            return this.accessKeyType;
        }

        public GetShortTermAccessKeyForAccountResponseBodyAccessKey setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetShortTermAccessKeyForAccountResponseBodyAccessKey setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

    }

}
