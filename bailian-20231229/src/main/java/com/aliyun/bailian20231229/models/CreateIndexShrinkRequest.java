// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class CreateIndexShrinkRequest extends TeaModel {
    @NameInMap("CategoryIds")
    public String categoryIdsShrink;

    /**
     * <strong>example:</strong>
     * <p>128</p>
     */
    @NameInMap("ChunkSize")
    public Integer chunkSize;

    @NameInMap("Columns")
    public String columnsShrink;

    @NameInMap("Description")
    public String description;

    @NameInMap("DocumentIds")
    public String documentIdsShrink;

    /**
     * <strong>example:</strong>
     * <p>text-embedding-v2</p>
     */
    @NameInMap("EmbeddingModelName")
    public String embeddingModelName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("OverlapSize")
    public Integer overlapSize;

    /**
     * <strong>example:</strong>
     * <p>0.20</p>
     */
    @NameInMap("RerankMinScore")
    public Double rerankMinScore;

    /**
     * <strong>example:</strong>
     * <p>gte-rerank-hybrid</p>
     */
    @NameInMap("RerankModelName")
    public String rerankModelName;

    /**
     * <strong>example:</strong>
     * <p>,</p>
     */
    @NameInMap("Separator")
    public String separator;

    /**
     * <strong>example:</strong>
     * <p>gp-bp321093j84</p>
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DEFAULT</p>
     */
    @NameInMap("SinkType")
    public String sinkType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DATA_CENTER_FILE</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>structured</p>
     */
    @NameInMap("StructureType")
    public String structureType;

    public static CreateIndexShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIndexShrinkRequest self = new CreateIndexShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateIndexShrinkRequest setCategoryIdsShrink(String categoryIdsShrink) {
        this.categoryIdsShrink = categoryIdsShrink;
        return this;
    }
    public String getCategoryIdsShrink() {
        return this.categoryIdsShrink;
    }

    public CreateIndexShrinkRequest setChunkSize(Integer chunkSize) {
        this.chunkSize = chunkSize;
        return this;
    }
    public Integer getChunkSize() {
        return this.chunkSize;
    }

    public CreateIndexShrinkRequest setColumnsShrink(String columnsShrink) {
        this.columnsShrink = columnsShrink;
        return this;
    }
    public String getColumnsShrink() {
        return this.columnsShrink;
    }

    public CreateIndexShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateIndexShrinkRequest setDocumentIdsShrink(String documentIdsShrink) {
        this.documentIdsShrink = documentIdsShrink;
        return this;
    }
    public String getDocumentIdsShrink() {
        return this.documentIdsShrink;
    }

    public CreateIndexShrinkRequest setEmbeddingModelName(String embeddingModelName) {
        this.embeddingModelName = embeddingModelName;
        return this;
    }
    public String getEmbeddingModelName() {
        return this.embeddingModelName;
    }

    public CreateIndexShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateIndexShrinkRequest setOverlapSize(Integer overlapSize) {
        this.overlapSize = overlapSize;
        return this;
    }
    public Integer getOverlapSize() {
        return this.overlapSize;
    }

    public CreateIndexShrinkRequest setRerankMinScore(Double rerankMinScore) {
        this.rerankMinScore = rerankMinScore;
        return this;
    }
    public Double getRerankMinScore() {
        return this.rerankMinScore;
    }

    public CreateIndexShrinkRequest setRerankModelName(String rerankModelName) {
        this.rerankModelName = rerankModelName;
        return this;
    }
    public String getRerankModelName() {
        return this.rerankModelName;
    }

    public CreateIndexShrinkRequest setSeparator(String separator) {
        this.separator = separator;
        return this;
    }
    public String getSeparator() {
        return this.separator;
    }

    public CreateIndexShrinkRequest setSinkInstanceId(String sinkInstanceId) {
        this.sinkInstanceId = sinkInstanceId;
        return this;
    }
    public String getSinkInstanceId() {
        return this.sinkInstanceId;
    }

    public CreateIndexShrinkRequest setSinkRegion(String sinkRegion) {
        this.sinkRegion = sinkRegion;
        return this;
    }
    public String getSinkRegion() {
        return this.sinkRegion;
    }

    public CreateIndexShrinkRequest setSinkType(String sinkType) {
        this.sinkType = sinkType;
        return this;
    }
    public String getSinkType() {
        return this.sinkType;
    }

    public CreateIndexShrinkRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public CreateIndexShrinkRequest setStructureType(String structureType) {
        this.structureType = structureType;
        return this;
    }
    public String getStructureType() {
        return this.structureType;
    }

}
