// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeDRApplianceUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDRApplianceUrlResponseBody body;

    public static DescribeDRApplianceUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDRApplianceUrlResponse self = new DescribeDRApplianceUrlResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDRApplianceUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDRApplianceUrlResponse setBody(DescribeDRApplianceUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDRApplianceUrlResponseBody getBody() {
        return this.body;
    }

}
