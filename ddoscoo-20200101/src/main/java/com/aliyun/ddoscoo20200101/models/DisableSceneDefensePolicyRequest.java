// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DisableSceneDefensePolicyRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("PolicyId")
    public String policyId;

    public static DisableSceneDefensePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableSceneDefensePolicyRequest self = new DisableSceneDefensePolicyRequest();
        return TeaModel.build(map, self);
    }

    public DisableSceneDefensePolicyRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DisableSceneDefensePolicyRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

}
