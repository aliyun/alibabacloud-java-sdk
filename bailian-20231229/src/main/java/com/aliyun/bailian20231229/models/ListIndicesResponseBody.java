// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class ListIndicesResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>Index.InvalidParameter</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public ListIndicesResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Required parameter(%s) missing or invalid, please check the request parameters.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>17204B98-xxxx-4F9A-8464-2446A84821CA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status code returned by the operation.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Indicates whether the operation was successful. Valid values:</p>
     * <ul>
     * <li>true: Successful.</li>
     * <li>false: Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListIndicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIndicesResponseBody self = new ListIndicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIndicesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListIndicesResponseBody setData(ListIndicesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListIndicesResponseBodyData getData() {
        return this.data;
    }

    public ListIndicesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListIndicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIndicesResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListIndicesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListIndicesResponseBodyDataIndices extends TeaModel {
        /**
         * <p>The estimated chunk length. Valid values: 1 to 2048.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ChunkSize")
        public Integer chunkSize;

        /**
         * <p>The configuration mode used by this knowledge base. Valid values:</p>
         * <ul>
         * <li>recommend: recommended configuration.</li>
         * <li>user-defined: custom configuration.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>recommend</p>
         */
        @NameInMap("ConfgModel")
        public String confgModel;

        /**
         * <p>The description of the knowledge base.</p>
         * 
         * <strong>example:</strong>
         * <p>清单中产品主要面向海外客户。</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The list of file IDs.</p>
         */
        @NameInMap("DocumentIds")
        public java.util.List<String> documentIds;

        /**
         * <p>The name of the embedding model. Valid values:</p>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <ul>
         * <li>text-embedding-v4: the text-embedding-v4 model.</li>
         * <li>text-embedding-v3: the text-embedding-v3 model.</li>
         * <li>text-embedding-v2: the text-embedding-v2 model.</li>
         * </ul>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <ul>
         * <li>text-embedding-v2: the text-embedding-v2 model.</li>
         * </ul>
         * <p>.</p>
         * 
         * <strong>example:</strong>
         * <p>text-embedding-v2</p>
         */
        @NameInMap("EmbeddingModelName")
        public String embeddingModelName;

        /**
         * <p>Indicates whether &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/model-studio/use-cases/rag-optimization#b7031e2ad6cji">multi-turn conversation rewriting</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/model-studio/use-cases/rag-optimization#b7031e2ad6cji">multi-turn conversation rewriting</a> is enabled for this knowledge base. Valid values:</p>
         * <ul>
         * <li>true: Enabled.</li>
         * <li>false: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableRewrite")
        public Boolean enableRewrite;

        /**
         * <p>The knowledge base ID, which is the <code>Data.Id</code> returned by the <strong>CreateIndex</strong> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>lecxr5xxxx</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the knowledge base.</p>
         * 
         * <strong>example:</strong>
         * <p>XXXX产品清单</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The chunk overlap length. Valid values: 0 to 1024.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("OverlapSize")
        public Integer overlapSize;

        /**
         * <p>The similarity threshold. Valid values: 0.01 to 1.00.</p>
         * 
         * <strong>example:</strong>
         * <p>0.01</p>
         */
        @NameInMap("RerankMinScore")
        public String rerankMinScore;

        /**
         * <p>The name of the rerank model. Valid values:</p>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <ul>
         * <li>qwen3-rerank-hybrid: qwen3-rerank (hybrid) reranking.</li>
         * <li>qwen3-rerank: qwen3-rerank reranking.</li>
         * <li>gte-rerank-hybrid: gte-rerank (hybrid) reranking.</li>
         * <li>gte-rerank: gte-rerank reranking.</li>
         * </ul>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <ul>
         * <li>gte-rerank-hybrid: official reranking.</li>
         * <li>gte-rerank: gte-rerank reranking.</li>
         * </ul>
         * <p>.</p>
         * 
         * <strong>example:</strong>
         * <p>gte-rerank-hybrid</p>
         */
        @NameInMap("RerankModelName")
        public String rerankModelName;

        /**
         * <p>The sentence separator. If multiple separators are used, they are separated by |. Valid values:</p>
         * <ul>
         * <li>\
         * : line break</li>
         * <li>，: Chinese comma</li>
         * <li>,: English comma</li>
         * <li>。: Chinese period</li>
         * <li>.: English period</li>
         * <li>！: Chinese exclamation mark</li>
         * <li>!: English exclamation mark</li>
         * <li>；: Chinese semicolon</li>
         * <li>;: English semicolon</li>
         * <li>？: Chinese question mark</li>
         * <li>?: English question mark.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>\n</p>
         */
        @NameInMap("Separator")
        public String separator;

        /**
         * <p>The instance ID of the vector storage for the knowledge base.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-bp1gq62t1788yxxxx</p>
         */
        @NameInMap("SinkInstanceId")
        public String sinkInstanceId;

        /**
         * <p>The region of the vector storage instance for the knowledge base.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("SinkRegion")
        public String sinkRegion;

        /**
         * <p>The vector storage type of the knowledge base. Valid values:</p>
         * <ul>
         * <li>ES: built-in vector database.</li>
         * <li>BUILT_IN: built-in vector database.</li>
         * <li>ADB: AnalyticDB for PostgreSQL database.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BUILT_IN</p>
         */
        @NameInMap("SinkType")
        public String sinkType;

        /**
         * <p>The data type of Alibaba Cloud Model Studio &lt;props=&quot;china&quot;&gt;<a href="https://bailian.console.aliyun.com/?tab=app#/data-center">application data</a>&lt;props=&quot;intl&quot;&gt;<a href="https://modelstudio.console.alibabacloud.com/?tab=app#/data-center">application data</a>.</p>
         * <p>For document search&lt;props=&quot;china&quot;&gt;/audio and video search knowledge bases, valid values:</p>
         * <ul>
         * <li>DATA_CENTER_CATEGORY: category type.</li>
         * <li>DATA_CENTER_FILE: file type.</li>
         * </ul>
         * <p>For data query/image Q&amp;A knowledge bases, valid values:</p>
         * <ul>
         * <li>DATA_CENTER_STRUCTURED_TABLE: data table type.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DATA_CENTER_FILE</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The type of the knowledge base. Valid values:</p>
         * <ul>
         * <li>UNSTRUCTURED: document search.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UNSTRUCTURED</p>
         */
        @NameInMap("StructureType")
        public String structureType;

        public static ListIndicesResponseBodyDataIndices build(java.util.Map<String, ?> map) throws Exception {
            ListIndicesResponseBodyDataIndices self = new ListIndicesResponseBodyDataIndices();
            return TeaModel.build(map, self);
        }

        public ListIndicesResponseBodyDataIndices setChunkSize(Integer chunkSize) {
            this.chunkSize = chunkSize;
            return this;
        }
        public Integer getChunkSize() {
            return this.chunkSize;
        }

        public ListIndicesResponseBodyDataIndices setConfgModel(String confgModel) {
            this.confgModel = confgModel;
            return this;
        }
        public String getConfgModel() {
            return this.confgModel;
        }

        public ListIndicesResponseBodyDataIndices setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListIndicesResponseBodyDataIndices setDocumentIds(java.util.List<String> documentIds) {
            this.documentIds = documentIds;
            return this;
        }
        public java.util.List<String> getDocumentIds() {
            return this.documentIds;
        }

        public ListIndicesResponseBodyDataIndices setEmbeddingModelName(String embeddingModelName) {
            this.embeddingModelName = embeddingModelName;
            return this;
        }
        public String getEmbeddingModelName() {
            return this.embeddingModelName;
        }

        public ListIndicesResponseBodyDataIndices setEnableRewrite(Boolean enableRewrite) {
            this.enableRewrite = enableRewrite;
            return this;
        }
        public Boolean getEnableRewrite() {
            return this.enableRewrite;
        }

        public ListIndicesResponseBodyDataIndices setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListIndicesResponseBodyDataIndices setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListIndicesResponseBodyDataIndices setOverlapSize(Integer overlapSize) {
            this.overlapSize = overlapSize;
            return this;
        }
        public Integer getOverlapSize() {
            return this.overlapSize;
        }

        public ListIndicesResponseBodyDataIndices setRerankMinScore(String rerankMinScore) {
            this.rerankMinScore = rerankMinScore;
            return this;
        }
        public String getRerankMinScore() {
            return this.rerankMinScore;
        }

        public ListIndicesResponseBodyDataIndices setRerankModelName(String rerankModelName) {
            this.rerankModelName = rerankModelName;
            return this;
        }
        public String getRerankModelName() {
            return this.rerankModelName;
        }

        public ListIndicesResponseBodyDataIndices setSeparator(String separator) {
            this.separator = separator;
            return this;
        }
        public String getSeparator() {
            return this.separator;
        }

        public ListIndicesResponseBodyDataIndices setSinkInstanceId(String sinkInstanceId) {
            this.sinkInstanceId = sinkInstanceId;
            return this;
        }
        public String getSinkInstanceId() {
            return this.sinkInstanceId;
        }

        public ListIndicesResponseBodyDataIndices setSinkRegion(String sinkRegion) {
            this.sinkRegion = sinkRegion;
            return this;
        }
        public String getSinkRegion() {
            return this.sinkRegion;
        }

        public ListIndicesResponseBodyDataIndices setSinkType(String sinkType) {
            this.sinkType = sinkType;
            return this;
        }
        public String getSinkType() {
            return this.sinkType;
        }

        public ListIndicesResponseBodyDataIndices setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public ListIndicesResponseBodyDataIndices setStructureType(String structureType) {
            this.structureType = structureType;
            return this;
        }
        public String getStructureType() {
            return this.structureType;
        }

    }

    public static class ListIndicesResponseBodyData extends TeaModel {
        /**
         * <p>The list of knowledge bases.</p>
         */
        @NameInMap("Indices")
        public java.util.List<ListIndicesResponseBodyDataIndices> indices;

        /**
         * <p>The page number returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>48</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListIndicesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListIndicesResponseBodyData self = new ListIndicesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListIndicesResponseBodyData setIndices(java.util.List<ListIndicesResponseBodyDataIndices> indices) {
            this.indices = indices;
            return this;
        }
        public java.util.List<ListIndicesResponseBodyDataIndices> getIndices() {
            return this.indices;
        }

        public ListIndicesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListIndicesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListIndicesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
