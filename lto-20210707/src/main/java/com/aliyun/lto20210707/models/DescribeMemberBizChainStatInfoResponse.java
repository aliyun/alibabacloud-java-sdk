// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DescribeMemberBizChainStatInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeMemberBizChainStatInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMemberBizChainStatInfoResponse setBody(DescribeMemberBizChainStatInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMemberBizChainStatInfoResponseBody getBody() {
        return this.body;
    }

}
