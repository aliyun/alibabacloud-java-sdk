// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class DeleteLiveRecordTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLiveRecordTemplateResponseBody body;

    public static DeleteLiveRecordTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveRecordTemplateResponse self = new DeleteLiveRecordTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLiveRecordTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLiveRecordTemplateResponse setBody(DeleteLiveRecordTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLiveRecordTemplateResponseBody getBody() {
        return this.body;
    }

}
