// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListImageLabelsResponseBody extends TeaModel {
    @NameInMap("Labels")
    public java.util.List<ListImageLabelsResponseBodyLabels> labels;

    /**
     * <strong>example:</strong>
     * <p>5A14FA81-DD4E-******-6343FE44B941</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListImageLabelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListImageLabelsResponseBody self = new ListImageLabelsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListImageLabelsResponseBody setLabels(java.util.List<ListImageLabelsResponseBodyLabels> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<ListImageLabelsResponseBodyLabels> getLabels() {
        return this.labels;
    }

    public ListImageLabelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListImageLabelsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListImageLabelsResponseBodyLabels extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>system.chipType</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>GPU</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListImageLabelsResponseBodyLabels build(java.util.Map<String, ?> map) throws Exception {
            ListImageLabelsResponseBodyLabels self = new ListImageLabelsResponseBodyLabels();
            return TeaModel.build(map, self);
        }

        public ListImageLabelsResponseBodyLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListImageLabelsResponseBodyLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
