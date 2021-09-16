// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetServiceGroupSchedulingPreviewResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetServiceGroupSchedulingPreviewResponseBody body;

    public static GetServiceGroupSchedulingPreviewResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceGroupSchedulingPreviewResponse self = new GetServiceGroupSchedulingPreviewResponse();
        return TeaModel.build(map, self);
    }

    public GetServiceGroupSchedulingPreviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetServiceGroupSchedulingPreviewResponse setBody(GetServiceGroupSchedulingPreviewResponseBody body) {
        this.body = body;
        return this;
    }
    public GetServiceGroupSchedulingPreviewResponseBody getBody() {
        return this.body;
    }

}
