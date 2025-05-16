// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ExecuteHundredThousandWhysDialogueResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecuteHundredThousandWhysDialogueResponseBody body;

    public static ExecuteHundredThousandWhysDialogueResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteHundredThousandWhysDialogueResponse self = new ExecuteHundredThousandWhysDialogueResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteHundredThousandWhysDialogueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteHundredThousandWhysDialogueResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteHundredThousandWhysDialogueResponse setBody(ExecuteHundredThousandWhysDialogueResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteHundredThousandWhysDialogueResponseBody getBody() {
        return this.body;
    }

}
