// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class UpdateOptimizeRunRequest extends TeaModel {
    /**
     * <p>The extra parameters. To retry a failed artifact application, set application.action to retry and do not specify status. Do not specify this field when canceling a run.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;application&quot;:{&quot;action&quot;:&quot;retry&quot;}}</p>
     */
    @NameInMap("extra")
    public java.util.Map<String, ?> extra;

    /**
     * <p>The status. Only Cancelled is supported when canceling a run. The execution status is maintained by the server. Do not specify this field when retrying an artifact application.</p>
     * 
     * <strong>example:</strong>
     * <p>Succeeded</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The idempotency token.</p>
     * 
     * <strong>example:</strong>
     * <p>a1b2c3d4-1234-5678-90ab-cdef12345678</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static UpdateOptimizeRunRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOptimizeRunRequest self = new UpdateOptimizeRunRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOptimizeRunRequest setExtra(java.util.Map<String, ?> extra) {
        this.extra = extra;
        return this;
    }
    public java.util.Map<String, ?> getExtra() {
        return this.extra;
    }

    public UpdateOptimizeRunRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateOptimizeRunRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
