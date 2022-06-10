// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ListUserPointRecordsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListUserPointRecordsResponseBody body;

    public static ListUserPointRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserPointRecordsResponse self = new ListUserPointRecordsResponse();
        return TeaModel.build(map, self);
    }

    public ListUserPointRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserPointRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUserPointRecordsResponse setBody(ListUserPointRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserPointRecordsResponseBody getBody() {
        return this.body;
    }

}
