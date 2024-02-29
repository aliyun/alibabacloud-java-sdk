// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateBaselineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateBaselineResponseBody body;

    public static UpdateBaselineResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateBaselineResponse self = new UpdateBaselineResponse();
        return TeaModel.build(map, self);
    }

    public UpdateBaselineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateBaselineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateBaselineResponse setBody(UpdateBaselineResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateBaselineResponseBody getBody() {
        return this.body;
    }

}
