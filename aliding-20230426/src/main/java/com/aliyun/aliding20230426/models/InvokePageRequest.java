// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class InvokePageRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>createPage</p>
     */
    @NameInMap("operationId")
    public String operationId;

    @NameInMap("params")
    public String params;

    public static InvokePageRequest build(java.util.Map<String, ?> map) throws Exception {
        InvokePageRequest self = new InvokePageRequest();
        return TeaModel.build(map, self);
    }

    public InvokePageRequest setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

    public InvokePageRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

}
