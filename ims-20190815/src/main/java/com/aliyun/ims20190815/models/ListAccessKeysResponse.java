// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListAccessKeysResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AccessKeys")
    @Validation(required = true)
    public ListAccessKeysResponseAccessKeys accessKeys;

    public static ListAccessKeysResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAccessKeysResponse self = new ListAccessKeysResponse();
        return TeaModel.build(map, self);
    }

    public ListAccessKeysResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAccessKeysResponse setAccessKeys(ListAccessKeysResponseAccessKeys accessKeys) {
        this.accessKeys = accessKeys;
        return this;
    }
    public ListAccessKeysResponseAccessKeys getAccessKeys() {
        return this.accessKeys;
    }

    public static class ListAccessKeysResponseAccessKeysAccessKey extends TeaModel {
        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("UpdateDate")
        @Validation(required = true)
        public String updateDate;

        @NameInMap("AccessKeyId")
        @Validation(required = true)
        public String accessKeyId;

        @NameInMap("CreateDate")
        @Validation(required = true)
        public String createDate;

        public static ListAccessKeysResponseAccessKeysAccessKey build(java.util.Map<String, ?> map) throws Exception {
            ListAccessKeysResponseAccessKeysAccessKey self = new ListAccessKeysResponseAccessKeysAccessKey();
            return TeaModel.build(map, self);
        }

        public ListAccessKeysResponseAccessKeysAccessKey setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAccessKeysResponseAccessKeysAccessKey setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

        public ListAccessKeysResponseAccessKeysAccessKey setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public ListAccessKeysResponseAccessKeysAccessKey setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

    }

    public static class ListAccessKeysResponseAccessKeys extends TeaModel {
        @NameInMap("AccessKey")
        @Validation(required = true)
        public java.util.List<ListAccessKeysResponseAccessKeysAccessKey> accessKey;

        public static ListAccessKeysResponseAccessKeys build(java.util.Map<String, ?> map) throws Exception {
            ListAccessKeysResponseAccessKeys self = new ListAccessKeysResponseAccessKeys();
            return TeaModel.build(map, self);
        }

        public ListAccessKeysResponseAccessKeys setAccessKey(java.util.List<ListAccessKeysResponseAccessKeysAccessKey> accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public java.util.List<ListAccessKeysResponseAccessKeysAccessKey> getAccessKey() {
            return this.accessKey;
        }

    }

}
