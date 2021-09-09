// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribePipelineManagementConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePipelineManagementConfigResponseBody body;

    public static DescribePipelineManagementConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePipelineManagementConfigResponse self = new DescribePipelineManagementConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribePipelineManagementConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePipelineManagementConfigResponse setBody(DescribePipelineManagementConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePipelineManagementConfigResponseBody getBody() {
        return this.body;
    }

}
