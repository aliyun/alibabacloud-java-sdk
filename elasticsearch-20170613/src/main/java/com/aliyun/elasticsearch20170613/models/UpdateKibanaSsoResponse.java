// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateKibanaSsoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateKibanaSsoResponseBody body;

    public static UpdateKibanaSsoResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateKibanaSsoResponse self = new UpdateKibanaSsoResponse();
        return TeaModel.build(map, self);
    }

    public UpdateKibanaSsoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateKibanaSsoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateKibanaSsoResponse setBody(UpdateKibanaSsoResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateKibanaSsoResponseBody getBody() {
        return this.body;
    }

}
