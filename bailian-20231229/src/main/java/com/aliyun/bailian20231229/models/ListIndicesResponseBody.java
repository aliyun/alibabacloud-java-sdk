// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class ListIndicesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Index.InvalidParameter</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListIndicesResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Required parameter(%s) missing or invalid, please check the request parameters.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>17204B98-xxxx-4F9A-8464-2446A84821CA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Status")
    public String status;

    /**
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
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ChunkSize")
        public Integer chunkSize;

        /**
         * <strong>example:</strong>
         * <p>If each RAM user belongs to a RAM group, the configuration is considered compliant.</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("DocumentIds")
        public java.util.List<String> documentIds;

        /**
         * <strong>example:</strong>
         * <p>conv-rewrite-qwen-1.8b</p>
         */
        @NameInMap("EmbeddingModelName")
        public String embeddingModelName;

        /**
         * <strong>example:</strong>
         * <p>259899</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>temp_mUB4j</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("OverlapSize")
        public Integer overlapSize;

        /**
         * <strong>example:</strong>
         * <p>0.01</p>
         */
        @NameInMap("RerankMinScore")
        public String rerankMinScore;

        /**
         * <strong>example:</strong>
         * <p>gte-rerank-hybrid</p>
         */
        @NameInMap("RerankModelName")
        public String rerankModelName;

        /**
         * <strong>example:</strong>
         * <p>\n</p>
         */
        @NameInMap("Separator")
        public String separator;

        /**
         * <strong>example:</strong>
         * <p>gp-bp1gq62t1788yw2ol</p>
         */
        @NameInMap("SinkInstanceId")
        public String sinkInstanceId;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("SinkRegion")
        public String sinkRegion;

        /**
         * <strong>example:</strong>
         * <p>es</p>
         */
        @NameInMap("SinkType")
        public String sinkType;

        /**
         * <strong>example:</strong>
         * <p>DATA_CENTER_FILE</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <strong>example:</strong>
         * <p>structured</p>
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
        @NameInMap("Indices")
        public java.util.List<ListIndicesResponseBodyDataIndices> indices;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
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
