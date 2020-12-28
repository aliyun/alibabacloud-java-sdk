// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ModifyContainerAppAttributesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyContainerAppAttributesResponseBody body;

    public static ModifyContainerAppAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyContainerAppAttributesResponse self = new ModifyContainerAppAttributesResponse();
        return TeaModel.build(map, self);
    }

    public ModifyContainerAppAttributesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyContainerAppAttributesResponse setBody(ModifyContainerAppAttributesResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyContainerAppAttributesResponseBody getBody() {
        return this.body;
    }

}
