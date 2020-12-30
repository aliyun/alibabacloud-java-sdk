// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeFaceUsageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeFaceUsageResponseBody body;

    public static DescribeFaceUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFaceUsageResponse self = new DescribeFaceUsageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFaceUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFaceUsageResponse setBody(DescribeFaceUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFaceUsageResponseBody getBody() {
        return this.body;
    }

}
