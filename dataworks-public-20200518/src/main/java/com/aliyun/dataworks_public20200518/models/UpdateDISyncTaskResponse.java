// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateDISyncTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDISyncTaskResponseBody body;

    public static UpdateDISyncTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDISyncTaskResponse self = new UpdateDISyncTaskResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDISyncTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDISyncTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDISyncTaskResponse setBody(UpdateDISyncTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDISyncTaskResponseBody getBody() {
        return this.body;
    }

}
