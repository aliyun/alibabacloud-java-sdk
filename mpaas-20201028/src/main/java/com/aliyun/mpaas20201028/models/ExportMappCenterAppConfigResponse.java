// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ExportMappCenterAppConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExportMappCenterAppConfigResponseBody body;

    public static ExportMappCenterAppConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportMappCenterAppConfigResponse self = new ExportMappCenterAppConfigResponse();
        return TeaModel.build(map, self);
    }

    public ExportMappCenterAppConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportMappCenterAppConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportMappCenterAppConfigResponse setBody(ExportMappCenterAppConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportMappCenterAppConfigResponseBody getBody() {
        return this.body;
    }

}
