// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateDataSourceSharedRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDataSourceSharedRuleResponseBody body;

    public static CreateDataSourceSharedRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDataSourceSharedRuleResponse self = new CreateDataSourceSharedRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateDataSourceSharedRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDataSourceSharedRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDataSourceSharedRuleResponse setBody(CreateDataSourceSharedRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDataSourceSharedRuleResponseBody getBody() {
        return this.body;
    }

}
