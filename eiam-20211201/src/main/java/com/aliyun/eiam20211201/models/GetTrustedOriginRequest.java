// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetTrustedOriginRequest extends TeaModel {
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

    public static GetTrustedOriginRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTrustedOriginRequest self = new GetTrustedOriginRequest();
        return TeaModel.build(map, self);
    }

    public GetTrustedOriginRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetTrustedOriginRequest setTrustedOriginId(String trustedOriginId) {
        this.trustedOriginId = trustedOriginId;
        return this;
    }
    public String getTrustedOriginId() {
        return this.trustedOriginId;
    }

}
