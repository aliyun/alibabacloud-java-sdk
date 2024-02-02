// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateDownloadDataJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDownloadDataJobResponseBody body;

    public static CreateDownloadDataJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDownloadDataJobResponse self = new CreateDownloadDataJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateDownloadDataJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDownloadDataJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDownloadDataJobResponse setBody(CreateDownloadDataJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDownloadDataJobResponseBody getBody() {
        return this.body;
    }

}
