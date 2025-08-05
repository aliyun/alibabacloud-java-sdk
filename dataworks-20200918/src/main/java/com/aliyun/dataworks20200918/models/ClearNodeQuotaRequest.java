// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class ClearNodeQuotaRequest extends TeaModel {
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

    @NameInMap("RefreshTaskInstance")
    public Boolean refreshTaskInstance;

    public static ClearNodeQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        ClearNodeQuotaRequest self = new ClearNodeQuotaRequest();
        return TeaModel.build(map, self);
    }

    public ClearNodeQuotaRequest setNodeIds(String nodeIds) {
        this.nodeIds = nodeIds;
        return this;
    }
    public String getNodeIds() {
        return this.nodeIds;
    }

    public ClearNodeQuotaRequest setProjectEnv(String projectEnv) {
        this.projectEnv = projectEnv;
        return this;
    }
    public String getProjectEnv() {
        return this.projectEnv;
    }

    public ClearNodeQuotaRequest setRefreshTaskInstance(Boolean refreshTaskInstance) {
        this.refreshTaskInstance = refreshTaskInstance;
        return this;
    }
    public Boolean getRefreshTaskInstance() {
        return this.refreshTaskInstance;
    }

}
