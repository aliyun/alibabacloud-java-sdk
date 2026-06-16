// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class GrayTrafficWeight extends TeaModel {
    /**
     * <p>The identifier of the gray version.</p>
     */
    @NameInMap("version")
    public String version;

    /**
     * <p>The traffic weight, a value from 0.0 to 1.0.</p>
     */
    @NameInMap("weight")
    public Float weight;

    public static GrayTrafficWeight build(java.util.Map<String, ?> map) throws Exception {
        GrayTrafficWeight self = new GrayTrafficWeight();
        return TeaModel.build(map, self);
    }

    public GrayTrafficWeight setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public GrayTrafficWeight setWeight(Float weight) {
        this.weight = weight;
        return this;
    }
    public Float getWeight() {
        return this.weight;
    }

}
