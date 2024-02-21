// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListAvailableEsInstanceIdsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAvailableEsInstanceIdsResponseBody body;

    public static ListAvailableEsInstanceIdsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAvailableEsInstanceIdsResponse self = new ListAvailableEsInstanceIdsResponse();
        return TeaModel.build(map, self);
    }

    public ListAvailableEsInstanceIdsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAvailableEsInstanceIdsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAvailableEsInstanceIdsResponse setBody(ListAvailableEsInstanceIdsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAvailableEsInstanceIdsResponseBody getBody() {
        return this.body;
    }

}
