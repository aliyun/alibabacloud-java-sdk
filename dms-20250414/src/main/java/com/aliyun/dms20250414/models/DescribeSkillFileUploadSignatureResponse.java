// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DescribeSkillFileUploadSignatureResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSkillFileUploadSignatureResponseBody body;

    public static DescribeSkillFileUploadSignatureResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSkillFileUploadSignatureResponse self = new DescribeSkillFileUploadSignatureResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSkillFileUploadSignatureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSkillFileUploadSignatureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSkillFileUploadSignatureResponse setBody(DescribeSkillFileUploadSignatureResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSkillFileUploadSignatureResponseBody getBody() {
        return this.body;
    }

}
