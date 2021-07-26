// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateIpRecordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateIpRecordResponseBody body;

    public static CreateIpRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIpRecordResponse self = new CreateIpRecordResponse();
        return TeaModel.build(map, self);
    }

    public CreateIpRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateIpRecordResponse setBody(CreateIpRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateIpRecordResponseBody getBody() {
        return this.body;
    }

}
