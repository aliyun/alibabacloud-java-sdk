// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ListTopologyViewResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListTopologyViewResponseBody body;

    public static ListTopologyViewResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTopologyViewResponse self = new ListTopologyViewResponse();
        return TeaModel.build(map, self);
    }

    public ListTopologyViewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTopologyViewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTopologyViewResponse setBody(ListTopologyViewResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTopologyViewResponseBody getBody() {
        return this.body;
    }

}
