// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeleteMonitorGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMonitorGroupResponseBody body;

    public static DeleteMonitorGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMonitorGroupResponse self = new DeleteMonitorGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMonitorGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMonitorGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMonitorGroupResponse setBody(DeleteMonitorGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMonitorGroupResponseBody getBody() {
        return this.body;
    }

}
