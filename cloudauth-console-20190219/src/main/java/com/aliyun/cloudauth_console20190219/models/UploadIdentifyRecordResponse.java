// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class UploadIdentifyRecordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UploadIdentifyRecordResponseBody body;

    public static UploadIdentifyRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadIdentifyRecordResponse self = new UploadIdentifyRecordResponse();
        return TeaModel.build(map, self);
    }

    public UploadIdentifyRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadIdentifyRecordResponse setBody(UploadIdentifyRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadIdentifyRecordResponseBody getBody() {
        return this.body;
    }

}
