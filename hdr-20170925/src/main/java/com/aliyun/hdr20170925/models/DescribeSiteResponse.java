// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeSiteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSiteResponseBody body;

    public static DescribeSiteResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSiteResponse self = new DescribeSiteResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSiteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSiteResponse setBody(DescribeSiteResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSiteResponseBody getBody() {
        return this.body;
    }

}
