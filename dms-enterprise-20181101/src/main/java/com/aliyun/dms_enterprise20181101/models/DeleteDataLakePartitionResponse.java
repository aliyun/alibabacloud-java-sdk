// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DeleteDataLakePartitionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDataLakePartitionResponseBody body;

    public static DeleteDataLakePartitionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataLakePartitionResponse self = new DeleteDataLakePartitionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDataLakePartitionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDataLakePartitionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDataLakePartitionResponse setBody(DeleteDataLakePartitionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDataLakePartitionResponseBody getBody() {
        return this.body;
    }

}
