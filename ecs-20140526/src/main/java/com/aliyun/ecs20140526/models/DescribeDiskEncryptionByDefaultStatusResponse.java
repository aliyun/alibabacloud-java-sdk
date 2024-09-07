// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDiskEncryptionByDefaultStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDiskEncryptionByDefaultStatusResponseBody body;

    public static DescribeDiskEncryptionByDefaultStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiskEncryptionByDefaultStatusResponse self = new DescribeDiskEncryptionByDefaultStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDiskEncryptionByDefaultStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDiskEncryptionByDefaultStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDiskEncryptionByDefaultStatusResponse setBody(DescribeDiskEncryptionByDefaultStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDiskEncryptionByDefaultStatusResponseBody getBody() {
        return this.body;
    }

}
