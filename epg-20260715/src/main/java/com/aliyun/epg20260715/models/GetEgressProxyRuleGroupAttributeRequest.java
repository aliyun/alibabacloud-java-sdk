// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class GetEgressProxyRuleGroupAttributeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eprg-uf60966a9633667c****</p>
     */
    @NameInMap("EgressProxyRuleGroupId")
    public String egressProxyRuleGroupId;

    public static GetEgressProxyRuleGroupAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEgressProxyRuleGroupAttributeRequest self = new GetEgressProxyRuleGroupAttributeRequest();
        return TeaModel.build(map, self);
    }

    public GetEgressProxyRuleGroupAttributeRequest setEgressProxyRuleGroupId(String egressProxyRuleGroupId) {
        this.egressProxyRuleGroupId = egressProxyRuleGroupId;
        return this;
    }
    public String getEgressProxyRuleGroupId() {
        return this.egressProxyRuleGroupId;
    }

}
