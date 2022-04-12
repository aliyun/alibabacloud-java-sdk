// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ContinuePipelineRequest extends TeaModel {
    @NameInMap("Confirm")
    public Boolean confirm;

    @NameInMap("PipelineId")
    public String pipelineId;

    public static ContinuePipelineRequest build(java.util.Map<String, ?> map) throws Exception {
        ContinuePipelineRequest self = new ContinuePipelineRequest();
        return TeaModel.build(map, self);
    }

    public ContinuePipelineRequest setConfirm(Boolean confirm) {
        this.confirm = confirm;
        return this;
    }
    public Boolean getConfirm() {
        return this.confirm;
    }

    public ContinuePipelineRequest setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

}
