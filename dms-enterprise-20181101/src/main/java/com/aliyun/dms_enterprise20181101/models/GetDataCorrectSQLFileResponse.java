// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataCorrectSQLFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataCorrectSQLFileResponseBody body;

    public static GetDataCorrectSQLFileResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataCorrectSQLFileResponse self = new GetDataCorrectSQLFileResponse();
        return TeaModel.build(map, self);
    }

    public GetDataCorrectSQLFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataCorrectSQLFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataCorrectSQLFileResponse setBody(GetDataCorrectSQLFileResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataCorrectSQLFileResponseBody getBody() {
        return this.body;
    }

}
