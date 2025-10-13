// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class DescribeWuyingServerEipInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeWuyingServerEipInfoResponseBody body;

    public static DescribeWuyingServerEipInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWuyingServerEipInfoResponse self = new DescribeWuyingServerEipInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWuyingServerEipInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWuyingServerEipInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWuyingServerEipInfoResponse setBody(DescribeWuyingServerEipInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWuyingServerEipInfoResponseBody getBody() {
        return this.body;
    }

}
