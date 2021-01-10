// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivision20190308.models;

import com.aliyun.tea.*;

public class DescribeFaceGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeFaceGroupsResponseBody body;

    public static DescribeFaceGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFaceGroupsResponse self = new DescribeFaceGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFaceGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFaceGroupsResponse setBody(DescribeFaceGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFaceGroupsResponseBody getBody() {
        return this.body;
    }

}
