// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class RemoveEntityTagsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveEntityTagsResponseBody body;

    public static RemoveEntityTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveEntityTagsResponse self = new RemoveEntityTagsResponse();
        return TeaModel.build(map, self);
    }

    public RemoveEntityTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveEntityTagsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveEntityTagsResponse setBody(RemoveEntityTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveEntityTagsResponseBody getBody() {
        return this.body;
    }

}
