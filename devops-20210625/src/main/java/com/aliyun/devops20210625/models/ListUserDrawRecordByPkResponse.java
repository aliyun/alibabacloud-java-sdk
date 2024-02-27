// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListUserDrawRecordByPkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUserDrawRecordByPkResponseBody body;

    public static ListUserDrawRecordByPkResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserDrawRecordByPkResponse self = new ListUserDrawRecordByPkResponse();
        return TeaModel.build(map, self);
    }

    public ListUserDrawRecordByPkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserDrawRecordByPkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUserDrawRecordByPkResponse setBody(ListUserDrawRecordByPkResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserDrawRecordByPkResponseBody getBody() {
        return this.body;
    }

}
