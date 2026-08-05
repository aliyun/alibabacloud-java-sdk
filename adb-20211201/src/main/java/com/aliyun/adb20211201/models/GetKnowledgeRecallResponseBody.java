// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetKnowledgeRecallResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetKnowledgeRecallResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetKnowledgeRecallResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetKnowledgeRecallResponseBody self = new GetKnowledgeRecallResponseBody();
        return TeaModel.build(map, self);
    }

    public GetKnowledgeRecallResponseBody setData(GetKnowledgeRecallResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetKnowledgeRecallResponseBodyData getData() {
        return this.data;
    }

    public GetKnowledgeRecallResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetKnowledgeRecallResponseBodyData extends TeaModel {
        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The prompt message.</p>
         * 
         * <strong>example:</strong>
         * <p>recall 5 files</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The recall results.</p>
         */
        @NameInMap("Results")
        public java.util.List<java.util.Map<String, ?>> results;

        /**
         * <p>The Tracing Analysis ID.</p>
         * 
         * <strong>example:</strong>
         * <p>qf_c41fc27697d3</p>
         */
        @NameInMap("TraceId")
        public String traceId;

        public static GetKnowledgeRecallResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeRecallResponseBodyData self = new GetKnowledgeRecallResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeRecallResponseBodyData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public GetKnowledgeRecallResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetKnowledgeRecallResponseBodyData setResults(java.util.List<java.util.Map<String, ?>> results) {
            this.results = results;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getResults() {
            return this.results;
        }

        public GetKnowledgeRecallResponseBodyData setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

}
