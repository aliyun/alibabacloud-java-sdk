// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CheckDataSourceConnectivityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckDataSourceConnectivityResponseBody body;

    public static CheckDataSourceConnectivityResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckDataSourceConnectivityResponse self = new CheckDataSourceConnectivityResponse();
        return TeaModel.build(map, self);
    }

    public CheckDataSourceConnectivityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckDataSourceConnectivityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckDataSourceConnectivityResponse setBody(CheckDataSourceConnectivityResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckDataSourceConnectivityResponseBody getBody() {
        return this.body;
    }

}
