// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class AddCameraResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddCameraResponseBody body;

    public static AddCameraResponse build(java.util.Map<String, ?> map) throws Exception {
        AddCameraResponse self = new AddCameraResponse();
        return TeaModel.build(map, self);
    }

    public AddCameraResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddCameraResponse setBody(AddCameraResponseBody body) {
        this.body = body;
        return this;
    }
    public AddCameraResponseBody getBody() {
        return this.body;
    }

}
