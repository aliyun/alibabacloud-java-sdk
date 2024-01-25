// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class UpdateBindMetricResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateBindMetricResponseBody body;

    public static UpdateBindMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateBindMetricResponse self = new UpdateBindMetricResponse();
        return TeaModel.build(map, self);
    }

    public UpdateBindMetricResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateBindMetricResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateBindMetricResponse setBody(UpdateBindMetricResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateBindMetricResponseBody getBody() {
        return this.body;
    }

}
