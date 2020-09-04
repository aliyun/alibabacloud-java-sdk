// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class CancelPipelineRequest extends TeaModel {
    @NameInMap("PipelineInstanceId")
    @Validation(required = true)
    public String pipelineInstanceId;

    public static CancelPipelineRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelPipelineRequest self = new CancelPipelineRequest();
        return TeaModel.build(map, self);
    }

    public CancelPipelineRequest setPipelineInstanceId(String pipelineInstanceId) {
        this.pipelineInstanceId = pipelineInstanceId;
        return this;
    }
    public String getPipelineInstanceId() {
        return this.pipelineInstanceId;
    }

}
