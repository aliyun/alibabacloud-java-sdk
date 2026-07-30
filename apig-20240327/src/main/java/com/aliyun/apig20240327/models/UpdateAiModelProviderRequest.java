// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateAiModelProviderRequest extends TeaModel {
    /**
     * <p>The display name of the model provider. This parameter is required. The name can be up to 128 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Qwen Cloud / Alibaba Cloud Bailian.</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>The complete set of AI service IDs to bind to the model provider. If this parameter is not specified, the existing bindings are retained. If an empty array is specified, all bindings are cleared. Duplicate and empty values are normalized.</p>
     */
    @NameInMap("serviceIds")
    public java.util.List<String> serviceIds;

    public static UpdateAiModelProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAiModelProviderRequest self = new UpdateAiModelProviderRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAiModelProviderRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public UpdateAiModelProviderRequest setServiceIds(java.util.List<String> serviceIds) {
        this.serviceIds = serviceIds;
        return this;
    }
    public java.util.List<String> getServiceIds() {
        return this.serviceIds;
    }

}
