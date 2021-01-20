// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateCmsCallNumOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateCmsCallNumOrderResponseBody body;

    public static CreateCmsCallNumOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCmsCallNumOrderResponse self = new CreateCmsCallNumOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreateCmsCallNumOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCmsCallNumOrderResponse setBody(CreateCmsCallNumOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCmsCallNumOrderResponseBody getBody() {
        return this.body;
    }

}
