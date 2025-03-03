// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ListMachineNetworkInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMachineNetworkInfoResponseBody body;

    public static ListMachineNetworkInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMachineNetworkInfoResponse self = new ListMachineNetworkInfoResponse();
        return TeaModel.build(map, self);
    }

    public ListMachineNetworkInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMachineNetworkInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMachineNetworkInfoResponse setBody(ListMachineNetworkInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMachineNetworkInfoResponseBody getBody() {
        return this.body;
    }

}
