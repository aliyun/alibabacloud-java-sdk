// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteCustomMetricResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
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
