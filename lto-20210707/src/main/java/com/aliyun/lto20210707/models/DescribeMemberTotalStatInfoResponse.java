// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DescribeMemberTotalStatInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMemberTotalStatInfoResponseBody body;

    public static DescribeMemberTotalStatInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMemberTotalStatInfoResponse self = new DescribeMemberTotalStatInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMemberTotalStatInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMemberTotalStatInfoResponse setBody(DescribeMemberTotalStatInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMemberTotalStatInfoResponseBody getBody() {
        return this.body;
    }

}
