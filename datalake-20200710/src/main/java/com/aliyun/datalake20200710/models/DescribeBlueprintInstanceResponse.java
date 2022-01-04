// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class DescribeBlueprintInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeBlueprintInstanceResponseBody body;

    public static DescribeBlueprintInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBlueprintInstanceResponse self = new DescribeBlueprintInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBlueprintInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBlueprintInstanceResponse setBody(DescribeBlueprintInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBlueprintInstanceResponseBody getBody() {
        return this.body;
    }

}
