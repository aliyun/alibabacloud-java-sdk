// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lvwangwatermark20210104.models;

import com.aliyun.tea.*;

public class GetDocExtractResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDocExtractResponseBody body;

    public static GetDocExtractResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDocExtractResponse self = new GetDocExtractResponse();
        return TeaModel.build(map, self);
    }

    public GetDocExtractResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDocExtractResponse setBody(GetDocExtractResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDocExtractResponseBody getBody() {
        return this.body;
    }

}
