// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeFaceConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeFaceConfigResponseBody body;

    public static DescribeFaceConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFaceConfigResponse self = new DescribeFaceConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFaceConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFaceConfigResponse setBody(DescribeFaceConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFaceConfigResponseBody getBody() {
        return this.body;
    }

}
