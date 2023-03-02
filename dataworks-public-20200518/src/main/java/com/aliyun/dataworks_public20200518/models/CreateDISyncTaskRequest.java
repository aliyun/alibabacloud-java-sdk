// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateDISyncTaskRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. This parameter can be left empty.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the DataWorks workspace. You can log on to the [DataWorks console](https://workbench.data.aliyun.com/console) and go to the Workspace Management page to obtain the workspace ID.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The configuration of the synchronization node to be created. This operation is equivalent to node creation by using the code editor in the DataWorks console. For more information, see [Create a synchronization node by using the code editor](~~137717~~).</p>
     * <br>
     * <p>You can call the CreateDISyncTask operation to create only batch synchronization nodes.</p>
     */
    @NameInMap("TaskContent")
    public String taskContent;

    /**
     * <p>The name of the synchronization node.</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>The settings that specify the storage path of the synchronization node and the resource group used by the node. The following fields are supported:</p>
     * <br>
     * <p>*   FileFolderPath: the storage path of the node.</p>
     * <p>*   ResourceGroup: the identifier of the resource group for Data Integration that is used by the node. To query the identifier of the resource group, call the [ListResourceGroup](~~173913~~) operation.</p>
     */
    @NameInMap("TaskParam")
    public String taskParam;

    /**
     * <p>The type of the synchronization node.</p>
     * <br>
     * <p>You can call the CreateDISyncTask operation to create only batch synchronization nodes. Set the value to DI_OFFLINE.</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static CreateDISyncTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDISyncTaskRequest self = new CreateDISyncTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateDISyncTaskRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDISyncTaskRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateDISyncTaskRequest setTaskContent(String taskContent) {
        this.taskContent = taskContent;
        return this;
    }
    public String getTaskContent() {
        return this.taskContent;
    }

    public CreateDISyncTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public CreateDISyncTaskRequest setTaskParam(String taskParam) {
        this.taskParam = taskParam;
        return this;
    }
    public String getTaskParam() {
        return this.taskParam;
    }

    public CreateDISyncTaskRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
