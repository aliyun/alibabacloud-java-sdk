// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class GetOfficeConversionTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetOfficeConversionTaskResponseBody body;

    public static GetOfficeConversionTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOfficeConversionTaskResponse self = new GetOfficeConversionTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetOfficeConversionTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOfficeConversionTaskResponse setBody(GetOfficeConversionTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOfficeConversionTaskResponseBody getBody() {
        return this.body;
    }

}
