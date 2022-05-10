// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class DatasetConfigUpdateOneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DatasetConfigUpdateOneResponseBody body;

    public static DatasetConfigUpdateOneResponse build(java.util.Map<String, ?> map) throws Exception {
        DatasetConfigUpdateOneResponse self = new DatasetConfigUpdateOneResponse();
        return TeaModel.build(map, self);
    }

    public DatasetConfigUpdateOneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DatasetConfigUpdateOneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DatasetConfigUpdateOneResponse setBody(DatasetConfigUpdateOneResponseBody body) {
        this.body = body;
        return this;
    }
    public DatasetConfigUpdateOneResponseBody getBody() {
        return this.body;
    }

}
