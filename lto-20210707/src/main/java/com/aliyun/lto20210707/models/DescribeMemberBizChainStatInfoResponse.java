// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DescribeMemberBizChainStatInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMemberBizChainStatInfoResponseBody body;

    public static DescribeMemberBizChainStatInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMemberBizChainStatInfoResponse self = new DescribeMemberBizChainStatInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMemberBizChainStatInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMemberBizChainStatInfoResponse setBody(DescribeMemberBizChainStatInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMemberBizChainStatInfoResponseBody getBody() {
        return this.body;
    }

}
