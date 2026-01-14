// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class QuitAgentGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuitAgentGroupResponseBody body;

    public static QuitAgentGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        QuitAgentGroupResponse self = new QuitAgentGroupResponse();
        return TeaModel.build(map, self);
    }

    public QuitAgentGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuitAgentGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuitAgentGroupResponse setBody(QuitAgentGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public QuitAgentGroupResponseBody getBody() {
        return this.body;
    }

}
