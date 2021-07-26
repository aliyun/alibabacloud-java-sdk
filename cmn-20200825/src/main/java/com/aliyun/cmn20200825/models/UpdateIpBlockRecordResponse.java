// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateIpBlockRecordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateIpBlockRecordResponseBody body;

    public static UpdateIpBlockRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateIpBlockRecordResponse self = new UpdateIpBlockRecordResponse();
        return TeaModel.build(map, self);
    }

    public UpdateIpBlockRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateIpBlockRecordResponse setBody(UpdateIpBlockRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateIpBlockRecordResponseBody getBody() {
        return this.body;
    }

}
