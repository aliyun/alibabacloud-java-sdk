// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class TopTenElapsedTimeInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TopTenElapsedTimeInstanceResponseBody body;

    public static TopTenElapsedTimeInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        TopTenElapsedTimeInstanceResponse self = new TopTenElapsedTimeInstanceResponse();
        return TeaModel.build(map, self);
    }

    public TopTenElapsedTimeInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TopTenElapsedTimeInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TopTenElapsedTimeInstanceResponse setBody(TopTenElapsedTimeInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public TopTenElapsedTimeInstanceResponseBody getBody() {
        return this.body;
    }

}
