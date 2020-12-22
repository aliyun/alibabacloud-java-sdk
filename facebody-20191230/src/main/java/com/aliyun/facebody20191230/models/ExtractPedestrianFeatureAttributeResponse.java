// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class ExtractPedestrianFeatureAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExtractPedestrianFeatureAttributeResponseBody body;

    public static ExtractPedestrianFeatureAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ExtractPedestrianFeatureAttributeResponse self = new ExtractPedestrianFeatureAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ExtractPedestrianFeatureAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExtractPedestrianFeatureAttributeResponse setBody(ExtractPedestrianFeatureAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ExtractPedestrianFeatureAttributeResponseBody getBody() {
        return this.body;
    }

}
