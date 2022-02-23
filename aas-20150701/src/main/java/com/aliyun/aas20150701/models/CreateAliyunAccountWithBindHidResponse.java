// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aas20150701.models;

import com.aliyun.tea.*;

public class CreateAliyunAccountWithBindHidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAliyunAccountWithBindHidResponseBody body;

    public static CreateAliyunAccountWithBindHidResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAliyunAccountWithBindHidResponse self = new CreateAliyunAccountWithBindHidResponse();
        return TeaModel.build(map, self);
    }

    public CreateAliyunAccountWithBindHidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAliyunAccountWithBindHidResponse setBody(CreateAliyunAccountWithBindHidResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAliyunAccountWithBindHidResponseBody getBody() {
        return this.body;
    }

}
