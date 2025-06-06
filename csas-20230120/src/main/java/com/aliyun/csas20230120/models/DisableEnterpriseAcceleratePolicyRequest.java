// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DisableEnterpriseAcceleratePolicyRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>eap-d50b45aa7dc04aef</p>
     */
    @NameInMap("EapId")
    public String eapId;

    public static DisableEnterpriseAcceleratePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableEnterpriseAcceleratePolicyRequest self = new DisableEnterpriseAcceleratePolicyRequest();
        return TeaModel.build(map, self);
    }

    public DisableEnterpriseAcceleratePolicyRequest setEapId(String eapId) {
        this.eapId = eapId;
        return this;
    }
    public String getEapId() {
        return this.eapId;
    }

}
