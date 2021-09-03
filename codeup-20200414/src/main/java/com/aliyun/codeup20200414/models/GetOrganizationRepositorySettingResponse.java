// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class GetOrganizationRepositorySettingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetOrganizationRepositorySettingResponseBody body;

    public static GetOrganizationRepositorySettingResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOrganizationRepositorySettingResponse self = new GetOrganizationRepositorySettingResponse();
        return TeaModel.build(map, self);
    }

    public GetOrganizationRepositorySettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOrganizationRepositorySettingResponse setBody(GetOrganizationRepositorySettingResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOrganizationRepositorySettingResponseBody getBody() {
        return this.body;
    }

}
