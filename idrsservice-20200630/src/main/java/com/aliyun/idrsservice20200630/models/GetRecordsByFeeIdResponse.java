// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetRecordsByFeeIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetRecordsByFeeIdResponseBody body;

    public static GetRecordsByFeeIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRecordsByFeeIdResponse self = new GetRecordsByFeeIdResponse();
        return TeaModel.build(map, self);
    }

    public GetRecordsByFeeIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRecordsByFeeIdResponse setBody(GetRecordsByFeeIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRecordsByFeeIdResponseBody getBody() {
        return this.body;
    }

}
