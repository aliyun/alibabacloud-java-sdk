// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ListAccessConfigurationProvisioningsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAccessConfigurationProvisioningsResponseBody body;

    public static ListAccessConfigurationProvisioningsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAccessConfigurationProvisioningsResponse self = new ListAccessConfigurationProvisioningsResponse();
        return TeaModel.build(map, self);
    }

    public ListAccessConfigurationProvisioningsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAccessConfigurationProvisioningsResponse setBody(ListAccessConfigurationProvisioningsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAccessConfigurationProvisioningsResponseBody getBody() {
        return this.body;
    }

}
