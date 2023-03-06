// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListDiagnosisItemsResponseBody extends TeaModel {
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
        @NameInMap("description")
        public String description;

        @NameInMap("key")
        public String key;

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
