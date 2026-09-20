// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ModifyClusterDeletionProtectionRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ld-****************</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>Specifies whether to enable deletion protection. Valid values:</p>
     * <ul>
     * <li>true: Enables deletion protection. The cluster cannot be deleted when deletion protection is enabled.</li>
     * <li>false: Disables deletion protection. The cluster can be deleted.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Protection")
    public Boolean protection;

    public static ModifyClusterDeletionProtectionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterDeletionProtectionRequest self = new ModifyClusterDeletionProtectionRequest();
        return TeaModel.build(map, self);
    }

    public ModifyClusterDeletionProtectionRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ModifyClusterDeletionProtectionRequest setProtection(Boolean protection) {
        this.protection = protection;
        return this;
    }
    public Boolean getProtection() {
        return this.protection;
    }

}
