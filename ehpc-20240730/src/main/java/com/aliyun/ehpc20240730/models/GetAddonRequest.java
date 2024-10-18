// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class GetAddonRequest extends TeaModel {
    /**
     * <p>The addon ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Login-1.0-W4g****</p>
     */
    @NameInMap("AddonId")
    public String addonId;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    public static GetAddonRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAddonRequest self = new GetAddonRequest();
        return TeaModel.build(map, self);
    }

    public GetAddonRequest setAddonId(String addonId) {
        this.addonId = addonId;
        return this;
    }
    public String getAddonId() {
        return this.addonId;
    }

    public GetAddonRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
