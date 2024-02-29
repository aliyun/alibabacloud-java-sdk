// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTableChangeLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMetaTableChangeLogResponseBody body;

    public static GetMetaTableChangeLogResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableChangeLogResponse self = new GetMetaTableChangeLogResponse();
        return TeaModel.build(map, self);
    }

    public GetMetaTableChangeLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMetaTableChangeLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMetaTableChangeLogResponse setBody(GetMetaTableChangeLogResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMetaTableChangeLogResponseBody getBody() {
        return this.body;
    }

}
