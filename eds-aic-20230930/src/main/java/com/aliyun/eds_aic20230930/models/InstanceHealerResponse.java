// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class InstanceHealerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InstanceHealerResponseBody body;

    public static InstanceHealerResponse build(java.util.Map<String, ?> map) throws Exception {
        InstanceHealerResponse self = new InstanceHealerResponse();
        return TeaModel.build(map, self);
    }

    public InstanceHealerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InstanceHealerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InstanceHealerResponse setBody(InstanceHealerResponseBody body) {
        this.body = body;
        return this;
    }
    public InstanceHealerResponseBody getBody() {
        return this.body;
    }

}
