// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeMountTargetsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMountTargetsResponseBody body;

    public static DescribeMountTargetsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMountTargetsResponse self = new DescribeMountTargetsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMountTargetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMountTargetsResponse setBody(DescribeMountTargetsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMountTargetsResponseBody getBody() {
        return this.body;
    }

}
