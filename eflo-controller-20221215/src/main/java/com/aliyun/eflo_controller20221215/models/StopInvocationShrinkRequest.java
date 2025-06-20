// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class StopInvocationShrinkRequest extends TeaModel {
    /**
     * <p>The execution ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f-hz044748dzepds0</p>
     */
    @NameInMap("InvokeId")
    public String invokeId;

    /**
     * <p>The nodes.</p>
     */
    @NameInMap("NodeIdList")
    public String nodeIdListShrink;

    public static StopInvocationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        StopInvocationShrinkRequest self = new StopInvocationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public StopInvocationShrinkRequest setInvokeId(String invokeId) {
        this.invokeId = invokeId;
        return this;
    }
    public String getInvokeId() {
        return this.invokeId;
    }

    public StopInvocationShrinkRequest setNodeIdListShrink(String nodeIdListShrink) {
        this.nodeIdListShrink = nodeIdListShrink;
        return this;
    }
    public String getNodeIdListShrink() {
        return this.nodeIdListShrink;
    }

}
