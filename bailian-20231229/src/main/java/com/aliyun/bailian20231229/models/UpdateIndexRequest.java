// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class UpdateIndexRequest extends TeaModel {
    /**
     * <p>The number of most similar text segments to retrieve using vector search. A vector is generated for the input text, and the K most similar text segments are retrieved from the knowledge base. The value of K must be in the range of 0 to 100.
     * The sum of <code>DenseSimilarityTopK</code> and <code>SparseSimilarityTopK</code> cannot exceed 200.</p>
     * <p>Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("DenseSimilarityTopK")
    public Integer denseSimilarityTopK;

    /**
     * <p>The description of the knowledge base.</p>
     * 
     * <strong>example:</strong>
     * <p>企业知识库</p>
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
     * <p>The name of the knowledge base.</p>
     * 
     * <strong>example:</strong>
     * <p>企业帮助文档库</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The number of Retrieval Compute Units (RCUs) for the Ultimate Edition knowledge base. This parameter is required only when PipelineCommercialType is set to enterprise.</p>
     * <p>The value must be in the range of 1 to 200.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("PipelineCommercialCu")
    public Integer pipelineCommercialCu;

    /**
     * <p>The edition of the knowledge base. Valid values:</p>
     * <ul>
     * <li><p>standard: Standard Edition</p>
     * </li>
     * <li><p>enterprise: Ultimate Edition</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>standard</p>
     */
    @NameInMap("PipelineCommercialType")
    public String pipelineCommercialType;

    /**
     * <p>The minimum score for sorting. The value must be between 0 and 1.</p>
     * 
     * <strong>example:</strong>
     * <p>0.01</p>
     */
    @NameInMap("RerankMinScore")
    public String rerankMinScore;

    /**
     * <p>The number of text segments to retrieve using an exact keyword match. This helps filter out irrelevant text segments and provides more accurate results.
     * The value must be in the range of 0 to 100.
     * The sum of <code>DenseSimilarityTopK</code> and <code>SparseSimilarityTopK</code> cannot exceed 200.</p>
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
