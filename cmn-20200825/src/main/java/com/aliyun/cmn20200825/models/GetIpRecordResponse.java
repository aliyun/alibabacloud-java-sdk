// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetIpRecordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetIpRecordResponseBody body;

    public static GetIpRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIpRecordResponse self = new GetIpRecordResponse();
        return TeaModel.build(map, self);
    }

    public GetIpRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIpRecordResponse setBody(GetIpRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIpRecordResponseBody getBody() {
        return this.body;
    }

}
