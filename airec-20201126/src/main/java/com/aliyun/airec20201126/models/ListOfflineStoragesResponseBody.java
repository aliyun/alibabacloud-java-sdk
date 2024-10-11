// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListOfflineStoragesResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6839AE7C-A984-48C1-AC17-331BAC6D97BC</p>
     */
    @NameInMap("requestId")
    public byte[] requestId;

    @NameInMap("result")
    public java.util.List<ListOfflineStoragesResponseBodyResult> result;

    public static ListOfflineStoragesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOfflineStoragesResponseBody self = new ListOfflineStoragesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOfflineStoragesResponseBody setRequestId(byte[] requestId) {
        this.requestId = requestId;
        return this;
    }
    public byte[] getRequestId() {
        return this.requestId;
    }

    public ListOfflineStoragesResponseBody setResult(java.util.List<ListOfflineStoragesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListOfflineStoragesResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListOfflineStoragesResponseBodyResult extends TeaModel {
        @NameInMap("meta")
        public java.util.Map<String, ?> meta;

        /**
         * <strong>example:</strong>
         * <p>item</p>
         */
        @NameInMap("tableName")
        public byte[] tableName;

        public static ListOfflineStoragesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListOfflineStoragesResponseBodyResult self = new ListOfflineStoragesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListOfflineStoragesResponseBodyResult setMeta(java.util.Map<String, ?> meta) {
            this.meta = meta;
            return this;
        }
        public java.util.Map<String, ?> getMeta() {
            return this.meta;
        }

        public ListOfflineStoragesResponseBodyResult setTableName(byte[] tableName) {
            this.tableName = tableName;
            return this;
        }
        public byte[] getTableName() {
            return this.tableName;
        }

    }

}
