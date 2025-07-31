// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetDataQualityScanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataQualityScanResponseBody body;

    public static GetDataQualityScanResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataQualityScanResponse self = new GetDataQualityScanResponse();
        return TeaModel.build(map, self);
    }

    public GetDataQualityScanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataQualityScanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataQualityScanResponse setBody(GetDataQualityScanResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataQualityScanResponseBody getBody() {
        return this.body;
    }

}
