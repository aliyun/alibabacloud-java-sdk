// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class GetOptionValueForProjectRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ExtensionCode")
    public String extensionCode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

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

    public GetOptionValueForProjectRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
