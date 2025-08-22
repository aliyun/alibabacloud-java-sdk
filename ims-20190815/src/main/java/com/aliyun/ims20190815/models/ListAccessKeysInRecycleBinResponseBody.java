// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListAccessKeysInRecycleBinResponseBody extends TeaModel {
    /**
     * <p>The information about the AccessKey pairs.</p>
     */
    @NameInMap("AccessKeys")
    public ListAccessKeysInRecycleBinResponseBodyAccessKeys accessKeys;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4507D1CD-526A-4E2B-A1E2-3AB045D1EE0B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListAccessKeysInRecycleBinResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAccessKeysInRecycleBinResponseBody self = new ListAccessKeysInRecycleBinResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAccessKeysInRecycleBinResponseBody setAccessKeys(ListAccessKeysInRecycleBinResponseBodyAccessKeys accessKeys) {
        this.accessKeys = accessKeys;
        return this;
    }
    public ListAccessKeysInRecycleBinResponseBodyAccessKeys getAccessKeys() {
        return this.accessKeys;
    }

    public ListAccessKeysInRecycleBinResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAccessKeysInRecycleBinResponseBodyAccessKeysAccessKey extends TeaModel {
        /**
         * <p>The AccessKey ID.</p>
         * 
         * <strong>example:</strong>
         * <p>LTAI*******************</p>
         */
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        /**
         * <p>The time when the AccessKey pair was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-10-11T09:12:00Z</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>The time when the AccessKey pair will be permanently deleted from the recycle bin.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-12T09:12:00Z</p>
         */
        @NameInMap("DeleteDate")
        public String deleteDate;

        /**
         * <p>The time when the AccessKey pair was deleted and moved to the recycle bin.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-10-12T09:12:00Z</p>
         */
        @NameInMap("RecycleDate")
        public String recycleDate;

        public static ListAccessKeysInRecycleBinResponseBodyAccessKeysAccessKey build(java.util.Map<String, ?> map) throws Exception {
            ListAccessKeysInRecycleBinResponseBodyAccessKeysAccessKey self = new ListAccessKeysInRecycleBinResponseBodyAccessKeysAccessKey();
            return TeaModel.build(map, self);
        }

        public ListAccessKeysInRecycleBinResponseBodyAccessKeysAccessKey setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public ListAccessKeysInRecycleBinResponseBodyAccessKeysAccessKey setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public ListAccessKeysInRecycleBinResponseBodyAccessKeysAccessKey setDeleteDate(String deleteDate) {
            this.deleteDate = deleteDate;
            return this;
        }
        public String getDeleteDate() {
            return this.deleteDate;
        }

        public ListAccessKeysInRecycleBinResponseBodyAccessKeysAccessKey setRecycleDate(String recycleDate) {
            this.recycleDate = recycleDate;
            return this;
        }
        public String getRecycleDate() {
            return this.recycleDate;
        }

    }

    public static class ListAccessKeysInRecycleBinResponseBodyAccessKeys extends TeaModel {
        @NameInMap("AccessKey")
        public java.util.List<ListAccessKeysInRecycleBinResponseBodyAccessKeysAccessKey> accessKey;

        public static ListAccessKeysInRecycleBinResponseBodyAccessKeys build(java.util.Map<String, ?> map) throws Exception {
            ListAccessKeysInRecycleBinResponseBodyAccessKeys self = new ListAccessKeysInRecycleBinResponseBodyAccessKeys();
            return TeaModel.build(map, self);
        }

        public ListAccessKeysInRecycleBinResponseBodyAccessKeys setAccessKey(java.util.List<ListAccessKeysInRecycleBinResponseBodyAccessKeysAccessKey> accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public java.util.List<ListAccessKeysInRecycleBinResponseBodyAccessKeysAccessKey> getAccessKey() {
            return this.accessKey;
        }

    }

}
