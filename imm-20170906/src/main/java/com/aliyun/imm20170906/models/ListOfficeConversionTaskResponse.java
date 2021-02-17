// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class ListOfficeConversionTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListOfficeConversionTaskResponseBody body;

    public static ListOfficeConversionTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOfficeConversionTaskResponse self = new ListOfficeConversionTaskResponse();
        return TeaModel.build(map, self);
    }

    public ListOfficeConversionTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOfficeConversionTaskResponse setBody(ListOfficeConversionTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOfficeConversionTaskResponseBody getBody() {
        return this.body;
    }

}
