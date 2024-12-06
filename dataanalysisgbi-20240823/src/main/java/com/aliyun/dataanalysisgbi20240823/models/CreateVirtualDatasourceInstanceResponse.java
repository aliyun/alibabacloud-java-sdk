// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataanalysisgbi20240823.models;

import com.aliyun.tea.*;

public class CreateVirtualDatasourceInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateVirtualDatasourceInstanceResponseBody body;

    public static CreateVirtualDatasourceInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVirtualDatasourceInstanceResponse self = new CreateVirtualDatasourceInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateVirtualDatasourceInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVirtualDatasourceInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVirtualDatasourceInstanceResponse setBody(CreateVirtualDatasourceInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVirtualDatasourceInstanceResponseBody getBody() {
        return this.body;
    }

}
