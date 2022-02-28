// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeDiskGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDiskGroupResponseBody body;

    public static DescribeDiskGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiskGroupResponse self = new DescribeDiskGroupResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDiskGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDiskGroupResponse setBody(DescribeDiskGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDiskGroupResponseBody getBody() {
        return this.body;
    }

}
