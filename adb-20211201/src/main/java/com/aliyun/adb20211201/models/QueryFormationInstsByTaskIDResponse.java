// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class QueryFormationInstsByTaskIDResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryFormationInstsByTaskIDResponseBody body;

    public static QueryFormationInstsByTaskIDResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFormationInstsByTaskIDResponse self = new QueryFormationInstsByTaskIDResponse();
        return TeaModel.build(map, self);
    }

    public QueryFormationInstsByTaskIDResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryFormationInstsByTaskIDResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryFormationInstsByTaskIDResponse setBody(QueryFormationInstsByTaskIDResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryFormationInstsByTaskIDResponseBody getBody() {
        return this.body;
    }

}
