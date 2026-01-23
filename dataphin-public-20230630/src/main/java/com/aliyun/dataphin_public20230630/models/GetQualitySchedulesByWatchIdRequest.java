// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetQualitySchedulesByWatchIdRequest extends TeaModel {
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
     * <p>1</p>
     */
    @NameInMap("WatchId")
    public Long watchId;

    public static GetQualitySchedulesByWatchIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQualitySchedulesByWatchIdRequest self = new GetQualitySchedulesByWatchIdRequest();
        return TeaModel.build(map, self);
    }

    public GetQualitySchedulesByWatchIdRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetQualitySchedulesByWatchIdRequest setWatchId(Long watchId) {
        this.watchId = watchId;
        return this;
    }
    public Long getWatchId() {
        return this.watchId;
    }

}
