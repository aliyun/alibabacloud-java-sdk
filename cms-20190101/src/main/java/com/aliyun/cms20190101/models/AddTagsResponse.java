// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class AddTagsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddTagsResponseBody body;

    public static AddTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        AddTagsResponse self = new AddTagsResponse();
        return TeaModel.build(map, self);
    }

    public AddTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddTagsResponse setBody(AddTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public AddTagsResponseBody getBody() {
        return this.body;
    }

}
