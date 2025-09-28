// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class BatchEventRedeployInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchEventRedeployInstanceResponseBody body;

    public static BatchEventRedeployInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchEventRedeployInstanceResponse self = new BatchEventRedeployInstanceResponse();
        return TeaModel.build(map, self);
    }

    public BatchEventRedeployInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchEventRedeployInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchEventRedeployInstanceResponse setBody(BatchEventRedeployInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchEventRedeployInstanceResponseBody getBody() {
        return this.body;
    }

}
