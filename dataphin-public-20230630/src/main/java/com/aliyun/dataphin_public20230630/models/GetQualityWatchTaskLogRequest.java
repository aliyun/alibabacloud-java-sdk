// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetQualityWatchTaskLogRequest extends TeaModel {
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

    public static GetQualityWatchTaskLogRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQualityWatchTaskLogRequest self = new GetQualityWatchTaskLogRequest();
        return TeaModel.build(map, self);
    }

    public GetQualityWatchTaskLogRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetQualityWatchTaskLogRequest setWatchTaskId(Long watchTaskId) {
        this.watchTaskId = watchTaskId;
        return this;
    }
    public Long getWatchTaskId() {
        return this.watchTaskId;
    }

}
