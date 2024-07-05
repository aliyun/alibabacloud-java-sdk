// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ListFpShotDBResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFpShotDBResponseBody body;

    public static ListFpShotDBResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFpShotDBResponse self = new ListFpShotDBResponse();
        return TeaModel.build(map, self);
    }

    public ListFpShotDBResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFpShotDBResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFpShotDBResponse setBody(ListFpShotDBResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFpShotDBResponseBody getBody() {
        return this.body;
    }

}
