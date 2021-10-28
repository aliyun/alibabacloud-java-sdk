// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class UpdateEntityItemsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public UpdateEntityItemsResponse setBody(UpdateEntityItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEntityItemsResponseBody getBody() {
        return this.body;
    }

}
