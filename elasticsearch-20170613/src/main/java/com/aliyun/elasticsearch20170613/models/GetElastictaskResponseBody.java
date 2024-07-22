// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class GetElastictaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1D***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetElastictaskResponseBodyResult result;

    public static GetElastictaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetElastictaskResponseBody self = new GetElastictaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetElastictaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetElastictaskResponseBody setResult(GetElastictaskResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetElastictaskResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetElastictaskResponseBodyResultElasticExpansionTask extends TeaModel {
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

        public static GetElastictaskResponseBodyResultElasticExpansionTask build(java.util.Map<String, ?> map) throws Exception {
            GetElastictaskResponseBodyResultElasticExpansionTask self = new GetElastictaskResponseBodyResultElasticExpansionTask();
            return TeaModel.build(map, self);
        }

        public GetElastictaskResponseBodyResultElasticExpansionTask setCronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }
        public String getCronExpression() {
            return this.cronExpression;
        }

        public GetElastictaskResponseBodyResultElasticExpansionTask setElasticNodeCount(Integer elasticNodeCount) {
            this.elasticNodeCount = elasticNodeCount;
            return this;
        }
        public Integer getElasticNodeCount() {
            return this.elasticNodeCount;
        }

        public GetElastictaskResponseBodyResultElasticExpansionTask setReplicaCount(Integer replicaCount) {
            this.replicaCount = replicaCount;
            return this;
        }
        public Integer getReplicaCount() {
            return this.replicaCount;
        }

        public GetElastictaskResponseBodyResultElasticExpansionTask setTargetIndices(java.util.List<String> targetIndices) {
            this.targetIndices = targetIndices;
            return this;
        }
        public java.util.List<String> getTargetIndices() {
            return this.targetIndices;
        }

        public GetElastictaskResponseBodyResultElasticExpansionTask setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

    }

    public static class GetElastictaskResponseBodyResultElasticShrinkTask extends TeaModel {
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

        public static GetElastictaskResponseBodyResultElasticShrinkTask build(java.util.Map<String, ?> map) throws Exception {
            GetElastictaskResponseBodyResultElasticShrinkTask self = new GetElastictaskResponseBodyResultElasticShrinkTask();
            return TeaModel.build(map, self);
        }

        public GetElastictaskResponseBodyResultElasticShrinkTask setCronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }
        public String getCronExpression() {
            return this.cronExpression;
        }

        public GetElastictaskResponseBodyResultElasticShrinkTask setElasticNodeCount(Integer elasticNodeCount) {
            this.elasticNodeCount = elasticNodeCount;
            return this;
        }
        public Integer getElasticNodeCount() {
            return this.elasticNodeCount;
        }

        public GetElastictaskResponseBodyResultElasticShrinkTask setReplicaCount(Integer replicaCount) {
            this.replicaCount = replicaCount;
            return this;
        }
        public Integer getReplicaCount() {
            return this.replicaCount;
        }

        public GetElastictaskResponseBodyResultElasticShrinkTask setTargetIndices(java.util.List<String> targetIndices) {
            this.targetIndices = targetIndices;
            return this;
        }
        public java.util.List<String> getTargetIndices() {
            return this.targetIndices;
        }

        public GetElastictaskResponseBodyResultElasticShrinkTask setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

    }

    public static class GetElastictaskResponseBodyResult extends TeaModel {
        @NameInMap("elasticExpansionTask")
        public GetElastictaskResponseBodyResultElasticExpansionTask elasticExpansionTask;

        @NameInMap("elasticShrinkTask")
        public GetElastictaskResponseBodyResultElasticShrinkTask elasticShrinkTask;

        public static GetElastictaskResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetElastictaskResponseBodyResult self = new GetElastictaskResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetElastictaskResponseBodyResult setElasticExpansionTask(GetElastictaskResponseBodyResultElasticExpansionTask elasticExpansionTask) {
            this.elasticExpansionTask = elasticExpansionTask;
            return this;
        }
        public GetElastictaskResponseBodyResultElasticExpansionTask getElasticExpansionTask() {
            return this.elasticExpansionTask;
        }

        public GetElastictaskResponseBodyResult setElasticShrinkTask(GetElastictaskResponseBodyResultElasticShrinkTask elasticShrinkTask) {
            this.elasticShrinkTask = elasticShrinkTask;
            return this;
        }
        public GetElastictaskResponseBodyResultElasticShrinkTask getElasticShrinkTask() {
            return this.elasticShrinkTask;
        }

    }

}
