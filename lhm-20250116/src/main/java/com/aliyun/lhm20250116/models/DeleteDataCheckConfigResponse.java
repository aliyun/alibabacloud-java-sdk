// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class DeleteDataCheckConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDataCheckConfigResponseBody body;

    public static DeleteDataCheckConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataCheckConfigResponse self = new DeleteDataCheckConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDataCheckConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDataCheckConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDataCheckConfigResponse setBody(DeleteDataCheckConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDataCheckConfigResponseBody getBody() {
        return this.body;
    }

}
