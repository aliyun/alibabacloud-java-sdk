// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaColumnLineageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMetaColumnLineageResponseBody body;

    public static GetMetaColumnLineageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMetaColumnLineageResponse self = new GetMetaColumnLineageResponse();
        return TeaModel.build(map, self);
    }

    public GetMetaColumnLineageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMetaColumnLineageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMetaColumnLineageResponse setBody(GetMetaColumnLineageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMetaColumnLineageResponseBody getBody() {
        return this.body;
    }

}
