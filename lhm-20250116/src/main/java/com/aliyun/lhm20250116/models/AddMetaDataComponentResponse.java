// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class AddMetaDataComponentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddMetaDataComponentResponseBody body;

    public static AddMetaDataComponentResponse build(java.util.Map<String, ?> map) throws Exception {
        AddMetaDataComponentResponse self = new AddMetaDataComponentResponse();
        return TeaModel.build(map, self);
    }

    public AddMetaDataComponentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddMetaDataComponentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddMetaDataComponentResponse setBody(AddMetaDataComponentResponseBody body) {
        this.body = body;
        return this;
    }
    public AddMetaDataComponentResponseBody getBody() {
        return this.body;
    }

}
