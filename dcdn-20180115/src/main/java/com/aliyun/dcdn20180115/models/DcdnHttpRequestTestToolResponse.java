// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DcdnHttpRequestTestToolResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DcdnHttpRequestTestToolResponseBody body;

    public static DcdnHttpRequestTestToolResponse build(java.util.Map<String, ?> map) throws Exception {
        DcdnHttpRequestTestToolResponse self = new DcdnHttpRequestTestToolResponse();
        return TeaModel.build(map, self);
    }

    public DcdnHttpRequestTestToolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DcdnHttpRequestTestToolResponse setBody(DcdnHttpRequestTestToolResponseBody body) {
        this.body = body;
        return this;
    }
    public DcdnHttpRequestTestToolResponseBody getBody() {
        return this.body;
    }

}
