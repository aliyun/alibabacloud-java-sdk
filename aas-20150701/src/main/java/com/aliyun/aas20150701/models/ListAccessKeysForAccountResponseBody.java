// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aas20150701.models;

import com.aliyun.tea.*;

public class ListAccessKeysForAccountResponseBody extends TeaModel {
    @NameInMap("AccessKeys")
    public ListAccessKeysForAccountResponseBodyAccessKeys accessKeys;

    @NameInMap("PK")
    public String PK;

    @NameInMap("RequestId")
    public String requestId;

    public static ListAccessKeysForAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAccessKeysForAccountResponseBody self = new ListAccessKeysForAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAccessKeysForAccountResponseBody setAccessKeys(ListAccessKeysForAccountResponseBodyAccessKeys accessKeys) {
        this.accessKeys = accessKeys;
        return this;
    }
    public ListAccessKeysForAccountResponseBodyAccessKeys getAccessKeys() {
        return this.accessKeys;
    }

    public ListAccessKeysForAccountResponseBody setPK(String PK) {
        this.PK = PK;
        return this;
    }
    public String getPK() {
        return this.PK;
    }

    public ListAccessKeysForAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAccessKeysForAccountResponseBodyAccessKeysAccessKey extends TeaModel {
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

        public static ListAccessKeysForAccountResponseBodyAccessKeysAccessKey build(java.util.Map<String, ?> map) throws Exception {
            ListAccessKeysForAccountResponseBodyAccessKeysAccessKey self = new ListAccessKeysForAccountResponseBodyAccessKeysAccessKey();
            return TeaModel.build(map, self);
        }

        public ListAccessKeysForAccountResponseBodyAccessKeysAccessKey setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public ListAccessKeysForAccountResponseBodyAccessKeysAccessKey setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public ListAccessKeysForAccountResponseBodyAccessKeysAccessKey setAccessKeyStatus(String accessKeyStatus) {
            this.accessKeyStatus = accessKeyStatus;
            return this;
        }
        public String getAccessKeyStatus() {
            return this.accessKeyStatus;
        }

        public ListAccessKeysForAccountResponseBodyAccessKeysAccessKey setAccessKeyType(String accessKeyType) {
            this.accessKeyType = accessKeyType;
            return this;
        }
        public String getAccessKeyType() {
            return this.accessKeyType;
        }

        public ListAccessKeysForAccountResponseBodyAccessKeysAccessKey setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

    }

    public static class ListAccessKeysForAccountResponseBodyAccessKeys extends TeaModel {
        @NameInMap("AccessKey")
        public java.util.List<ListAccessKeysForAccountResponseBodyAccessKeysAccessKey> accessKey;

        public static ListAccessKeysForAccountResponseBodyAccessKeys build(java.util.Map<String, ?> map) throws Exception {
            ListAccessKeysForAccountResponseBodyAccessKeys self = new ListAccessKeysForAccountResponseBodyAccessKeys();
            return TeaModel.build(map, self);
        }

        public ListAccessKeysForAccountResponseBodyAccessKeys setAccessKey(java.util.List<ListAccessKeysForAccountResponseBodyAccessKeysAccessKey> accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public java.util.List<ListAccessKeysForAccountResponseBodyAccessKeysAccessKey> getAccessKey() {
            return this.accessKey;
        }

    }

}
