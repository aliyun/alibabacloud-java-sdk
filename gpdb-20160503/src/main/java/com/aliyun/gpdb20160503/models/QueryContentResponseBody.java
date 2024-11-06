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

    /**
     * <p>The retrieved data.</p>
     */
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

    /**
     * <p>List of windowed matches.</p>
     */
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

    public QueryContentResponseBody setWindowMatches(QueryContentResponseBodyWindowMatches windowMatches) {
        this.windowMatches = windowMatches;
        return this;
    }
    public QueryContentResponseBodyWindowMatches getWindowMatches() {
        return this.windowMatches;
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
        /**
         * <p>The content that is used for full-text search. If you leave this parameter empty, only vector search is used. If you do not leave this parameter empty, two-way retrieval based on vector search and full-text search is used.</p>
         * <blockquote>
         * <p> You must specify at least one of the Content and Vector parameters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Cloud-native data warehouse AnalyticDB PostgreSQL Edition provides a simple, fast, and cost-effective PB-level cloud data warehouse solution.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The name of the document.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/2618453.html">ListDocuments</a> operation to query a list of documents.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>my_doc.txt</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The public URL of the query result image, valid for 2 hours</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxx-cn-beijing.aliyuncs.com/image/test.png">https://xxx-cn-beijing.aliyuncs.com/image/test.png</a></p>
         */
        @NameInMap("FileURL")
        public String fileURL;

        /**
         * <p>The unique ID of the vector data.</p>
         * 
         * <strong>example:</strong>
         * <p>doca-1234</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Metadata during document loader loading.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;page_pos&quot;: 1}</p>
         */
        @NameInMap("LoaderMetadata")
        public String loaderMetadata;

        /**
         * <p>The metadata.</p>
         */
        @NameInMap("Metadata")
        public java.util.Map<String, String> metadata;

        /**
         * <p>Re-ranking score.</p>
         * 
         * <strong>example:</strong>
         * <p>6.2345</p>
         */
        @NameInMap("RerankScore")
        public Double rerankScore;

        /**
         * <p>Source of the retrieval results:</p>
         * <ul>
         * <li>1 indicates vector retrieval</li>
         * <li>2 indicates full-text retrieval</li>
         * <li>3 indicates dual-path recall</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RetrievalSource")
        public Integer retrievalSource;

        /**
         * <p>The similarity score of the data. It is related to the <code>l2, ip, or cosine</code> algorithm that is specified when you create an index.</p>
         * 
         * <strong>example:</strong>
         * <p>0.12345</p>
         */
        @NameInMap("Score")
        public Double score;

        /**
         * <p>The vector data. The length of the value must be the same as that of the Dimension parameter in the <a href="https://help.aliyun.com/document_detail/2401497.html">CreateCollection</a> operation.</p>
         * <blockquote>
         * <p> If you leave this parameter empty, only full-text search results are returned.</p>
         * </blockquote>
         */
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
        /**
         * <p>Text content.</p>
         * 
         * <strong>example:</strong>
         * <p>AnalyticDB for PostgreSQL is a cloud-native data warehouse service that provides large-scale parallel processing (MPP) capabilities for massive online data analysis.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>File name.</p>
         * 
         * <strong>example:</strong>
         * <p>my_doc.txt</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>Unique ID of the vector data.</p>
         * 
         * <strong>example:</strong>
         * <p>doca-2345</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Metadata information when the document loader was loaded.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;page_pos&quot;: 2}</p>
         */
        @NameInMap("LoaderMetadata")
        public String loaderMetadata;

        /**
         * <p>Metadata map.</p>
         */
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
        /**
         * <p>List of individual top windowed matches.</p>
         */
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
