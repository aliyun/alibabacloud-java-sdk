// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class AddCodeupSourceToPipelineResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 流水线ID
    @NameInMap("PipelineId")
    public Long pipelineId;

    public static AddCodeupSourceToPipelineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddCodeupSourceToPipelineResponseBody self = new AddCodeupSourceToPipelineResponseBody();
        return TeaModel.build(map, self);
    }

    public AddCodeupSourceToPipelineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddCodeupSourceToPipelineResponseBody setPipelineId(Long pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public Long getPipelineId() {
        return this.pipelineId;
    }

}
