// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteHybridMonitorSLSGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteHybridMonitorSLSGroupResponseBody body;

    public static DeleteHybridMonitorSLSGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHybridMonitorSLSGroupResponse self = new DeleteHybridMonitorSLSGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHybridMonitorSLSGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHybridMonitorSLSGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteHybridMonitorSLSGroupResponse setBody(DeleteHybridMonitorSLSGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHybridMonitorSLSGroupResponseBody getBody() {
        return this.body;
    }

}
