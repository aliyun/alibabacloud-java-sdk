// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class ConvertImageToScreenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ConvertImageToScreenResponseBody body;

    public static ConvertImageToScreenResponse build(java.util.Map<String, ?> map) throws Exception {
        ConvertImageToScreenResponse self = new ConvertImageToScreenResponse();
        return TeaModel.build(map, self);
    }

    public ConvertImageToScreenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConvertImageToScreenResponse setBody(ConvertImageToScreenResponseBody body) {
        this.body = body;
        return this;
    }
    public ConvertImageToScreenResponseBody getBody() {
        return this.body;
    }

}
