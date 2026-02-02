// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteQosRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteQosRulesResponseBody body;

    public static DeleteQosRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteQosRulesResponse self = new DeleteQosRulesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteQosRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteQosRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteQosRulesResponse setBody(DeleteQosRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteQosRulesResponseBody getBody() {
        return this.body;
    }

}
