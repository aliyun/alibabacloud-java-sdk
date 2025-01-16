// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetProjectExportJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetProjectExportJobResponseBody body;

    public static GetProjectExportJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProjectExportJobResponse self = new GetProjectExportJobResponse();
        return TeaModel.build(map, self);
    }

    public GetProjectExportJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProjectExportJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetProjectExportJobResponse setBody(GetProjectExportJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProjectExportJobResponseBody getBody() {
        return this.body;
    }

}
