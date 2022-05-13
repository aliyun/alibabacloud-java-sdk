// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeFrontVulPatchListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeFrontVulPatchListResponseBody body;

    public static DescribeFrontVulPatchListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFrontVulPatchListResponse self = new DescribeFrontVulPatchListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFrontVulPatchListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFrontVulPatchListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFrontVulPatchListResponse setBody(DescribeFrontVulPatchListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFrontVulPatchListResponseBody getBody() {
        return this.body;
    }

}
