// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class OfflineFlowVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OfflineFlowVersionResponseBody body;

    public static OfflineFlowVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        OfflineFlowVersionResponse self = new OfflineFlowVersionResponse();
        return TeaModel.build(map, self);
    }

    public OfflineFlowVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OfflineFlowVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OfflineFlowVersionResponse setBody(OfflineFlowVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public OfflineFlowVersionResponseBody getBody() {
        return this.body;
    }

}
