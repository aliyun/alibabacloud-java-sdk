// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateEnterpriseAccelerateTargetRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>eap-eec34d4b12fcca61</p>
     */
    @NameInMap("EapId")
    public String eapId;

    @NameInMap("Target")
    public java.util.List<String> target;

    public static CreateEnterpriseAccelerateTargetRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEnterpriseAccelerateTargetRequest self = new CreateEnterpriseAccelerateTargetRequest();
        return TeaModel.build(map, self);
    }

    public CreateEnterpriseAccelerateTargetRequest setEapId(String eapId) {
        this.eapId = eapId;
        return this;
    }
    public String getEapId() {
        return this.eapId;
    }

    public CreateEnterpriseAccelerateTargetRequest setTarget(java.util.List<String> target) {
        this.target = target;
        return this;
    }
    public java.util.List<String> getTarget() {
        return this.target;
    }

}
