// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ExecDeploymentStageRequest extends TeaModel {
    /**
     * <p>The code of the stage in the process. You can call the GetDeployment operation to query the code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DEV_CHECK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The ID of the process.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a7ef0634-20ec-4a7c-a214-54020f91XXXX</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The DataWorks workspace ID. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to obtain the ID.</p>
     * <p>You can use this parameter to specify the DataWorks workspace on which you want to perform the API operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static ExecDeploymentStageRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecDeploymentStageRequest self = new ExecDeploymentStageRequest();
        return TeaModel.build(map, self);
    }

    public ExecDeploymentStageRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ExecDeploymentStageRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ExecDeploymentStageRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
