// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteDataQualityRuleTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDataQualityRuleTemplateResponseBody body;

    public static DeleteDataQualityRuleTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataQualityRuleTemplateResponse self = new DeleteDataQualityRuleTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDataQualityRuleTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDataQualityRuleTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDataQualityRuleTemplateResponse setBody(DeleteDataQualityRuleTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDataQualityRuleTemplateResponseBody getBody() {
        return this.body;
    }

}
