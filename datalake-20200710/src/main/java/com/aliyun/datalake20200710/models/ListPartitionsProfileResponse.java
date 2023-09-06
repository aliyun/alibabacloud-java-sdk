// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListPartitionsProfileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListPartitionsProfileResponseBody body;

    public static ListPartitionsProfileResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPartitionsProfileResponse self = new ListPartitionsProfileResponse();
        return TeaModel.build(map, self);
    }

    public ListPartitionsProfileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPartitionsProfileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPartitionsProfileResponse setBody(ListPartitionsProfileResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPartitionsProfileResponseBody getBody() {
        return this.body;
    }

}
