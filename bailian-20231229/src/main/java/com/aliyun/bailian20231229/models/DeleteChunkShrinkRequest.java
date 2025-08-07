// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class DeleteChunkShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ChunkIds")
    public String chunkIdsShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>79c0alxxxx</p>
     */
    @NameInMap("PipelineId")
    public String pipelineId;

    public static DeleteChunkShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteChunkShrinkRequest self = new DeleteChunkShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteChunkShrinkRequest setChunkIdsShrink(String chunkIdsShrink) {
        this.chunkIdsShrink = chunkIdsShrink;
        return this;
    }
    public String getChunkIdsShrink() {
        return this.chunkIdsShrink;
    }

    public DeleteChunkShrinkRequest setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

}
