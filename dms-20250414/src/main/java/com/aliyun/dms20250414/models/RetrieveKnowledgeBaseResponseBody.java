// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class RetrieveKnowledgeBaseResponseBody extends TeaModel {
    @NameInMap("Data")
    public RetrieveKnowledgeBaseResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>KnowledgeBaseNotFound</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>Resource not found kb-***</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>67E910F2-4B62-5B0C-ACA3-7547695C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static RetrieveKnowledgeBaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RetrieveKnowledgeBaseResponseBody self = new RetrieveKnowledgeBaseResponseBody();
        return TeaModel.build(map, self);
    }

    public RetrieveKnowledgeBaseResponseBody setData(RetrieveKnowledgeBaseResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RetrieveKnowledgeBaseResponseBodyData getData() {
        return this.data;
    }

    public RetrieveKnowledgeBaseResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public RetrieveKnowledgeBaseResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public RetrieveKnowledgeBaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RetrieveKnowledgeBaseResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RetrieveKnowledgeBaseResponseBodyDataMatches extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>GraphRAG (Graph Retrieval-Augmented Generation) is an advanced AI framework that combines Knowledge Graphs with Large Language Models (LLMs) to improve the accuracy, context, and reasoning capabilities of information retrieval and generation.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>1.txt</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <strong>example:</strong>
         * <p>3b35c95-57f3-442f-9220-xxxxx</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>{&quot;page_pos&quot;: 1}</p>
         */
        @NameInMap("LoaderMetadata")
        public String loaderMetadata;

        /**
         * <strong>example:</strong>
         * <p>{&quot;title&quot;:&quot;test&quot;}</p>
         */
        @NameInMap("Metadata")
        public java.util.Map<String, ?> metadata;

        public static RetrieveKnowledgeBaseResponseBodyDataMatches build(java.util.Map<String, ?> map) throws Exception {
            RetrieveKnowledgeBaseResponseBodyDataMatches self = new RetrieveKnowledgeBaseResponseBodyDataMatches();
            return TeaModel.build(map, self);
        }

        public RetrieveKnowledgeBaseResponseBodyDataMatches setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public RetrieveKnowledgeBaseResponseBodyDataMatches setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public RetrieveKnowledgeBaseResponseBodyDataMatches setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public RetrieveKnowledgeBaseResponseBodyDataMatches setLoaderMetadata(String loaderMetadata) {
            this.loaderMetadata = loaderMetadata;
            return this;
        }
        public String getLoaderMetadata() {
            return this.loaderMetadata;
        }

        public RetrieveKnowledgeBaseResponseBodyDataMatches setMetadata(java.util.Map<String, ?> metadata) {
            this.metadata = metadata;
            return this;
        }
        public java.util.Map<String, ?> getMetadata() {
            return this.metadata;
        }

    }

    public static class RetrieveKnowledgeBaseResponseBodyDataResults extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>GraphRAG (Graph Retrieval-Augmented Generation) is an advanced AI framework that combines Knowledge Graphs with Large Language Models (LLMs) to improve the accuracy, context, and reasoning capabilities of information retrieval and generation.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>1.txt</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <strong>example:</strong>
         * <p>3b35c95-57f3-442f-9220-xxxxx</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>{&quot;page_pos&quot;: 1}</p>
         */
        @NameInMap("LoaderMetadata")
        public String loaderMetadata;

        /**
         * <strong>example:</strong>
         * <p>{&quot;title&quot;:&quot;test&quot;}</p>
         */
        @NameInMap("Metadata")
        public java.util.Map<String, ?> metadata;

        /**
         * <strong>example:</strong>
         * <p>6.2345</p>
         */
        @NameInMap("RerankScore")
        public Double rerankScore;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RetrievalSource")
        public Integer retrievalSource;

        /**
         * <strong>example:</strong>
         * <p>0.81</p>
         */
        @NameInMap("Score")
        public Double score;

        @NameInMap("Vector")
        public java.util.List<Double> vector;

        public static RetrieveKnowledgeBaseResponseBodyDataResults build(java.util.Map<String, ?> map) throws Exception {
            RetrieveKnowledgeBaseResponseBodyDataResults self = new RetrieveKnowledgeBaseResponseBodyDataResults();
            return TeaModel.build(map, self);
        }

        public RetrieveKnowledgeBaseResponseBodyDataResults setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public RetrieveKnowledgeBaseResponseBodyDataResults setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public RetrieveKnowledgeBaseResponseBodyDataResults setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public RetrieveKnowledgeBaseResponseBodyDataResults setLoaderMetadata(String loaderMetadata) {
            this.loaderMetadata = loaderMetadata;
            return this;
        }
        public String getLoaderMetadata() {
            return this.loaderMetadata;
        }

        public RetrieveKnowledgeBaseResponseBodyDataResults setMetadata(java.util.Map<String, ?> metadata) {
            this.metadata = metadata;
            return this;
        }
        public java.util.Map<String, ?> getMetadata() {
            return this.metadata;
        }

        public RetrieveKnowledgeBaseResponseBodyDataResults setRerankScore(Double rerankScore) {
            this.rerankScore = rerankScore;
            return this;
        }
        public Double getRerankScore() {
            return this.rerankScore;
        }

        public RetrieveKnowledgeBaseResponseBodyDataResults setRetrievalSource(Integer retrievalSource) {
            this.retrievalSource = retrievalSource;
            return this;
        }
        public Integer getRetrievalSource() {
            return this.retrievalSource;
        }

        public RetrieveKnowledgeBaseResponseBodyDataResults setScore(Double score) {
            this.score = score;
            return this;
        }
        public Double getScore() {
            return this.score;
        }

        public RetrieveKnowledgeBaseResponseBodyDataResults setVector(java.util.List<Double> vector) {
            this.vector = vector;
            return this;
        }
        public java.util.List<Double> getVector() {
            return this.vector;
        }

    }

    public static class RetrieveKnowledgeBaseResponseBodyData extends TeaModel {
        @NameInMap("Matches")
        public java.util.List<RetrieveKnowledgeBaseResponseBodyDataMatches> matches;

        @NameInMap("Results")
        public java.util.List<RetrieveKnowledgeBaseResponseBodyDataResults> results;

        public static RetrieveKnowledgeBaseResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RetrieveKnowledgeBaseResponseBodyData self = new RetrieveKnowledgeBaseResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RetrieveKnowledgeBaseResponseBodyData setMatches(java.util.List<RetrieveKnowledgeBaseResponseBodyDataMatches> matches) {
            this.matches = matches;
            return this;
        }
        public java.util.List<RetrieveKnowledgeBaseResponseBodyDataMatches> getMatches() {
            return this.matches;
        }

        public RetrieveKnowledgeBaseResponseBodyData setResults(java.util.List<RetrieveKnowledgeBaseResponseBodyDataResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<RetrieveKnowledgeBaseResponseBodyDataResults> getResults() {
            return this.results;
        }

    }

}
