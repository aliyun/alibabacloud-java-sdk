// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterBatchBindModelGroupRequest extends TeaModel {
    /**
     * <p>The authorization configuration (JSON string). Internal key names use a fixed underscore style: {&quot;model_ids&quot;:[...],&quot;group_ids&quot;:[&quot;mg_xxx&quot;]}</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;model_ids&quot;:[],&quot;group_ids&quot;:[&quot;mg_pro&quot;]}</p>
     */
    @NameInMap("allowedModelGroupConfig")
    public String allowedModelGroupConfig;

    /**
     * <p>The array of department IDs. You can specify 1 to 50 IDs. If more than 50, call this operation in batches.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[1001, 1002, 1003]</p>
     */
    @NameInMap("clientIdList")
    public java.util.List<Long> clientIdList;

    public static ModelRouterBatchBindModelGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterBatchBindModelGroupRequest self = new ModelRouterBatchBindModelGroupRequest();
        return TeaModel.build(map, self);
    }

    public ModelRouterBatchBindModelGroupRequest setAllowedModelGroupConfig(String allowedModelGroupConfig) {
        this.allowedModelGroupConfig = allowedModelGroupConfig;
        return this;
    }
    public String getAllowedModelGroupConfig() {
        return this.allowedModelGroupConfig;
    }

    public ModelRouterBatchBindModelGroupRequest setClientIdList(java.util.List<Long> clientIdList) {
        this.clientIdList = clientIdList;
        return this;
    }
    public java.util.List<Long> getClientIdList() {
        return this.clientIdList;
    }

}
