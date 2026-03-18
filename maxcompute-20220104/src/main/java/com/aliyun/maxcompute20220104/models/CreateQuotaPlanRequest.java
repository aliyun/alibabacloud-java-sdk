// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class CreateQuotaPlanRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    @NameInMap("region")
    public String region;

    @NameInMap("tenantId")
    public String tenantId;

    public static CreateQuotaPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateQuotaPlanRequest self = new CreateQuotaPlanRequest();
        return TeaModel.build(map, self);
    }

    public CreateQuotaPlanRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public CreateQuotaPlanRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public CreateQuotaPlanRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
