// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeDRAppliancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDRAppliancesResponseBody body;

    public static DescribeDRAppliancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDRAppliancesResponse self = new DescribeDRAppliancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDRAppliancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDRAppliancesResponse setBody(DescribeDRAppliancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDRAppliancesResponseBody getBody() {
        return this.body;
    }

}
