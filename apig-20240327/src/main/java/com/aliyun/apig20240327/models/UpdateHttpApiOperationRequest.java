// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateHttpApiOperationRequest extends TeaModel {
    /**
     * <p>The operation definition.</p>
     */
    @NameInMap("operation")
    public HttpApiOperation operation;

    public static UpdateHttpApiOperationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHttpApiOperationRequest self = new UpdateHttpApiOperationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHttpApiOperationRequest setOperation(HttpApiOperation operation) {
        this.operation = operation;
        return this;
    }
    public HttpApiOperation getOperation() {
        return this.operation;
    }

}
