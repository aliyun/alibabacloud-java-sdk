// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class OfflineJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public OfflineJobResponseBody body;

    public static OfflineJobResponse build(java.util.Map<String, ?> map) throws Exception {
        OfflineJobResponse self = new OfflineJobResponse();
        return TeaModel.build(map, self);
    }

    public OfflineJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OfflineJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OfflineJobResponse setBody(OfflineJobResponseBody body) {
        this.body = body;
        return this;
    }
    public OfflineJobResponseBody getBody() {
        return this.body;
    }

}
