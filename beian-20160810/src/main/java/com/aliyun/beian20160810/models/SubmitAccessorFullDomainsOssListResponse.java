// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.beian20160810.models;

import com.aliyun.tea.*;

public class SubmitAccessorFullDomainsOssListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitAccessorFullDomainsOssListResponseBody body;

    public static SubmitAccessorFullDomainsOssListResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitAccessorFullDomainsOssListResponse self = new SubmitAccessorFullDomainsOssListResponse();
        return TeaModel.build(map, self);
    }

    public SubmitAccessorFullDomainsOssListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitAccessorFullDomainsOssListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitAccessorFullDomainsOssListResponse setBody(SubmitAccessorFullDomainsOssListResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitAccessorFullDomainsOssListResponseBody getBody() {
        return this.body;
    }

}
