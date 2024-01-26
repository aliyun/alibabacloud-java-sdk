// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdateMetricDropResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMetricDropResponseBody body;

    public static UpdateMetricDropResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMetricDropResponse self = new UpdateMetricDropResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMetricDropResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMetricDropResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMetricDropResponse setBody(UpdateMetricDropResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMetricDropResponseBody getBody() {
        return this.body;
    }

}
