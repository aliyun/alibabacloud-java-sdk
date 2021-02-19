// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class AttachDBInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AttachDBInstancesResponseBody body;

    public static AttachDBInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachDBInstancesResponse self = new AttachDBInstancesResponse();
        return TeaModel.build(map, self);
    }

    public AttachDBInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachDBInstancesResponse setBody(AttachDBInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachDBInstancesResponseBody getBody() {
        return this.body;
    }

}
