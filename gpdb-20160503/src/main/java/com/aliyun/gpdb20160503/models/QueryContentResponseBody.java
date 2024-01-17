// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class QueryContentResponseBody extends TeaModel {
    @NameInMap("EmbeddingTokens")
    public String embeddingTokens;

    @NameInMap("Matches")
    public QueryContentResponseBodyMatches matches;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    @NameInMap("Usage")
    public QueryContentResponseBodyUsage usage;

    public static QueryContentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryContentResponseBody self = new QueryContentResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryContentResponseBody setEmbeddingTokens(String embeddingTokens) {
        this.embeddingTokens = embeddingTokens;
        return this;
    }
    public String getEmbeddingTokens() {
        return this.embeddingTokens;
    }

    public QueryContentResponseBody setMatches(QueryContentResponseBodyMatches matches) {
        this.matches = matches;
        return this;
    }
    public QueryContentResponseBodyMatches getMatches() {
        return this.matches;
    }

    public QueryContentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryContentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryContentResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryContentResponseBody setUsage(QueryContentResponseBodyUsage usage) {
        this.usage = usage;
        return this;
    }
    public QueryContentResponseBodyUsage getUsage() {
        return this.usage;
    }

    public static class QueryContentResponseBodyMatchesMatchListVector extends TeaModel {
        @NameInMap("VectorList")
        public java.util.List<Double> vectorList;

        public static QueryContentResponseBodyMatchesMatchListVector build(java.util.Map<String, ?> map) throws Exception {
            QueryContentResponseBodyMatchesMatchListVector self = new QueryContentResponseBodyMatchesMatchListVector();
            return TeaModel.build(map, self);
        }

        public QueryContentResponseBodyMatchesMatchListVector setVectorList(java.util.List<Double> vectorList) {
            this.vectorList = vectorList;
            return this;
        }
        public java.util.List<Double> getVectorList() {
            return this.vectorList;
        }

    }

    public static class QueryContentResponseBodyMatchesMatchList extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("FileURL")
        public String fileURL;

        @NameInMap("Id")
        public String id;

        @NameInMap("LoaderMetadata")
        public String loaderMetadata;

        @NameInMap("Metadata")
        public java.util.Map<String, String> metadata;

        @NameInMap("RetrievalSource")
        public Integer retrievalSource;

        @NameInMap("Score")
        public Double score;

        @NameInMap("Vector")
        public QueryContentResponseBodyMatchesMatchListVector vector;

        public static QueryContentResponseBodyMatchesMatchList build(java.util.Map<String, ?> map) throws Exception {
            QueryContentResponseBodyMatchesMatchList self = new QueryContentResponseBodyMatchesMatchList();
            return TeaModel.build(map, self);
        }

        public QueryContentResponseBodyMatchesMatchList setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public QueryContentResponseBodyMatchesMatchList setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public QueryContentResponseBodyMatchesMatchList setFileURL(String fileURL) {
            this.fileURL = fileURL;
            return this;
        }
        public String getFileURL() {
            return this.fileURL;
        }

        public QueryContentResponseBodyMatchesMatchList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryContentResponseBodyMatchesMatchList setLoaderMetadata(String loaderMetadata) {
            this.loaderMetadata = loaderMetadata;
            return this;
        }
        public String getLoaderMetadata() {
            return this.loaderMetadata;
        }

        public QueryContentResponseBodyMatchesMatchList setMetadata(java.util.Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }
        public java.util.Map<String, String> getMetadata() {
            return this.metadata;
        }

        public QueryContentResponseBodyMatchesMatchList setRetrievalSource(Integer retrievalSource) {
            this.retrievalSource = retrievalSource;
            return this;
        }
        public Integer getRetrievalSource() {
            return this.retrievalSource;
        }

        public QueryContentResponseBodyMatchesMatchList setScore(Double score) {
            this.score = score;
            return this;
        }
        public Double getScore() {
            return this.score;
        }

        public QueryContentResponseBodyMatchesMatchList setVector(QueryContentResponseBodyMatchesMatchListVector vector) {
            this.vector = vector;
            return this;
        }
        public QueryContentResponseBodyMatchesMatchListVector getVector() {
            return this.vector;
        }

    }

    public static class QueryContentResponseBodyMatches extends TeaModel {
        @NameInMap("MatchList")
        public java.util.List<QueryContentResponseBodyMatchesMatchList> matchList;

        public static QueryContentResponseBodyMatches build(java.util.Map<String, ?> map) throws Exception {
            QueryContentResponseBodyMatches self = new QueryContentResponseBodyMatches();
            return TeaModel.build(map, self);
        }

        public QueryContentResponseBodyMatches setMatchList(java.util.List<QueryContentResponseBodyMatchesMatchList> matchList) {
            this.matchList = matchList;
            return this;
        }
        public java.util.List<QueryContentResponseBodyMatchesMatchList> getMatchList() {
            return this.matchList;
        }

    }

    public static class QueryContentResponseBodyUsage extends TeaModel {
        @NameInMap("EmbeddingEntries")
        public String embeddingEntries;

        @NameInMap("EmbeddingTokens")
        public String embeddingTokens;

        public static QueryContentResponseBodyUsage build(java.util.Map<String, ?> map) throws Exception {
            QueryContentResponseBodyUsage self = new QueryContentResponseBodyUsage();
            return TeaModel.build(map, self);
        }

        public QueryContentResponseBodyUsage setEmbeddingEntries(String embeddingEntries) {
            this.embeddingEntries = embeddingEntries;
            return this;
        }
        public String getEmbeddingEntries() {
            return this.embeddingEntries;
        }

        public QueryContentResponseBodyUsage setEmbeddingTokens(String embeddingTokens) {
            this.embeddingTokens = embeddingTokens;
            return this;
        }
        public String getEmbeddingTokens() {
            return this.embeddingTokens;
        }

    }

}
