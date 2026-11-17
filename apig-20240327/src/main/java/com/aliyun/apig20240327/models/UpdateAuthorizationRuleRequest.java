// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateAuthorizationRuleRequest extends TeaModel {
    /**
     * <p>The new list of authorized resources. In the MCP tool scenario, this is a collection of tool names. If an empty array is provided, the ErrInvalidParameterWithEmpty error is returned.</p>
     */
    @NameInMap("resources")
    public java.util.List<String> resources;

    public static UpdateAuthorizationRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAuthorizationRuleRequest self = new UpdateAuthorizationRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAuthorizationRuleRequest setResources(java.util.List<String> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<String> getResources() {
        return this.resources;
    }

}
