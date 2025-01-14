// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDataQualityRuleTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataQualityRuleTemplatesResponseBody body;

    public static ListDataQualityRuleTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataQualityRuleTemplatesResponse self = new ListDataQualityRuleTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListDataQualityRuleTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataQualityRuleTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataQualityRuleTemplatesResponse setBody(ListDataQualityRuleTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataQualityRuleTemplatesResponseBody getBody() {
        return this.body;
    }

}
