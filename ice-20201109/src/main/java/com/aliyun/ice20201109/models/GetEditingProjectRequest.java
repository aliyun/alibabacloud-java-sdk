// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetEditingProjectRequest extends TeaModel {
    /**
     * <p>The ID of the online editing project.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>fb2101bf24b2754cb318787dc</strong></strong></p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The ID of the request source. Valid values:</p>
     * <p>\- OpenAPI (default): Timeline conversion is not performed.</p>
     * <p>\- WebSDK: If you specify this value, the project timeline is automatically converted into the frontend style, and the materials in the timeline are associated with the project to enable preview by using frontend web SDKs.</p>
     * 
     * <strong>example:</strong>
     * <p>WebSDK</p>
     */
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
