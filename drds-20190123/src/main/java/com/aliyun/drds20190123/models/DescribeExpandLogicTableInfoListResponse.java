// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeExpandLogicTableInfoListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeExpandLogicTableInfoListResponseBody body;

    public static DescribeExpandLogicTableInfoListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeExpandLogicTableInfoListResponse self = new DescribeExpandLogicTableInfoListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeExpandLogicTableInfoListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeExpandLogicTableInfoListResponse setBody(DescribeExpandLogicTableInfoListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeExpandLogicTableInfoListResponseBody getBody() {
        return this.body;
    }

}
