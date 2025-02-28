// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class InnerGetSparkAppWebUiAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InnerGetSparkAppWebUiAddressResponseBody body;

    public static InnerGetSparkAppWebUiAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        InnerGetSparkAppWebUiAddressResponse self = new InnerGetSparkAppWebUiAddressResponse();
        return TeaModel.build(map, self);
    }

    public InnerGetSparkAppWebUiAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InnerGetSparkAppWebUiAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InnerGetSparkAppWebUiAddressResponse setBody(InnerGetSparkAppWebUiAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public InnerGetSparkAppWebUiAddressResponseBody getBody() {
        return this.body;
    }

}
