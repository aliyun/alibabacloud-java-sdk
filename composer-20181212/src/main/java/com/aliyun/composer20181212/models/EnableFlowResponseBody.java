// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.composer20181212.models;

import com.aliyun.tea.*;

public class EnableFlowResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("FlowStatus")
    public String flowStatus;

    public static EnableFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableFlowResponseBody self = new EnableFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnableFlowResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public EnableFlowResponseBody setFlowStatus(String flowStatus) {
        this.flowStatus = flowStatus;
        return this;
    }
    public String getFlowStatus() {
        return this.flowStatus;
    }

}
