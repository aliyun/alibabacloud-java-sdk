// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class MountInstanceSDGResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MountInstanceSDGResponseBody body;

    public static MountInstanceSDGResponse build(java.util.Map<String, ?> map) throws Exception {
        MountInstanceSDGResponse self = new MountInstanceSDGResponse();
        return TeaModel.build(map, self);
    }

    public MountInstanceSDGResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MountInstanceSDGResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MountInstanceSDGResponse setBody(MountInstanceSDGResponseBody body) {
        this.body = body;
        return this;
    }
    public MountInstanceSDGResponseBody getBody() {
        return this.body;
    }

}
