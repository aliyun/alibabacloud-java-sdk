// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CheckHadoopDataSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckHadoopDataSourceResponseBody body;

    public static CheckHadoopDataSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckHadoopDataSourceResponse self = new CheckHadoopDataSourceResponse();
        return TeaModel.build(map, self);
    }

    public CheckHadoopDataSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckHadoopDataSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckHadoopDataSourceResponse setBody(CheckHadoopDataSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckHadoopDataSourceResponseBody getBody() {
        return this.body;
    }

}
