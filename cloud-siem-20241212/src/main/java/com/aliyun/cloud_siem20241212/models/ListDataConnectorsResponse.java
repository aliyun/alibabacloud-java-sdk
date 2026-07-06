// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListDataConnectorsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataConnectorsResponseBody body;

    public static ListDataConnectorsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataConnectorsResponse self = new ListDataConnectorsResponse();
        return TeaModel.build(map, self);
    }

    public ListDataConnectorsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataConnectorsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataConnectorsResponse setBody(ListDataConnectorsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataConnectorsResponseBody getBody() {
        return this.body;
    }

}
