// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetQualityAlertOfAllRuleScopeByWatchIdRequest extends TeaModel {
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
    @NameInMap("WatchId")
    public Long watchId;

    public static GetQualityAlertOfAllRuleScopeByWatchIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQualityAlertOfAllRuleScopeByWatchIdRequest self = new GetQualityAlertOfAllRuleScopeByWatchIdRequest();
        return TeaModel.build(map, self);
    }

    public GetQualityAlertOfAllRuleScopeByWatchIdRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetQualityAlertOfAllRuleScopeByWatchIdRequest setWatchId(Long watchId) {
        this.watchId = watchId;
        return this;
    }
    public Long getWatchId() {
        return this.watchId;
    }

}
