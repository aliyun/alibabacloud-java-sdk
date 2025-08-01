// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateDataQualityScanRunResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDataQualityScanRunResponseBody body;

    public static CreateDataQualityScanRunResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDataQualityScanRunResponse self = new CreateDataQualityScanRunResponse();
        return TeaModel.build(map, self);
    }

    public CreateDataQualityScanRunResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDataQualityScanRunResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDataQualityScanRunResponse setBody(CreateDataQualityScanRunResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDataQualityScanRunResponseBody getBody() {
        return this.body;
    }

}
