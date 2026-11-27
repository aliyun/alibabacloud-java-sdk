// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class ClusterStage extends TeaModel {
    /**
     * <p>The ordinal number of the current execution stage.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("CurrentStage")
    public Integer currentStage;

    /**
     * <p>The execution information of the current stage.</p>
     * 
     * <strong>example:</strong>
     * <p>Creating resources</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The execution status of the current stage.</p>
     * 
     * <strong>example:</strong>
     * <p>CREATING</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The list of execution stages and their weights.</p>
     */
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
