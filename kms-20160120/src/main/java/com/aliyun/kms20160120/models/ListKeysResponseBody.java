// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ListKeysResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Keys")
    public ListKeysResponseBodyKeys keys;

    public static ListKeysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListKeysResponseBody self = new ListKeysResponseBody();
        return TeaModel.build(map, self);
    }

    public ListKeysResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListKeysResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListKeysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListKeysResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListKeysResponseBody setKeys(ListKeysResponseBodyKeys keys) {
        this.keys = keys;
        return this;
    }
    public ListKeysResponseBodyKeys getKeys() {
        return this.keys;
    }

    public static class ListKeysResponseBodyKeysKey extends TeaModel {
        @NameInMap("KeyArn")
        public String keyArn;

        @NameInMap("KeyId")
        public String keyId;

        public static ListKeysResponseBodyKeysKey build(java.util.Map<String, ?> map) throws Exception {
            ListKeysResponseBodyKeysKey self = new ListKeysResponseBodyKeysKey();
            return TeaModel.build(map, self);
        }

        public ListKeysResponseBodyKeysKey setKeyArn(String keyArn) {
            this.keyArn = keyArn;
            return this;
        }
        public String getKeyArn() {
            return this.keyArn;
        }

        public ListKeysResponseBodyKeysKey setKeyId(String keyId) {
            this.keyId = keyId;
            return this;
        }
        public String getKeyId() {
            return this.keyId;
        }

    }

    public static class ListKeysResponseBodyKeys extends TeaModel {
        @NameInMap("Key")
        public java.util.List<ListKeysResponseBodyKeysKey> key;

        public static ListKeysResponseBodyKeys build(java.util.Map<String, ?> map) throws Exception {
            ListKeysResponseBodyKeys self = new ListKeysResponseBodyKeys();
            return TeaModel.build(map, self);
        }

        public ListKeysResponseBodyKeys setKey(java.util.List<ListKeysResponseBodyKeysKey> key) {
            this.key = key;
            return this;
        }
        public java.util.List<ListKeysResponseBodyKeysKey> getKey() {
            return this.key;
        }

    }

}
