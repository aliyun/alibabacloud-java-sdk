// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeSkillsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSkillsResponseBody body;

    public static DescribeSkillsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSkillsResponse self = new DescribeSkillsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSkillsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSkillsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSkillsResponse setBody(DescribeSkillsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSkillsResponseBody getBody() {
        return this.body;
    }

}
