// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeShadowSchemaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeShadowSchemaResponseBody body;

    public static DescribeShadowSchemaResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeShadowSchemaResponse self = new DescribeShadowSchemaResponse();
        return TeaModel.build(map, self);
    }

    public DescribeShadowSchemaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeShadowSchemaResponse setBody(DescribeShadowSchemaResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeShadowSchemaResponseBody getBody() {
        return this.body;
    }

}
