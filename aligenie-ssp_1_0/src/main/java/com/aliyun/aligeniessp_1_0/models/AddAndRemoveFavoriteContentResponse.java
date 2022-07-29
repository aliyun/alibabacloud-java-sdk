// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class AddAndRemoveFavoriteContentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddAndRemoveFavoriteContentResponseBody body;

    public static AddAndRemoveFavoriteContentResponse build(java.util.Map<String, ?> map) throws Exception {
        AddAndRemoveFavoriteContentResponse self = new AddAndRemoveFavoriteContentResponse();
        return TeaModel.build(map, self);
    }

    public AddAndRemoveFavoriteContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddAndRemoveFavoriteContentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddAndRemoveFavoriteContentResponse setBody(AddAndRemoveFavoriteContentResponseBody body) {
        this.body = body;
        return this;
    }
    public AddAndRemoveFavoriteContentResponseBody getBody() {
        return this.body;
    }

}
