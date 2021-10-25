// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class EcdDeleteDesktopsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EcdDeleteDesktopsResponseBody body;

    public static EcdDeleteDesktopsResponse build(java.util.Map<String, ?> map) throws Exception {
        EcdDeleteDesktopsResponse self = new EcdDeleteDesktopsResponse();
        return TeaModel.build(map, self);
    }

    public EcdDeleteDesktopsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EcdDeleteDesktopsResponse setBody(EcdDeleteDesktopsResponseBody body) {
        this.body = body;
        return this;
    }
    public EcdDeleteDesktopsResponseBody getBody() {
        return this.body;
    }

}
