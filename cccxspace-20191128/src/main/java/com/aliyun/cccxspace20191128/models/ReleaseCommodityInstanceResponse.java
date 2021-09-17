// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class ReleaseCommodityInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReleaseCommodityInstanceResponseBody body;

    public static ReleaseCommodityInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseCommodityInstanceResponse self = new ReleaseCommodityInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseCommodityInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseCommodityInstanceResponse setBody(ReleaseCommodityInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseCommodityInstanceResponseBody getBody() {
        return this.body;
    }

}
