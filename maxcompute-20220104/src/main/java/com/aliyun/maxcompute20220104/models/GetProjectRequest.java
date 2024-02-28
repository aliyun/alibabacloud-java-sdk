// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetProjectRequest extends TeaModel {
    /**
     * <p>Specifies whether to use additional information.</p>
     */
    @NameInMap("verbose")
    public Boolean verbose;

    public static GetProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProjectRequest self = new GetProjectRequest();
        return TeaModel.build(map, self);
    }

    public GetProjectRequest setVerbose(Boolean verbose) {
        this.verbose = verbose;
        return this;
    }
    public Boolean getVerbose() {
        return this.verbose;
    }

}
