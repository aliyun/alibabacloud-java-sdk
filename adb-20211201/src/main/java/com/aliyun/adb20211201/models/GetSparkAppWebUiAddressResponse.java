// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetSparkAppWebUiAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSparkAppWebUiAddressResponseBody body;

    public static GetSparkAppWebUiAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSparkAppWebUiAddressResponse self = new GetSparkAppWebUiAddressResponse();
        return TeaModel.build(map, self);
    }

    public GetSparkAppWebUiAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSparkAppWebUiAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSparkAppWebUiAddressResponse setBody(GetSparkAppWebUiAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSparkAppWebUiAddressResponseBody getBody() {
        return this.body;
    }

}
