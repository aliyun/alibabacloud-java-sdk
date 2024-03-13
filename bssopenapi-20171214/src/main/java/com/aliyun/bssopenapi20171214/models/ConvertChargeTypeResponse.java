// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class ConvertChargeTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ConvertChargeTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConvertChargeTypeResponse setBody(ConvertChargeTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public ConvertChargeTypeResponseBody getBody() {
        return this.body;
    }

}
