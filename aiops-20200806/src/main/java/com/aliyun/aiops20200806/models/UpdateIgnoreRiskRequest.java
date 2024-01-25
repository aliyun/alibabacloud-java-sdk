// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class UpdateIgnoreRiskRequest extends TeaModel {
    @NameInMap("PatrolDetailIds")
    public String patrolDetailIds;

    @NameInMap("PatrolId")
    public Long patrolId;

    @NameInMap("SwitchFrontOperaUid")
    public String switchFrontOperaUid;

    public static UpdateIgnoreRiskRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIgnoreRiskRequest self = new UpdateIgnoreRiskRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIgnoreRiskRequest setPatrolDetailIds(String patrolDetailIds) {
        this.patrolDetailIds = patrolDetailIds;
        return this;
    }
    public String getPatrolDetailIds() {
        return this.patrolDetailIds;
    }

    public UpdateIgnoreRiskRequest setPatrolId(Long patrolId) {
        this.patrolId = patrolId;
        return this;
    }
    public Long getPatrolId() {
        return this.patrolId;
    }

    public UpdateIgnoreRiskRequest setSwitchFrontOperaUid(String switchFrontOperaUid) {
        this.switchFrontOperaUid = switchFrontOperaUid;
        return this;
    }
    public String getSwitchFrontOperaUid() {
        return this.switchFrontOperaUid;
    }

}
