// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class CreateAsyncTaskRequest extends TeaModel {
    /**
     * <p>The ID of the resource group to which the Anti-DDoS Pro or Anti-DDoS Premium instance belongs in Resource Management. If this parameter is empty, the instance belongs to the default resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The task parameter information. The value is a JSON-formatted string. The required task parameters vary based on the value of <strong>TaskType</strong>.</p>
     * <p>If <strong>TaskType</strong> is set to <strong>1</strong>, <strong>3</strong>, <strong>4</strong>, <strong>5</strong>, or <strong>6</strong>, the task parameters use the following structure:</p>
     * <ul>
     * <li><strong>instanceId</strong>: String type. Required. The ID of the Anti-DDoS Pro or Anti-DDoS Premium instance.</li>
     * </ul>
     * <p>If <strong>TaskType</strong> is set to <strong>2</strong>, the task parameters use the following structure:</p>
     * <ul>
     * <li><strong>domain</strong>: String type. Optional. The domain name of the website. If this parameter is not specified, the forwarding rules of all websites are exported.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;instanceId&quot;: &quot;ddoscoo-cn-mp91j1ao****&quot;}</p>
     */
    @NameInMap("TaskParams")
    public String taskParams;

    /**
     * <p>The type of the export task to create. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Layer 4 export task. Exports port forwarding rules of the Anti-DDoS Pro or Anti-DDoS Premium instance.</li>
     * <li><strong>2</strong>: Layer 7 export task. Exports website forwarding rules.</li>
     * <li><strong>3</strong>: Session persistence and health check export task. Exports session persistence and health check configurations of the Anti-DDoS Pro or Anti-DDoS Premium instance.</li>
     * <li><strong>4</strong>: DDoS mitigation policy export task. Exports DDoS mitigation policy configurations of the Anti-DDoS Pro or Anti-DDoS Premium instance.</li>
     * <li><strong>5</strong>: Blacklist (destination IP address-based) download task. Exports blacklisted IP addresses for the Anti-DDoS Pro or Anti-DDoS Premium instance.</li>
     * <li><strong>6</strong>: Whitelist (destination IP address-based) download task. Exports whitelisted IP addresses for the Anti-DDoS Pro or Anti-DDoS Premium instance.</li>
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
