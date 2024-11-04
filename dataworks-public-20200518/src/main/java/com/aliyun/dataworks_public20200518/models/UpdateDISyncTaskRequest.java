// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateDISyncTaskRequest extends TeaModel {
    /**
     * <p>The ID of the data synchronization task. You can call the <a href="https://help.aliyun.com/document_detail/173942.html">ListFiles</a> operation to query the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000000</p>
     */
    @NameInMap("FileId")
    public Long fileId;

    /**
     * <p>The ID of the DataWorks workspace. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to obtain the workspace ID. You must configure this parameter to specify the DataWorks workspace to which the API operation is applied.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The updated configurations of the data synchronization task. Calling this API operation to update a data synchronization task is equivalent to updating a data synchronization task by using the code editor in the DataWorks console. For more information, see <a href="https://help.aliyun.com/document_detail/137717.html">Create a synchronization task by using the code editor</a>. You can call the UpdateDISyncTask operation to update only batch synchronization tasks. If you do not need to update the configurations of the data synchronization task, leave this parameter empty.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;type&quot;:&quot;job&quot;,&quot;version&quot;:&quot;2.0&quot;,&quot;steps&quot;:[{&quot;stepType&quot;:&quot;mysql&quot;,&quot;parameter&quot;:{&quot;envType&quot;:1,&quot;datasource&quot;:&quot;mysql_pub&quot;,&quot;column&quot;:[&quot;id&quot;,&quot;name&quot;,&quot;create_time&quot;,&quot;age&quot;,&quot;score&quot;,&quot;t_01&quot;],&quot;connection&quot;:[{&quot;datasource&quot;:&quot;mysql_pub&quot;,&quot;table&quot;:[&quot;u_pk&quot;]}],&quot;where&quot;:&quot;&quot;,&quot;splitPk&quot;:&quot;id&quot;,&quot;encoding&quot;:&quot;UTF-8&quot;},&quot;name&quot;:&quot;Reader&quot;,&quot;category&quot;:&quot;reader&quot;},{&quot;stepType&quot;:&quot;odps&quot;,&quot;parameter&quot;:{&quot;partition&quot;:&quot;pt=${bizdate}&quot;,&quot;truncate&quot;:true,&quot;datasource&quot;:&quot;odps_first&quot;,&quot;envType&quot;:1,&quot;column&quot;:[&quot;id&quot;,&quot;name&quot;,&quot;create_time&quot;,&quot;age&quot;,&quot;score&quot;,&quot;t_01&quot;],&quot;emptyAsNull&quot;:false,&quot;tableComment&quot;:&quot;null&quot;,&quot;table&quot;:&quot;u_pk&quot;},&quot;name&quot;:&quot;Writer&quot;,&quot;category&quot;:&quot;writer&quot;}],&quot;setting&quot;:{&quot;executeMode&quot;:null,&quot;errorLimit&quot;:{&quot;record&quot;:&quot;&quot;},&quot;speed&quot;:{&quot;concurrent&quot;:2,&quot;throttle&quot;:false}},&quot;order&quot;:{&quot;hops&quot;:[{&quot;from&quot;:&quot;Reader&quot;,&quot;to&quot;:&quot;Writer&quot;}]}}</p>
     */
    @NameInMap("TaskContent")
    public String taskContent;

    /**
     * <p>The configuration parameters of the data synchronization task. You must configure this parameter in the JSON format.</p>
     * <ul>
     * <li>ResourceGroup: the identifier of the resource group for Data Integration that is used by the data synchronization task. You can call the <a href="https://help.aliyun.com/document_detail/173913.html">ListResourceGroups</a> operation to query the identifier of the resource group.</li>
     * <li>Cu: the specifications occupied by the data synchronization task in the serverless resource group. The value of this parameter must be a multiple of 0.5.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ResourceGroup&quot;:&quot;S_res_group_XXX_XXXX&quot;}</p>
     */
    @NameInMap("TaskParam")
    public String taskParam;

    /**
     * <p>The type of the data synchronization task. Set the value to DI_OFFLINE. You can call the UpdateDISyncTask operation to update only batch synchronization tasks.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DI_OFFLINE</p>
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
