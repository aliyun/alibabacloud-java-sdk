// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class UpdateIndexRequest extends TeaModel {
    /**
     * <p>The top K value for AISearch. The system generates a vector for the input text and retrieves the K text chunks with the most similar vector representations from the knowledge base. Valid values: 0 to 100.
     * The sum of <code>DenseSimilarityTopK</code> and <code>SparseSimilarityTopK</code> must be less than or equal to 200.</p>
     * <p>Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("DenseSimilarityTopK")
    public Integer denseSimilarityTopK;

    /**
     * <p>The knowledge base description.</p>
     * 
     * <strong>example:</strong>
     * <p>Enterprise knowledge base</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The knowledge base ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>79c0alxxxx</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The knowledge base name.</p>
     * 
     * <strong>example:</strong>
     * <p>Enterprise help documentation library</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The number of RCUs for an Ultimate Edition knowledge base. This parameter is required only when pipelineCommercialType is set to enterprise.</p>
     * <p>Valid values: 1 to 200.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("PipelineCommercialCu")
    public Integer pipelineCommercialCu;

    /**
     * <p>The specification type of the knowledge base. Valid values:</p>
     * <ul>
     * <li><p>standard: Standard Edition.</p>
     * </li>
     * <li><p>enterprise: Ultimate Edition.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>standard</p>
     */
    @NameInMap("PipelineCommercialType")
    public String pipelineCommercialType;

    /**
     * <p>The minimum reranking score. Valid values: 0 to 1.</p>
     * 
     * <strong>example:</strong>
     * <p>0.01</p>
     */
    @NameInMap("RerankMinScore")
    public String rerankMinScore;

    /**
     * <p>The top K value for keyword retrieval. The system retrieves text chunks in the knowledge base that are an exact match for the keywords of the input text. This helps filter out irrelevant text chunks and provides more accurate results.
     * Valid values: 0 to 100.
     * The sum of <code>DenseSimilarityTopK</code> and <code>SparseSimilarityTopK</code> must be less than or equal to 200.</p>
     * <p>Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("SparseSimilarityTopK")
    public Integer sparseSimilarityTopK;

    public static UpdateIndexRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIndexRequest self = new UpdateIndexRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIndexRequest setDenseSimilarityTopK(Integer denseSimilarityTopK) {
        this.denseSimilarityTopK = denseSimilarityTopK;
        return this;
    }
    public Integer getDenseSimilarityTopK() {
        return this.denseSimilarityTopK;
    }

    public UpdateIndexRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateIndexRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateIndexRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateIndexRequest setPipelineCommercialCu(Integer pipelineCommercialCu) {
        this.pipelineCommercialCu = pipelineCommercialCu;
        return this;
    }
    public Integer getPipelineCommercialCu() {
        return this.pipelineCommercialCu;
    }

    public UpdateIndexRequest setPipelineCommercialType(String pipelineCommercialType) {
        this.pipelineCommercialType = pipelineCommercialType;
        return this;
    }
    public String getPipelineCommercialType() {
        return this.pipelineCommercialType;
    }

    public UpdateIndexRequest setRerankMinScore(String rerankMinScore) {
        this.rerankMinScore = rerankMinScore;
        return this;
    }
    public String getRerankMinScore() {
        return this.rerankMinScore;
    }

    public UpdateIndexRequest setSparseSimilarityTopK(Integer sparseSimilarityTopK) {
        this.sparseSimilarityTopK = sparseSimilarityTopK;
        return this;
    }
    public Integer getSparseSimilarityTopK() {
        return this.sparseSimilarityTopK;
    }

}
