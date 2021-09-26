// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class DescribeFlowProjectClusterSettingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeFlowProjectClusterSettingResponseBody body;

    public static DescribeFlowProjectClusterSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowProjectClusterSettingResponse self = new DescribeFlowProjectClusterSettingResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFlowProjectClusterSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFlowProjectClusterSettingResponse setBody(DescribeFlowProjectClusterSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFlowProjectClusterSettingResponseBody getBody() {
        return this.body;
    }

}
