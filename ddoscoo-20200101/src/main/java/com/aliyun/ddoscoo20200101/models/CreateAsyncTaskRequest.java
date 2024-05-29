// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class CreateAsyncTaskRequest extends TeaModel {
    /**
     * <p>The ID of the resource group to which the instance belongs in Resource Management. This parameter is empty by default, which indicates that the instance belongs to the default resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The details of the asynchronous export task. The value is a JSON string. The field in the value varies with **TaskType**.</p>
     * <br>
     * <p>If **TaskType** is set to **1**, **3**, **4**, **5**, or **6**, the following filed is returned:</p>
     * <br>
     * <p>*   **instanceId**: the ID of the instance. This field is required and must be of the STRING type.</p>
     * <br>
     * <p>If **TaskType** is set to **2**, the following field is returned:</p>
     * <br>
     * <p>*   **domain**: the domain name of the website, which must be of the STRING type. If you do not specify this field, the forwarding rules of all websites are exported.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TaskParams")
    public String taskParams;

    /**
     * <p>The type of the asynchronous export task that you want to create. Valid values:</p>
     * <br>
     * <p>*   **1**: the task to export the port forwarding rules of an instance</p>
     * <p>*   **2**: the task to export the forwarding rules of a website protected by an instance</p>
     * <p>*   **3**: the task to export the session persistence and health check settings of an instance</p>
     * <p>*   **4**: the task to export the anti-DDoS mitigation policies of an instance</p>
     * <p>*   **5**: the task to download the blacklist for destination IP addresses of an instance</p>
     * <p>*   **6**: the task to download the whitelist for destination IP addresses of an instance</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TaskType")
    public Integer taskType;

    public static CreateAsyncTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAsyncTaskRequest self = new CreateAsyncTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateAsyncTaskRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateAsyncTaskRequest setTaskParams(String taskParams) {
        this.taskParams = taskParams;
        return this;
    }
    public String getTaskParams() {
        return this.taskParams;
    }

    public CreateAsyncTaskRequest setTaskType(Integer taskType) {
        this.taskType = taskType;
        return this;
    }
    public Integer getTaskType() {
        return this.taskType;
    }

}
