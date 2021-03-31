// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateTableLevelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateTableLevelResponseBody body;

    public static UpdateTableLevelResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTableLevelResponse self = new UpdateTableLevelResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTableLevelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTableLevelResponse setBody(UpdateTableLevelResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTableLevelResponseBody getBody() {
        return this.body;
    }

}
