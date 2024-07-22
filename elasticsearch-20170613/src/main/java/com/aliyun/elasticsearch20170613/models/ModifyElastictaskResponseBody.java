// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ModifyElastictaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public ModifyElastictaskResponseBodyResult result;

    public static ModifyElastictaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyElastictaskResponseBody self = new ModifyElastictaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyElastictaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyElastictaskResponseBody setResult(ModifyElastictaskResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ModifyElastictaskResponseBodyResult getResult() {
        return this.result;
    }

    public static class ModifyElastictaskResponseBodyResultElasticExpansionTask extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0 0 0 ? * MON</p>
         */
        @NameInMap("cronExpression")
        public String cronExpression;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("elasticNodeCount")
        public Integer elasticNodeCount;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("replicaCount")
        public Integer replicaCount;

        @NameInMap("targetIndices")
        public java.util.List<String> targetIndices;

        /**
         * <strong>example:</strong>
         * <p>crontab</p>
         */
        @NameInMap("triggerType")
        public String triggerType;

        public static ModifyElastictaskResponseBodyResultElasticExpansionTask build(java.util.Map<String, ?> map) throws Exception {
            ModifyElastictaskResponseBodyResultElasticExpansionTask self = new ModifyElastictaskResponseBodyResultElasticExpansionTask();
            return TeaModel.build(map, self);
        }

        public ModifyElastictaskResponseBodyResultElasticExpansionTask setCronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }
        public String getCronExpression() {
            return this.cronExpression;
        }

        public ModifyElastictaskResponseBodyResultElasticExpansionTask setElasticNodeCount(Integer elasticNodeCount) {
            this.elasticNodeCount = elasticNodeCount;
            return this;
        }
        public Integer getElasticNodeCount() {
            return this.elasticNodeCount;
        }

        public ModifyElastictaskResponseBodyResultElasticExpansionTask setReplicaCount(Integer replicaCount) {
            this.replicaCount = replicaCount;
            return this;
        }
        public Integer getReplicaCount() {
            return this.replicaCount;
        }

        public ModifyElastictaskResponseBodyResultElasticExpansionTask setTargetIndices(java.util.List<String> targetIndices) {
            this.targetIndices = targetIndices;
            return this;
        }
        public java.util.List<String> getTargetIndices() {
            return this.targetIndices;
        }

        public ModifyElastictaskResponseBodyResultElasticExpansionTask setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

    }

    public static class ModifyElastictaskResponseBodyResultElasticShrinkTask extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>4 4 4 ? * WED</p>
         */
        @NameInMap("cronExpression")
        public String cronExpression;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("elasticNodeCount")
        public Integer elasticNodeCount;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("replicaCount")
        public Integer replicaCount;

        @NameInMap("targetIndices")
        public java.util.List<String> targetIndices;

        /**
         * <strong>example:</strong>
         * <p>crontab</p>
         */
        @NameInMap("triggerType")
        public String triggerType;

        public static ModifyElastictaskResponseBodyResultElasticShrinkTask build(java.util.Map<String, ?> map) throws Exception {
            ModifyElastictaskResponseBodyResultElasticShrinkTask self = new ModifyElastictaskResponseBodyResultElasticShrinkTask();
            return TeaModel.build(map, self);
        }

        public ModifyElastictaskResponseBodyResultElasticShrinkTask setCronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }
        public String getCronExpression() {
            return this.cronExpression;
        }

        public ModifyElastictaskResponseBodyResultElasticShrinkTask setElasticNodeCount(Integer elasticNodeCount) {
            this.elasticNodeCount = elasticNodeCount;
            return this;
        }
        public Integer getElasticNodeCount() {
            return this.elasticNodeCount;
        }

        public ModifyElastictaskResponseBodyResultElasticShrinkTask setReplicaCount(Integer replicaCount) {
            this.replicaCount = replicaCount;
            return this;
        }
        public Integer getReplicaCount() {
            return this.replicaCount;
        }

        public ModifyElastictaskResponseBodyResultElasticShrinkTask setTargetIndices(java.util.List<String> targetIndices) {
            this.targetIndices = targetIndices;
            return this;
        }
        public java.util.List<String> getTargetIndices() {
            return this.targetIndices;
        }

        public ModifyElastictaskResponseBodyResultElasticShrinkTask setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

    }

    public static class ModifyElastictaskResponseBodyResult extends TeaModel {
        @NameInMap("elasticExpansionTask")
        public ModifyElastictaskResponseBodyResultElasticExpansionTask elasticExpansionTask;

        @NameInMap("elasticShrinkTask")
        public ModifyElastictaskResponseBodyResultElasticShrinkTask elasticShrinkTask;

        public static ModifyElastictaskResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ModifyElastictaskResponseBodyResult self = new ModifyElastictaskResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ModifyElastictaskResponseBodyResult setElasticExpansionTask(ModifyElastictaskResponseBodyResultElasticExpansionTask elasticExpansionTask) {
            this.elasticExpansionTask = elasticExpansionTask;
            return this;
        }
        public ModifyElastictaskResponseBodyResultElasticExpansionTask getElasticExpansionTask() {
            return this.elasticExpansionTask;
        }

        public ModifyElastictaskResponseBodyResult setElasticShrinkTask(ModifyElastictaskResponseBodyResultElasticShrinkTask elasticShrinkTask) {
            this.elasticShrinkTask = elasticShrinkTask;
            return this;
        }
        public ModifyElastictaskResponseBodyResultElasticShrinkTask getElasticShrinkTask() {
            return this.elasticShrinkTask;
        }

    }

}
