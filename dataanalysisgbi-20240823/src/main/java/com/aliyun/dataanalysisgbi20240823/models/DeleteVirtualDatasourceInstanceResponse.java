// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataanalysisgbi20240823.models;

import com.aliyun.tea.*;

public class DeleteVirtualDatasourceInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteVirtualDatasourceInstanceResponseBody body;

    public static DeleteVirtualDatasourceInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVirtualDatasourceInstanceResponse self = new DeleteVirtualDatasourceInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVirtualDatasourceInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVirtualDatasourceInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteVirtualDatasourceInstanceResponse setBody(DeleteVirtualDatasourceInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVirtualDatasourceInstanceResponseBody getBody() {
        return this.body;
    }

}
