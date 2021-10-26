// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class CreateVpcBindingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static CreateVpcBindingResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVpcBindingResponse self = new CreateVpcBindingResponse();
        return TeaModel.build(map, self);
    }

    public CreateVpcBindingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
