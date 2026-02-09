// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateHttpApiOperationRequest extends TeaModel {
    /**
     * <p>The operation definitions.</p>
     */
    @NameInMap("operations")
    public java.util.List<HttpApiOperation> operations;

    public static CreateHttpApiOperationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateHttpApiOperationRequest self = new CreateHttpApiOperationRequest();
        return TeaModel.build(map, self);
    }

    public CreateHttpApiOperationRequest setOperations(java.util.List<HttpApiOperation> operations) {
        this.operations = operations;
        return this;
    }
    public java.util.List<HttpApiOperation> getOperations() {
        return this.operations;
    }

}
