// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetTableColumnListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTableColumnListResponseBody body;

    public static GetTableColumnListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTableColumnListResponse self = new GetTableColumnListResponse();
        return TeaModel.build(map, self);
    }

    public GetTableColumnListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTableColumnListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTableColumnListResponse setBody(GetTableColumnListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTableColumnListResponseBody getBody() {
        return this.body;
    }

}
