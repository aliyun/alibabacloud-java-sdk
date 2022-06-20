// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateProductTagsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateProductTagsResponseBody body;

    public static UpdateProductTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateProductTagsResponse self = new UpdateProductTagsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateProductTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateProductTagsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateProductTagsResponse setBody(UpdateProductTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateProductTagsResponseBody getBody() {
        return this.body;
    }

}
