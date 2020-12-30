// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ReleaseClusterHostGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReleaseClusterHostGroupResponseBody body;

    public static ReleaseClusterHostGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseClusterHostGroupResponse self = new ReleaseClusterHostGroupResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseClusterHostGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseClusterHostGroupResponse setBody(ReleaseClusterHostGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseClusterHostGroupResponseBody getBody() {
        return this.body;
    }

}
