// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class CreateDataModelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDataModelResponseBody body;

    public static CreateDataModelResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDataModelResponse self = new CreateDataModelResponse();
        return TeaModel.build(map, self);
    }

    public CreateDataModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDataModelResponse setBody(CreateDataModelResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDataModelResponseBody getBody() {
        return this.body;
    }

}
