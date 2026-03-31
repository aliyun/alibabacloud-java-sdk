// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetComputeQuotaScheduleRequest extends TeaModel {
    /**
     * <p>Display time zone.</p>
     * 
     * <strong>example:</strong>
     * <p>UTC+8</p>
     */
    @NameInMap("displayTimezone")
    public String displayTimezone;

    public static GetComputeQuotaScheduleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetComputeQuotaScheduleRequest self = new GetComputeQuotaScheduleRequest();
        return TeaModel.build(map, self);
    }

    public GetComputeQuotaScheduleRequest setDisplayTimezone(String displayTimezone) {
        this.displayTimezone = displayTimezone;
        return this;
    }
    public String getDisplayTimezone() {
        return this.displayTimezone;
    }

}
