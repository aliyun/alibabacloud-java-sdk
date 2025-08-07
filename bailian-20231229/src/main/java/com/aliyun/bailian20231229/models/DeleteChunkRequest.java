// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class DeleteChunkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ChunkIds")
    public java.util.List<String> chunkIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>79c0alxxxx</p>
     */
    @NameInMap("PipelineId")
    public String pipelineId;

    public static DeleteChunkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteChunkRequest self = new DeleteChunkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteChunkRequest setChunkIds(java.util.List<String> chunkIds) {
        this.chunkIds = chunkIds;
        return this;
    }
    public java.util.List<String> getChunkIds() {
        return this.chunkIds;
    }

    public DeleteChunkRequest setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

}
