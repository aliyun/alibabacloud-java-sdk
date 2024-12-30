// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateDataLakeTableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDataLakeTableResponseBody body;

    public static UpdateDataLakeTableResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataLakeTableResponse self = new UpdateDataLakeTableResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDataLakeTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDataLakeTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDataLakeTableResponse setBody(UpdateDataLakeTableResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDataLakeTableResponseBody getBody() {
        return this.body;
    }

}
