// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteComponentRequest extends TeaModel {
    /**
     * <p>The component ID. It can be used as a request parameter for querying the list of production studio components and modifying production studio components.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123123123123</p>
     */
    @NameInMap("ComponentId")
    public String componentId;

    /**
     * <p>The ID of the DataWorks workspace. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to query the ID.</p>
     * <p>This parameter specifies the DataWorks workspace to which the API operation is applied.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static DeleteComponentRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteComponentRequest self = new DeleteComponentRequest();
        return TeaModel.build(map, self);
    }

    public DeleteComponentRequest setComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }
    public String getComponentId() {
        return this.componentId;
    }

    public DeleteComponentRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
