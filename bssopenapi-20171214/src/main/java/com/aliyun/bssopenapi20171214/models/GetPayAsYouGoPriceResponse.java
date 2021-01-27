// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class GetPayAsYouGoPriceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetPayAsYouGoPriceResponseBody body;

    public static GetPayAsYouGoPriceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPayAsYouGoPriceResponse self = new GetPayAsYouGoPriceResponse();
        return TeaModel.build(map, self);
    }

    public GetPayAsYouGoPriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPayAsYouGoPriceResponse setBody(GetPayAsYouGoPriceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPayAsYouGoPriceResponseBody getBody() {
        return this.body;
    }

}
