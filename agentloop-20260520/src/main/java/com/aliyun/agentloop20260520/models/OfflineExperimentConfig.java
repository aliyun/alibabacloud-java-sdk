// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class OfflineExperimentConfig extends TeaModel {
    @NameInMap("desc")
    public String desc;

    @NameInMap("label")
    public String label;

    @NameInMap("name")
    public String name;

    public static OfflineExperimentConfig build(java.util.Map<String, ?> map) throws Exception {
        OfflineExperimentConfig self = new OfflineExperimentConfig();
        return TeaModel.build(map, self);
    }

    public OfflineExperimentConfig setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public OfflineExperimentConfig setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public OfflineExperimentConfig setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
