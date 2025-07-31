// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateDataQualityScanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDataQualityScanResponseBody body;

    public static UpdateDataQualityScanResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataQualityScanResponse self = new UpdateDataQualityScanResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDataQualityScanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDataQualityScanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDataQualityScanResponse setBody(UpdateDataQualityScanResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDataQualityScanResponseBody getBody() {
        return this.body;
    }

}
