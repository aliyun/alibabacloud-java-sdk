// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CheckDataSourceConnectivityByIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckDataSourceConnectivityByIdResponseBody body;

    public static CheckDataSourceConnectivityByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckDataSourceConnectivityByIdResponse self = new CheckDataSourceConnectivityByIdResponse();
        return TeaModel.build(map, self);
    }

    public CheckDataSourceConnectivityByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckDataSourceConnectivityByIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckDataSourceConnectivityByIdResponse setBody(CheckDataSourceConnectivityByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckDataSourceConnectivityByIdResponseBody getBody() {
        return this.body;
    }

}
