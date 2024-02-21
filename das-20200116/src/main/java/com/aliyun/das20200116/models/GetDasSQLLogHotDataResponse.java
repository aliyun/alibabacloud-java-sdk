// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetDasSQLLogHotDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDasSQLLogHotDataResponseBody body;

    public static GetDasSQLLogHotDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDasSQLLogHotDataResponse self = new GetDasSQLLogHotDataResponse();
        return TeaModel.build(map, self);
    }

    public GetDasSQLLogHotDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDasSQLLogHotDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDasSQLLogHotDataResponse setBody(GetDasSQLLogHotDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDasSQLLogHotDataResponseBody getBody() {
        return this.body;
    }

}
