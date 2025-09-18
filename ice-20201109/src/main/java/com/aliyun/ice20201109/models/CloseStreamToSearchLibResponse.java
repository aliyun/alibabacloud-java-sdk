// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CloseStreamToSearchLibResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloseStreamToSearchLibResponseBody body;

    public static CloseStreamToSearchLibResponse build(java.util.Map<String, ?> map) throws Exception {
        CloseStreamToSearchLibResponse self = new CloseStreamToSearchLibResponse();
        return TeaModel.build(map, self);
    }

    public CloseStreamToSearchLibResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloseStreamToSearchLibResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloseStreamToSearchLibResponse setBody(CloseStreamToSearchLibResponseBody body) {
        this.body = body;
        return this;
    }
    public CloseStreamToSearchLibResponseBody getBody() {
        return this.body;
    }

}
