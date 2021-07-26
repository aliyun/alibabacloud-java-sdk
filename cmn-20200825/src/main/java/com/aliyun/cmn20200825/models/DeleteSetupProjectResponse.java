// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeleteSetupProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteSetupProjectResponseBody body;

    public static DeleteSetupProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSetupProjectResponse self = new DeleteSetupProjectResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSetupProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSetupProjectResponse setBody(DeleteSetupProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSetupProjectResponseBody getBody() {
        return this.body;
    }

}
