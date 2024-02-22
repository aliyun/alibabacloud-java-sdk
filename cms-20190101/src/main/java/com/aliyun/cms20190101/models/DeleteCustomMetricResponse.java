// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteCustomMetricResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCustomMetricResponseBody body;

    public static DeleteCustomMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomMetricResponse self = new DeleteCustomMetricResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCustomMetricResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCustomMetricResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCustomMetricResponse setBody(DeleteCustomMetricResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCustomMetricResponseBody getBody() {
        return this.body;
    }

}
