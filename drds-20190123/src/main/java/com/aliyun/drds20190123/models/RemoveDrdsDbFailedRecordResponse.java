// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class RemoveDrdsDbFailedRecordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveDrdsDbFailedRecordResponseBody body;

    public static RemoveDrdsDbFailedRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveDrdsDbFailedRecordResponse self = new RemoveDrdsDbFailedRecordResponse();
        return TeaModel.build(map, self);
    }

    public RemoveDrdsDbFailedRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveDrdsDbFailedRecordResponse setBody(RemoveDrdsDbFailedRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveDrdsDbFailedRecordResponseBody getBody() {
        return this.body;
    }

}
