// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetRemindResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRemindResponseBody body;

    public static GetRemindResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRemindResponse self = new GetRemindResponse();
        return TeaModel.build(map, self);
    }

    public GetRemindResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRemindResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRemindResponse setBody(GetRemindResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRemindResponseBody getBody() {
        return this.body;
    }

}
