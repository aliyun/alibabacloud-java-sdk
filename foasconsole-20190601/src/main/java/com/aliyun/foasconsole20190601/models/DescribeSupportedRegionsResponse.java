// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20190601.models;

import com.aliyun.tea.*;

public class DescribeSupportedRegionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSupportedRegionsResponseBody body;

    public static DescribeSupportedRegionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSupportedRegionsResponse self = new DescribeSupportedRegionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSupportedRegionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSupportedRegionsResponse setBody(DescribeSupportedRegionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSupportedRegionsResponseBody getBody() {
        return this.body;
    }

}
