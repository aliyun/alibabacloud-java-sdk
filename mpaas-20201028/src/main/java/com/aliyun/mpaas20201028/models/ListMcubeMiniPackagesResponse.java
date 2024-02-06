// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ListMcubeMiniPackagesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMcubeMiniPackagesResponseBody body;

    public static ListMcubeMiniPackagesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMcubeMiniPackagesResponse self = new ListMcubeMiniPackagesResponse();
        return TeaModel.build(map, self);
    }

    public ListMcubeMiniPackagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMcubeMiniPackagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMcubeMiniPackagesResponse setBody(ListMcubeMiniPackagesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMcubeMiniPackagesResponseBody getBody() {
        return this.body;
    }

}
