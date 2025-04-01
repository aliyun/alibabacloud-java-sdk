// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class DisableFunctionInvocationRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("abortOngoingRequest")
    public Boolean abortOngoingRequest;

    @NameInMap("reason")
    public String reason;

    public static DisableFunctionInvocationRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableFunctionInvocationRequest self = new DisableFunctionInvocationRequest();
        return TeaModel.build(map, self);
    }

    public DisableFunctionInvocationRequest setAbortOngoingRequest(Boolean abortOngoingRequest) {
        this.abortOngoingRequest = abortOngoingRequest;
        return this;
    }
    public Boolean getAbortOngoingRequest() {
        return this.abortOngoingRequest;
    }

    public DisableFunctionInvocationRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

}
