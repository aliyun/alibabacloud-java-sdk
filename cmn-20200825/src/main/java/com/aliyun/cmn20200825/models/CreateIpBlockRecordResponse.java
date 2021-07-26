// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateIpBlockRecordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateIpBlockRecordResponseBody body;

    public static CreateIpBlockRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIpBlockRecordResponse self = new CreateIpBlockRecordResponse();
        return TeaModel.build(map, self);
    }

    public CreateIpBlockRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateIpBlockRecordResponse setBody(CreateIpBlockRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateIpBlockRecordResponseBody getBody() {
        return this.body;
    }

}
