// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeAssistRTMPServerAddressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAssistRTMPServerAddressResponseBody body;

    public static DescribeAssistRTMPServerAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAssistRTMPServerAddressResponse self = new DescribeAssistRTMPServerAddressResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAssistRTMPServerAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAssistRTMPServerAddressResponse setBody(DescribeAssistRTMPServerAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAssistRTMPServerAddressResponseBody getBody() {
        return this.body;
    }

}
