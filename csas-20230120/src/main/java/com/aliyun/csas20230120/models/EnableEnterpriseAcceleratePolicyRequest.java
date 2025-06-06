// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class EnableEnterpriseAcceleratePolicyRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>eap-530da9f7110441fb</p>
     */
    @NameInMap("EapId")
    public String eapId;

    public static EnableEnterpriseAcceleratePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableEnterpriseAcceleratePolicyRequest self = new EnableEnterpriseAcceleratePolicyRequest();
        return TeaModel.build(map, self);
    }

    public EnableEnterpriseAcceleratePolicyRequest setEapId(String eapId) {
        this.eapId = eapId;
        return this;
    }
    public String getEapId() {
        return this.eapId;
    }

}
