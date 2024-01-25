// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApisWithStageNameIntegratedByAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApisWithStageNameIntegratedByAppResponseBody body;

    public static DescribeApisWithStageNameIntegratedByAppResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisWithStageNameIntegratedByAppResponse self = new DescribeApisWithStageNameIntegratedByAppResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApisWithStageNameIntegratedByAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApisWithStageNameIntegratedByAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApisWithStageNameIntegratedByAppResponse setBody(DescribeApisWithStageNameIntegratedByAppResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApisWithStageNameIntegratedByAppResponseBody getBody() {
        return this.body;
    }

}
