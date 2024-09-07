// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class UnInstallAddonRequest extends TeaModel {
    /**
     * <p>The addon ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Login-1.0-W2g****</p>
     */
    @NameInMap("AddonId")
    public String addonId;

    /**
     * <p>The cluster ID.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/87116.html">ListClusters</a> operation to query the cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    public static UnInstallAddonRequest build(java.util.Map<String, ?> map) throws Exception {
        UnInstallAddonRequest self = new UnInstallAddonRequest();
        return TeaModel.build(map, self);
    }

    public UnInstallAddonRequest setAddonId(String addonId) {
        this.addonId = addonId;
        return this;
    }
    public String getAddonId() {
        return this.addonId;
    }

    public UnInstallAddonRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
