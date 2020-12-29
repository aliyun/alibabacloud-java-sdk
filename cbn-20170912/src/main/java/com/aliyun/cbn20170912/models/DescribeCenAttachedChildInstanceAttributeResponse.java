// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeCenAttachedChildInstanceAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCenAttachedChildInstanceAttributeResponseBody body;

    public static DescribeCenAttachedChildInstanceAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCenAttachedChildInstanceAttributeResponse self = new DescribeCenAttachedChildInstanceAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCenAttachedChildInstanceAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCenAttachedChildInstanceAttributeResponse setBody(DescribeCenAttachedChildInstanceAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCenAttachedChildInstanceAttributeResponseBody getBody() {
        return this.body;
    }

}
