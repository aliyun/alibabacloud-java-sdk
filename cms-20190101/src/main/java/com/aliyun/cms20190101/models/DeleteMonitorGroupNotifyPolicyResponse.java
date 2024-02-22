// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteMonitorGroupNotifyPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMonitorGroupNotifyPolicyResponseBody body;

    public static DeleteMonitorGroupNotifyPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMonitorGroupNotifyPolicyResponse self = new DeleteMonitorGroupNotifyPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMonitorGroupNotifyPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMonitorGroupNotifyPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMonitorGroupNotifyPolicyResponse setBody(DeleteMonitorGroupNotifyPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMonitorGroupNotifyPolicyResponseBody getBody() {
        return this.body;
    }

}
