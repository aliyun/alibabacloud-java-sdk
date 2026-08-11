// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class UpdateMetaLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMetaLogResponseBody body;

    public static UpdateMetaLogResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMetaLogResponse self = new UpdateMetaLogResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMetaLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMetaLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMetaLogResponse setBody(UpdateMetaLogResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMetaLogResponseBody getBody() {
        return this.body;
    }

}
