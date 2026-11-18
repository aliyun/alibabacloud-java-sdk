// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class GetIqsUsageRequest extends TeaModel {
    /**
     * <p>The ID of the Alibaba Cloud RAM user or the API key caller identifier to query.</p>
     * 
     * <strong>example:</strong>
     * <p>138608930460****</p>
     */
    @NameInMap("callerId")
    public String callerId;

    /**
     * <p>The end date for the usage query, inclusive. The format is YYYYMMDD. The date must be within the last 60 days.</p>
     * 
     * <strong>example:</strong>
     * <p>20241017</p>
     */
    @NameInMap("endDate")
    public String endDate;

    /**
     * <p>The start date for the usage query, inclusive. The format is YYYYMMDD. The date must be within the last 60 days.</p>
     * 
     * <strong>example:</strong>
     * <p>20241011</p>
     */
    @NameInMap("startDate")
    public String startDate;

    public static GetIqsUsageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIqsUsageRequest self = new GetIqsUsageRequest();
        return TeaModel.build(map, self);
    }

    public GetIqsUsageRequest setCallerId(String callerId) {
        this.callerId = callerId;
        return this;
    }
    public String getCallerId() {
        return this.callerId;
    }

    public GetIqsUsageRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public GetIqsUsageRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
