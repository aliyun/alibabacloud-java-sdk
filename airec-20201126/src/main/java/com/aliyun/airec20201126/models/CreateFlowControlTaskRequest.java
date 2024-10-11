// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class CreateFlowControlTaskRequest extends TeaModel {
    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    public static CreateFlowControlTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowControlTaskRequest self = new CreateFlowControlTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateFlowControlTaskRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
