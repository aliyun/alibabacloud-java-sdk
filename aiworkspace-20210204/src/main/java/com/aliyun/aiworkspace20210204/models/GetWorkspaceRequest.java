// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetWorkspaceRequest extends TeaModel {
    /**
     * <p>A comma-separated string used to specify additional information to return. This field does not take effect.</p>
     * 
     * <strong>example:</strong>
     * <p>NotSupport</p>
     */
    @NameInMap("ExtraVerboseFields")
    public String extraVerboseFields;

    /**
     * <p>Specifies whether to display supplementary information such as the workspace owner. Valid values:</p>
     * <ul>
     * <li>false: Does not display supplementary information.</li>
     * <li>true: Displays supplementary information.
     * Default value: false.</li>
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

    public GetWorkspaceRequest setExtraVerboseFields(String extraVerboseFields) {
        this.extraVerboseFields = extraVerboseFields;
        return this;
    }
    public String getExtraVerboseFields() {
        return this.extraVerboseFields;
    }

    public GetWorkspaceRequest setVerbose(Boolean verbose) {
        this.verbose = verbose;
        return this;
    }
    public Boolean getVerbose() {
        return this.verbose;
    }

}
