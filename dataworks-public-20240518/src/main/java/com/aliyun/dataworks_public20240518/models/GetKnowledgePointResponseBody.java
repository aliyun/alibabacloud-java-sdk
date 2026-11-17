// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetKnowledgePointResponseBody extends TeaModel {
    /**
     * <p>The business error code. This field may be omitted if the request succeeds. If the request fails, the common error response protocol applies.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidParameter</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The typed details of a single knowledge point. Only the item corresponding to the Type value is returned among Graph, Wiki, and KnowledgeContent.</p>
     */
    @NameInMap("Data")
    public GetKnowledgePointResponseBodyData data;

    /**
     * <p>A human-readable description of the business error. This field may be omitted if the request succeeds. Provide the RequestId when troubleshooting failures.</p>
     * 
     * <strong>example:</strong>
     * <p>The request parameters are invalid.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique identifier of the request, which can be used to troubleshoot issues.</p>
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

    public static GetKnowledgePointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetKnowledgePointResponseBody self = new GetKnowledgePointResponseBody();
        return TeaModel.build(map, self);
    }

    public GetKnowledgePointResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetKnowledgePointResponseBody setData(GetKnowledgePointResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetKnowledgePointResponseBodyData getData() {
        return this.data;
    }

    public GetKnowledgePointResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetKnowledgePointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetKnowledgePointResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetKnowledgePointResponseBodyDataGraphEdgesJoinJoinKeys extends TeaModel {
        /**
         * <p>The name of the association field for the node corresponding to FromNodeId.</p>
         * 
         * <strong>example:</strong>
         * <p>customer_id</p>
         */
        @NameInMap("FromField")
        public String fromField;

        /**
         * <p>The name of the association field for the node corresponding to ToNodeId.</p>
         * 
         * <strong>example:</strong>
         * <p>id</p>
         */
        @NameInMap("ToField")
        public String toField;

        public static GetKnowledgePointResponseBodyDataGraphEdgesJoinJoinKeys build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgePointResponseBodyDataGraphEdgesJoinJoinKeys self = new GetKnowledgePointResponseBodyDataGraphEdgesJoinJoinKeys();
            return TeaModel.build(map, self);
        }

        public GetKnowledgePointResponseBodyDataGraphEdgesJoinJoinKeys setFromField(String fromField) {
            this.fromField = fromField;
            return this;
        }
        public String getFromField() {
            return this.fromField;
        }

        public GetKnowledgePointResponseBodyDataGraphEdgesJoinJoinKeys setToField(String toField) {
            this.toField = toField;
            return this;
        }
        public String getToField() {
            return this.toField;
        }

    }

    public static class GetKnowledgePointResponseBodyDataGraphEdgesJoin extends TeaModel {
        /**
         * <p>The association cardinality from the start node to the end node. Valid values: ONE_TO_ONE, ONE_TO_MANY, MANY_TO_ONE, and MANY_TO_MANY. This parameter is returned when the cardinality is reliable.</p>
         * 
         * <strong>example:</strong>
         * <p>MANY_TO_ONE</p>
         */
        @NameInMap("Cardinality")
        public String cardinality;

        /**
         * <p>The equivalent association field pairing for the nodes at both ends. Composite keys are returned in full.</p>
         */
        @NameInMap("JoinKeys")
        public java.util.List<GetKnowledgePointResponseBodyDataGraphEdgesJoinJoinKeys> joinKeys;

        public static GetKnowledgePointResponseBodyDataGraphEdgesJoin build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgePointResponseBodyDataGraphEdgesJoin self = new GetKnowledgePointResponseBodyDataGraphEdgesJoin();
            return TeaModel.build(map, self);
        }

        public GetKnowledgePointResponseBodyDataGraphEdgesJoin setCardinality(String cardinality) {
            this.cardinality = cardinality;
            return this;
        }
        public String getCardinality() {
            return this.cardinality;
        }

        public GetKnowledgePointResponseBodyDataGraphEdgesJoin setJoinKeys(java.util.List<GetKnowledgePointResponseBodyDataGraphEdgesJoinJoinKeys> joinKeys) {
            this.joinKeys = joinKeys;
            return this;
        }
        public java.util.List<GetKnowledgePointResponseBodyDataGraphEdgesJoinJoinKeys> getJoinKeys() {
            return this.joinKeys;
        }

    }

    public static class GetKnowledgePointResponseBodyDataGraphEdges extends TeaModel {
        /**
         * <p>The readable supplementary description of the current node or relationship. This parameter is omitted when no reliable content is available.</p>
         * 
         * <strong>example:</strong>
         * <p>Sales revenue is calculated based on the actual paid amount of orders</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the relationship in the current knowledge base graph.</p>
         * 
         * <strong>example:</strong>
         * <p>edge-sales-orders</p>
         */
        @NameInMap("EdgeId")
        public String edgeId;

        /**
         * <p>The NodeId of the start node of the relationship. The start node must exist in the Graph.Nodes of the same page.</p>
         * 
         * <strong>example:</strong>
         * <p>node-sales</p>
         */
        @NameInMap("FromNodeId")
        public String fromNodeId;

        /**
         * <p>The typed field association information for verified relationships. This parameter is omitted when no reliable and complete field pairing is available.</p>
         */
        @NameInMap("Join")
        public GetKnowledgePointResponseBodyDataGraphEdgesJoin join;

        /**
         * <p>The ID of the knowledge base to which the knowledge point belongs. This parameter is used together with Type and Id to locate the knowledge point.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678-1234-4234-8234-123456789abc</p>
         */
        @NameInMap("KnowledgeBaseId")
        public String knowledgeBaseId;

        /**
         * <p>The public relationship type from the start node to the end node. For example, CALCULATED_FROM indicates that the start node is calculated based on the end node. You cannot infer the complete formula based solely on the type.</p>
         * 
         * <strong>example:</strong>
         * <p>CALCULATED_FROM</p>
         */
        @NameInMap("RelationType")
        public String relationType;

        /**
         * <p>The NodeId of the end node of the relationship. The end node must exist in the Graph.Nodes of the same page.</p>
         * 
         * <strong>example:</strong>
         * <p>node-orders</p>
         */
        @NameInMap("ToNodeId")
        public String toNodeId;

        public static GetKnowledgePointResponseBodyDataGraphEdges build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgePointResponseBodyDataGraphEdges self = new GetKnowledgePointResponseBodyDataGraphEdges();
            return TeaModel.build(map, self);
        }

        public GetKnowledgePointResponseBodyDataGraphEdges setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetKnowledgePointResponseBodyDataGraphEdges setEdgeId(String edgeId) {
            this.edgeId = edgeId;
            return this;
        }
        public String getEdgeId() {
            return this.edgeId;
        }

        public GetKnowledgePointResponseBodyDataGraphEdges setFromNodeId(String fromNodeId) {
            this.fromNodeId = fromNodeId;
            return this;
        }
        public String getFromNodeId() {
            return this.fromNodeId;
        }

        public GetKnowledgePointResponseBodyDataGraphEdges setJoin(GetKnowledgePointResponseBodyDataGraphEdgesJoin join) {
            this.join = join;
            return this;
        }
        public GetKnowledgePointResponseBodyDataGraphEdgesJoin getJoin() {
            return this.join;
        }

        public GetKnowledgePointResponseBodyDataGraphEdges setKnowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }
        public String getKnowledgeBaseId() {
            return this.knowledgeBaseId;
        }

        public GetKnowledgePointResponseBodyDataGraphEdges setRelationType(String relationType) {
            this.relationType = relationType;
            return this;
        }
        public String getRelationType() {
            return this.relationType;
        }

        public GetKnowledgePointResponseBodyDataGraphEdges setToNodeId(String toNodeId) {
            this.toNodeId = toNodeId;
            return this;
        }
        public String getToNodeId() {
            return this.toNodeId;
        }

    }

    public static class GetKnowledgePointResponseBodyDataGraphNodes extends TeaModel {
        /**
         * <p>The list of reliable aliases for the node. This parameter is omitted when no aliases are available.</p>
         */
        @NameInMap("Aliases")
        public java.util.List<String> aliases;

        /**
         * <p>The reliable business definition of the graph node. This parameter is omitted when no public definition is available.</p>
         * 
         * <strong>example:</strong>
         * <p>The sum of the actual paid amounts of paid orders</p>
         */
        @NameInMap("Definition")
        public String definition;

        /**
         * <p>The readable supplementary description of the current node or relationship. This parameter is omitted when no reliable content is available.</p>
         * 
         * <strong>example:</strong>
         * <p>Sales revenue is calculated based on the actual paid amount of orders</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The asset ID in DataWorks Data Map that can be reliably located. This is not the NodeId of the graph node. This parameter is omitted when no unique and reliable asset mapping is available.</p>
         * 
         * <strong>example:</strong>
         * <p>maxcompute-table:::sales:public:orders</p>
         */
        @NameInMap("EntityId")
        public String entityId;

        /**
         * <p>The ID of the knowledge base to which the knowledge point belongs. This parameter is used together with Type and Id to locate the knowledge point.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678-1234-4234-8234-123456789abc</p>
         */
        @NameInMap("KnowledgeBaseId")
        public String knowledgeBaseId;

        /**
         * <p>The display name of the graph node.</p>
         * 
         * <strong>example:</strong>
         * <p>Sales revenue</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the node in the current knowledge base graph. You can use this value as the Id parameter when Type is set to GRAPH to read the local graph of this node.</p>
         * 
         * <strong>example:</strong>
         * <p>node-sales</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The business category of the graph node, such as TABLE for a data table. This is not the read category of the knowledge point.</p>
         * 
         * <strong>example:</strong>
         * <p>TABLE</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetKnowledgePointResponseBodyDataGraphNodes build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgePointResponseBodyDataGraphNodes self = new GetKnowledgePointResponseBodyDataGraphNodes();
            return TeaModel.build(map, self);
        }

        public GetKnowledgePointResponseBodyDataGraphNodes setAliases(java.util.List<String> aliases) {
            this.aliases = aliases;
            return this;
        }
        public java.util.List<String> getAliases() {
            return this.aliases;
        }

        public GetKnowledgePointResponseBodyDataGraphNodes setDefinition(String definition) {
            this.definition = definition;
            return this;
        }
        public String getDefinition() {
            return this.definition;
        }

        public GetKnowledgePointResponseBodyDataGraphNodes setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetKnowledgePointResponseBodyDataGraphNodes setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public GetKnowledgePointResponseBodyDataGraphNodes setKnowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }
        public String getKnowledgeBaseId() {
            return this.knowledgeBaseId;
        }

        public GetKnowledgePointResponseBodyDataGraphNodes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetKnowledgePointResponseBodyDataGraphNodes setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public GetKnowledgePointResponseBodyDataGraphNodes setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetKnowledgePointResponseBodyDataGraph extends TeaModel {
        /**
         * <p>The visible one-hop adjacency relationships on the current page. At least one end of each edge is the RootNodeId, and both ends are in the Nodes of the current page.</p>
         */
        @NameInMap("Edges")
        public java.util.List<GetKnowledgePointResponseBodyDataGraphEdges> edges;

        /**
         * <p>The ID of the knowledge base to which the knowledge point belongs. This parameter is used together with Type and Id to locate the knowledge point.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678-1234-4234-8234-123456789abc</p>
         */
        @NameInMap("KnowledgeBaseId")
        public String knowledgeBaseId;

        /**
         * <p>All visible endpoints involved by the entry node and the relationships on the current page, deduplicated by NodeId. Subsequent pages still include the entry node.</p>
         */
        @NameInMap("Nodes")
        public java.util.List<GetKnowledgePointResponseBodyDataGraphNodes> nodes;

        /**
         * <p>The ID of the entry node for the current local graph, which is the same as the requested Id.</p>
         * 
         * <strong>example:</strong>
         * <p>node-sales</p>
         */
        @NameInMap("RootNodeId")
        public String rootNodeId;

        /**
         * <p>The time when the current graph was last published. This parameter is returned when the time is reliable.</p>
         * 
         * <strong>example:</strong>
         * <p>1794373200000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static GetKnowledgePointResponseBodyDataGraph build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgePointResponseBodyDataGraph self = new GetKnowledgePointResponseBodyDataGraph();
            return TeaModel.build(map, self);
        }

        public GetKnowledgePointResponseBodyDataGraph setEdges(java.util.List<GetKnowledgePointResponseBodyDataGraphEdges> edges) {
            this.edges = edges;
            return this;
        }
        public java.util.List<GetKnowledgePointResponseBodyDataGraphEdges> getEdges() {
            return this.edges;
        }

        public GetKnowledgePointResponseBodyDataGraph setKnowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }
        public String getKnowledgeBaseId() {
            return this.knowledgeBaseId;
        }

        public GetKnowledgePointResponseBodyDataGraph setNodes(java.util.List<GetKnowledgePointResponseBodyDataGraphNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<GetKnowledgePointResponseBodyDataGraphNodes> getNodes() {
            return this.nodes;
        }

        public GetKnowledgePointResponseBodyDataGraph setRootNodeId(String rootNodeId) {
            this.rootNodeId = rootNodeId;
            return this;
        }
        public String getRootNodeId() {
            return this.rootNodeId;
        }

        public GetKnowledgePointResponseBodyDataGraph setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class GetKnowledgePointResponseBodyDataKnowledgeContentSources extends TeaModel {
        /**
         * <p>The temporary HTTPS download URL of the original file, which is valid for 2 hours. This parameter is returned only when the source can be reliably located and the caller has read permissions for the original file. Do not forward this URL publicly or store it for a long time.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/sales-policy.pdf">https://example.com/sales-policy.pdf</a></p>
         */
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        /**
         * <p>The expiration time of the download URL, in UNIX milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1794376800000</p>
         */
        @NameInMap("ExpirationTime")
        public Long expirationTime;

        /**
         * <p>The full file name of the original document used for building. This is not the name of the current knowledge point fragment.</p>
         * 
         * <strong>example:</strong>
         * <p>Sales_policy.pdf</p>
         */
        @NameInMap("FileName")
        public String fileName;

        public static GetKnowledgePointResponseBodyDataKnowledgeContentSources build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgePointResponseBodyDataKnowledgeContentSources self = new GetKnowledgePointResponseBodyDataKnowledgeContentSources();
            return TeaModel.build(map, self);
        }

        public GetKnowledgePointResponseBodyDataKnowledgeContentSources setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public GetKnowledgePointResponseBodyDataKnowledgeContentSources setExpirationTime(Long expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }
        public Long getExpirationTime() {
            return this.expirationTime;
        }

        public GetKnowledgePointResponseBodyDataKnowledgeContentSources setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

    }

    public static class GetKnowledgePointResponseBodyDataKnowledgeContent extends TeaModel {
        /**
         * <p>The currently public Markdown body. The knowledge content may be a document fragment or a readable projection of structured knowledge, and is not guaranteed to be the full text of the original file.</p>
         * 
         * <strong>example:</strong>
         * <p>Sales revenue is aggregated based on the actual paid amount of paid orders</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The download information of the uploaded original document explicitly associated with the current content. This parameter is omitted when no reliable source is available or when you do not have read permissions for the original file. The ability to retrieve a knowledge point does not imply the ability to download the complete original file.</p>
         */
        @NameInMap("Sources")
        public java.util.List<GetKnowledgePointResponseBodyDataKnowledgeContentSources> sources;

        /**
         * <p>The display title of the current knowledge point.</p>
         * 
         * <strong>example:</strong>
         * <p>Sales revenue</p>
         */
        @NameInMap("Title")
        public String title;

        public static GetKnowledgePointResponseBodyDataKnowledgeContent build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgePointResponseBodyDataKnowledgeContent self = new GetKnowledgePointResponseBodyDataKnowledgeContent();
            return TeaModel.build(map, self);
        }

        public GetKnowledgePointResponseBodyDataKnowledgeContent setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetKnowledgePointResponseBodyDataKnowledgeContent setSources(java.util.List<GetKnowledgePointResponseBodyDataKnowledgeContentSources> sources) {
            this.sources = sources;
            return this;
        }
        public java.util.List<GetKnowledgePointResponseBodyDataKnowledgeContentSources> getSources() {
            return this.sources;
        }

        public GetKnowledgePointResponseBodyDataKnowledgeContent setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class GetKnowledgePointResponseBodyDataWarnings extends TeaModel {
        /**
         * <p>The truncation or degradation prompt code. For example, CONTENT_TRUNCATED indicates that the content is truncated, and SOURCE_UNAVAILABLE indicates that the original file download is temporarily unavailable.</p>
         * 
         * <strong>example:</strong>
         * <p>CONTENT_TRUNCATED</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The sanitized and readable description of the current prompt. Use Code for programmatic judgment instead of relying on the text.</p>
         * 
         * <strong>example:</strong>
         * <p>Some content exceeds the length limit and has been truncated</p>
         */
        @NameInMap("Message")
        public String message;

        public static GetKnowledgePointResponseBodyDataWarnings build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgePointResponseBodyDataWarnings self = new GetKnowledgePointResponseBodyDataWarnings();
            return TeaModel.build(map, self);
        }

        public GetKnowledgePointResponseBodyDataWarnings setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetKnowledgePointResponseBodyDataWarnings setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class GetKnowledgePointResponseBodyDataWikiSources extends TeaModel {
        /**
         * <p>The temporary HTTPS download URL of the original file, which is valid for 2 hours. This parameter is returned only when the source can be reliably located and the caller has read permissions for the original file. Do not forward this URL publicly or store it for a long time.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/sales-policy.pdf">https://example.com/sales-policy.pdf</a></p>
         */
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        /**
         * <p>The expiration time of the download URL, in UNIX milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1794376800000</p>
         */
        @NameInMap("ExpirationTime")
        public Long expirationTime;

        /**
         * <p>The full file name of the original document used for building. This is not the name of the current knowledge point fragment.</p>
         * 
         * <strong>example:</strong>
         * <p>Sales_policy.pdf</p>
         */
        @NameInMap("FileName")
        public String fileName;

        public static GetKnowledgePointResponseBodyDataWikiSources build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgePointResponseBodyDataWikiSources self = new GetKnowledgePointResponseBodyDataWikiSources();
            return TeaModel.build(map, self);
        }

        public GetKnowledgePointResponseBodyDataWikiSources setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public GetKnowledgePointResponseBodyDataWikiSources setExpirationTime(Long expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }
        public Long getExpirationTime() {
            return this.expirationTime;
        }

        public GetKnowledgePointResponseBodyDataWikiSources setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

    }

    public static class GetKnowledgePointResponseBodyDataWiki extends TeaModel {
        /**
         * <p>The currently public Markdown body. The knowledge content may be a document fragment or a readable projection of structured knowledge, and is not guaranteed to be the full text of the original file.</p>
         * 
         * <strong>example:</strong>
         * <p>Sales revenue is aggregated based on the actual paid amount of paid orders</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The download information of the uploaded original document explicitly associated with the current content. This parameter is omitted when no reliable source is available or when you do not have read permissions for the original file. The ability to retrieve a knowledge point does not imply the ability to download the complete original file.</p>
         */
        @NameInMap("Sources")
        public java.util.List<GetKnowledgePointResponseBodyDataWikiSources> sources;

        /**
         * <p>The display title of the current knowledge point.</p>
         * 
         * <strong>example:</strong>
         * <p>Sales revenue</p>
         */
        @NameInMap("Title")
        public String title;

        public static GetKnowledgePointResponseBodyDataWiki build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgePointResponseBodyDataWiki self = new GetKnowledgePointResponseBodyDataWiki();
            return TeaModel.build(map, self);
        }

        public GetKnowledgePointResponseBodyDataWiki setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetKnowledgePointResponseBodyDataWiki setSources(java.util.List<GetKnowledgePointResponseBodyDataWikiSources> sources) {
            this.sources = sources;
            return this;
        }
        public java.util.List<GetKnowledgePointResponseBodyDataWikiSources> getSources() {
            return this.sources;
        }

        public GetKnowledgePointResponseBodyDataWiki setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class GetKnowledgePointResponseBodyData extends TeaModel {
        /**
         * <p>The one-hop local graph with the requested Id as the entry point. This parameter is returned only when Type is set to GRAPH. It includes the entry point, the relationships on the current page, and their visible endpoints.</p>
         */
        @NameInMap("Graph")
        public GetKnowledgePointResponseBodyDataGraph graph;

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
         * <p>The title, Markdown body, and optional sources of the knowledge content. This parameter is returned only when Type is set to KNOWLEDGE_CONTENT.</p>
         */
        @NameInMap("KnowledgeContent")
        public GetKnowledgePointResponseBodyDataKnowledgeContent knowledgeContent;

        /**
         * <p>The pagination cursor. Do not specify this parameter when you request the first page. For subsequent pages, use the NextToken value returned in the previous response. An empty response indicates that no more pages are available. If the current page is empty but the cursor is not empty, continue pagination. This parameter is used only when Type is set to GRAPH. You must keep the same knowledge base, entry point, and MaxResults values.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJvZmZzZXQiOjIwfQ</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The read category of the knowledge point. Valid values: GRAPH for local graphs, WIKI for topic pages, and KNOWLEDGE_CONTENT for knowledge content.</p>
         * 
         * <strong>example:</strong>
         * <p>GRAPH</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The truncation, scope limitation, or degradation prompts for the current call. Use Code for programmatic judgment. Message is for reading purposes only.</p>
         */
        @NameInMap("Warnings")
        public java.util.List<GetKnowledgePointResponseBodyDataWarnings> warnings;

        /**
         * <p>The title, Markdown body, and optional sources of the topic page. This parameter is returned only when Type is set to WIKI.</p>
         */
        @NameInMap("Wiki")
        public GetKnowledgePointResponseBodyDataWiki wiki;

        public static GetKnowledgePointResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgePointResponseBodyData self = new GetKnowledgePointResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetKnowledgePointResponseBodyData setGraph(GetKnowledgePointResponseBodyDataGraph graph) {
            this.graph = graph;
            return this;
        }
        public GetKnowledgePointResponseBodyDataGraph getGraph() {
            return this.graph;
        }

        public GetKnowledgePointResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetKnowledgePointResponseBodyData setKnowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }
        public String getKnowledgeBaseId() {
            return this.knowledgeBaseId;
        }

        public GetKnowledgePointResponseBodyData setKnowledgeContent(GetKnowledgePointResponseBodyDataKnowledgeContent knowledgeContent) {
            this.knowledgeContent = knowledgeContent;
            return this;
        }
        public GetKnowledgePointResponseBodyDataKnowledgeContent getKnowledgeContent() {
            return this.knowledgeContent;
        }

        public GetKnowledgePointResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public GetKnowledgePointResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetKnowledgePointResponseBodyData setWarnings(java.util.List<GetKnowledgePointResponseBodyDataWarnings> warnings) {
            this.warnings = warnings;
            return this;
        }
        public java.util.List<GetKnowledgePointResponseBodyDataWarnings> getWarnings() {
            return this.warnings;
        }

        public GetKnowledgePointResponseBodyData setWiki(GetKnowledgePointResponseBodyDataWiki wiki) {
            this.wiki = wiki;
            return this;
        }
        public GetKnowledgePointResponseBodyDataWiki getWiki() {
            return this.wiki;
        }

    }

}
