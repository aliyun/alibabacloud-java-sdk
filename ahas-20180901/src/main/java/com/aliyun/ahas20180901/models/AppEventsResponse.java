// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class AppEventsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AppEventsResponseBody body;

    public static AppEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        AppEventsResponse self = new AppEventsResponse();
        return TeaModel.build(map, self);
    }

    public AppEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AppEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AppEventsResponse setBody(AppEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public AppEventsResponseBody getBody() {
        return this.body;
    }

}
