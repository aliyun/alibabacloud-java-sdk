// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetInstanceTrialStatusResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("TrialStatus")
    public Boolean trialStatus;

    public static GetInstanceTrialStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceTrialStatusResponseBody self = new GetInstanceTrialStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceTrialStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceTrialStatusResponseBody setTrialStatus(Boolean trialStatus) {
        this.trialStatus = trialStatus;
        return this;
    }
    public Boolean getTrialStatus() {
        return this.trialStatus;
    }

}
