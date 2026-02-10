// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class QueryKnowledgeBasesContentResponseBody extends TeaModel {
    /**
     * <p>The number of tokens that are used during vectorization.</p>
     * <blockquote>
     * <p> A token is the minimum unit for segmenting text. A token can be a word, phrase, punctuation, or character.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("EmbeddingTokens")
    public String embeddingTokens;

    @NameInMap("Entities")
    public QueryKnowledgeBasesContentResponseBodyEntities entities;

    @NameInMap("Matches")
    public QueryKnowledgeBasesContentResponseBodyMatches matches;

    /**
     * <p>The returned information.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Relations")
    public QueryKnowledgeBasesContentResponseBodyRelations relations;

    /**
     * <p>The unique ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the operation. Valid values:</p>
     * <ul>
     * <li><strong>success</strong>.</li>
     * <li><strong>fail</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The total number of tokens that are consumed by this query.</p>
     */
    @NameInMap("Usage")
    public QueryKnowledgeBasesContentResponseBodyUsage usage;

    public static QueryKnowledgeBasesContentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryKnowledgeBasesContentResponseBody self = new QueryKnowledgeBasesContentResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryKnowledgeBasesContentResponseBody setEmbeddingTokens(String embeddingTokens) {
        this.embeddingTokens = embeddingTokens;
        return this;
    }
    public String getEmbeddingTokens() {
        return this.embeddingTokens;
    }

    public QueryKnowledgeBasesContentResponseBody setEntities(QueryKnowledgeBasesContentResponseBodyEntities entities) {
        this.entities = entities;
        return this;
    }
    public QueryKnowledgeBasesContentResponseBodyEntities getEntities() {
        return this.entities;
    }

    public QueryKnowledgeBasesContentResponseBody setMatches(QueryKnowledgeBasesContentResponseBodyMatches matches) {
        this.matches = matches;
        return this;
    }
    public QueryKnowledgeBasesContentResponseBodyMatches getMatches() {
        return this.matches;
    }

    public QueryKnowledgeBasesContentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryKnowledgeBasesContentResponseBody setRelations(QueryKnowledgeBasesContentResponseBodyRelations relations) {
        this.relations = relations;
        return this;
    }
    public QueryKnowledgeBasesContentResponseBodyRelations getRelations() {
        return this.relations;
    }

    public QueryKnowledgeBasesContentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryKnowledgeBasesContentResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryKnowledgeBasesContentResponseBody setUsage(QueryKnowledgeBasesContentResponseBodyUsage usage) {
        this.usage = usage;
        return this;
    }
    public QueryKnowledgeBasesContentResponseBodyUsage getUsage() {
        return this.usage;
    }

    public static class QueryKnowledgeBasesContentResponseBodyEntitiesEntities extends TeaModel {
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

        public static QueryKnowledgeBasesContentResponseBodyEntitiesEntities build(java.util.Map<String, ?> map) throws Exception {
            QueryKnowledgeBasesContentResponseBodyEntitiesEntities self = new QueryKnowledgeBasesContentResponseBodyEntitiesEntities();
            return TeaModel.build(map, self);
        }

        public QueryKnowledgeBasesContentResponseBodyEntitiesEntities setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryKnowledgeBasesContentResponseBodyEntitiesEntities setEntity(String entity) {
            this.entity = entity;
            return this;
        }
        public String getEntity() {
            return this.entity;
        }

        public QueryKnowledgeBasesContentResponseBodyEntitiesEntities setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public QueryKnowledgeBasesContentResponseBodyEntitiesEntities setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryKnowledgeBasesContentResponseBodyEntitiesEntities setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryKnowledgeBasesContentResponseBodyEntities extends TeaModel {
        @NameInMap("entities")
        public java.util.List<QueryKnowledgeBasesContentResponseBodyEntitiesEntities> entities;

        public static QueryKnowledgeBasesContentResponseBodyEntities build(java.util.Map<String, ?> map) throws Exception {
            QueryKnowledgeBasesContentResponseBodyEntities self = new QueryKnowledgeBasesContentResponseBodyEntities();
            return TeaModel.build(map, self);
        }

        public QueryKnowledgeBasesContentResponseBodyEntities setEntities(java.util.List<QueryKnowledgeBasesContentResponseBodyEntitiesEntities> entities) {
            this.entities = entities;
            return this;
        }
        public java.util.List<QueryKnowledgeBasesContentResponseBodyEntitiesEntities> getEntities() {
            return this.entities;
        }

    }

    public static class QueryKnowledgeBasesContentResponseBodyMatchesMatchList extends TeaModel {
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

        public static QueryKnowledgeBasesContentResponseBodyMatchesMatchList build(java.util.Map<String, ?> map) throws Exception {
            QueryKnowledgeBasesContentResponseBodyMatchesMatchList self = new QueryKnowledgeBasesContentResponseBodyMatchesMatchList();
            return TeaModel.build(map, self);
        }

        public QueryKnowledgeBasesContentResponseBodyMatchesMatchList setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public QueryKnowledgeBasesContentResponseBodyMatchesMatchList setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public QueryKnowledgeBasesContentResponseBodyMatchesMatchList setFileURL(String fileURL) {
            this.fileURL = fileURL;
            return this;
        }
        public String getFileURL() {
            return this.fileURL;
        }

        public QueryKnowledgeBasesContentResponseBodyMatchesMatchList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryKnowledgeBasesContentResponseBodyMatchesMatchList setLoaderMetadata(String loaderMetadata) {
            this.loaderMetadata = loaderMetadata;
            return this;
        }
        public String getLoaderMetadata() {
            return this.loaderMetadata;
        }

        public QueryKnowledgeBasesContentResponseBodyMatchesMatchList setMetadata(java.util.Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }
        public java.util.Map<String, String> getMetadata() {
            return this.metadata;
        }

        public QueryKnowledgeBasesContentResponseBodyMatchesMatchList setRerankScore(Double rerankScore) {
            this.rerankScore = rerankScore;
            return this;
        }
        public Double getRerankScore() {
            return this.rerankScore;
        }

        public QueryKnowledgeBasesContentResponseBodyMatchesMatchList setRetrievalSource(Integer retrievalSource) {
            this.retrievalSource = retrievalSource;
            return this;
        }
        public Integer getRetrievalSource() {
            return this.retrievalSource;
        }

        public QueryKnowledgeBasesContentResponseBodyMatchesMatchList setScore(Double score) {
            this.score = score;
            return this;
        }
        public Double getScore() {
            return this.score;
        }

    }

    public static class QueryKnowledgeBasesContentResponseBodyMatches extends TeaModel {
        @NameInMap("MatchList")
        public java.util.List<QueryKnowledgeBasesContentResponseBodyMatchesMatchList> matchList;

        public static QueryKnowledgeBasesContentResponseBodyMatches build(java.util.Map<String, ?> map) throws Exception {
            QueryKnowledgeBasesContentResponseBodyMatches self = new QueryKnowledgeBasesContentResponseBodyMatches();
            return TeaModel.build(map, self);
        }

        public QueryKnowledgeBasesContentResponseBodyMatches setMatchList(java.util.List<QueryKnowledgeBasesContentResponseBodyMatchesMatchList> matchList) {
            this.matchList = matchList;
            return this;
        }
        public java.util.List<QueryKnowledgeBasesContentResponseBodyMatchesMatchList> getMatchList() {
            return this.matchList;
        }

    }

    public static class QueryKnowledgeBasesContentResponseBodyRelationsRelations extends TeaModel {
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

        public static QueryKnowledgeBasesContentResponseBodyRelationsRelations build(java.util.Map<String, ?> map) throws Exception {
            QueryKnowledgeBasesContentResponseBodyRelationsRelations self = new QueryKnowledgeBasesContentResponseBodyRelationsRelations();
            return TeaModel.build(map, self);
        }

        public QueryKnowledgeBasesContentResponseBodyRelationsRelations setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryKnowledgeBasesContentResponseBodyRelationsRelations setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public QueryKnowledgeBasesContentResponseBodyRelationsRelations setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryKnowledgeBasesContentResponseBodyRelationsRelations setSourceEntity(String sourceEntity) {
            this.sourceEntity = sourceEntity;
            return this;
        }
        public String getSourceEntity() {
            return this.sourceEntity;
        }

        public QueryKnowledgeBasesContentResponseBodyRelationsRelations setTargetEntity(String targetEntity) {
            this.targetEntity = targetEntity;
            return this;
        }
        public String getTargetEntity() {
            return this.targetEntity;
        }

    }

    public static class QueryKnowledgeBasesContentResponseBodyRelations extends TeaModel {
        @NameInMap("relations")
        public java.util.List<QueryKnowledgeBasesContentResponseBodyRelationsRelations> relations;

        public static QueryKnowledgeBasesContentResponseBodyRelations build(java.util.Map<String, ?> map) throws Exception {
            QueryKnowledgeBasesContentResponseBodyRelations self = new QueryKnowledgeBasesContentResponseBodyRelations();
            return TeaModel.build(map, self);
        }

        public QueryKnowledgeBasesContentResponseBodyRelations setRelations(java.util.List<QueryKnowledgeBasesContentResponseBodyRelationsRelations> relations) {
            this.relations = relations;
            return this;
        }
        public java.util.List<QueryKnowledgeBasesContentResponseBodyRelationsRelations> getRelations() {
            return this.relations;
        }

    }

    public static class QueryKnowledgeBasesContentResponseBodyUsage extends TeaModel {
        /**
         * <p>The number of entries that are used during vectorization.</p>
         * <blockquote>
         * <p> An entry refers to a single unit of vectorization processing. Processing one text input counts as 1 entry, while processing one image counts as 2 entries.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("EmbeddingEntries")
        public String embeddingEntries;

        /**
         * <p>The number of tokens that are used for vectorization.</p>
         * <blockquote>
         * <p> A token is the minimum unit for splitting text. A token can be a word, phrase, punctuation, or character.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>475</p>
         */
        @NameInMap("EmbeddingTokens")
        public String embeddingTokens;

        public static QueryKnowledgeBasesContentResponseBodyUsage build(java.util.Map<String, ?> map) throws Exception {
            QueryKnowledgeBasesContentResponseBodyUsage self = new QueryKnowledgeBasesContentResponseBodyUsage();
            return TeaModel.build(map, self);
        }

        public QueryKnowledgeBasesContentResponseBodyUsage setEmbeddingEntries(String embeddingEntries) {
            this.embeddingEntries = embeddingEntries;
            return this;
        }
        public String getEmbeddingEntries() {
            return this.embeddingEntries;
        }

        public QueryKnowledgeBasesContentResponseBodyUsage setEmbeddingTokens(String embeddingTokens) {
            this.embeddingTokens = embeddingTokens;
            return this;
        }
        public String getEmbeddingTokens() {
            return this.embeddingTokens;
        }

    }

}
