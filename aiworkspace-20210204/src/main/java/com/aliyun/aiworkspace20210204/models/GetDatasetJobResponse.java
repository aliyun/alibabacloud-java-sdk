// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetDatasetJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDatasetJobResponseBody body;

    public static GetDatasetJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDatasetJobResponse self = new GetDatasetJobResponse();
        return TeaModel.build(map, self);
    }

    public GetDatasetJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDatasetJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDatasetJobResponse setBody(GetDatasetJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDatasetJobResponseBody getBody() {
        return this.body;
    }

}
