// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetQueueEngineVersionByEnvRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>61187014-a3ba-4cdd-8609-1f0aa3df4a3d</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The environment.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PROD</p>
     */
    @NameInMap("Env")
    public String env;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>The project ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7081229106458752</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The queue name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>default-queue</p>
     */
    @NameInMap("QueueName")
    public String queueName;

    /**
     * <p>The stream-batch mode.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>BOTH</p>
     */
    @NameInMap("StreamBatchMode")
    public String streamBatchMode;

    public static GetQueueEngineVersionByEnvRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQueueEngineVersionByEnvRequest self = new GetQueueEngineVersionByEnvRequest();
        return TeaModel.build(map, self);
    }

    public GetQueueEngineVersionByEnvRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetQueueEngineVersionByEnvRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public GetQueueEngineVersionByEnvRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetQueueEngineVersionByEnvRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public GetQueueEngineVersionByEnvRequest setQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }
    public String getQueueName() {
        return this.queueName;
    }

    public GetQueueEngineVersionByEnvRequest setStreamBatchMode(String streamBatchMode) {
        this.streamBatchMode = streamBatchMode;
        return this;
    }
    public String getStreamBatchMode() {
        return this.streamBatchMode;
    }

}
