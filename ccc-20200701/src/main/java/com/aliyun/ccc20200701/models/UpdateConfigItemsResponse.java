// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class UpdateConfigItemsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateConfigItemsResponseBody body;

    public static UpdateConfigItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateConfigItemsResponse self = new UpdateConfigItemsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateConfigItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateConfigItemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateConfigItemsResponse setBody(UpdateConfigItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateConfigItemsResponseBody getBody() {
        return this.body;
    }

}
