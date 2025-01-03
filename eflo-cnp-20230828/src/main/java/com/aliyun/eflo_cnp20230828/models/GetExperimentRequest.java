// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_cnp20230828.models;

import com.aliyun.tea.*;

public class GetExperimentRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>234</p>
     */
    @NameInMap("ExperimentId")
    public Long experimentId;

    public static GetExperimentRequest build(java.util.Map<String, ?> map) throws Exception {
        GetExperimentRequest self = new GetExperimentRequest();
        return TeaModel.build(map, self);
    }

    public GetExperimentRequest setExperimentId(Long experimentId) {
        this.experimentId = experimentId;
        return this;
    }
    public Long getExperimentId() {
        return this.experimentId;
    }

}
