// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListImageLabelsResponseBody extends TeaModel {
    // 镜像标签
    @NameInMap("Labels")
    public java.util.List<ListImageLabelsResponseBodyLabels> labels;

    // 符合过滤条件的数量
    @NameInMap("TotalCount")
    public Long totalCount;

    // Id of the request
    @NameInMap("requestId")
    public String requestId;

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

    public ListImageLabelsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListImageLabelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListImageLabelsResponseBodyLabels extends TeaModel {
        // 键
        @NameInMap("Key")
        public String key;

        // 值
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
