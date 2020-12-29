// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricInvitationCodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeFabricInvitationCodeResponseBody body;

    public static DescribeFabricInvitationCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricInvitationCodeResponse self = new DescribeFabricInvitationCodeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFabricInvitationCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFabricInvitationCodeResponse setBody(DescribeFabricInvitationCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFabricInvitationCodeResponseBody getBody() {
        return this.body;
    }

}
