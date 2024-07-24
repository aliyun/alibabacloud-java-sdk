// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetRumOcuStatisticDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRumOcuStatisticDataResponseBody body;

    public static GetRumOcuStatisticDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRumOcuStatisticDataResponse self = new GetRumOcuStatisticDataResponse();
        return TeaModel.build(map, self);
    }

    public GetRumOcuStatisticDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRumOcuStatisticDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRumOcuStatisticDataResponse setBody(GetRumOcuStatisticDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRumOcuStatisticDataResponseBody getBody() {
        return this.body;
    }

}
