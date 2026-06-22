// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class AddDatasetDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddDatasetDataResponseBody body;

    public static AddDatasetDataResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDatasetDataResponse self = new AddDatasetDataResponse();
        return TeaModel.build(map, self);
    }

    public AddDatasetDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddDatasetDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddDatasetDataResponse setBody(AddDatasetDataResponseBody body) {
        this.body = body;
        return this;
    }
    public AddDatasetDataResponseBody getBody() {
        return this.body;
    }

}
