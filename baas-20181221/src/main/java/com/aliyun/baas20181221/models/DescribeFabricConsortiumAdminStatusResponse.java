// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricConsortiumAdminStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFabricConsortiumAdminStatusResponseBody body;

    public static DescribeFabricConsortiumAdminStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricConsortiumAdminStatusResponse self = new DescribeFabricConsortiumAdminStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFabricConsortiumAdminStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFabricConsortiumAdminStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFabricConsortiumAdminStatusResponse setBody(DescribeFabricConsortiumAdminStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFabricConsortiumAdminStatusResponseBody getBody() {
        return this.body;
    }

}
