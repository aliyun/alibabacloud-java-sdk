// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class UpdateOptimizeTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{&quot;ioVersion&quot;:2,&quot;inputs&quot;:{&quot;experienceLibrary&quot;:{&quot;type&quot;:&quot;dataset&quot;,&quot;dataset&quot;:&quot;experiences&quot;},&quot;trajectory&quot;:{&quot;type&quot;:&quot;sls&quot;,&quot;project&quot;:&quot;my-project&quot;,&quot;logstore&quot;:&quot;agent-trajectory&quot;,&quot;format&quot;:&quot;atif&quot;},&quot;prompt&quot;:{&quot;type&quot;:&quot;inline&quot;,&quot;format&quot;:&quot;markdown&quot;,&quot;content&quot;:&quot;# Guidance\\nExtract evidence-backed tool contracts.&quot;}},&quot;outputs&quot;:{&quot;changePlan&quot;:{&quot;type&quot;:&quot;dataset&quot;,&quot;dataset&quot;:&quot;experience-plans&quot;}},&quot;operators&quot;:[&quot;tool_contract&quot;],&quot;application&quot;:{&quot;mode&quot;:&quot;manual&quot;}}</p>
     */
    @NameInMap("config")
    public java.util.Map<String, ?> config;

    /**
     * <strong>example:</strong>
     * <p>Disabled</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>a1b2c3d4-1234-5678-90ab-cdef12345678</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static UpdateOptimizeTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOptimizeTaskRequest self = new UpdateOptimizeTaskRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOptimizeTaskRequest setConfig(java.util.Map<String, ?> config) {
        this.config = config;
        return this;
    }
    public java.util.Map<String, ?> getConfig() {
        return this.config;
    }

    public UpdateOptimizeTaskRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateOptimizeTaskRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
