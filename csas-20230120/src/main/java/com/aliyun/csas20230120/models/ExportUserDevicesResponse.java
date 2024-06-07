// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ExportUserDevicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExportUserDevicesResponseBody body;

    public static ExportUserDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportUserDevicesResponse self = new ExportUserDevicesResponse();
        return TeaModel.build(map, self);
    }

    public ExportUserDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportUserDevicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportUserDevicesResponse setBody(ExportUserDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportUserDevicesResponseBody getBody() {
        return this.body;
    }

}
