// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataanalysisgbi20240823.models;

import com.aliyun.tea.*;

public class UpdateVirtualDatasourceInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateVirtualDatasourceInstanceResponseBody body;

    public static UpdateVirtualDatasourceInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateVirtualDatasourceInstanceResponse self = new UpdateVirtualDatasourceInstanceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateVirtualDatasourceInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateVirtualDatasourceInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateVirtualDatasourceInstanceResponse setBody(UpdateVirtualDatasourceInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateVirtualDatasourceInstanceResponseBody getBody() {
        return this.body;
    }

}
