// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_cnp20230828.models;

import com.aliyun.tea.*;

public class StopExperimentRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>234</p>
     */
    @NameInMap("ExperimentId")
    public Long experimentId;

    public static StopExperimentRequest build(java.util.Map<String, ?> map) throws Exception {
        StopExperimentRequest self = new StopExperimentRequest();
        return TeaModel.build(map, self);
    }

    public StopExperimentRequest setExperimentId(Long experimentId) {
        this.experimentId = experimentId;
        return this;
    }
    public Long getExperimentId() {
        return this.experimentId;
    }

}
