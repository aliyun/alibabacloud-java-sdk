// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetHttpApiRequest extends TeaModel {
    /**
     * <p>Specifies whether to expand independent policy configurations. If omitted or set to true, a complete compatibility view is returned. If set to false, the ModelAPI token throttling managed by the policy returns a policy reference and an optional read-only plugin status. You can use GetPolicy to retrieve the rule body.</p>
     */
    @NameInMap("expandPolicyConfigs")
    public Boolean expandPolicyConfigs;

    public static GetHttpApiRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHttpApiRequest self = new GetHttpApiRequest();
        return TeaModel.build(map, self);
    }

    public GetHttpApiRequest setExpandPolicyConfigs(Boolean expandPolicyConfigs) {
        this.expandPolicyConfigs = expandPolicyConfigs;
        return this;
    }
    public Boolean getExpandPolicyConfigs() {
        return this.expandPolicyConfigs;
    }

}
