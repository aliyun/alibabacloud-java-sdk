// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class ConvertOfficeFormatResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ConvertOfficeFormatResponseBody body;

    public static ConvertOfficeFormatResponse build(java.util.Map<String, ?> map) throws Exception {
        ConvertOfficeFormatResponse self = new ConvertOfficeFormatResponse();
        return TeaModel.build(map, self);
    }

    public ConvertOfficeFormatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConvertOfficeFormatResponse setBody(ConvertOfficeFormatResponseBody body) {
        this.body = body;
        return this;
    }
    public ConvertOfficeFormatResponseBody getBody() {
        return this.body;
    }

}
