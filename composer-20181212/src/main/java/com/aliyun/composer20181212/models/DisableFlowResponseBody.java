// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.composer20181212.models;

import com.aliyun.tea.*;

public class DisableFlowResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("FlowStatus")
    public String flowStatus;

    public static DisableFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableFlowResponseBody self = new DisableFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DisableFlowResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DisableFlowResponseBody setFlowStatus(String flowStatus) {
        this.flowStatus = flowStatus;
        return this;
    }
    public String getFlowStatus() {
        return this.flowStatus;
    }

}
