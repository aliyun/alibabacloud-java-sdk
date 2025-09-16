// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class ClusterStage extends TeaModel {
    @NameInMap("CurrentStage")
    public Integer currentStage;

    @NameInMap("Message")
    public String message;

    @NameInMap("Status")
    public String status;

    @NameInMap("TotalStageWithWeight")
    public java.util.List<StageWithWeight> totalStageWithWeight;

    public static ClusterStage build(java.util.Map<String, ?> map) throws Exception {
        ClusterStage self = new ClusterStage();
        return TeaModel.build(map, self);
    }

    public ClusterStage setCurrentStage(Integer currentStage) {
        this.currentStage = currentStage;
        return this;
    }
    public Integer getCurrentStage() {
        return this.currentStage;
    }

    public ClusterStage setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ClusterStage setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ClusterStage setTotalStageWithWeight(java.util.List<StageWithWeight> totalStageWithWeight) {
        this.totalStageWithWeight = totalStageWithWeight;
        return this;
    }
    public java.util.List<StageWithWeight> getTotalStageWithWeight() {
        return this.totalStageWithWeight;
    }

}
