// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddCasterVideoResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddCasterVideoResourceResponseBody body;

    public static AddCasterVideoResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        AddCasterVideoResourceResponse self = new AddCasterVideoResourceResponse();
        return TeaModel.build(map, self);
    }

    public AddCasterVideoResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddCasterVideoResourceResponse setBody(AddCasterVideoResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public AddCasterVideoResourceResponseBody getBody() {
        return this.body;
    }

}
