// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DeleteHadoopDataSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteHadoopDataSourceResponseBody body;

    public static DeleteHadoopDataSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHadoopDataSourceResponse self = new DeleteHadoopDataSourceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHadoopDataSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHadoopDataSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteHadoopDataSourceResponse setBody(DeleteHadoopDataSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHadoopDataSourceResponseBody getBody() {
        return this.body;
    }

}
