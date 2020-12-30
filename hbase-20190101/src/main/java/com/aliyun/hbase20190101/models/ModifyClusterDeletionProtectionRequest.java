// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ModifyClusterDeletionProtectionRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

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
