// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetHttpApiRequest extends TeaModel {
    /**
     * <p>Specifies whether to expand independent policy configurations. If this parameter is omitted or set to true, a fully compatible view is returned. If this parameter is set to false, policy references and optional read-only plug-in statuses are returned for Model API token throttling managed by policies, and the rule body can be retrieved by calling GetPolicy.</p>
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
