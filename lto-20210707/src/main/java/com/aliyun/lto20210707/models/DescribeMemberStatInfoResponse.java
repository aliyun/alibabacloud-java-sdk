// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DescribeMemberStatInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMemberStatInfoResponseBody body;

    public static DescribeMemberStatInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMemberStatInfoResponse self = new DescribeMemberStatInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMemberStatInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMemberStatInfoResponse setBody(DescribeMemberStatInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMemberStatInfoResponseBody getBody() {
        return this.body;
    }

}
