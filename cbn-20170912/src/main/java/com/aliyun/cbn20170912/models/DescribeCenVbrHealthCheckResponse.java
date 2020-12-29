// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeCenVbrHealthCheckResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeCenVbrHealthCheckResponse setBody(DescribeCenVbrHealthCheckResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCenVbrHealthCheckResponseBody getBody() {
        return this.body;
    }

}
