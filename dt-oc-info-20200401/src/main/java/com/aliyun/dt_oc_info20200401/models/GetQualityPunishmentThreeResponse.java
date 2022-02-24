// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class GetQualityPunishmentThreeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetQualityPunishmentThreeResponseBody body;

    public static GetQualityPunishmentThreeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQualityPunishmentThreeResponse self = new GetQualityPunishmentThreeResponse();
        return TeaModel.build(map, self);
    }

    public GetQualityPunishmentThreeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQualityPunishmentThreeResponse setBody(GetQualityPunishmentThreeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQualityPunishmentThreeResponseBody getBody() {
        return this.body;
    }

}
