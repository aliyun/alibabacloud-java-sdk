// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetHttpApiRequest extends TeaModel {
    /**
     * <p>Specifies whether to expand independent policy configurations. When omitted or set to true, a full compatible view is returned. When set to false, the ModelAPI Token throttling managed by Policy returns policy references and optional read-only plug-in status, and the rule body can be retrieved by calling GetPolicy.</p>
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
