// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateHadoopDataSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateHadoopDataSourceResponseBody body;

    public static CreateHadoopDataSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHadoopDataSourceResponse self = new CreateHadoopDataSourceResponse();
        return TeaModel.build(map, self);
    }

    public CreateHadoopDataSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHadoopDataSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateHadoopDataSourceResponse setBody(CreateHadoopDataSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHadoopDataSourceResponseBody getBody() {
        return this.body;
    }

}
