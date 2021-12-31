// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms_export20211101.models;

import com.aliyun.tea.*;

public class BatchGetResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public BatchGetResponseBodyData data;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static BatchGetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchGetResponseBody self = new BatchGetResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchGetResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public BatchGetResponseBody setData(BatchGetResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BatchGetResponseBodyData getData() {
        return this.data;
    }

    public BatchGetResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BatchGetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchGetResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BatchGetResponseBodyDataRecords extends TeaModel {
        @NameInMap("LabelValues")
        public java.util.List<String> labelValues;

        @NameInMap("Labels")
        public java.util.List<String> labels;

        @NameInMap("MeasureLabels")
        public java.util.List<String> measureLabels;

        @NameInMap("MeasureValues")
        public java.util.List<String> measureValues;

        @NameInMap("Metric")
        public String metric;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("Period")
        public Integer period;

        @NameInMap("TagValues")
        public java.util.List<String> tagValues;

        @NameInMap("Tags")
        public java.util.List<String> tags;

        @NameInMap("Timestamp")
        public Long timestamp;

        public static BatchGetResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            BatchGetResponseBodyDataRecords self = new BatchGetResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public BatchGetResponseBodyDataRecords setLabelValues(java.util.List<String> labelValues) {
            this.labelValues = labelValues;
            return this;
        }
        public java.util.List<String> getLabelValues() {
            return this.labelValues;
        }

        public BatchGetResponseBodyDataRecords setLabels(java.util.List<String> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<String> getLabels() {
            return this.labels;
        }

        public BatchGetResponseBodyDataRecords setMeasureLabels(java.util.List<String> measureLabels) {
            this.measureLabels = measureLabels;
            return this;
        }
        public java.util.List<String> getMeasureLabels() {
            return this.measureLabels;
        }

        public BatchGetResponseBodyDataRecords setMeasureValues(java.util.List<String> measureValues) {
            this.measureValues = measureValues;
            return this;
        }
        public java.util.List<String> getMeasureValues() {
            return this.measureValues;
        }

        public BatchGetResponseBodyDataRecords setMetric(String metric) {
            this.metric = metric;
            return this;
        }
        public String getMetric() {
            return this.metric;
        }

        public BatchGetResponseBodyDataRecords setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public BatchGetResponseBodyDataRecords setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public BatchGetResponseBodyDataRecords setTagValues(java.util.List<String> tagValues) {
            this.tagValues = tagValues;
            return this;
        }
        public java.util.List<String> getTagValues() {
            return this.tagValues;
        }

        public BatchGetResponseBodyDataRecords setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

        public BatchGetResponseBodyDataRecords setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

    public static class BatchGetResponseBodyData extends TeaModel {
        @NameInMap("CompressionKeys")
        public java.util.List<String> compressionKeys;

        @NameInMap("CompressionValues")
        public java.util.List<java.util.List<java.util.Map<String, ?>>> compressionValues;

        @NameInMap("Cursor")
        public String cursor;

        @NameInMap("Length")
        public Long length;

        @NameInMap("Records")
        public java.util.List<BatchGetResponseBodyDataRecords> records;

        public static BatchGetResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchGetResponseBodyData self = new BatchGetResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchGetResponseBodyData setCompressionKeys(java.util.List<String> compressionKeys) {
            this.compressionKeys = compressionKeys;
            return this;
        }
        public java.util.List<String> getCompressionKeys() {
            return this.compressionKeys;
        }

        public BatchGetResponseBodyData setCompressionValues(java.util.List<java.util.List<java.util.Map<String, ?>>> compressionValues) {
            this.compressionValues = compressionValues;
            return this;
        }
        public java.util.List<java.util.List<java.util.Map<String, ?>>> getCompressionValues() {
            return this.compressionValues;
        }

        public BatchGetResponseBodyData setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }
        public String getCursor() {
            return this.cursor;
        }

        public BatchGetResponseBodyData setLength(Long length) {
            this.length = length;
            return this;
        }
        public Long getLength() {
            return this.length;
        }

        public BatchGetResponseBodyData setRecords(java.util.List<BatchGetResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<BatchGetResponseBodyDataRecords> getRecords() {
            return this.records;
        }

    }

}
