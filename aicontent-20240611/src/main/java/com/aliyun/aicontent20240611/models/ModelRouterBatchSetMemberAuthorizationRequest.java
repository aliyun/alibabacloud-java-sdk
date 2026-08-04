// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterBatchSetMemberAuthorizationRequest extends TeaModel {
    /**
     * <p>The authorization configuration. This parameter is a required JSON string that uses overwrite mode: {&quot;model_ids&quot;:[...],&quot;group_ids&quot;:[&quot;mg_xxx&quot;]}. Internal key names use a fixed underscore style and are not converted to the camelCase convention of the API.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;model_ids&quot;:[],&quot;group_ids&quot;:[&quot;mg_qwen_19&quot;]}</p>
     */
    @NameInMap("allowedModelGroupConfig")
    public String allowedModelGroupConfig;

    /**
     * <p>The list of user IDs. This parameter is required. You can specify 1 to 50 user IDs. If more than 50 user IDs are required, call this operation in batches. All users must be direct members of the specified department.</p>
     * 
     * <strong>example:</strong>
     * <p>[30001,30002,30003]</p>
     */
    @NameInMap("userIdList")
    public java.util.List<Long> userIdList;

    public static ModelRouterBatchSetMemberAuthorizationRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterBatchSetMemberAuthorizationRequest self = new ModelRouterBatchSetMemberAuthorizationRequest();
        return TeaModel.build(map, self);
    }

    public ModelRouterBatchSetMemberAuthorizationRequest setAllowedModelGroupConfig(String allowedModelGroupConfig) {
        this.allowedModelGroupConfig = allowedModelGroupConfig;
        return this;
    }
    public String getAllowedModelGroupConfig() {
        return this.allowedModelGroupConfig;
    }

    public ModelRouterBatchSetMemberAuthorizationRequest setUserIdList(java.util.List<Long> userIdList) {
        this.userIdList = userIdList;
        return this;
    }
    public java.util.List<Long> getUserIdList() {
        return this.userIdList;
    }

}
