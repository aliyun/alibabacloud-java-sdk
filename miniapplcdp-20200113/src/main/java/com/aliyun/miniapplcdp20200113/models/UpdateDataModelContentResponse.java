// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class UpdateDataModelContentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateDataModelContentResponseBody body;

    public static UpdateDataModelContentResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataModelContentResponse self = new UpdateDataModelContentResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDataModelContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDataModelContentResponse setBody(UpdateDataModelContentResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDataModelContentResponseBody getBody() {
        return this.body;
    }

}
