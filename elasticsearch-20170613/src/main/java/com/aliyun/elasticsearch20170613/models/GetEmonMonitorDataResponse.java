// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class GetEmonMonitorDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEmonMonitorDataResponseBody body;

    public static GetEmonMonitorDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEmonMonitorDataResponse self = new GetEmonMonitorDataResponse();
        return TeaModel.build(map, self);
    }

    public GetEmonMonitorDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEmonMonitorDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEmonMonitorDataResponse setBody(GetEmonMonitorDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEmonMonitorDataResponseBody getBody() {
        return this.body;
    }

}
