// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateBandwidthResourcePackagesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateBandwidthResourcePackagesResponseBody body;

    public static CreateBandwidthResourcePackagesResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBandwidthResourcePackagesResponse self = new CreateBandwidthResourcePackagesResponse();
        return TeaModel.build(map, self);
    }

    public CreateBandwidthResourcePackagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBandwidthResourcePackagesResponse setBody(CreateBandwidthResourcePackagesResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBandwidthResourcePackagesResponseBody getBody() {
        return this.body;
    }

}
