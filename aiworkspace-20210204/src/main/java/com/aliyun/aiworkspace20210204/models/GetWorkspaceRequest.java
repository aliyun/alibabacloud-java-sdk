// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetWorkspaceRequest extends TeaModel {
    /**
     * <p>Specifies whether to display supplementary information such as the workspace owner. Valid values:</p>
     * <ul>
     * <li>false (default)</li>
     * <li>true</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Verbose")
    public Boolean verbose;

    public static GetWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWorkspaceRequest self = new GetWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public GetWorkspaceRequest setVerbose(Boolean verbose) {
        this.verbose = verbose;
        return this;
    }
    public Boolean getVerbose() {
        return this.verbose;
    }

}
