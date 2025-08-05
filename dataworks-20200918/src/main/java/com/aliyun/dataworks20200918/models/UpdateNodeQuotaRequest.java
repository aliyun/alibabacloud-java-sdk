// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class UpdateNodeQuotaRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("NodeIds")
    public String nodeIds;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectEnv")
    public String projectEnv;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Quota")
    public String quota;

    @NameInMap("RefreshTaskInstance")
    public Boolean refreshTaskInstance;

    public static UpdateNodeQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateNodeQuotaRequest self = new UpdateNodeQuotaRequest();
        return TeaModel.build(map, self);
    }

    public UpdateNodeQuotaRequest setNodeIds(String nodeIds) {
        this.nodeIds = nodeIds;
        return this;
    }
    public String getNodeIds() {
        return this.nodeIds;
    }

    public UpdateNodeQuotaRequest setProjectEnv(String projectEnv) {
        this.projectEnv = projectEnv;
        return this;
    }
    public String getProjectEnv() {
        return this.projectEnv;
    }

    public UpdateNodeQuotaRequest setQuota(String quota) {
        this.quota = quota;
        return this;
    }
    public String getQuota() {
        return this.quota;
    }

    public UpdateNodeQuotaRequest setRefreshTaskInstance(Boolean refreshTaskInstance) {
        this.refreshTaskInstance = refreshTaskInstance;
        return this;
    }
    public Boolean getRefreshTaskInstance() {
        return this.refreshTaskInstance;
    }

}
