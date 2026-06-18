// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class UpdateQuotaRequest extends TeaModel {
    @NameInMap("body")
    public Quota body;

    public static UpdateQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateQuotaRequest self = new UpdateQuotaRequest();
        return TeaModel.build(map, self);
    }

    public UpdateQuotaRequest setBody(Quota body) {
        this.body = body;
        return this;
    }
    public Quota getBody() {
        return this.body;
    }

}
