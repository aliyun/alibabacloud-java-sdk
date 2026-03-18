// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class UpdateQuotaScheduleRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    @NameInMap("region")
    public String region;

    @NameInMap("tenantId")
    public String tenantId;

    public static UpdateQuotaScheduleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateQuotaScheduleRequest self = new UpdateQuotaScheduleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateQuotaScheduleRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public UpdateQuotaScheduleRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public UpdateQuotaScheduleRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
