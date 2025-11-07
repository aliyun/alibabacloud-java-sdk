// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeOssStatusV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOssStatusV2ResponseBody body;

    public static DescribeOssStatusV2Response build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssStatusV2Response self = new DescribeOssStatusV2Response();
        return TeaModel.build(map, self);
    }

    public DescribeOssStatusV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOssStatusV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOssStatusV2Response setBody(DescribeOssStatusV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOssStatusV2ResponseBody getBody() {
        return this.body;
    }

}
