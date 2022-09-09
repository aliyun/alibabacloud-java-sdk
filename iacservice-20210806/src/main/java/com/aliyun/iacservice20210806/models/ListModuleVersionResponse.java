// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListModuleVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListModuleVersionResponseBody body;

    public static ListModuleVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        ListModuleVersionResponse self = new ListModuleVersionResponse();
        return TeaModel.build(map, self);
    }

    public ListModuleVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListModuleVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListModuleVersionResponse setBody(ListModuleVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public ListModuleVersionResponseBody getBody() {
        return this.body;
    }

}
