// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class InvokeContainerRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>createSandbox</p>
     */
    @NameInMap("operationId")
    public String operationId;

    @NameInMap("params")
    public String params;

    public static InvokeContainerRequest build(java.util.Map<String, ?> map) throws Exception {
        InvokeContainerRequest self = new InvokeContainerRequest();
        return TeaModel.build(map, self);
    }

    public InvokeContainerRequest setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

    public InvokeContainerRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

}
