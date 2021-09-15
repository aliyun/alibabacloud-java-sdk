// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class RestoreModelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RestoreModelResponseBody body;

    public static RestoreModelResponse build(java.util.Map<String, ?> map) throws Exception {
        RestoreModelResponse self = new RestoreModelResponse();
        return TeaModel.build(map, self);
    }

    public RestoreModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestoreModelResponse setBody(RestoreModelResponseBody body) {
        this.body = body;
        return this;
    }
    public RestoreModelResponseBody getBody() {
        return this.body;
    }

}
