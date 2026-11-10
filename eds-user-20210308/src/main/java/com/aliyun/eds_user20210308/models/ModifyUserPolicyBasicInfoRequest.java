// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class ModifyUserPolicyBasicInfoRequest extends TeaModel {
    /**
     * <p>The channel.</p>
     * 
     * <strong>example:</strong>
     * <p>ENTERPRISE</p>
     */
    @NameInMap("BusinessChannel")
    public String businessChannel;

    /**
     * <p>The policy name.</p>
     * 
     * <strong>example:</strong>
     * <p>deveoper-policy</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The policy ID.</p>
     * 
     * <strong>example:</strong>
     * <p>up-89unlabdl****</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    public static ModifyUserPolicyBasicInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyUserPolicyBasicInfoRequest self = new ModifyUserPolicyBasicInfoRequest();
        return TeaModel.build(map, self);
    }

    public ModifyUserPolicyBasicInfoRequest setBusinessChannel(String businessChannel) {
        this.businessChannel = businessChannel;
        return this;
    }
    public String getBusinessChannel() {
        return this.businessChannel;
    }

    public ModifyUserPolicyBasicInfoRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyUserPolicyBasicInfoRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

}
