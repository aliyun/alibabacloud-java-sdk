// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class UpdateWebFilterRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateWebFilterRulesResponseBody body;

    public static UpdateWebFilterRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWebFilterRulesResponse self = new UpdateWebFilterRulesResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWebFilterRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateWebFilterRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateWebFilterRulesResponse setBody(UpdateWebFilterRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateWebFilterRulesResponseBody getBody() {
        return this.body;
    }

}
