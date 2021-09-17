// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class GetAliyunInstanceRouteSaleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAliyunInstanceRouteSaleResponseBody body;

    public static GetAliyunInstanceRouteSaleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAliyunInstanceRouteSaleResponse self = new GetAliyunInstanceRouteSaleResponse();
        return TeaModel.build(map, self);
    }

    public GetAliyunInstanceRouteSaleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAliyunInstanceRouteSaleResponse setBody(GetAliyunInstanceRouteSaleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAliyunInstanceRouteSaleResponseBody getBody() {
        return this.body;
    }

}
