// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteDataQualityRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDataQualityRuleResponseBody body;

    public static DeleteDataQualityRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataQualityRuleResponse self = new DeleteDataQualityRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDataQualityRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDataQualityRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDataQualityRuleResponse setBody(DeleteDataQualityRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDataQualityRuleResponseBody getBody() {
        return this.body;
    }

}
