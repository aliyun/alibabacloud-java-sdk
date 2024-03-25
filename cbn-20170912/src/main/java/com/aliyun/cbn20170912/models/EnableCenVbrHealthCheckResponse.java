// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class EnableCenVbrHealthCheckResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public EnableCenVbrHealthCheckResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableCenVbrHealthCheckResponse setBody(EnableCenVbrHealthCheckResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableCenVbrHealthCheckResponseBody getBody() {
        return this.body;
    }

}
