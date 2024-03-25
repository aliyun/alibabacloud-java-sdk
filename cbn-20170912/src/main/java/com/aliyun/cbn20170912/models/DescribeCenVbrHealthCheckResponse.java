// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeCenVbrHealthCheckResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCenVbrHealthCheckResponseBody body;

    public static DescribeCenVbrHealthCheckResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCenVbrHealthCheckResponse self = new DescribeCenVbrHealthCheckResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCenVbrHealthCheckResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCenVbrHealthCheckResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCenVbrHealthCheckResponse setBody(DescribeCenVbrHealthCheckResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCenVbrHealthCheckResponseBody getBody() {
        return this.body;
    }

}
