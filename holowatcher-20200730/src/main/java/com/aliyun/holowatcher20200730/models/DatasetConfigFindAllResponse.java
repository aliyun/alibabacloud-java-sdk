// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class DatasetConfigFindAllResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DatasetConfigFindAllResponseBody body;

    public static DatasetConfigFindAllResponse build(java.util.Map<String, ?> map) throws Exception {
        DatasetConfigFindAllResponse self = new DatasetConfigFindAllResponse();
        return TeaModel.build(map, self);
    }

    public DatasetConfigFindAllResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DatasetConfigFindAllResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DatasetConfigFindAllResponse setBody(DatasetConfigFindAllResponseBody body) {
        this.body = body;
        return this;
    }
    public DatasetConfigFindAllResponseBody getBody() {
        return this.body;
    }

}
