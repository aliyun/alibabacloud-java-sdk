// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class DatasetConfigFindOneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DatasetConfigFindOneResponseBody body;

    public static DatasetConfigFindOneResponse build(java.util.Map<String, ?> map) throws Exception {
        DatasetConfigFindOneResponse self = new DatasetConfigFindOneResponse();
        return TeaModel.build(map, self);
    }

    public DatasetConfigFindOneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DatasetConfigFindOneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DatasetConfigFindOneResponse setBody(DatasetConfigFindOneResponseBody body) {
        this.body = body;
        return this;
    }
    public DatasetConfigFindOneResponseBody getBody() {
        return this.body;
    }

}
