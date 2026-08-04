// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class BatchDeleteTopicsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public BatchDeleteTopicsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static BatchDeleteTopicsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteTopicsResponseBody self = new BatchDeleteTopicsResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchDeleteTopicsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public BatchDeleteTopicsResponseBody setData(BatchDeleteTopicsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BatchDeleteTopicsResponseBodyData getData() {
        return this.data;
    }

    public BatchDeleteTopicsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BatchDeleteTopicsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchDeleteTopicsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BatchDeleteTopicsResponseBodyDataResultsTopicDeleteResultItemVO extends TeaModel {
        @NameInMap("Code")
        public Integer code;

        @NameInMap("DynamicCode")
        public String dynamicCode;

        @NameInMap("DynamicMessage")
        public String dynamicMessage;

        @NameInMap("Message")
        public String message;

        @NameInMap("Status")
        public String status;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Topic")
        public String topic;

        public static BatchDeleteTopicsResponseBodyDataResultsTopicDeleteResultItemVO build(java.util.Map<String, ?> map) throws Exception {
            BatchDeleteTopicsResponseBodyDataResultsTopicDeleteResultItemVO self = new BatchDeleteTopicsResponseBodyDataResultsTopicDeleteResultItemVO();
            return TeaModel.build(map, self);
        }

        public BatchDeleteTopicsResponseBodyDataResultsTopicDeleteResultItemVO setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public BatchDeleteTopicsResponseBodyDataResultsTopicDeleteResultItemVO setDynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }
        public String getDynamicCode() {
            return this.dynamicCode;
        }

        public BatchDeleteTopicsResponseBodyDataResultsTopicDeleteResultItemVO setDynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }
        public String getDynamicMessage() {
            return this.dynamicMessage;
        }

        public BatchDeleteTopicsResponseBodyDataResultsTopicDeleteResultItemVO setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public BatchDeleteTopicsResponseBodyDataResultsTopicDeleteResultItemVO setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public BatchDeleteTopicsResponseBodyDataResultsTopicDeleteResultItemVO setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public BatchDeleteTopicsResponseBodyDataResultsTopicDeleteResultItemVO setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

    public static class BatchDeleteTopicsResponseBodyDataResults extends TeaModel {
        @NameInMap("TopicDeleteResultItemVO")
        public java.util.List<BatchDeleteTopicsResponseBodyDataResultsTopicDeleteResultItemVO> topicDeleteResultItemVO;

        public static BatchDeleteTopicsResponseBodyDataResults build(java.util.Map<String, ?> map) throws Exception {
            BatchDeleteTopicsResponseBodyDataResults self = new BatchDeleteTopicsResponseBodyDataResults();
            return TeaModel.build(map, self);
        }

        public BatchDeleteTopicsResponseBodyDataResults setTopicDeleteResultItemVO(java.util.List<BatchDeleteTopicsResponseBodyDataResultsTopicDeleteResultItemVO> topicDeleteResultItemVO) {
            this.topicDeleteResultItemVO = topicDeleteResultItemVO;
            return this;
        }
        public java.util.List<BatchDeleteTopicsResponseBodyDataResultsTopicDeleteResultItemVO> getTopicDeleteResultItemVO() {
            return this.topicDeleteResultItemVO;
        }

    }

    public static class BatchDeleteTopicsResponseBodyData extends TeaModel {
        @NameInMap("FailedCount")
        public Integer failedCount;

        @NameInMap("Results")
        public BatchDeleteTopicsResponseBodyDataResults results;

        @NameInMap("SuccessCount")
        public Integer successCount;

        @NameInMap("Total")
        public Integer total;

        public static BatchDeleteTopicsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchDeleteTopicsResponseBodyData self = new BatchDeleteTopicsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchDeleteTopicsResponseBodyData setFailedCount(Integer failedCount) {
            this.failedCount = failedCount;
            return this;
        }
        public Integer getFailedCount() {
            return this.failedCount;
        }

        public BatchDeleteTopicsResponseBodyData setResults(BatchDeleteTopicsResponseBodyDataResults results) {
            this.results = results;
            return this;
        }
        public BatchDeleteTopicsResponseBodyDataResults getResults() {
            return this.results;
        }

        public BatchDeleteTopicsResponseBodyData setSuccessCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }
        public Integer getSuccessCount() {
            return this.successCount;
        }

        public BatchDeleteTopicsResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
