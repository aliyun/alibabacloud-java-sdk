// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetQualityWatchTaskRequest extends TeaModel {
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
     * <p>11</p>
     */
    @NameInMap("WatchTaskId")
    public Long watchTaskId;

    public static GetQualityWatchTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQualityWatchTaskRequest self = new GetQualityWatchTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetQualityWatchTaskRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetQualityWatchTaskRequest setWatchTaskId(Long watchTaskId) {
        this.watchTaskId = watchTaskId;
        return this;
    }
    public Long getWatchTaskId() {
        return this.watchTaskId;
    }

}
