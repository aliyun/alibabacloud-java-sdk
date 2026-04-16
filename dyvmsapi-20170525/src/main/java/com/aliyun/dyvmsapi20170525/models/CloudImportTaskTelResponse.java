// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudImportTaskTelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloudImportTaskTelResponseBody body;

    public static CloudImportTaskTelResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudImportTaskTelResponse self = new CloudImportTaskTelResponse();
        return TeaModel.build(map, self);
    }

    public CloudImportTaskTelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudImportTaskTelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudImportTaskTelResponse setBody(CloudImportTaskTelResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudImportTaskTelResponseBody getBody() {
        return this.body;
    }

}
