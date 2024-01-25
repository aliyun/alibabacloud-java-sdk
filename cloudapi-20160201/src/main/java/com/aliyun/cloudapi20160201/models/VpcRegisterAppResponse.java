// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class VpcRegisterAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VpcRegisterAppResponseBody body;

    public static VpcRegisterAppResponse build(java.util.Map<String, ?> map) throws Exception {
        VpcRegisterAppResponse self = new VpcRegisterAppResponse();
        return TeaModel.build(map, self);
    }

    public VpcRegisterAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VpcRegisterAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VpcRegisterAppResponse setBody(VpcRegisterAppResponseBody body) {
        this.body = body;
        return this;
    }
    public VpcRegisterAppResponseBody getBody() {
        return this.body;
    }

}
