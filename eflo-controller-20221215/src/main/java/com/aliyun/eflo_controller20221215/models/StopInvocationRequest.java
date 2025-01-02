// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class StopInvocationRequest extends TeaModel {
    /**
     * <p>Command execution ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f-hz044748dzepds0</p>
     */
    @NameInMap("InvokeId")
    public String invokeId;

    /**
     * <p>List of nodes.</p>
     */
    @NameInMap("NodeIdList")
    public java.util.List<String> nodeIdList;

    public static StopInvocationRequest build(java.util.Map<String, ?> map) throws Exception {
        StopInvocationRequest self = new StopInvocationRequest();
        return TeaModel.build(map, self);
    }

    public StopInvocationRequest setInvokeId(String invokeId) {
        this.invokeId = invokeId;
        return this;
    }
    public String getInvokeId() {
        return this.invokeId;
    }

    public StopInvocationRequest setNodeIdList(java.util.List<String> nodeIdList) {
        this.nodeIdList = nodeIdList;
        return this;
    }
    public java.util.List<String> getNodeIdList() {
        return this.nodeIdList;
    }

}
