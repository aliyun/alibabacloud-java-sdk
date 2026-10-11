// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class UpdateEgressProxyRuleGroupAttributeRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B******</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>testEpg</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <strong>example:</strong>
     * <p>eppool-gw80d96a96ca0b00****</p>
     */
    @NameInMap("EgressProxyIpPoolId")
    public String egressProxyIpPoolId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eprg-uf60966a9633667c****</p>
     */
    @NameInMap("EgressProxyRuleGroupId")
    public String egressProxyRuleGroupId;

    /**
     * <strong>example:</strong>
     * <p>testEpg</p>
     */
    @NameInMap("EgressProxyRuleGroupName")
    public String egressProxyRuleGroupName;

    public static UpdateEgressProxyRuleGroupAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEgressProxyRuleGroupAttributeRequest self = new UpdateEgressProxyRuleGroupAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEgressProxyRuleGroupAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateEgressProxyRuleGroupAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateEgressProxyRuleGroupAttributeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateEgressProxyRuleGroupAttributeRequest setEgressProxyIpPoolId(String egressProxyIpPoolId) {
        this.egressProxyIpPoolId = egressProxyIpPoolId;
        return this;
    }
    public String getEgressProxyIpPoolId() {
        return this.egressProxyIpPoolId;
    }

    public UpdateEgressProxyRuleGroupAttributeRequest setEgressProxyRuleGroupId(String egressProxyRuleGroupId) {
        this.egressProxyRuleGroupId = egressProxyRuleGroupId;
        return this;
    }
    public String getEgressProxyRuleGroupId() {
        return this.egressProxyRuleGroupId;
    }

    public UpdateEgressProxyRuleGroupAttributeRequest setEgressProxyRuleGroupName(String egressProxyRuleGroupName) {
        this.egressProxyRuleGroupName = egressProxyRuleGroupName;
        return this;
    }
    public String getEgressProxyRuleGroupName() {
        return this.egressProxyRuleGroupName;
    }

}
