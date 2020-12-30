// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForCreatingOrderActivateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveSingleTaskForCreatingOrderActivateResponseBody body;

    public static SaveSingleTaskForCreatingOrderActivateResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveSingleTaskForCreatingOrderActivateResponse self = new SaveSingleTaskForCreatingOrderActivateResponse();
        return TeaModel.build(map, self);
    }

    public SaveSingleTaskForCreatingOrderActivateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveSingleTaskForCreatingOrderActivateResponse setBody(SaveSingleTaskForCreatingOrderActivateResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveSingleTaskForCreatingOrderActivateResponseBody getBody() {
        return this.body;
    }

}
