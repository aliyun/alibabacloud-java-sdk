// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class CreateDCStorageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDCStorageResponseBody body;

    public static CreateDCStorageResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDCStorageResponse self = new CreateDCStorageResponse();
        return TeaModel.build(map, self);
    }

    public CreateDCStorageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDCStorageResponse setBody(CreateDCStorageResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDCStorageResponseBody getBody() {
        return this.body;
    }

}
