// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class RerankResponseBody extends TeaModel {
    /**
     * <p>Detailed information returned by the interface.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public RerankResponseBodyResults results;

    /**
     * <p>API execution status, value description:</p>
     * <ul>
     * <li><strong>success</strong>: Execution succeeded.</li>
     * <li><strong>fail</strong>: Execution failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Number of consumed tokens.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Tokens")
    public Integer tokens;

    public static RerankResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RerankResponseBody self = new RerankResponseBody();
        return TeaModel.build(map, self);
    }

    public RerankResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RerankResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RerankResponseBody setResults(RerankResponseBodyResults results) {
        this.results = results;
        return this;
    }
    public RerankResponseBodyResults getResults() {
        return this.results;
    }

    public RerankResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public RerankResponseBody setTokens(Integer tokens) {
        this.tokens = tokens;
        return this;
    }
    public Integer getTokens() {
        return this.tokens;
    }

    public static class RerankResponseBodyResultsResults extends TeaModel {
        @NameInMap("Document")
        public String document;

        @NameInMap("Index")
        public Integer index;

        @NameInMap("RelevanceScore")
        public Float relevanceScore;

        public static RerankResponseBodyResultsResults build(java.util.Map<String, ?> map) throws Exception {
            RerankResponseBodyResultsResults self = new RerankResponseBodyResultsResults();
            return TeaModel.build(map, self);
        }

        public RerankResponseBodyResultsResults setDocument(String document) {
            this.document = document;
            return this;
        }
        public String getDocument() {
            return this.document;
        }

        public RerankResponseBodyResultsResults setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public RerankResponseBodyResultsResults setRelevanceScore(Float relevanceScore) {
            this.relevanceScore = relevanceScore;
            return this;
        }
        public Float getRelevanceScore() {
            return this.relevanceScore;
        }

    }

    public static class RerankResponseBodyResults extends TeaModel {
        @NameInMap("Results")
        public java.util.List<RerankResponseBodyResultsResults> results;

        public static RerankResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            RerankResponseBodyResults self = new RerankResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public RerankResponseBodyResults setResults(java.util.List<RerankResponseBodyResultsResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<RerankResponseBodyResultsResults> getResults() {
            return this.results;
        }

    }

}
