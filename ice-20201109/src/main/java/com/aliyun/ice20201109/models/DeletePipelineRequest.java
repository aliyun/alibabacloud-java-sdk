// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeletePipelineRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PipelineId")
    public String pipelineId;

    public static DeletePipelineRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePipelineRequest self = new DeletePipelineRequest();
        return TeaModel.build(map, self);
    }

    public DeletePipelineRequest setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

}
