// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetDefaultWorkspaceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Verbose")
    public Boolean verbose;

    public static GetDefaultWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDefaultWorkspaceRequest self = new GetDefaultWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public GetDefaultWorkspaceRequest setVerbose(Boolean verbose) {
        this.verbose = verbose;
        return this;
    }
    public Boolean getVerbose() {
        return this.verbose;
    }

}
