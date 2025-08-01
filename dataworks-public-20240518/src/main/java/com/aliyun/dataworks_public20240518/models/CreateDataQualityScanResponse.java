// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateDataQualityScanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDataQualityScanResponseBody body;

    public static CreateDataQualityScanResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDataQualityScanResponse self = new CreateDataQualityScanResponse();
        return TeaModel.build(map, self);
    }

    public CreateDataQualityScanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDataQualityScanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDataQualityScanResponse setBody(CreateDataQualityScanResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDataQualityScanResponseBody getBody() {
        return this.body;
    }

}
