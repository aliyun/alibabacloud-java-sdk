// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetRowPermissionByTableGuidsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRowPermissionByTableGuidsResponseBody body;

    public static GetRowPermissionByTableGuidsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRowPermissionByTableGuidsResponse self = new GetRowPermissionByTableGuidsResponse();
        return TeaModel.build(map, self);
    }

    public GetRowPermissionByTableGuidsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRowPermissionByTableGuidsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRowPermissionByTableGuidsResponse setBody(GetRowPermissionByTableGuidsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRowPermissionByTableGuidsResponseBody getBody() {
        return this.body;
    }

}
