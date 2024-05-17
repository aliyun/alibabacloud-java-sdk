// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifyStreamingDataServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyStreamingDataServiceResponseBody body;

    public static ModifyStreamingDataServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyStreamingDataServiceResponse self = new ModifyStreamingDataServiceResponse();
        return TeaModel.build(map, self);
    }

    public ModifyStreamingDataServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyStreamingDataServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyStreamingDataServiceResponse setBody(ModifyStreamingDataServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyStreamingDataServiceResponseBody getBody() {
        return this.body;
    }

}
