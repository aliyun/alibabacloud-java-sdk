// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class UpdateEntityItemsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateEntityItemsResponseBody body;

    public static UpdateEntityItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEntityItemsResponse self = new UpdateEntityItemsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEntityItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEntityItemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateEntityItemsResponse setBody(UpdateEntityItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEntityItemsResponseBody getBody() {
        return this.body;
    }

}
