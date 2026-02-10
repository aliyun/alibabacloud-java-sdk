// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class TextEmbeddingResponseBody extends TeaModel {
    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public TextEmbeddingResponseBodyResults results;

    /**
     * <p>The status of the operation. Valid values:</p>
     * <ul>
     * <li><strong>success</strong></li>
     * <li><strong>fail</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The total number of tokens consumed.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("TextTokens")
    public Integer textTokens;

    public static TextEmbeddingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TextEmbeddingResponseBody self = new TextEmbeddingResponseBody();
        return TeaModel.build(map, self);
    }

    public TextEmbeddingResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TextEmbeddingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TextEmbeddingResponseBody setResults(TextEmbeddingResponseBodyResults results) {
        this.results = results;
        return this;
    }
    public TextEmbeddingResponseBodyResults getResults() {
        return this.results;
    }

    public TextEmbeddingResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public TextEmbeddingResponseBody setTextTokens(Integer textTokens) {
        this.textTokens = textTokens;
        return this;
    }
    public Integer getTextTokens() {
        return this.textTokens;
    }

    public static class TextEmbeddingResponseBodyResultsResultsEmbedding extends TeaModel {
        @NameInMap("Embedding")
        public java.util.List<Double> embedding;

        public static TextEmbeddingResponseBodyResultsResultsEmbedding build(java.util.Map<String, ?> map) throws Exception {
            TextEmbeddingResponseBodyResultsResultsEmbedding self = new TextEmbeddingResponseBodyResultsResultsEmbedding();
            return TeaModel.build(map, self);
        }

        public TextEmbeddingResponseBodyResultsResultsEmbedding setEmbedding(java.util.List<Double> embedding) {
            this.embedding = embedding;
            return this;
        }
        public java.util.List<Double> getEmbedding() {
            return this.embedding;
        }

    }

    public static class TextEmbeddingResponseBodyResultsResults extends TeaModel {
        @NameInMap("Embedding")
        public TextEmbeddingResponseBodyResultsResultsEmbedding embedding;

        @NameInMap("Index")
        public Integer index;

        public static TextEmbeddingResponseBodyResultsResults build(java.util.Map<String, ?> map) throws Exception {
            TextEmbeddingResponseBodyResultsResults self = new TextEmbeddingResponseBodyResultsResults();
            return TeaModel.build(map, self);
        }

        public TextEmbeddingResponseBodyResultsResults setEmbedding(TextEmbeddingResponseBodyResultsResultsEmbedding embedding) {
            this.embedding = embedding;
            return this;
        }
        public TextEmbeddingResponseBodyResultsResultsEmbedding getEmbedding() {
            return this.embedding;
        }

        public TextEmbeddingResponseBodyResultsResults setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

    }

    public static class TextEmbeddingResponseBodyResults extends TeaModel {
        @NameInMap("Results")
        public java.util.List<TextEmbeddingResponseBodyResultsResults> results;

        public static TextEmbeddingResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            TextEmbeddingResponseBodyResults self = new TextEmbeddingResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public TextEmbeddingResponseBodyResults setResults(java.util.List<TextEmbeddingResponseBodyResultsResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<TextEmbeddingResponseBodyResultsResults> getResults() {
            return this.results;
        }

    }

}
