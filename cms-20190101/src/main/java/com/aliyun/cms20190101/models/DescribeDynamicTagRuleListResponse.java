// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeDynamicTagRuleListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDynamicTagRuleListResponseBody body;

    public static DescribeDynamicTagRuleListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDynamicTagRuleListResponse self = new DescribeDynamicTagRuleListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDynamicTagRuleListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDynamicTagRuleListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDynamicTagRuleListResponse setBody(DescribeDynamicTagRuleListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDynamicTagRuleListResponseBody getBody() {
        return this.body;
    }

}
