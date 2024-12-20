// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetQualityProjectLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetQualityProjectLogResponseBody body;

    public static GetQualityProjectLogResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQualityProjectLogResponse self = new GetQualityProjectLogResponse();
        return TeaModel.build(map, self);
    }

    public GetQualityProjectLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQualityProjectLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetQualityProjectLogResponse setBody(GetQualityProjectLogResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQualityProjectLogResponseBody getBody() {
        return this.body;
    }

}
