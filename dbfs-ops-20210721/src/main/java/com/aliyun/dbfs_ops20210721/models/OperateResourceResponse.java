// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs_ops20210721.models;

import com.aliyun.tea.*;

public class OperateResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OperateResourceResponseBody body;

    public static OperateResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateResourceResponse self = new OperateResourceResponse();
        return TeaModel.build(map, self);
    }

    public OperateResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperateResourceResponse setBody(OperateResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateResourceResponseBody getBody() {
        return this.body;
    }

}
