// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class RunNodeOperationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>restart.kubelet</p>
     */
    @NameInMap("operationAction")
    public String operationAction;

    @NameInMap("operationArgs")
    public java.util.List<String> operationArgs;

    public static RunNodeOperationRequest build(java.util.Map<String, ?> map) throws Exception {
        RunNodeOperationRequest self = new RunNodeOperationRequest();
        return TeaModel.build(map, self);
    }

    public RunNodeOperationRequest setOperationAction(String operationAction) {
        this.operationAction = operationAction;
        return this;
    }
    public String getOperationAction() {
        return this.operationAction;
    }

    public RunNodeOperationRequest setOperationArgs(java.util.List<String> operationArgs) {
        this.operationArgs = operationArgs;
        return this;
    }
    public java.util.List<String> getOperationArgs() {
        return this.operationArgs;
    }

}
