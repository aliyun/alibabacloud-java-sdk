// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListAvailableTerraformVersionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAvailableTerraformVersionsResponseBody body;

    public static ListAvailableTerraformVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAvailableTerraformVersionsResponse self = new ListAvailableTerraformVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListAvailableTerraformVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAvailableTerraformVersionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAvailableTerraformVersionsResponse setBody(ListAvailableTerraformVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAvailableTerraformVersionsResponseBody getBody() {
        return this.body;
    }

}
