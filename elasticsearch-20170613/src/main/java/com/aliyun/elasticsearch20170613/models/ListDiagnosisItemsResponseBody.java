// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListDiagnosisItemsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<ListDiagnosisItemsResponseBodyResult> result;

    public static ListDiagnosisItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDiagnosisItemsResponseBody self = new ListDiagnosisItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDiagnosisItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDiagnosisItemsResponseBody setResult(java.util.List<ListDiagnosisItemsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListDiagnosisItemsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListDiagnosisItemsResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>诊断集群写数据是否有堆积当集群的数据写入存在堆积时，会造成BulkReject异常，可能会导致数据丢失，且会造成系统资源消耗严重</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>ClusterBulkRejectDiagnostic</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>索引写入BulkReject诊断</p>
         */
        @NameInMap("name")
        public String name;

        public static ListDiagnosisItemsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListDiagnosisItemsResponseBodyResult self = new ListDiagnosisItemsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListDiagnosisItemsResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDiagnosisItemsResponseBodyResult setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListDiagnosisItemsResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
