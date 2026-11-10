// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class RemoveUserLoginPoliciesRequest extends TeaModel {
    /**
     * <p>The business channel.</p>
     * 
     * <strong>example:</strong>
     * <p>ENTERPRISE</p>
     */
    @NameInMap("BusinessChannel")
    public String businessChannel;

    /**
     * <p>The list of policy IDs.</p>
     */
    @NameInMap("PolicyIds")
    public java.util.List<String> policyIds;

    public static RemoveUserLoginPoliciesRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveUserLoginPoliciesRequest self = new RemoveUserLoginPoliciesRequest();
        return TeaModel.build(map, self);
    }

    public RemoveUserLoginPoliciesRequest setBusinessChannel(String businessChannel) {
        this.businessChannel = businessChannel;
        return this;
    }
    public String getBusinessChannel() {
        return this.businessChannel;
    }

    public RemoveUserLoginPoliciesRequest setPolicyIds(java.util.List<String> policyIds) {
        this.policyIds = policyIds;
        return this;
    }
    public java.util.List<String> getPolicyIds() {
        return this.policyIds;
    }

}
