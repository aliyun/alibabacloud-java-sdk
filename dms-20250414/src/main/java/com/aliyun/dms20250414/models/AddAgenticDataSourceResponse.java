// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class AddAgenticDataSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddAgenticDataSourceResponseBody body;

    public static AddAgenticDataSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        AddAgenticDataSourceResponse self = new AddAgenticDataSourceResponse();
        return TeaModel.build(map, self);
    }

    public AddAgenticDataSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddAgenticDataSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddAgenticDataSourceResponse setBody(AddAgenticDataSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public AddAgenticDataSourceResponseBody getBody() {
        return this.body;
    }

}
