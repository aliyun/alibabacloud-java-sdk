// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class QueryContentResponseBody extends TeaModel {
    /**
     * <p>Number of tokens used for vectorization.</p>
     * <blockquote>
     * <p>A token refers to the smallest unit into which the input text is divided; a token can be a word, a phrase, a punctuation mark, or a character, etc.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("EmbeddingTokens")
    public String embeddingTokens;

    @NameInMap("Entities")
    public QueryContentResponseBodyEntities entities;

    @NameInMap("Matches")
    public QueryContentResponseBodyMatches matches;

    /**
     * <p>Return message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Relations")
    public QueryContentResponseBodyRelations relations;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The execution state of the operation. Valid values:</p>
     * <ul>
     * <li><strong>false</strong>: The operation fails.</li>
     * <li><strong>true</strong>: The operation is successful.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Resource usage for this query.</p>
     */
    @NameInMap("Usage")
    public QueryContentResponseBodyUsage usage;

    @NameInMap("WindowMatches")
    public QueryContentResponseBodyWindowMatches windowMatches;

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

    public QueryContentResponseBody setEntities(QueryContentResponseBodyEntities entities) {
        this.entities = entities;
        return this;
    }
    public QueryContentResponseBodyEntities getEntities() {
        return this.entities;
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

    public QueryContentResponseBody setRelations(QueryContentResponseBodyRelations relations) {
        this.relations = relations;
        return this;
    }
    public QueryContentResponseBodyRelations getRelations() {
        return this.relations;
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

    public QueryContentResponseBody setWindowMatches(QueryContentResponseBodyWindowMatches windowMatches) {
        this.windowMatches = windowMatches;
        return this;
    }
    public QueryContentResponseBodyWindowMatches getWindowMatches() {
        return this.windowMatches;
    }

    public static class QueryContentResponseBodyEntitiesEntities extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Entity")
        public String entity;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("Id")
        public String id;

        @NameInMap("Type")
        public String type;

        public static QueryContentResponseBodyEntitiesEntities build(java.util.Map<String, ?> map) throws Exception {
            QueryContentResponseBodyEntitiesEntities self = new QueryContentResponseBodyEntitiesEntities();
            return TeaModel.build(map, self);
        }

        public QueryContentResponseBodyEntitiesEntities setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryContentResponseBodyEntitiesEntities setEntity(String entity) {
            this.entity = entity;
            return this;
        }
        public String getEntity() {
            return this.entity;
        }

        public QueryContentResponseBodyEntitiesEntities setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public QueryContentResponseBodyEntitiesEntities setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryContentResponseBodyEntitiesEntities setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryContentResponseBodyEntities extends TeaModel {
        @NameInMap("entities")
        public java.util.List<QueryContentResponseBodyEntitiesEntities> entities;

        public static QueryContentResponseBodyEntities build(java.util.Map<String, ?> map) throws Exception {
            QueryContentResponseBodyEntities self = new QueryContentResponseBodyEntities();
            return TeaModel.build(map, self);
        }

        public QueryContentResponseBodyEntities setEntities(java.util.List<QueryContentResponseBodyEntitiesEntities> entities) {
            this.entities = entities;
            return this;
        }
        public java.util.List<QueryContentResponseBodyEntitiesEntities> getEntities() {
            return this.entities;
        }

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

        @NameInMap("RerankScore")
        public Double rerankScore;

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

        public QueryContentResponseBodyMatchesMatchList setRerankScore(Double rerankScore) {
            this.rerankScore = rerankScore;
            return this;
        }
        public Double getRerankScore() {
            return this.rerankScore;
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

    public static class QueryContentResponseBodyRelationsRelations extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("Id")
        public String id;

        @NameInMap("SourceEntity")
        public String sourceEntity;

        @NameInMap("TargetEntity")
        public String targetEntity;

        public static QueryContentResponseBodyRelationsRelations build(java.util.Map<String, ?> map) throws Exception {
            QueryContentResponseBodyRelationsRelations self = new QueryContentResponseBodyRelationsRelations();
            return TeaModel.build(map, self);
        }

        public QueryContentResponseBodyRelationsRelations setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryContentResponseBodyRelationsRelations setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public QueryContentResponseBodyRelationsRelations setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryContentResponseBodyRelationsRelations setSourceEntity(String sourceEntity) {
            this.sourceEntity = sourceEntity;
            return this;
        }
        public String getSourceEntity() {
            return this.sourceEntity;
        }

        public QueryContentResponseBodyRelationsRelations setTargetEntity(String targetEntity) {
            this.targetEntity = targetEntity;
            return this;
        }
        public String getTargetEntity() {
            return this.targetEntity;
        }

    }

    public static class QueryContentResponseBodyRelations extends TeaModel {
        @NameInMap("relations")
        public java.util.List<QueryContentResponseBodyRelationsRelations> relations;

        public static QueryContentResponseBodyRelations build(java.util.Map<String, ?> map) throws Exception {
            QueryContentResponseBodyRelations self = new QueryContentResponseBodyRelations();
            return TeaModel.build(map, self);
        }

        public QueryContentResponseBodyRelations setRelations(java.util.List<QueryContentResponseBodyRelationsRelations> relations) {
            this.relations = relations;
            return this;
        }
        public java.util.List<QueryContentResponseBodyRelationsRelations> getRelations() {
            return this.relations;
        }

    }

    public static class QueryContentResponseBodyUsage extends TeaModel {
        /**
         * <p>The number of entries used for vectorization.</p>
         * <blockquote>
         * <p>An entry refers to the number of processing items when performing vectorization on text or images. For example, processing one piece of text counts as 1 entry, while processing one image counts as 2 entries.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("EmbeddingEntries")
        public String embeddingEntries;

        /**
         * <p>Number of tokens used for vectorization.</p>
         * <blockquote>
         * <p>A token refers to the smallest unit into which the input text is divided; a token can be a word, a phrase, a punctuation mark, or a character, etc.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
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

    public static class QueryContentResponseBodyWindowMatchesWindowMatchesWindowMatchWindowMatch extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("Id")
        public String id;

        @NameInMap("LoaderMetadata")
        public String loaderMetadata;

        @NameInMap("Metadata")
        public java.util.Map<String, String> metadata;

        public static QueryContentResponseBodyWindowMatchesWindowMatchesWindowMatchWindowMatch build(java.util.Map<String, ?> map) throws Exception {
            QueryContentResponseBodyWindowMatchesWindowMatchesWindowMatchWindowMatch self = new QueryContentResponseBodyWindowMatchesWindowMatchesWindowMatchWindowMatch();
            return TeaModel.build(map, self);
        }

        public QueryContentResponseBodyWindowMatchesWindowMatchesWindowMatchWindowMatch setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public QueryContentResponseBodyWindowMatchesWindowMatchesWindowMatchWindowMatch setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public QueryContentResponseBodyWindowMatchesWindowMatchesWindowMatchWindowMatch setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryContentResponseBodyWindowMatchesWindowMatchesWindowMatchWindowMatch setLoaderMetadata(String loaderMetadata) {
            this.loaderMetadata = loaderMetadata;
            return this;
        }
        public String getLoaderMetadata() {
            return this.loaderMetadata;
        }

        public QueryContentResponseBodyWindowMatchesWindowMatchesWindowMatchWindowMatch setMetadata(java.util.Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }
        public java.util.Map<String, String> getMetadata() {
            return this.metadata;
        }

    }

    public static class QueryContentResponseBodyWindowMatchesWindowMatchesWindowMatch extends TeaModel {
        @NameInMap("windowMatch")
        public java.util.List<QueryContentResponseBodyWindowMatchesWindowMatchesWindowMatchWindowMatch> windowMatch;

        public static QueryContentResponseBodyWindowMatchesWindowMatchesWindowMatch build(java.util.Map<String, ?> map) throws Exception {
            QueryContentResponseBodyWindowMatchesWindowMatchesWindowMatch self = new QueryContentResponseBodyWindowMatchesWindowMatchesWindowMatch();
            return TeaModel.build(map, self);
        }

        public QueryContentResponseBodyWindowMatchesWindowMatchesWindowMatch setWindowMatch(java.util.List<QueryContentResponseBodyWindowMatchesWindowMatchesWindowMatchWindowMatch> windowMatch) {
            this.windowMatch = windowMatch;
            return this;
        }
        public java.util.List<QueryContentResponseBodyWindowMatchesWindowMatchesWindowMatchWindowMatch> getWindowMatch() {
            return this.windowMatch;
        }

    }

    public static class QueryContentResponseBodyWindowMatchesWindowMatches extends TeaModel {
        @NameInMap("WindowMatch")
        public QueryContentResponseBodyWindowMatchesWindowMatchesWindowMatch windowMatch;

        public static QueryContentResponseBodyWindowMatchesWindowMatches build(java.util.Map<String, ?> map) throws Exception {
            QueryContentResponseBodyWindowMatchesWindowMatches self = new QueryContentResponseBodyWindowMatchesWindowMatches();
            return TeaModel.build(map, self);
        }

        public QueryContentResponseBodyWindowMatchesWindowMatches setWindowMatch(QueryContentResponseBodyWindowMatchesWindowMatchesWindowMatch windowMatch) {
            this.windowMatch = windowMatch;
            return this;
        }
        public QueryContentResponseBodyWindowMatchesWindowMatchesWindowMatch getWindowMatch() {
            return this.windowMatch;
        }

    }

    public static class QueryContentResponseBodyWindowMatches extends TeaModel {
        @NameInMap("windowMatches")
        public java.util.List<QueryContentResponseBodyWindowMatchesWindowMatches> windowMatches;

        public static QueryContentResponseBodyWindowMatches build(java.util.Map<String, ?> map) throws Exception {
            QueryContentResponseBodyWindowMatches self = new QueryContentResponseBodyWindowMatches();
            return TeaModel.build(map, self);
        }

        public QueryContentResponseBodyWindowMatches setWindowMatches(java.util.List<QueryContentResponseBodyWindowMatchesWindowMatches> windowMatches) {
            this.windowMatches = windowMatches;
            return this;
        }
        public java.util.List<QueryContentResponseBodyWindowMatchesWindowMatches> getWindowMatches() {
            return this.windowMatches;
        }

    }

}
