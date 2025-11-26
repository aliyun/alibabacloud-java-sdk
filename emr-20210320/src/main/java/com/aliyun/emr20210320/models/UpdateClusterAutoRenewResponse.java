// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class UpdateClusterAutoRenewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateClusterAutoRenewResponseBody body;

    public static UpdateClusterAutoRenewResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateClusterAutoRenewResponse self = new UpdateClusterAutoRenewResponse();
        return TeaModel.build(map, self);
    }

    public UpdateClusterAutoRenewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateClusterAutoRenewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateClusterAutoRenewResponse setBody(UpdateClusterAutoRenewResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateClusterAutoRenewResponseBody getBody() {
        return this.body;
    }

}
