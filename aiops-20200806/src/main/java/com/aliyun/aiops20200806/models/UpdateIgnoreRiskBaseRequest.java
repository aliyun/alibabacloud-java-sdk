// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class UpdateIgnoreRiskBaseRequest extends TeaModel {
    @NameInMap("HandleDescribe")
    public String handleDescribe;

    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("PatrolDetailIds")
    public String patrolDetailIds;

    @NameInMap("PatrolId")
    public Long patrolId;

    public static UpdateIgnoreRiskBaseRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIgnoreRiskBaseRequest self = new UpdateIgnoreRiskBaseRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIgnoreRiskBaseRequest setHandleDescribe(String handleDescribe) {
        this.handleDescribe = handleDescribe;
        return this;
    }
    public String getHandleDescribe() {
        return this.handleDescribe;
    }

    public UpdateIgnoreRiskBaseRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public UpdateIgnoreRiskBaseRequest setPatrolDetailIds(String patrolDetailIds) {
        this.patrolDetailIds = patrolDetailIds;
        return this;
    }
    public String getPatrolDetailIds() {
        return this.patrolDetailIds;
    }

    public UpdateIgnoreRiskBaseRequest setPatrolId(Long patrolId) {
        this.patrolId = patrolId;
        return this;
    }
    public Long getPatrolId() {
        return this.patrolId;
    }

}
