// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class GetIcebergTableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public IcebergTable body;

    public static GetIcebergTableResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIcebergTableResponse self = new GetIcebergTableResponse();
        return TeaModel.build(map, self);
    }

    public GetIcebergTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIcebergTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetIcebergTableResponse setBody(IcebergTable body) {
        this.body = body;
        return this;
    }
    public IcebergTable getBody() {
        return this.body;
    }

}
