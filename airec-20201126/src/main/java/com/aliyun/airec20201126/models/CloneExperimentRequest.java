// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class CloneExperimentRequest extends TeaModel {
    /**
     * <p>true: verifies experiment information. false (default): creates an experiment.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    public static CloneExperimentRequest build(java.util.Map<String, ?> map) throws Exception {
        CloneExperimentRequest self = new CloneExperimentRequest();
        return TeaModel.build(map, self);
    }

    public CloneExperimentRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
