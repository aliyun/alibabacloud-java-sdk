// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetDatasetJobConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDatasetJobConfigResponseBody body;

    public static GetDatasetJobConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDatasetJobConfigResponse self = new GetDatasetJobConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetDatasetJobConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDatasetJobConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDatasetJobConfigResponse setBody(GetDatasetJobConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDatasetJobConfigResponseBody getBody() {
        return this.body;
    }

}
