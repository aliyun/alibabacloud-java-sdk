// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class UpgradeMinorVersionRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Components")
    public String components;

    public static UpgradeMinorVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeMinorVersionRequest self = new UpgradeMinorVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeMinorVersionRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpgradeMinorVersionRequest setComponents(String components) {
        this.components = components;
        return this;
    }
    public String getComponents() {
        return this.components;
    }

}
