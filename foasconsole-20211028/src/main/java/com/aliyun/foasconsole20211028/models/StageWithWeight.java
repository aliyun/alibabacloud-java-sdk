// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class StageWithWeight extends TeaModel {
    /**
     * <p>The ordinal number of the execution stage.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("StepIndex")
    public Integer stepIndex;

    /**
     * <p>The name of the execution stage.</p>
     */
    @NameInMap("StepName")
    public String stepName;

    /**
     * <p>The weight of the stage in the overall progress.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Weight")
    public Integer weight;

    public static StageWithWeight build(java.util.Map<String, ?> map) throws Exception {
        StageWithWeight self = new StageWithWeight();
        return TeaModel.build(map, self);
    }

    public StageWithWeight setStepIndex(Integer stepIndex) {
        this.stepIndex = stepIndex;
        return this;
    }
    public Integer getStepIndex() {
        return this.stepIndex;
    }

    public StageWithWeight setStepName(String stepName) {
        this.stepName = stepName;
        return this;
    }
    public String getStepName() {
        return this.stepName;
    }

    public StageWithWeight setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }
    public Integer getWeight() {
        return this.weight;
    }

}
