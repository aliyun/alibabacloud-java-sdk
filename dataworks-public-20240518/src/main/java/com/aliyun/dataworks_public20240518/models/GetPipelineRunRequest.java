// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetPipelineRunRequest extends TeaModel {
    /**
     * <p>The unique identifier of the Publishing Pipeline.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a7ef0634-20ec-4a7c-a214-54020f****</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The ID of the DataWorks workspace. You can find this ID on the Workspace Management page in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
     * <p>This parameter specifies the DataWorks workspace for the API call.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static GetPipelineRunRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPipelineRunRequest self = new GetPipelineRunRequest();
        return TeaModel.build(map, self);
    }

    public GetPipelineRunRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetPipelineRunRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
