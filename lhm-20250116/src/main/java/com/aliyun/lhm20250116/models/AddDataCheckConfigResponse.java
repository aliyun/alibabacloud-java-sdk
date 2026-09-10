// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class AddDataCheckConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddDataCheckConfigResponseBody body;

    public static AddDataCheckConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDataCheckConfigResponse self = new AddDataCheckConfigResponse();
        return TeaModel.build(map, self);
    }

    public AddDataCheckConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddDataCheckConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddDataCheckConfigResponse setBody(AddDataCheckConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public AddDataCheckConfigResponseBody getBody() {
        return this.body;
    }

}
