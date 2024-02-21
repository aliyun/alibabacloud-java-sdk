// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class CreateDeliveryHistoryJobResponseBody extends TeaModel {
    /**
     * <p>The ID of the historical event delivery task.</p>
     */
    @NameInMap("JobId")
    public Integer jobId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDeliveryHistoryJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDeliveryHistoryJobResponseBody self = new CreateDeliveryHistoryJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDeliveryHistoryJobResponseBody setJobId(Integer jobId) {
        this.jobId = jobId;
        return this;
    }
    public Integer getJobId() {
        return this.jobId;
    }

    public CreateDeliveryHistoryJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
