// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetIpBlockRecordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetIpBlockRecordResponseBody body;

    public static GetIpBlockRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIpBlockRecordResponse self = new GetIpBlockRecordResponse();
        return TeaModel.build(map, self);
    }

    public GetIpBlockRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIpBlockRecordResponse setBody(GetIpBlockRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIpBlockRecordResponseBody getBody() {
        return this.body;
    }

}
