// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeDynamicTagRuleListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeDynamicTagRuleListResponse setBody(DescribeDynamicTagRuleListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDynamicTagRuleListResponseBody getBody() {
        return this.body;
    }

}
