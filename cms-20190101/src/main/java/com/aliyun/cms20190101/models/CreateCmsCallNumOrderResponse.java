// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateCmsCallNumOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public CreateCmsCallNumOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCmsCallNumOrderResponse setBody(CreateCmsCallNumOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCmsCallNumOrderResponseBody getBody() {
        return this.body;
    }

}
