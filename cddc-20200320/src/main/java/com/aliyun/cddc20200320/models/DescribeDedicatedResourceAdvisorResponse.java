// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class DescribeDedicatedResourceAdvisorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDedicatedResourceAdvisorResponseBody body;

    public static DescribeDedicatedResourceAdvisorResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedResourceAdvisorResponse self = new DescribeDedicatedResourceAdvisorResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedResourceAdvisorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDedicatedResourceAdvisorResponse setBody(DescribeDedicatedResourceAdvisorResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDedicatedResourceAdvisorResponseBody getBody() {
        return this.body;
    }

}
