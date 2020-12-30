// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ConvertInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ConvertInstanceResponseBody body;

    public static ConvertInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ConvertInstanceResponse self = new ConvertInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ConvertInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConvertInstanceResponse setBody(ConvertInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ConvertInstanceResponseBody getBody() {
        return this.body;
    }

}
