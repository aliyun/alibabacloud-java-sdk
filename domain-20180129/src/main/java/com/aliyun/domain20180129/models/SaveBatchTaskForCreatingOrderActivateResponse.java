// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveBatchTaskForCreatingOrderActivateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveBatchTaskForCreatingOrderActivateResponseBody body;

    public static SaveBatchTaskForCreatingOrderActivateResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveBatchTaskForCreatingOrderActivateResponse self = new SaveBatchTaskForCreatingOrderActivateResponse();
        return TeaModel.build(map, self);
    }

    public SaveBatchTaskForCreatingOrderActivateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveBatchTaskForCreatingOrderActivateResponse setBody(SaveBatchTaskForCreatingOrderActivateResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveBatchTaskForCreatingOrderActivateResponseBody getBody() {
        return this.body;
    }

}
