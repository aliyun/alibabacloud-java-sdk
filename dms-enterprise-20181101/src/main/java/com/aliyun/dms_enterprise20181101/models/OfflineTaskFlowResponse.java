// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class OfflineTaskFlowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OfflineTaskFlowResponseBody body;

    public static OfflineTaskFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        OfflineTaskFlowResponse self = new OfflineTaskFlowResponse();
        return TeaModel.build(map, self);
    }

    public OfflineTaskFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OfflineTaskFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OfflineTaskFlowResponse setBody(OfflineTaskFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public OfflineTaskFlowResponseBody getBody() {
        return this.body;
    }

}
