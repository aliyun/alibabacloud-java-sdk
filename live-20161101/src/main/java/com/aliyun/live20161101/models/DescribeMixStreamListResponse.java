// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeMixStreamListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMixStreamListResponseBody body;

    public static DescribeMixStreamListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMixStreamListResponse self = new DescribeMixStreamListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMixStreamListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMixStreamListResponse setBody(DescribeMixStreamListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMixStreamListResponseBody getBody() {
        return this.body;
    }

}
