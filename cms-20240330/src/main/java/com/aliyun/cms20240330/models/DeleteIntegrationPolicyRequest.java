// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteIntegrationPolicyRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("force")
    public Boolean force;

    public static DeleteIntegrationPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteIntegrationPolicyRequest self = new DeleteIntegrationPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteIntegrationPolicyRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

}
