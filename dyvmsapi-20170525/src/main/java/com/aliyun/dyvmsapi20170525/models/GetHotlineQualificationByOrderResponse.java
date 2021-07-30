// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class GetHotlineQualificationByOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetHotlineQualificationByOrderResponseBody body;

    public static GetHotlineQualificationByOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHotlineQualificationByOrderResponse self = new GetHotlineQualificationByOrderResponse();
        return TeaModel.build(map, self);
    }

    public GetHotlineQualificationByOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHotlineQualificationByOrderResponse setBody(GetHotlineQualificationByOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHotlineQualificationByOrderResponseBody getBody() {
        return this.body;
    }

}
