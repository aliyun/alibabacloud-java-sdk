// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class SetDataSourceShareResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetDataSourceShareResponseBody body;

    public static SetDataSourceShareResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDataSourceShareResponse self = new SetDataSourceShareResponse();
        return TeaModel.build(map, self);
    }

    public SetDataSourceShareResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDataSourceShareResponse setBody(SetDataSourceShareResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDataSourceShareResponseBody getBody() {
        return this.body;
    }

}
