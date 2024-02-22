// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class AddDataSourceLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddDataSourceLogResponseBody body;

    public static AddDataSourceLogResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDataSourceLogResponse self = new AddDataSourceLogResponse();
        return TeaModel.build(map, self);
    }

    public AddDataSourceLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddDataSourceLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddDataSourceLogResponse setBody(AddDataSourceLogResponseBody body) {
        this.body = body;
        return this;
    }
    public AddDataSourceLogResponseBody getBody() {
        return this.body;
    }

}
