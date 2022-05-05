// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeletePrometheusGlobalViewResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeletePrometheusGlobalViewResponseBody body;

    public static DeletePrometheusGlobalViewResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePrometheusGlobalViewResponse self = new DeletePrometheusGlobalViewResponse();
        return TeaModel.build(map, self);
    }

    public DeletePrometheusGlobalViewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePrometheusGlobalViewResponse setBody(DeletePrometheusGlobalViewResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePrometheusGlobalViewResponseBody getBody() {
        return this.body;
    }

}
