// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class ConvertChargeTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ConvertChargeTypeResponseBody body;

    public static ConvertChargeTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        ConvertChargeTypeResponse self = new ConvertChargeTypeResponse();
        return TeaModel.build(map, self);
    }

    public ConvertChargeTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConvertChargeTypeResponse setBody(ConvertChargeTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public ConvertChargeTypeResponseBody getBody() {
        return this.body;
    }

}
