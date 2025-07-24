// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class GetIqsUsageRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>20241017</p>
     */
    @NameInMap("endDate")
    public String endDate;

    /**
     * <strong>example:</strong>
     * <p>20241011</p>
     */
    @NameInMap("startDate")
    public String startDate;

    public static GetIqsUsageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIqsUsageRequest self = new GetIqsUsageRequest();
        return TeaModel.build(map, self);
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
