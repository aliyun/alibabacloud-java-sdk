// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateDataLakePartitionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDataLakePartitionResponseBody body;

    public static UpdateDataLakePartitionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataLakePartitionResponse self = new UpdateDataLakePartitionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDataLakePartitionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDataLakePartitionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDataLakePartitionResponse setBody(UpdateDataLakePartitionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDataLakePartitionResponseBody getBody() {
        return this.body;
    }

}
