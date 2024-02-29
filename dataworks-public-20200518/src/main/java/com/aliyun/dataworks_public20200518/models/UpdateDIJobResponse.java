// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateDIJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDIJobResponseBody body;

    public static UpdateDIJobResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDIJobResponse self = new UpdateDIJobResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDIJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDIJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDIJobResponse setBody(UpdateDIJobResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDIJobResponseBody getBody() {
        return this.body;
    }

}
