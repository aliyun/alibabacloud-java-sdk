// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListPrometheusAlertTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListPrometheusAlertTemplatesResponseBody body;

    public static ListPrometheusAlertTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPrometheusAlertTemplatesResponse self = new ListPrometheusAlertTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListPrometheusAlertTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPrometheusAlertTemplatesResponse setBody(ListPrometheusAlertTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPrometheusAlertTemplatesResponseBody getBody() {
        return this.body;
    }

}
