// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class AddAssetsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddAssetsResponseBody body;

    public static AddAssetsResponse build(java.util.Map<String, ?> map) throws Exception {
        AddAssetsResponse self = new AddAssetsResponse();
        return TeaModel.build(map, self);
    }

    public AddAssetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddAssetsResponse setBody(AddAssetsResponseBody body) {
        this.body = body;
        return this;
    }
    public AddAssetsResponseBody getBody() {
        return this.body;
    }

}
