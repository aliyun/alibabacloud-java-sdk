// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DesensitizeDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DesensitizeDataResponseBody body;

    public static DesensitizeDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DesensitizeDataResponse self = new DesensitizeDataResponse();
        return TeaModel.build(map, self);
    }

    public DesensitizeDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DesensitizeDataResponse setBody(DesensitizeDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DesensitizeDataResponseBody getBody() {
        return this.body;
    }

}
