// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class InstallAddonResponseBody extends TeaModel {
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
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B745C159-3155-4B94-95D0-4B73D4D2****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static InstallAddonResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InstallAddonResponseBody self = new InstallAddonResponseBody();
        return TeaModel.build(map, self);
    }

    public InstallAddonResponseBody setAddonId(String addonId) {
        this.addonId = addonId;
        return this;
    }
    public String getAddonId() {
        return this.addonId;
    }

    public InstallAddonResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public InstallAddonResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
