// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetSCIMSynchronizationStatusResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of SCIM synchronization. Valid values:</p>
     * <br>
     * <p>*   Enabled</p>
     * <p>*   Disabled</p>
     */
    @NameInMap("SCIMSynchronizationStatus")
    public String SCIMSynchronizationStatus;

    public static GetSCIMSynchronizationStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSCIMSynchronizationStatusResponseBody self = new GetSCIMSynchronizationStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSCIMSynchronizationStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSCIMSynchronizationStatusResponseBody setSCIMSynchronizationStatus(String SCIMSynchronizationStatus) {
        this.SCIMSynchronizationStatus = SCIMSynchronizationStatus;
        return this;
    }
    public String getSCIMSynchronizationStatus() {
        return this.SCIMSynchronizationStatus;
    }

}
