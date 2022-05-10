// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class DatasetCreateOneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DatasetCreateOneResponseBody body;

    public static DatasetCreateOneResponse build(java.util.Map<String, ?> map) throws Exception {
        DatasetCreateOneResponse self = new DatasetCreateOneResponse();
        return TeaModel.build(map, self);
    }

    public DatasetCreateOneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DatasetCreateOneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DatasetCreateOneResponse setBody(DatasetCreateOneResponseBody body) {
        this.body = body;
        return this;
    }
    public DatasetCreateOneResponseBody getBody() {
        return this.body;
    }

}
