// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class DeleteQualityRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteQualityRulesResponseBody body;

    public static DeleteQualityRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteQualityRulesResponse self = new DeleteQualityRulesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteQualityRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteQualityRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteQualityRulesResponse setBody(DeleteQualityRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteQualityRulesResponseBody getBody() {
        return this.body;
    }

}
