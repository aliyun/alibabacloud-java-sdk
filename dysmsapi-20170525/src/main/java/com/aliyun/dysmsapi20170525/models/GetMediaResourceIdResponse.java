// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class GetMediaResourceIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMediaResourceIdResponseBody body;

    public static GetMediaResourceIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMediaResourceIdResponse self = new GetMediaResourceIdResponse();
        return TeaModel.build(map, self);
    }

    public GetMediaResourceIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMediaResourceIdResponse setBody(GetMediaResourceIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMediaResourceIdResponseBody getBody() {
        return this.body;
    }

}
