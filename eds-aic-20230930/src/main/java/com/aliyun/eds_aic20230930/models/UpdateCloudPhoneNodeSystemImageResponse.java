// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class UpdateCloudPhoneNodeSystemImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCloudPhoneNodeSystemImageResponseBody body;

    public static UpdateCloudPhoneNodeSystemImageResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloudPhoneNodeSystemImageResponse self = new UpdateCloudPhoneNodeSystemImageResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCloudPhoneNodeSystemImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCloudPhoneNodeSystemImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCloudPhoneNodeSystemImageResponse setBody(UpdateCloudPhoneNodeSystemImageResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCloudPhoneNodeSystemImageResponseBody getBody() {
        return this.body;
    }

}
