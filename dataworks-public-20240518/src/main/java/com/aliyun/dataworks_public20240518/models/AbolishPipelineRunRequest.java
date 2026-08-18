// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class AbolishPipelineRunRequest extends TeaModel {
    /**
     * <p>The unique identifier of the deployment process.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1606087c-9ac4-43f0-83a8-0b5ced21XXXX</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The ID of the DataWorks workspace. You can logon to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the storage management page to obtain the ID.</p>
     * <p>This parameter specifies the DataWorks workspace for this API invoke operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static AbolishPipelineRunRequest build(java.util.Map<String, ?> map) throws Exception {
        AbolishPipelineRunRequest self = new AbolishPipelineRunRequest();
        return TeaModel.build(map, self);
    }

    public AbolishPipelineRunRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public AbolishPipelineRunRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
