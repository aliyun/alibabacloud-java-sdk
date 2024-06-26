// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetEditingProjectRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>fb2101bf24b2754cb318787dc</strong></strong></p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("RequestSource")
    public String requestSource;

    public static GetEditingProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEditingProjectRequest self = new GetEditingProjectRequest();
        return TeaModel.build(map, self);
    }

    public GetEditingProjectRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public GetEditingProjectRequest setRequestSource(String requestSource) {
        this.requestSource = requestSource;
        return this;
    }
    public String getRequestSource() {
        return this.requestSource;
    }

}
