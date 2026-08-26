// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DisableTrustedOriginRequest extends TeaModel {
    /**
     * <p>The ID of the IDaaS EIAM instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_example</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the trusted origin.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>to_example</p>
     */
    @NameInMap("TrustedOriginId")
    public String trustedOriginId;

    public static DisableTrustedOriginRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableTrustedOriginRequest self = new DisableTrustedOriginRequest();
        return TeaModel.build(map, self);
    }

    public DisableTrustedOriginRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DisableTrustedOriginRequest setTrustedOriginId(String trustedOriginId) {
        this.trustedOriginId = trustedOriginId;
        return this;
    }
    public String getTrustedOriginId() {
        return this.trustedOriginId;
    }

}
