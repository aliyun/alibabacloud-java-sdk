// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class EnableCenVbrHealthCheckResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableCenVbrHealthCheckResponseBody body;

    public static EnableCenVbrHealthCheckResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableCenVbrHealthCheckResponse self = new EnableCenVbrHealthCheckResponse();
        return TeaModel.build(map, self);
    }

    public EnableCenVbrHealthCheckResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableCenVbrHealthCheckResponse setBody(EnableCenVbrHealthCheckResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableCenVbrHealthCheckResponseBody getBody() {
        return this.body;
    }

}
