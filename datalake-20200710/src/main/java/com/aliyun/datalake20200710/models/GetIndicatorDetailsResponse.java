// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetIndicatorDetailsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetIndicatorDetailsResponseBody body;

    public static GetIndicatorDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIndicatorDetailsResponse self = new GetIndicatorDetailsResponse();
        return TeaModel.build(map, self);
    }

    public GetIndicatorDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIndicatorDetailsResponse setBody(GetIndicatorDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIndicatorDetailsResponseBody getBody() {
        return this.body;
    }

}
