// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateDISyncTaskRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. This parameter can be left empty.</p>
     * 
     * <strong>example:</strong>
     * <p>0000-ABCD-EFG****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The DataWorks workspace ID. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to query the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TaskContent")
    public String taskContent;

    /**
     * <p>The name of the data synchronization task.</p>
     * 
     * <strong>example:</strong>
     * <p>new_di_task</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>The configuration parameters of the data synchronization task. The following parameters are supported:</p>
     * <ul>
     * <li>FileFolderPath: the storage path of the data synchronization task.</li>
     * <li>ResourceGroup: the identifier of the resource group for Data Integration that is used by the data synchronization task. You can call the <a href="https://help.aliyun.com/document_detail/173913.html">ListResourceGroups</a> operation to query the identifier of the resource group.</li>
     * <li>Cu: the specifications occupied by the data synchronization task in the serverless resource group. The value of this parameter must be a multiple of 0.5.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;FileFolderPath&quot;:&quot;Business Flow/XXX/Data Integration&quot;,&quot;ResourceGroup&quot;:&quot;S_res_group_XXX_XXXX&quot;}</p>
     */
    @NameInMap("TaskParam")
    public String taskParam;

    /**
     * <p>The type of the data synchronization task. Valid values: DI_OFFLINE, DI_REALTIME, and DI_SOLUTION.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DI_OFFLINE</p>
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
