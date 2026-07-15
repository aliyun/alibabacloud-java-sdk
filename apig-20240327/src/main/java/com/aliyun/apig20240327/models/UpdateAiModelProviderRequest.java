// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateAiModelProviderRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>千问云 / 阿里云百炼</p>
     */
    @NameInMap("displayName")
    public String displayName;

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
