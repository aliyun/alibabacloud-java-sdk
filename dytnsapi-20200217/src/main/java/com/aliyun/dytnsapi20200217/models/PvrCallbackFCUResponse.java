// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class PvrCallbackFCUResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static PvrCallbackFCUResponse build(java.util.Map<String, ?> map) throws Exception {
        PvrCallbackFCUResponse self = new PvrCallbackFCUResponse();
        return TeaModel.build(map, self);
    }

    public PvrCallbackFCUResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
