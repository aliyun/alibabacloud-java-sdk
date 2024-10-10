// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteDataSourceSharedRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDataSourceSharedRuleResponseBody body;

    public static DeleteDataSourceSharedRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataSourceSharedRuleResponse self = new DeleteDataSourceSharedRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDataSourceSharedRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDataSourceSharedRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDataSourceSharedRuleResponse setBody(DeleteDataSourceSharedRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDataSourceSharedRuleResponseBody getBody() {
        return this.body;
    }

}
