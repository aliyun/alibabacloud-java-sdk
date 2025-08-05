// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class UpdateNodeStatisticResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateNodeStatisticResponseBody body;

    public static UpdateNodeStatisticResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateNodeStatisticResponse self = new UpdateNodeStatisticResponse();
        return TeaModel.build(map, self);
    }

    public UpdateNodeStatisticResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateNodeStatisticResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateNodeStatisticResponse setBody(UpdateNodeStatisticResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateNodeStatisticResponseBody getBody() {
        return this.body;
    }

}
