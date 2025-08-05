// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class CheckMetaPartitionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckMetaPartitionResponseBody body;

    public static CheckMetaPartitionResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckMetaPartitionResponse self = new CheckMetaPartitionResponse();
        return TeaModel.build(map, self);
    }

    public CheckMetaPartitionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckMetaPartitionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckMetaPartitionResponse setBody(CheckMetaPartitionResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckMetaPartitionResponseBody getBody() {
        return this.body;
    }

}
