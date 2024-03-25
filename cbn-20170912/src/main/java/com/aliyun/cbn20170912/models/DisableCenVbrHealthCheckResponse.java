// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DisableCenVbrHealthCheckResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableCenVbrHealthCheckResponseBody body;

    public static DisableCenVbrHealthCheckResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableCenVbrHealthCheckResponse self = new DisableCenVbrHealthCheckResponse();
        return TeaModel.build(map, self);
    }

    public DisableCenVbrHealthCheckResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableCenVbrHealthCheckResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableCenVbrHealthCheckResponse setBody(DisableCenVbrHealthCheckResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableCenVbrHealthCheckResponseBody getBody() {
        return this.body;
    }

}
