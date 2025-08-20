// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetADBSparkNecessaryRAMPermissionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetADBSparkNecessaryRAMPermissionsResponseBody body;

    public static GetADBSparkNecessaryRAMPermissionsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetADBSparkNecessaryRAMPermissionsResponse self = new GetADBSparkNecessaryRAMPermissionsResponse();
        return TeaModel.build(map, self);
    }

    public GetADBSparkNecessaryRAMPermissionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetADBSparkNecessaryRAMPermissionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetADBSparkNecessaryRAMPermissionsResponse setBody(GetADBSparkNecessaryRAMPermissionsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetADBSparkNecessaryRAMPermissionsResponseBody getBody() {
        return this.body;
    }

}
