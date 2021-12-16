// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnAclFieldsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDcdnAclFieldsResponseBody body;

    public static DescribeDcdnAclFieldsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnAclFieldsResponse self = new DescribeDcdnAclFieldsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnAclFieldsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnAclFieldsResponse setBody(DescribeDcdnAclFieldsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnAclFieldsResponseBody getBody() {
        return this.body;
    }

}
