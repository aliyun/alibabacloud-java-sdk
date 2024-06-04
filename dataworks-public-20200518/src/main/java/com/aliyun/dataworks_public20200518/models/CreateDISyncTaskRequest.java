// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateDISyncTaskRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. This parameter can be left empty</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The DataWorks workspace ID. You can log on to the [DataWorks console](https://workbench.data.aliyun.com/console) and go to the Workspace page to obtain the workspace ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The configurations of the batch synchronization task to be created. Calling this API operation to create a batch synchronization task is equivalent to creating a batch synchronization task by using the code editor in the DataWorks console. For more information, see [Create a synchronization node by using the code editor](https://help.aliyun.com/document_detail/137717.html).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TaskContent")
    public String taskContent;

    /**
     * <p>The name of the data synchronization task.</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>The settings that specify the storage path of the data synchronization task and the resource group used by the task. The following parameters are supported:</p>
     * <p>- FileFolderPath: the storage path of the data synchronization task. </p>
     * <p>- ResourceGroup: the identifier of the resource group for Data Integration that is used by the data synchronization task. You can call the [ListResourceGroup](https://help.aliyun.com/document_detail/173913.html) operation to query the identifier of the resource group.</p>
     */
    @NameInMap("TaskParam")
    public String taskParam;

    /**
     * <p>The type of the data synchronization task. </p>
     * <p>Valid values: DI_OFFLINE, DI_REALTIME, and DI_SOLUTION.</p>
     * <br>
     * <p>This parameter is required.</p>
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
