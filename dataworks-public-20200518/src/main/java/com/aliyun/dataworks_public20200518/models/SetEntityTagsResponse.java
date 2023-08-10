// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class SetEntityTagsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SetEntityTagsResponseBody body;

    public static SetEntityTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        SetEntityTagsResponse self = new SetEntityTagsResponse();
        return TeaModel.build(map, self);
    }

    public SetEntityTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetEntityTagsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetEntityTagsResponse setBody(SetEntityTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public SetEntityTagsResponseBody getBody() {
        return this.body;
    }

}
