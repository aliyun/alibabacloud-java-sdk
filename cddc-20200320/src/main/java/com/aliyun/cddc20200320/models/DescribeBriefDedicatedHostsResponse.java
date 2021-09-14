// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class DescribeBriefDedicatedHostsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeBriefDedicatedHostsResponseBody body;

    public static DescribeBriefDedicatedHostsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBriefDedicatedHostsResponse self = new DescribeBriefDedicatedHostsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBriefDedicatedHostsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBriefDedicatedHostsResponse setBody(DescribeBriefDedicatedHostsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBriefDedicatedHostsResponseBody getBody() {
        return this.body;
    }

}
