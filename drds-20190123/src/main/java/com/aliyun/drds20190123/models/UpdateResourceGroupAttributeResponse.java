// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class UpdateResourceGroupAttributeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static UpdateResourceGroupAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceGroupAttributeResponse self = new UpdateResourceGroupAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateResourceGroupAttributeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
