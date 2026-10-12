// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateAuthorizationRuleRequest extends TeaModel {
    /**
     * <p>The new list of authorized resources. In MCP Tool scenarios, this is a set of tool names. An empty array returns ErrInvalidParameterWithEmpty.</p>
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
