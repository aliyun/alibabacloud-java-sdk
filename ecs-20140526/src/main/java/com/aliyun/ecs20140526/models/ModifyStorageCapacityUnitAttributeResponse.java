// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyStorageCapacityUnitAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyStorageCapacityUnitAttributeResponseBody body;

    public static ModifyStorageCapacityUnitAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyStorageCapacityUnitAttributeResponse self = new ModifyStorageCapacityUnitAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyStorageCapacityUnitAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyStorageCapacityUnitAttributeResponse setBody(ModifyStorageCapacityUnitAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyStorageCapacityUnitAttributeResponseBody getBody() {
        return this.body;
    }

}
