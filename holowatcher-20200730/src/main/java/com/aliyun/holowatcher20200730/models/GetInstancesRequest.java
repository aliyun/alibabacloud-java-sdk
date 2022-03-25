// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetInstancesRequest extends TeaModel {
    @NameInMap("PipelineNodeId")
    public String pipelineNodeId;

    public static GetInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstancesRequest self = new GetInstancesRequest();
        return TeaModel.build(map, self);
    }

    public GetInstancesRequest setPipelineNodeId(String pipelineNodeId) {
        this.pipelineNodeId = pipelineNodeId;
        return this;
    }
    public String getPipelineNodeId() {
        return this.pipelineNodeId;
    }

}
