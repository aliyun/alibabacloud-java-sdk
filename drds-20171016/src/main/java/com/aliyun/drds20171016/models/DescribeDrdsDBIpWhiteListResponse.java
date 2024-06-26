// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20171016.models;

import com.aliyun.tea.*;

public class DescribeDrdsDBIpWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDrdsDBIpWhiteListResponseBody body;

    public static DescribeDrdsDBIpWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsDBIpWhiteListResponse self = new DescribeDrdsDBIpWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsDBIpWhiteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDrdsDBIpWhiteListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDrdsDBIpWhiteListResponse setBody(DescribeDrdsDBIpWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDrdsDBIpWhiteListResponseBody getBody() {
        return this.body;
    }

}
