// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetDataQualityScanRunLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataQualityScanRunLogResponseBody body;

    public static GetDataQualityScanRunLogResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataQualityScanRunLogResponse self = new GetDataQualityScanRunLogResponse();
        return TeaModel.build(map, self);
    }

    public GetDataQualityScanRunLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataQualityScanRunLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataQualityScanRunLogResponse setBody(GetDataQualityScanRunLogResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataQualityScanRunLogResponseBody getBody() {
        return this.body;
    }

}
