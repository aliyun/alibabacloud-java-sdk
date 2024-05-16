// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateDISyncTaskRequest extends TeaModel {
    /**
     * <p>The ID of the sync node to be updated. You can call the [ListFiles](https://help.aliyun.com/document_detail/173942.html) operation to query the ID of the node.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileId")
    public Long fileId;

    /**
     * <p>The ID of the DataWorks workspace. You can log on to the [DataWorks console](https://workbench.data.aliyun.com/console) and go to the Workspace Management page to obtain the workspace ID.</p>
     * <br>
     * <p>You must set this parameter to specify the DataWorks workspace in which the node resides.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The updated configuration of the sync node. This operation is equivalent to node update by using the code editor in the DataWorks console. For more information, see [Create a sync node by using the code editor](https://help.aliyun.com/document_detail/137717.html). You can call the UpdateDISyncTask operation to update only batch sync nodes. If you do not need to update the configuration of the sync node, leave this parameter empty.</p>
     */
    @NameInMap("TaskContent")
    public String taskContent;

    /**
     * <p>The setting that updates the resource group used by the node. The value must be in the JSON format.</p>
     * <br>
     * <p>Only the ResourceGroup field is supported. This field specifies the identifier of the resource group for Data Integration that is used by the node. To query the identifier of the resource group, call the [ListResourceGroup](https://help.aliyun.com/document_detail/62055.html) operation.</p>
     * <br>
     * <p>If you do not need to update the resource group for the sync node, leave this parameter empty.</p>
     */
    @NameInMap("TaskParam")
    public String taskParam;

    /**
     * <p>The type of the sync node.</p>
     * <br>
     * <p>You can call the UpdateDISyncTask operation to update only batch sync nodes. The value must be DI_OFFLINE.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static UpdateDISyncTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDISyncTaskRequest self = new UpdateDISyncTaskRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDISyncTaskRequest setFileId(Long fileId) {
        this.fileId = fileId;
        return this;
    }
    public Long getFileId() {
        return this.fileId;
    }

    public UpdateDISyncTaskRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public UpdateDISyncTaskRequest setTaskContent(String taskContent) {
        this.taskContent = taskContent;
        return this;
    }
    public String getTaskContent() {
        return this.taskContent;
    }

    public UpdateDISyncTaskRequest setTaskParam(String taskParam) {
        this.taskParam = taskParam;
        return this;
    }
    public String getTaskParam() {
        return this.taskParam;
    }

    public UpdateDISyncTaskRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
