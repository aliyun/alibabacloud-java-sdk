// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddStudioLayoutResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddStudioLayoutResponseBody body;

    public static AddStudioLayoutResponse build(java.util.Map<String, ?> map) throws Exception {
        AddStudioLayoutResponse self = new AddStudioLayoutResponse();
        return TeaModel.build(map, self);
    }

    public AddStudioLayoutResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddStudioLayoutResponse setBody(AddStudioLayoutResponseBody body) {
        this.body = body;
        return this;
    }
    public AddStudioLayoutResponseBody getBody() {
        return this.body;
    }

}
