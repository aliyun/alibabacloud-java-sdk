// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetEditingProjectRequest extends TeaModel {
    /**
     * <p>The ID of the cloud editing project.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>fb2101bf24b2754cb318787dc</strong></strong></p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The identifier of the request source. Valid values:</p>
     * <ul>
     * <li>OpenAPI: Default. No timeline conversion is performed.</li>
     * <li>WebSDK: If this field is passed, the project timeline is automatically converted to the frontend style, and the associated media assets in the timeline are bound to the project for preview in the frontend WebSDK.</li>
     * </ul>
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
