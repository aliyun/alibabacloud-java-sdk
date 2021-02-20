// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DeleteSceneDefensePolicyRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("PolicyId")
    public String policyId;

    public static DeleteSceneDefensePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSceneDefensePolicyRequest self = new DeleteSceneDefensePolicyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSceneDefensePolicyRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DeleteSceneDefensePolicyRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

}
