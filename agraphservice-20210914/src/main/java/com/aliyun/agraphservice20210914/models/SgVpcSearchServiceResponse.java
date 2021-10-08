// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agraphservice20210914.models;

import com.aliyun.tea.*;

public class SgVpcSearchServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SgVpcSearchServiceResponseBody body;

    public static SgVpcSearchServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        SgVpcSearchServiceResponse self = new SgVpcSearchServiceResponse();
        return TeaModel.build(map, self);
    }

    public SgVpcSearchServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SgVpcSearchServiceResponse setBody(SgVpcSearchServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public SgVpcSearchServiceResponseBody getBody() {
        return this.body;
    }

}
