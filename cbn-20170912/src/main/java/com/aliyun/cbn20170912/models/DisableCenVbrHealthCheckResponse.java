// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DisableCenVbrHealthCheckResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DisableCenVbrHealthCheckResponse setBody(DisableCenVbrHealthCheckResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableCenVbrHealthCheckResponseBody getBody() {
        return this.body;
    }

}
