// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterSetMemberAuthorizationRequest extends TeaModel {
    /**
     * <p>The authorization configuration (JSON string, overwrite mode): {&quot;model_ids&quot;:[...],&quot;group_ids&quot;:[&quot;mg_xxx&quot;]}. The internal key names use a fixed underscore style and are not converted to the camelCase convention used by the API. If this field is specified together with allowedModels, this field takes precedence.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;model_ids&quot;:[],&quot;group_ids&quot;:[&quot;mg_qwen_49&quot;]}</p>
     */
    @NameInMap("allowedModelGroupConfig")
    public String allowedModelGroupConfig;

    /**
     * <p>The legacy authorization field (comma-separated numeric model IDs). This field is retained during the canary release of group-based authorization: tenants that have not enabled the grouping feature continue to use this field. If this field is specified together with allowedModelGroupConfig, the latter takes precedence.</p>
     * 
     * <strong>example:</strong>
     * <p>101,102,103</p>
     */
    @NameInMap("allowedModels")
    public String allowedModels;

    public static ModelRouterSetMemberAuthorizationRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterSetMemberAuthorizationRequest self = new ModelRouterSetMemberAuthorizationRequest();
        return TeaModel.build(map, self);
    }

    public ModelRouterSetMemberAuthorizationRequest setAllowedModelGroupConfig(String allowedModelGroupConfig) {
        this.allowedModelGroupConfig = allowedModelGroupConfig;
        return this;
    }
    public String getAllowedModelGroupConfig() {
        return this.allowedModelGroupConfig;
    }

    public ModelRouterSetMemberAuthorizationRequest setAllowedModels(String allowedModels) {
        this.allowedModels = allowedModels;
        return this;
    }
    public String getAllowedModels() {
        return this.allowedModels;
    }

}
