// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class StopProcessInstanceRequest extends TeaModel {
    /**
     * <p>A token to ensure that the request is idempotent. We recommend that you use a universally unique identifier (UUID).</p>
     * 
     * <strong>example:</strong>
     * <p>ABFUOEUOTRTRJKE</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The process instance ID. This operation supports approval forms from both the old and new versions of Security Center.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>176906667488145</p>
     */
    @NameInMap("ProcessInstanceId")
    public String processInstanceId;

    public static StopProcessInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        StopProcessInstanceRequest self = new StopProcessInstanceRequest();
        return TeaModel.build(map, self);
    }

    public StopProcessInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public StopProcessInstanceRequest setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
        return this;
    }
    public String getProcessInstanceId() {
        return this.processInstanceId;
    }

}
