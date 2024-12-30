// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetClusterQueueInfoByEnvRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DEV</p>
     */
    @NameInMap("Env")
    public String env;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7081229106458752</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>BOTH</p>
     */
    @NameInMap("StreamBatchMode")
    public String streamBatchMode;

    public static GetClusterQueueInfoByEnvRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClusterQueueInfoByEnvRequest self = new GetClusterQueueInfoByEnvRequest();
        return TeaModel.build(map, self);
    }

    public GetClusterQueueInfoByEnvRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public GetClusterQueueInfoByEnvRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetClusterQueueInfoByEnvRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public GetClusterQueueInfoByEnvRequest setStreamBatchMode(String streamBatchMode) {
        this.streamBatchMode = streamBatchMode;
        return this;
    }
    public String getStreamBatchMode() {
        return this.streamBatchMode;
    }

}
