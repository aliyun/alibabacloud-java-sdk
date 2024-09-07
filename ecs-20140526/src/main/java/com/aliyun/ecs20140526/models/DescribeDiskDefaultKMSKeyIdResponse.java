// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDiskDefaultKMSKeyIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDiskDefaultKMSKeyIdResponseBody body;

    public static DescribeDiskDefaultKMSKeyIdResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiskDefaultKMSKeyIdResponse self = new DescribeDiskDefaultKMSKeyIdResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDiskDefaultKMSKeyIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDiskDefaultKMSKeyIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDiskDefaultKMSKeyIdResponse setBody(DescribeDiskDefaultKMSKeyIdResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDiskDefaultKMSKeyIdResponseBody getBody() {
        return this.body;
    }

}
