// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class DescribeDdosIpConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDdosIpConfigResponseBody body;

    public static DescribeDdosIpConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDdosIpConfigResponse self = new DescribeDdosIpConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDdosIpConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDdosIpConfigResponse setBody(DescribeDdosIpConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDdosIpConfigResponseBody getBody() {
        return this.body;
    }

}
