// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class VersionWeight extends TeaModel {
    /**
     * <p>智能体运行时版本号</p>
     */
    @NameInMap("version")
    public String version;

    /**
     * <p>流量权重比例（0.0-1.0）</p>
     */
    @NameInMap("weight")
    public Float weight;

    public static VersionWeight build(java.util.Map<String, ?> map) throws Exception {
        VersionWeight self = new VersionWeight();
        return TeaModel.build(map, self);
    }

    public VersionWeight setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public VersionWeight setWeight(Float weight) {
        this.weight = weight;
        return this;
    }
    public Float getWeight() {
        return this.weight;
    }

}
