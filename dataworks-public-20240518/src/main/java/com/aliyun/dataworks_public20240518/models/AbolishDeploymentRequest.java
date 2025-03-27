// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class AbolishDeploymentRequest extends TeaModel {
    /**
     * <p>The ID of the process.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1606087c-9ac4-43f0-83a8-0b5ced21XXXX</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The DataWorks workspace ID. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to query the ID.</p>
     * <p>You can use this parameter to specify the DataWorks workspace on which you want to perform the API operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static AbolishDeploymentRequest build(java.util.Map<String, ?> map) throws Exception {
        AbolishDeploymentRequest self = new AbolishDeploymentRequest();
        return TeaModel.build(map, self);
    }

    public AbolishDeploymentRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public AbolishDeploymentRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
