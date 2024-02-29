// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTableLineageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMetaTableLineageResponseBody body;

    public static GetMetaTableLineageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableLineageResponse self = new GetMetaTableLineageResponse();
        return TeaModel.build(map, self);
    }

    public GetMetaTableLineageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMetaTableLineageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMetaTableLineageResponse setBody(GetMetaTableLineageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMetaTableLineageResponseBody getBody() {
        return this.body;
    }

}
