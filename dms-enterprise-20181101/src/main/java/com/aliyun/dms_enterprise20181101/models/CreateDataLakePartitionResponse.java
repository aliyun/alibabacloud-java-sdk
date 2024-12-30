// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateDataLakePartitionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDataLakePartitionResponseBody body;

    public static CreateDataLakePartitionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDataLakePartitionResponse self = new CreateDataLakePartitionResponse();
        return TeaModel.build(map, self);
    }

    public CreateDataLakePartitionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDataLakePartitionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDataLakePartitionResponse setBody(CreateDataLakePartitionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDataLakePartitionResponseBody getBody() {
        return this.body;
    }

}
