// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class GetDingTalkUserOrgByAliyunTmpCodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetDingTalkUserOrgByAliyunTmpCodeResponseBody body;

    public static GetDingTalkUserOrgByAliyunTmpCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDingTalkUserOrgByAliyunTmpCodeResponse self = new GetDingTalkUserOrgByAliyunTmpCodeResponse();
        return TeaModel.build(map, self);
    }

    public GetDingTalkUserOrgByAliyunTmpCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDingTalkUserOrgByAliyunTmpCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDingTalkUserOrgByAliyunTmpCodeResponse setBody(GetDingTalkUserOrgByAliyunTmpCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDingTalkUserOrgByAliyunTmpCodeResponseBody getBody() {
        return this.body;
    }

}
