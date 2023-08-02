// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class OpenDataWorksStandardServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public OpenDataWorksStandardServiceResponseBody body;

    public static OpenDataWorksStandardServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenDataWorksStandardServiceResponse self = new OpenDataWorksStandardServiceResponse();
        return TeaModel.build(map, self);
    }

    public OpenDataWorksStandardServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenDataWorksStandardServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenDataWorksStandardServiceResponse setBody(OpenDataWorksStandardServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenDataWorksStandardServiceResponseBody getBody() {
        return this.body;
    }

}
