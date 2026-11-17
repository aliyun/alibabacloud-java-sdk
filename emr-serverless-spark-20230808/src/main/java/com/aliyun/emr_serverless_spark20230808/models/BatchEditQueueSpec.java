// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class BatchEditQueueSpec extends TeaModel {
    /**
     * <p>The description of the queue. If this parameter is not specified, the description is not modified.</p>
     * 
     * <strong>example:</strong>
     * <p>Development and debugging queue</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The runtime environments. If this parameter is not specified, the runtime environments are not modified.</p>
     */
    @NameInMap("environments")
    public java.util.List<String> environments;

    /**
     * <p>The list of GPU instance types. If this parameter is not specified, the GPU specifications are not modified.</p>
     */
    @NameInMap("gpuSpec")
    public java.util.List<String> gpuSpec;

    /**
     * <p>The resource specifications, which represent the absolute target value. If this parameter is not specified, only the description, environments, or GPU specifications are modified, and the quota is not recalculated.</p>
     */
    @NameInMap("resourceSpec")
    public ResourceSpec resourceSpec;

    /**
     * <p>The name of the queue.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dev_queue</p>
     */
    @NameInMap("workspaceQueueName")
    public String workspaceQueueName;

    public static BatchEditQueueSpec build(java.util.Map<String, ?> map) throws Exception {
        BatchEditQueueSpec self = new BatchEditQueueSpec();
        return TeaModel.build(map, self);
    }

    public BatchEditQueueSpec setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public BatchEditQueueSpec setEnvironments(java.util.List<String> environments) {
        this.environments = environments;
        return this;
    }
    public java.util.List<String> getEnvironments() {
        return this.environments;
    }

    public BatchEditQueueSpec setGpuSpec(java.util.List<String> gpuSpec) {
        this.gpuSpec = gpuSpec;
        return this;
    }
    public java.util.List<String> getGpuSpec() {
        return this.gpuSpec;
    }

    public BatchEditQueueSpec setResourceSpec(ResourceSpec resourceSpec) {
        this.resourceSpec = resourceSpec;
        return this;
    }
    public ResourceSpec getResourceSpec() {
        return this.resourceSpec;
    }

    public BatchEditQueueSpec setWorkspaceQueueName(String workspaceQueueName) {
        this.workspaceQueueName = workspaceQueueName;
        return this;
    }
    public String getWorkspaceQueueName() {
        return this.workspaceQueueName;
    }

}
