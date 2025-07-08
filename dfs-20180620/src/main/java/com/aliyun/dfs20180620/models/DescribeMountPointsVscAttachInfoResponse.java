// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class DescribeMountPointsVscAttachInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMountPointsVscAttachInfoResponseBody body;

    public static DescribeMountPointsVscAttachInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMountPointsVscAttachInfoResponse self = new DescribeMountPointsVscAttachInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMountPointsVscAttachInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMountPointsVscAttachInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMountPointsVscAttachInfoResponse setBody(DescribeMountPointsVscAttachInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMountPointsVscAttachInfoResponseBody getBody() {
        return this.body;
    }

}
