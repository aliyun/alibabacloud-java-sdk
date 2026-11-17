// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateAiModelProviderRequest extends TeaModel {
    /**
     * <p>The optional default AI service ID. If not empty, it must be a service in the updated association set. Omitting this parameter retains the saved default. An explicit empty string clears the default. A non-empty value sets the default. The value can be up to 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>svc-d00000000000000000000</p>
     */
    @NameInMap("defaultServiceId")
    public String defaultServiceId;

    /**
     * <p>The display name of the model provider. This parameter is required and can be up to 128 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Qwen Cloud / Alibaba Cloud Model Studio</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>The complete set of AI service IDs to associate with the model provider. If you do not specify this parameter, the existing associations are retained. If you pass an empty array, all associations are cleared. Duplicate and empty values are normalized.</p>
     */
    @NameInMap("serviceIds")
    public java.util.List<String> serviceIds;

    public static UpdateAiModelProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAiModelProviderRequest self = new UpdateAiModelProviderRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAiModelProviderRequest setDefaultServiceId(String defaultServiceId) {
        this.defaultServiceId = defaultServiceId;
        return this;
    }
    public String getDefaultServiceId() {
        return this.defaultServiceId;
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
