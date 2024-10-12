// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetExperimentRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Verbose")
    public Boolean verbose;

    public static GetExperimentRequest build(java.util.Map<String, ?> map) throws Exception {
        GetExperimentRequest self = new GetExperimentRequest();
        return TeaModel.build(map, self);
    }

    public GetExperimentRequest setVerbose(Boolean verbose) {
        this.verbose = verbose;
        return this;
    }
    public Boolean getVerbose() {
        return this.verbose;
    }

}
