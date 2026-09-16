// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class AiChunkTransformParameters extends TeaModel {
    /**
     * <p>The chunking algorithm. Valid values: markdown_header and recursive_character.</p>
     * 
     * <strong>example:</strong>
     * <p>recursive_character</p>
     */
    @NameInMap("ChunkingType")
    public String chunkingType;

    /**
     * <p>The text field to chunk. This operator does not use InputField.</p>
     */
    @NameInMap("InputField")
    public AiTransformField inputField;

    /**
     * <p>The chunk overlap length. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxOverlapSize")
    public Integer maxOverlapSize;

    /**
     * <p>The maximum chunk length. Default value: 1000.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("MaxSegmentSize")
    public Integer maxSegmentSize;

    /**
     * <p>The field name in the CloudEvent to which the output is attached. Default value: transform0.</p>
     * 
     * <strong>example:</strong>
     * <p>chunks</p>
     */
    @NameInMap("StepName")
    public String stepName;

    /**
     * <p>Specifies whether to split the output into multiple events. Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Unpack")
    public Boolean unpack;

    public static AiChunkTransformParameters build(java.util.Map<String, ?> map) throws Exception {
        AiChunkTransformParameters self = new AiChunkTransformParameters();
        return TeaModel.build(map, self);
    }

    public AiChunkTransformParameters setChunkingType(String chunkingType) {
        this.chunkingType = chunkingType;
        return this;
    }
    public String getChunkingType() {
        return this.chunkingType;
    }

    public AiChunkTransformParameters setInputField(AiTransformField inputField) {
        this.inputField = inputField;
        return this;
    }
    public AiTransformField getInputField() {
        return this.inputField;
    }

    public AiChunkTransformParameters setMaxOverlapSize(Integer maxOverlapSize) {
        this.maxOverlapSize = maxOverlapSize;
        return this;
    }
    public Integer getMaxOverlapSize() {
        return this.maxOverlapSize;
    }

    public AiChunkTransformParameters setMaxSegmentSize(Integer maxSegmentSize) {
        this.maxSegmentSize = maxSegmentSize;
        return this;
    }
    public Integer getMaxSegmentSize() {
        return this.maxSegmentSize;
    }

    public AiChunkTransformParameters setStepName(String stepName) {
        this.stepName = stepName;
        return this;
    }
    public String getStepName() {
        return this.stepName;
    }

    public AiChunkTransformParameters setUnpack(Boolean unpack) {
        this.unpack = unpack;
        return this;
    }
    public Boolean getUnpack() {
        return this.unpack;
    }

}
