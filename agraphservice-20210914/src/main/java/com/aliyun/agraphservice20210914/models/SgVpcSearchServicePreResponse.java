// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agraphservice20210914.models;

import com.aliyun.tea.*;

public class SgVpcSearchServicePreResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SgVpcSearchServicePreResponseBody body;

    public static SgVpcSearchServicePreResponse build(java.util.Map<String, ?> map) throws Exception {
        SgVpcSearchServicePreResponse self = new SgVpcSearchServicePreResponse();
        return TeaModel.build(map, self);
    }

    public SgVpcSearchServicePreResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SgVpcSearchServicePreResponse setBody(SgVpcSearchServicePreResponseBody body) {
        this.body = body;
        return this;
    }
    public SgVpcSearchServicePreResponseBody getBody() {
        return this.body;
    }

}
