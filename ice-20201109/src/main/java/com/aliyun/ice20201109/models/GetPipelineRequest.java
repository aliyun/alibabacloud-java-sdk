// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetPipelineRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PipelineId")
    public String pipelineId;

    public static GetPipelineRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPipelineRequest self = new GetPipelineRequest();
        return TeaModel.build(map, self);
    }

    public GetPipelineRequest setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

}
