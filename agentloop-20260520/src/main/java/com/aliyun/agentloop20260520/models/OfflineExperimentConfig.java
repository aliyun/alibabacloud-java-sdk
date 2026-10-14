// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class OfflineExperimentConfig extends TeaModel {
    /**
     * <p>The experiment description.</p>
     * 
     * <strong>example:</strong>
     * <p>Baseline experiment</p>
     */
    @NameInMap("desc")
    public String desc;

    /**
     * <p>The experiment label.</p>
     * 
     * <strong>example:</strong>
     * <p>A</p>
     */
    @NameInMap("label")
    public String label;

    /**
     * <p>The experiment name.</p>
     * 
     * <strong>example:</strong>
     * <p>baseline</p>
     */
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
