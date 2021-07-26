// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateIpRecordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateIpRecordResponseBody body;

    public static UpdateIpRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateIpRecordResponse self = new UpdateIpRecordResponse();
        return TeaModel.build(map, self);
    }

    public UpdateIpRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateIpRecordResponse setBody(UpdateIpRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateIpRecordResponseBody getBody() {
        return this.body;
    }

}
