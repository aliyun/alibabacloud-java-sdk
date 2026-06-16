// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class UpdateFlowRequest extends TeaModel {
    /**
     * <p>The input parameters for updating the workflow.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public UpdateFlowInput body;

    public static UpdateFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFlowRequest self = new UpdateFlowRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFlowRequest setBody(UpdateFlowInput body) {
        this.body = body;
        return this;
    }
    public UpdateFlowInput getBody() {
        return this.body;
    }

}
