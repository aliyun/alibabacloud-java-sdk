// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class GetServiceInstanceForRegistryByServiceNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetServiceInstanceForRegistryByServiceNameResponseBody body;

    public static GetServiceInstanceForRegistryByServiceNameResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceInstanceForRegistryByServiceNameResponse self = new GetServiceInstanceForRegistryByServiceNameResponse();
        return TeaModel.build(map, self);
    }

    public GetServiceInstanceForRegistryByServiceNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetServiceInstanceForRegistryByServiceNameResponse setBody(GetServiceInstanceForRegistryByServiceNameResponseBody body) {
        this.body = body;
        return this;
    }
    public GetServiceInstanceForRegistryByServiceNameResponseBody getBody() {
        return this.body;
    }

}
