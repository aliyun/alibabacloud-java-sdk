// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeDtsServiceLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDtsServiceLogResponseBody body;

    public static DescribeDtsServiceLogResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDtsServiceLogResponse self = new DescribeDtsServiceLogResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDtsServiceLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDtsServiceLogResponse setBody(DescribeDtsServiceLogResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDtsServiceLogResponseBody getBody() {
        return this.body;
    }

}
