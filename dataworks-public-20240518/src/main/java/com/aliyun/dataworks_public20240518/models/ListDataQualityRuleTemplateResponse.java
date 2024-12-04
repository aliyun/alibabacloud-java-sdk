// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDataQualityRuleTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataQualityRuleTemplateResponseBody body;

    public static ListDataQualityRuleTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataQualityRuleTemplateResponse self = new ListDataQualityRuleTemplateResponse();
        return TeaModel.build(map, self);
    }

    public ListDataQualityRuleTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataQualityRuleTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataQualityRuleTemplateResponse setBody(ListDataQualityRuleTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataQualityRuleTemplateResponseBody getBody() {
        return this.body;
    }

}
