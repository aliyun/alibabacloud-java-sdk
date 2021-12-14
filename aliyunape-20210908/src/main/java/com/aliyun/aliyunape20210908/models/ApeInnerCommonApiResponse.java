// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliyunape20210908.models;

import com.aliyun.tea.*;

public class ApeInnerCommonApiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ApeInnerCommonApiResponseBody body;

    public static ApeInnerCommonApiResponse build(java.util.Map<String, ?> map) throws Exception {
        ApeInnerCommonApiResponse self = new ApeInnerCommonApiResponse();
        return TeaModel.build(map, self);
    }

    public ApeInnerCommonApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApeInnerCommonApiResponse setBody(ApeInnerCommonApiResponseBody body) {
        this.body = body;
        return this;
    }
    public ApeInnerCommonApiResponseBody getBody() {
        return this.body;
    }

}
