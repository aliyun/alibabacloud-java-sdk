// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class UpdateDcdnSubTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDcdnSubTaskResponseBody body;

    public static UpdateDcdnSubTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDcdnSubTaskResponse self = new UpdateDcdnSubTaskResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDcdnSubTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDcdnSubTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDcdnSubTaskResponse setBody(UpdateDcdnSubTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDcdnSubTaskResponseBody getBody() {
        return this.body;
    }

}
