// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateMetaTableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateMetaTableResponseBody body;

    public static UpdateMetaTableResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMetaTableResponse self = new UpdateMetaTableResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMetaTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMetaTableResponse setBody(UpdateMetaTableResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMetaTableResponseBody getBody() {
        return this.body;
    }

}
