// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateOTAJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateOTAJobResponseBody body;

    public static UpdateOTAJobResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateOTAJobResponse self = new UpdateOTAJobResponse();
        return TeaModel.build(map, self);
    }

    public UpdateOTAJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateOTAJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateOTAJobResponse setBody(UpdateOTAJobResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateOTAJobResponseBody getBody() {
        return this.body;
    }

}
