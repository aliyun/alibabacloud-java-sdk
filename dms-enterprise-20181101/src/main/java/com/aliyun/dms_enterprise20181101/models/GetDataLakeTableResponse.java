// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataLakeTableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataLakeTableResponseBody body;

    public static GetDataLakeTableResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataLakeTableResponse self = new GetDataLakeTableResponse();
        return TeaModel.build(map, self);
    }

    public GetDataLakeTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataLakeTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataLakeTableResponse setBody(GetDataLakeTableResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataLakeTableResponseBody getBody() {
        return this.body;
    }

}
