// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class DescribeSupportedZonesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSupportedZonesResponseBody body;

    public static DescribeSupportedZonesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSupportedZonesResponse self = new DescribeSupportedZonesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSupportedZonesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSupportedZonesResponse setBody(DescribeSupportedZonesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSupportedZonesResponseBody getBody() {
        return this.body;
    }

}
