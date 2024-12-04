// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetDataQualityRuleTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataQualityRuleTemplateResponseBody body;

    public static GetDataQualityRuleTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataQualityRuleTemplateResponse self = new GetDataQualityRuleTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetDataQualityRuleTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataQualityRuleTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataQualityRuleTemplateResponse setBody(GetDataQualityRuleTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataQualityRuleTemplateResponseBody getBody() {
        return this.body;
    }

}
