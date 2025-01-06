// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ListMachineTypesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMachineTypesResponseBody body;

    public static ListMachineTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMachineTypesResponse self = new ListMachineTypesResponse();
        return TeaModel.build(map, self);
    }

    public ListMachineTypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMachineTypesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMachineTypesResponse setBody(ListMachineTypesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMachineTypesResponseBody getBody() {
        return this.body;
    }

}
