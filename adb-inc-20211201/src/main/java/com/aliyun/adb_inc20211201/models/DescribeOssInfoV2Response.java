// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class DescribeOssInfoV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOssInfoV2ResponseBody body;

    public static DescribeOssInfoV2Response build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssInfoV2Response self = new DescribeOssInfoV2Response();
        return TeaModel.build(map, self);
    }

    public DescribeOssInfoV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOssInfoV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOssInfoV2Response setBody(DescribeOssInfoV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOssInfoV2ResponseBody getBody() {
        return this.body;
    }

}
