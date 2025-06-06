// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeleteEnterpriseAccelerateTargetRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>eap-ed1f0e392a28a4e6</p>
     */
    @NameInMap("EapId")
    public String eapId;

    @NameInMap("Target")
    public java.util.List<String> target;

    public static DeleteEnterpriseAccelerateTargetRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEnterpriseAccelerateTargetRequest self = new DeleteEnterpriseAccelerateTargetRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEnterpriseAccelerateTargetRequest setEapId(String eapId) {
        this.eapId = eapId;
        return this;
    }
    public String getEapId() {
        return this.eapId;
    }

    public DeleteEnterpriseAccelerateTargetRequest setTarget(java.util.List<String> target) {
        this.target = target;
        return this;
    }
    public java.util.List<String> getTarget() {
        return this.target;
    }

}
