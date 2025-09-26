// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class RoutingConfiguration extends TeaModel {
    /**
     * <p>不同版本的流量权重配置</p>
     */
    @NameInMap("versionWeights")
    public java.util.List<VersionWeight> versionWeights;

    public static RoutingConfiguration build(java.util.Map<String, ?> map) throws Exception {
        RoutingConfiguration self = new RoutingConfiguration();
        return TeaModel.build(map, self);
    }

    public RoutingConfiguration setVersionWeights(java.util.List<VersionWeight> versionWeights) {
        this.versionWeights = versionWeights;
        return this;
    }
    public java.util.List<VersionWeight> getVersionWeights() {
        return this.versionWeights;
    }

}
