// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class ExtractPedestrianFeatureAttrResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExtractPedestrianFeatureAttrResponseBody body;

    public static ExtractPedestrianFeatureAttrResponse build(java.util.Map<String, ?> map) throws Exception {
        ExtractPedestrianFeatureAttrResponse self = new ExtractPedestrianFeatureAttrResponse();
        return TeaModel.build(map, self);
    }

    public ExtractPedestrianFeatureAttrResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExtractPedestrianFeatureAttrResponse setBody(ExtractPedestrianFeatureAttrResponseBody body) {
        this.body = body;
        return this;
    }
    public ExtractPedestrianFeatureAttrResponseBody getBody() {
        return this.body;
    }

}
