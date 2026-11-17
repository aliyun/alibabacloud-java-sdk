// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class RetrieveKnowledgePointsResponseBody extends TeaModel {
    /**
     * <p>The business error code. This field may be omitted if the request succeeds. If the request fails, the common error response protocol applies.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidParameter</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The knowledge point summaries, relationship paths, ambiguity candidates, and warnings for the current search.</p>
     */
    @NameInMap("Data")
    public RetrieveKnowledgePointsResponseBodyData data;

    /**
     * <p>A human-readable description of the business error. This field may be omitted if the request succeeds. Provide the RequestId when troubleshooting failures.</p>
     * 
     * <strong>example:</strong>
     * <p>The request parameters are invalid.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique identifier of the request. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>00000000-0000-4000-8000-000000000001</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static RetrieveKnowledgePointsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RetrieveKnowledgePointsResponseBody self = new RetrieveKnowledgePointsResponseBody();
        return TeaModel.build(map, self);
    }

    public RetrieveKnowledgePointsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RetrieveKnowledgePointsResponseBody setData(RetrieveKnowledgePointsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RetrieveKnowledgePointsResponseBodyData getData() {
        return this.data;
    }

    public RetrieveKnowledgePointsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RetrieveKnowledgePointsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RetrieveKnowledgePointsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RetrieveKnowledgePointsResponseBodyDataAmbiguitiesCandidates extends TeaModel {
        /**
         * <p>The location ID of the knowledge point. Copy this value exactly as it appears in the search results and use it together with the corresponding KnowledgeBaseId and Type. Do not parse or convert this value.</p>
         * 
         * <strong>example:</strong>
         * <p>node-sales</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The ID of the knowledge base to which the knowledge point belongs. This parameter is used together with Type and Id to locate the knowledge point.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678-1234-4234-8234-123456789abc</p>
         */
        @NameInMap("KnowledgeBaseId")
        public String knowledgeBaseId;

        /**
         * <p>The display title of the current knowledge point.</p>
         * 
         * <strong>example:</strong>
         * <p>Sales revenue</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The read category of the knowledge point. Use GRAPH for the current focus objects and graph nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>GRAPH</p>
         */
        @NameInMap("Type")
        public String type;

        public static RetrieveKnowledgePointsResponseBodyDataAmbiguitiesCandidates build(java.util.Map<String, ?> map) throws Exception {
            RetrieveKnowledgePointsResponseBodyDataAmbiguitiesCandidates self = new RetrieveKnowledgePointsResponseBodyDataAmbiguitiesCandidates();
            return TeaModel.build(map, self);
        }

        public RetrieveKnowledgePointsResponseBodyDataAmbiguitiesCandidates setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public RetrieveKnowledgePointsResponseBodyDataAmbiguitiesCandidates setKnowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }
        public String getKnowledgeBaseId() {
            return this.knowledgeBaseId;
        }

        public RetrieveKnowledgePointsResponseBodyDataAmbiguitiesCandidates setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public RetrieveKnowledgePointsResponseBodyDataAmbiguitiesCandidates setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class RetrieveKnowledgePointsResponseBodyDataAmbiguities extends TeaModel {
        /**
         * <p>The candidate graph nodes when ambiguity exists. Each candidate carries the KnowledgeBaseId, Type, and Id for reading details, which does not indicate that the user has confirmed the selection.</p>
         */
        @NameInMap("Candidates")
        public java.util.List<RetrieveKnowledgePointsResponseBodyDataAmbiguitiesCandidates> candidates;

        /**
         * <p>The name or description of the object whose referent is not yet determined in the query.</p>
         * 
         * <strong>example:</strong>
         * <p>Sales revenue</p>
         */
        @NameInMap("Mention")
        public String mention;

        public static RetrieveKnowledgePointsResponseBodyDataAmbiguities build(java.util.Map<String, ?> map) throws Exception {
            RetrieveKnowledgePointsResponseBodyDataAmbiguities self = new RetrieveKnowledgePointsResponseBodyDataAmbiguities();
            return TeaModel.build(map, self);
        }

        public RetrieveKnowledgePointsResponseBodyDataAmbiguities setCandidates(java.util.List<RetrieveKnowledgePointsResponseBodyDataAmbiguitiesCandidates> candidates) {
            this.candidates = candidates;
            return this;
        }
        public java.util.List<RetrieveKnowledgePointsResponseBodyDataAmbiguitiesCandidates> getCandidates() {
            return this.candidates;
        }

        public RetrieveKnowledgePointsResponseBodyDataAmbiguities setMention(String mention) {
            this.mention = mention;
            return this;
        }
        public String getMention() {
            return this.mention;
        }

    }

    public static class RetrieveKnowledgePointsResponseBodyDataPathsEdges extends TeaModel {
        /**
         * <p>The Id of the start node in the Nodes array of the same path.</p>
         * 
         * <strong>example:</strong>
         * <p>node-sales</p>
         */
        @NameInMap("FromId")
        public String fromId;

        /**
         * <p>The public relationship type directed from the start node to the end node. For example, CALCULATED_FROM indicates that the start node is calculated based on the end node. You cannot infer the complete formula based solely on the relationship type.</p>
         * 
         * <strong>example:</strong>
         * <p>CALCULATED_FROM</p>
         */
        @NameInMap("RelationType")
        public String relationType;

        /**
         * <p>The Id of the end node in the Nodes array of the same path.</p>
         * 
         * <strong>example:</strong>
         * <p>node-orders</p>
         */
        @NameInMap("ToId")
        public String toId;

        public static RetrieveKnowledgePointsResponseBodyDataPathsEdges build(java.util.Map<String, ?> map) throws Exception {
            RetrieveKnowledgePointsResponseBodyDataPathsEdges self = new RetrieveKnowledgePointsResponseBodyDataPathsEdges();
            return TeaModel.build(map, self);
        }

        public RetrieveKnowledgePointsResponseBodyDataPathsEdges setFromId(String fromId) {
            this.fromId = fromId;
            return this;
        }
        public String getFromId() {
            return this.fromId;
        }

        public RetrieveKnowledgePointsResponseBodyDataPathsEdges setRelationType(String relationType) {
            this.relationType = relationType;
            return this;
        }
        public String getRelationType() {
            return this.relationType;
        }

        public RetrieveKnowledgePointsResponseBodyDataPathsEdges setToId(String toId) {
            this.toId = toId;
            return this;
        }
        public String getToId() {
            return this.toId;
        }

    }

    public static class RetrieveKnowledgePointsResponseBodyDataPathsNodes extends TeaModel {
        /**
         * <p>The location ID of the knowledge point. Copy this value exactly as it appears in the search results and use it together with the corresponding KnowledgeBaseId and Type. Do not parse or convert this value.</p>
         * 
         * <strong>example:</strong>
         * <p>node-sales</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The ID of the knowledge base to which the knowledge point belongs. This parameter is used together with Type and Id to locate the knowledge point.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678-1234-4234-8234-123456789abc</p>
         */
        @NameInMap("KnowledgeBaseId")
        public String knowledgeBaseId;

        /**
         * <p>The display title of the current knowledge point.</p>
         * 
         * <strong>example:</strong>
         * <p>Sales revenue</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The read category of the knowledge point. Use GRAPH for the current focus objects and graph nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>GRAPH</p>
         */
        @NameInMap("Type")
        public String type;

        public static RetrieveKnowledgePointsResponseBodyDataPathsNodes build(java.util.Map<String, ?> map) throws Exception {
            RetrieveKnowledgePointsResponseBodyDataPathsNodes self = new RetrieveKnowledgePointsResponseBodyDataPathsNodes();
            return TeaModel.build(map, self);
        }

        public RetrieveKnowledgePointsResponseBodyDataPathsNodes setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public RetrieveKnowledgePointsResponseBodyDataPathsNodes setKnowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }
        public String getKnowledgeBaseId() {
            return this.knowledgeBaseId;
        }

        public RetrieveKnowledgePointsResponseBodyDataPathsNodes setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public RetrieveKnowledgePointsResponseBodyDataPathsNodes setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class RetrieveKnowledgePointsResponseBodyDataPaths extends TeaModel {
        /**
         * <p>The directed relationships that connect the nodes in the Nodes array of the current path.</p>
         */
        @NameInMap("Edges")
        public java.util.List<RetrieveKnowledgePointsResponseBodyDataPathsEdges> edges;

        /**
         * <p>The graph nodes in the relationship path. You can read the details of each node by using its KnowledgeBaseId, Type, and Id.</p>
         */
        @NameInMap("Nodes")
        public java.util.List<RetrieveKnowledgePointsResponseBodyDataPathsNodes> nodes;

        public static RetrieveKnowledgePointsResponseBodyDataPaths build(java.util.Map<String, ?> map) throws Exception {
            RetrieveKnowledgePointsResponseBodyDataPaths self = new RetrieveKnowledgePointsResponseBodyDataPaths();
            return TeaModel.build(map, self);
        }

        public RetrieveKnowledgePointsResponseBodyDataPaths setEdges(java.util.List<RetrieveKnowledgePointsResponseBodyDataPathsEdges> edges) {
            this.edges = edges;
            return this;
        }
        public java.util.List<RetrieveKnowledgePointsResponseBodyDataPathsEdges> getEdges() {
            return this.edges;
        }

        public RetrieveKnowledgePointsResponseBodyDataPaths setNodes(java.util.List<RetrieveKnowledgePointsResponseBodyDataPathsNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<RetrieveKnowledgePointsResponseBodyDataPathsNodes> getNodes() {
            return this.nodes;
        }

    }

    public static class RetrieveKnowledgePointsResponseBodyDataResultsSources extends TeaModel {
        /**
         * <p>The temporary HTTPS download URL of the original file. The URL is valid for 2 hours. This parameter is returned only when the source can be reliably located and the caller has read permissions for the original file. Do not forward the URL publicly or store it for a long time.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/sales-policy.pdf">https://example.com/sales-policy.pdf</a></p>
         */
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        /**
         * <p>The expiration time of the download URL. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1794376800000</p>
         */
        @NameInMap("ExpirationTime")
        public Long expirationTime;

        /**
         * <p>The full file name of the original document used for building. This is not the name of the current knowledge point segment.</p>
         * 
         * <strong>example:</strong>
         * <p>Sales_policy.pdf</p>
         */
        @NameInMap("FileName")
        public String fileName;

        public static RetrieveKnowledgePointsResponseBodyDataResultsSources build(java.util.Map<String, ?> map) throws Exception {
            RetrieveKnowledgePointsResponseBodyDataResultsSources self = new RetrieveKnowledgePointsResponseBodyDataResultsSources();
            return TeaModel.build(map, self);
        }

        public RetrieveKnowledgePointsResponseBodyDataResultsSources setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public RetrieveKnowledgePointsResponseBodyDataResultsSources setExpirationTime(Long expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }
        public Long getExpirationTime() {
            return this.expirationTime;
        }

        public RetrieveKnowledgePointsResponseBodyDataResultsSources setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

    }

    public static class RetrieveKnowledgePointsResponseBodyDataResults extends TeaModel {
        /**
         * <p>The location ID of the knowledge point. Copy this value exactly as it appears in the search results and use it together with the corresponding KnowledgeBaseId and Type. Do not parse or convert this value.</p>
         * 
         * <strong>example:</strong>
         * <p>node-sales</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The ID of the knowledge base to which the knowledge point belongs. This parameter is used together with Type and Id to locate the knowledge point.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678-1234-4234-8234-123456789abc</p>
         */
        @NameInMap("KnowledgeBaseId")
        public String knowledgeBaseId;

        /**
         * <p>The download information of the uploaded original documents explicitly associated with the current content. This parameter is omitted if no reliable source is available or if the caller lacks read permissions for the original files. The ability to retrieve knowledge points does not imply the permission to download the complete original files.</p>
         */
        @NameInMap("Sources")
        public java.util.List<RetrieveKnowledgePointsResponseBodyDataResultsSources> sources;

        /**
         * <p>The readable summary of the knowledge point. The summary is not guaranteed to contain the complete content. To obtain details, call GetKnowledgePoint.</p>
         * 
         * <strong>example:</strong>
         * <p>The sales revenue metric and its associated order table</p>
         */
        @NameInMap("Summary")
        public String summary;

        /**
         * <p>The display title of the current knowledge point.</p>
         * 
         * <strong>example:</strong>
         * <p>Sales revenue</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The read category of the knowledge point. GRAPH indicates a local graph, WIKI indicates a topic page, and KNOWLEDGE_CONTENT indicates knowledge content.</p>
         * 
         * <strong>example:</strong>
         * <p>GRAPH</p>
         */
        @NameInMap("Type")
        public String type;

        public static RetrieveKnowledgePointsResponseBodyDataResults build(java.util.Map<String, ?> map) throws Exception {
            RetrieveKnowledgePointsResponseBodyDataResults self = new RetrieveKnowledgePointsResponseBodyDataResults();
            return TeaModel.build(map, self);
        }

        public RetrieveKnowledgePointsResponseBodyDataResults setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public RetrieveKnowledgePointsResponseBodyDataResults setKnowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }
        public String getKnowledgeBaseId() {
            return this.knowledgeBaseId;
        }

        public RetrieveKnowledgePointsResponseBodyDataResults setSources(java.util.List<RetrieveKnowledgePointsResponseBodyDataResultsSources> sources) {
            this.sources = sources;
            return this;
        }
        public java.util.List<RetrieveKnowledgePointsResponseBodyDataResultsSources> getSources() {
            return this.sources;
        }

        public RetrieveKnowledgePointsResponseBodyDataResults setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public RetrieveKnowledgePointsResponseBodyDataResults setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public RetrieveKnowledgePointsResponseBodyDataResults setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class RetrieveKnowledgePointsResponseBodyDataWarnings extends TeaModel {
        /**
         * <p>The truncation or degradation warning code. For example, CONTENT_TRUNCATED indicates that the content is truncated, and SOURCE_UNAVAILABLE indicates that the original file download is temporarily unavailable.</p>
         * 
         * <strong>example:</strong>
         * <p>CONTENT_TRUNCATED</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The sanitized readable description of the current warning. Use Code for programmatic judgment instead of relying on the text.</p>
         * 
         * <strong>example:</strong>
         * <p>Some content exceeds the length limit and has been truncated</p>
         */
        @NameInMap("Message")
        public String message;

        public static RetrieveKnowledgePointsResponseBodyDataWarnings build(java.util.Map<String, ?> map) throws Exception {
            RetrieveKnowledgePointsResponseBodyDataWarnings self = new RetrieveKnowledgePointsResponseBodyDataWarnings();
            return TeaModel.build(map, self);
        }

        public RetrieveKnowledgePointsResponseBodyDataWarnings setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public RetrieveKnowledgePointsResponseBodyDataWarnings setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class RetrieveKnowledgePointsResponseBodyData extends TeaModel {
        /**
         * <p>The ambiguity descriptions and candidate objects returned when the target is not yet confirmed.</p>
         */
        @NameInMap("Ambiguities")
        public java.util.List<RetrieveKnowledgePointsResponseBodyDataAmbiguities> ambiguities;

        /**
         * <p>The relationship paths matched by the search. Path indexes do not correspond to indexes in the Results array. The paths may cover only a subset of relationships.</p>
         */
        @NameInMap("Paths")
        public java.util.List<RetrieveKnowledgePointsResponseBodyDataPaths> paths;

        /**
         * <p>Knowledge point summaries ranked by relevance across all knowledge bases. The total number of results does not exceed MaxResults. Results can include GRAPH, WIKI, and KNOWLEDGE_CONTENT.</p>
         */
        @NameInMap("Results")
        public java.util.List<RetrieveKnowledgePointsResponseBodyDataResults> results;

        /**
         * <p>The truncation, scope limitation, or degradation warnings for the current call. Use Code for programmatic judgment. Message is for reading purposes only.</p>
         */
        @NameInMap("Warnings")
        public java.util.List<RetrieveKnowledgePointsResponseBodyDataWarnings> warnings;

        public static RetrieveKnowledgePointsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RetrieveKnowledgePointsResponseBodyData self = new RetrieveKnowledgePointsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RetrieveKnowledgePointsResponseBodyData setAmbiguities(java.util.List<RetrieveKnowledgePointsResponseBodyDataAmbiguities> ambiguities) {
            this.ambiguities = ambiguities;
            return this;
        }
        public java.util.List<RetrieveKnowledgePointsResponseBodyDataAmbiguities> getAmbiguities() {
            return this.ambiguities;
        }

        public RetrieveKnowledgePointsResponseBodyData setPaths(java.util.List<RetrieveKnowledgePointsResponseBodyDataPaths> paths) {
            this.paths = paths;
            return this;
        }
        public java.util.List<RetrieveKnowledgePointsResponseBodyDataPaths> getPaths() {
            return this.paths;
        }

        public RetrieveKnowledgePointsResponseBodyData setResults(java.util.List<RetrieveKnowledgePointsResponseBodyDataResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<RetrieveKnowledgePointsResponseBodyDataResults> getResults() {
            return this.results;
        }

        public RetrieveKnowledgePointsResponseBodyData setWarnings(java.util.List<RetrieveKnowledgePointsResponseBodyDataWarnings> warnings) {
            this.warnings = warnings;
            return this;
        }
        public java.util.List<RetrieveKnowledgePointsResponseBodyDataWarnings> getWarnings() {
            return this.warnings;
        }

    }

}
