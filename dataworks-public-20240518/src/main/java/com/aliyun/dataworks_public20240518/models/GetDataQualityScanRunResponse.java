// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetDataQualityScanRunResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataQualityScanRunResponseBody body;

    public static GetDataQualityScanRunResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataQualityScanRunResponse self = new GetDataQualityScanRunResponse();
        return TeaModel.build(map, self);
    }

    public GetDataQualityScanRunResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataQualityScanRunResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataQualityScanRunResponse setBody(GetDataQualityScanRunResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataQualityScanRunResponseBody getBody() {
        return this.body;
    }

}
