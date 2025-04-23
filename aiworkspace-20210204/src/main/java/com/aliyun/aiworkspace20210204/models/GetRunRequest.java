// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetRunRequest extends TeaModel {
    /**
     * <p>Specifies whether to obtain the Metrics, Params, and Labels information. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Verbose")
    public Boolean verbose;

    public static GetRunRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRunRequest self = new GetRunRequest();
        return TeaModel.build(map, self);
    }

    public GetRunRequest setVerbose(Boolean verbose) {
        this.verbose = verbose;
        return this;
    }
    public Boolean getVerbose() {
        return this.verbose;
    }

}
