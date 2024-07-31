// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetOptionValueForProjectRequest extends TeaModel {
    /**
     * <p>The unique code of the extension.</p>
     * 
     * <strong>example:</strong>
     * <p>ce4*********086da5</p>
     */
    @NameInMap("ExtensionCode")
    public String extensionCode;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>234</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    public static GetOptionValueForProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOptionValueForProjectRequest self = new GetOptionValueForProjectRequest();
        return TeaModel.build(map, self);
    }

    public GetOptionValueForProjectRequest setExtensionCode(String extensionCode) {
        this.extensionCode = extensionCode;
        return this;
    }
    public String getExtensionCode() {
        return this.extensionCode;
    }

    public GetOptionValueForProjectRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
