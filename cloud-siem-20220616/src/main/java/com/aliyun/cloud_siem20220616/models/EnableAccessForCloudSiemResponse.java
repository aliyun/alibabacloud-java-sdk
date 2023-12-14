// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class EnableAccessForCloudSiemResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public EnableAccessForCloudSiemResponseBody body;

    public static EnableAccessForCloudSiemResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableAccessForCloudSiemResponse self = new EnableAccessForCloudSiemResponse();
        return TeaModel.build(map, self);
    }

    public EnableAccessForCloudSiemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableAccessForCloudSiemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableAccessForCloudSiemResponse setBody(EnableAccessForCloudSiemResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableAccessForCloudSiemResponseBody getBody() {
        return this.body;
    }

}
