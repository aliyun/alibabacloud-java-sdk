// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLivePrivateLineAreasResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLivePrivateLineAreasResponseBody body;

    public static DescribeLivePrivateLineAreasResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLivePrivateLineAreasResponse self = new DescribeLivePrivateLineAreasResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLivePrivateLineAreasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLivePrivateLineAreasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLivePrivateLineAreasResponse setBody(DescribeLivePrivateLineAreasResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLivePrivateLineAreasResponseBody getBody() {
        return this.body;
    }

}
