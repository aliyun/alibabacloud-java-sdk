// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeleteEnterpriseAcceleratePolicyRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>eap-6edfb9d722ef8429</p>
     */
    @NameInMap("EapId")
    public String eapId;

    public static DeleteEnterpriseAcceleratePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEnterpriseAcceleratePolicyRequest self = new DeleteEnterpriseAcceleratePolicyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEnterpriseAcceleratePolicyRequest setEapId(String eapId) {
        this.eapId = eapId;
        return this;
    }
    public String getEapId() {
        return this.eapId;
    }

}
