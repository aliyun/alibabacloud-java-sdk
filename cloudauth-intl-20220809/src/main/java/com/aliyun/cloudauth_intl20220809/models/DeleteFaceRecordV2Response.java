// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class DeleteFaceRecordV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteFaceRecordV2ResponseBody body;

    public static DeleteFaceRecordV2Response build(java.util.Map<String, ?> map) throws Exception {
        DeleteFaceRecordV2Response self = new DeleteFaceRecordV2Response();
        return TeaModel.build(map, self);
    }

    public DeleteFaceRecordV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFaceRecordV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteFaceRecordV2Response setBody(DeleteFaceRecordV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFaceRecordV2ResponseBody getBody() {
        return this.body;
    }

}
