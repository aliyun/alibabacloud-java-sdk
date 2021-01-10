// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeCasterSyncGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCasterSyncGroupResponseBody body;

    public static DescribeCasterSyncGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCasterSyncGroupResponse self = new DescribeCasterSyncGroupResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCasterSyncGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCasterSyncGroupResponse setBody(DescribeCasterSyncGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCasterSyncGroupResponseBody getBody() {
        return this.body;
    }

}
