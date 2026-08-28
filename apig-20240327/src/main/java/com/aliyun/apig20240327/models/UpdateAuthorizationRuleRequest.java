// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateAuthorizationRuleRequest extends TeaModel {
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
