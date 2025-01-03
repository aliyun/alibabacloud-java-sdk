// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_cnp20230828.models;

import com.aliyun.tea.*;

public class DeleteExperimentRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>234</p>
     */
    @NameInMap("ExperimentId")
    public Long experimentId;

    public static DeleteExperimentRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteExperimentRequest self = new DeleteExperimentRequest();
        return TeaModel.build(map, self);
    }

    public DeleteExperimentRequest setExperimentId(Long experimentId) {
        this.experimentId = experimentId;
        return this;
    }
    public Long getExperimentId() {
        return this.experimentId;
    }

}
