// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class DatasetUpdateOneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DatasetUpdateOneResponseBody body;

    public static DatasetUpdateOneResponse build(java.util.Map<String, ?> map) throws Exception {
        DatasetUpdateOneResponse self = new DatasetUpdateOneResponse();
        return TeaModel.build(map, self);
    }

    public DatasetUpdateOneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DatasetUpdateOneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DatasetUpdateOneResponse setBody(DatasetUpdateOneResponseBody body) {
        this.body = body;
        return this;
    }
    public DatasetUpdateOneResponseBody getBody() {
        return this.body;
    }

}
