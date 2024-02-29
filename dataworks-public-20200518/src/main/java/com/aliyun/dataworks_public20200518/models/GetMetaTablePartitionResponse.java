// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTablePartitionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMetaTablePartitionResponseBody body;

    public static GetMetaTablePartitionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTablePartitionResponse self = new GetMetaTablePartitionResponse();
        return TeaModel.build(map, self);
    }

    public GetMetaTablePartitionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMetaTablePartitionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMetaTablePartitionResponse setBody(GetMetaTablePartitionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMetaTablePartitionResponseBody getBody() {
        return this.body;
    }

}
