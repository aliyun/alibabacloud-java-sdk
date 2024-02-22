// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class EnableServiceForCloudSiemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableServiceForCloudSiemResponseBody body;

    public static EnableServiceForCloudSiemResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableServiceForCloudSiemResponse self = new EnableServiceForCloudSiemResponse();
        return TeaModel.build(map, self);
    }

    public EnableServiceForCloudSiemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableServiceForCloudSiemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableServiceForCloudSiemResponse setBody(EnableServiceForCloudSiemResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableServiceForCloudSiemResponseBody getBody() {
        return this.body;
    }

}
