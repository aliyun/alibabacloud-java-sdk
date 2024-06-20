// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class CreateAsyncTaskRequest extends TeaModel {
    /**
     * <p>The ID of the resource group to which the instance belongs in Resource Management. This parameter is empty by default, which indicates that the instance belongs to the default resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The details of the asynchronous export task. The value is a JSON string. The field in the value varies with <strong>TaskType</strong>.</p>
     * <p>If <strong>TaskType</strong> is set to <strong>1</strong>, <strong>3</strong>, <strong>4</strong>, <strong>5</strong>, or <strong>6</strong>, the following filed is returned:</p>
     * <ul>
     * <li><strong>instanceId</strong>: the ID of the instance. This field is required and must be of the STRING type.</li>
     * </ul>
     * <p>If <strong>TaskType</strong> is set to <strong>2</strong>, the following field is returned:</p>
     * <ul>
     * <li><strong>domain</strong>: the domain name of the website, which must be of the STRING type. If you do not specify this field, the forwarding rules of all websites are exported.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;instanceId&quot;: &quot;ddoscoo-cn-mp91j1ao****&quot;}</p>
     */
    @NameInMap("TaskParams")
    public String taskParams;

    /**
     * <p>The type of the asynchronous export task that you want to create. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: the task to export the port forwarding rules of an instance</li>
     * <li><strong>2</strong>: the task to export the forwarding rules of a website protected by an instance</li>
     * <li><strong>3</strong>: the task to export the session persistence and health check settings of an instance</li>
     * <li><strong>4</strong>: the task to export the anti-DDoS mitigation policies of an instance</li>
     * <li><strong>5</strong>: the task to download the blacklist for destination IP addresses of an instance</li>
     * <li><strong>6</strong>: the task to download the whitelist for destination IP addresses of an instance</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
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
