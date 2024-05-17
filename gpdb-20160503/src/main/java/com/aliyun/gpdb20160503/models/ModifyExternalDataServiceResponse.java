// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifyExternalDataServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyExternalDataServiceResponseBody body;

    public static ModifyExternalDataServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyExternalDataServiceResponse self = new ModifyExternalDataServiceResponse();
        return TeaModel.build(map, self);
    }

    public ModifyExternalDataServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyExternalDataServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyExternalDataServiceResponse setBody(ModifyExternalDataServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyExternalDataServiceResponseBody getBody() {
        return this.body;
    }

}
