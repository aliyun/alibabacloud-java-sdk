// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetQuotaScheduleRequest extends TeaModel {
    /**
     * <p>The time zone.</p>
     */
    @NameInMap("displayTimezone")
    public String displayTimezone;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("region")
    public String region;

    /**
     * <p>The ID of the tenant.</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static GetQuotaScheduleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQuotaScheduleRequest self = new GetQuotaScheduleRequest();
        return TeaModel.build(map, self);
    }

    public GetQuotaScheduleRequest setDisplayTimezone(String displayTimezone) {
        this.displayTimezone = displayTimezone;
        return this;
    }
    public String getDisplayTimezone() {
        return this.displayTimezone;
    }

    public GetQuotaScheduleRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public GetQuotaScheduleRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
