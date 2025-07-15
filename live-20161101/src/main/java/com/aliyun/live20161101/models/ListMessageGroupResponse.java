// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListMessageGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMessageGroupResponseBody body;

    public static ListMessageGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMessageGroupResponse self = new ListMessageGroupResponse();
        return TeaModel.build(map, self);
    }

    public ListMessageGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMessageGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMessageGroupResponse setBody(ListMessageGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMessageGroupResponseBody getBody() {
        return this.body;
    }

}
