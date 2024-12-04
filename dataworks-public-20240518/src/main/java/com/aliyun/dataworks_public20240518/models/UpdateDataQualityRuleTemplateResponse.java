// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateDataQualityRuleTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDataQualityRuleTemplateResponseBody body;

    public static UpdateDataQualityRuleTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataQualityRuleTemplateResponse self = new UpdateDataQualityRuleTemplateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDataQualityRuleTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDataQualityRuleTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDataQualityRuleTemplateResponse setBody(UpdateDataQualityRuleTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDataQualityRuleTemplateResponseBody getBody() {
        return this.body;
    }

}
