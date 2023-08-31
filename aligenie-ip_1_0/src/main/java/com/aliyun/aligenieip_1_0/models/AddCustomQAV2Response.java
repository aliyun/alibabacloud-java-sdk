// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class AddCustomQAV2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddCustomQAV2ResponseBody body;

    public static AddCustomQAV2Response build(java.util.Map<String, ?> map) throws Exception {
        AddCustomQAV2Response self = new AddCustomQAV2Response();
        return TeaModel.build(map, self);
    }

    public AddCustomQAV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddCustomQAV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddCustomQAV2Response setBody(AddCustomQAV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public AddCustomQAV2ResponseBody getBody() {
        return this.body;
    }

}
