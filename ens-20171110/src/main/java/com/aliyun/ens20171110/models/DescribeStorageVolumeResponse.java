// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeStorageVolumeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeStorageVolumeResponseBody body;

    public static DescribeStorageVolumeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeStorageVolumeResponse self = new DescribeStorageVolumeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeStorageVolumeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeStorageVolumeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeStorageVolumeResponse setBody(DescribeStorageVolumeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeStorageVolumeResponseBody getBody() {
        return this.body;
    }

}
