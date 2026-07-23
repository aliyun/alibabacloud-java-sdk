// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class DeleteEventAnalysisJobRequest extends TeaModel {
    /**
     * <p>The identifier of the source resource.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Kafka&quot;:{&quot;RegionId&quot;:&quot;cn-hangzhou&quot;,&quot;InstanceId&quot;:&quot;alikafka_post-cn-xxx&quot;,&quot;Topic&quot;:&quot;my_topic&quot;}}</p>
     */
    @NameInMap("SourceResource")
    public DeleteEventAnalysisJobRequestSourceResource sourceResource;

    public static DeleteEventAnalysisJobRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEventAnalysisJobRequest self = new DeleteEventAnalysisJobRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEventAnalysisJobRequest setSourceResource(DeleteEventAnalysisJobRequestSourceResource sourceResource) {
        this.sourceResource = sourceResource;
        return this;
    }
    public DeleteEventAnalysisJobRequestSourceResource getSourceResource() {
        return this.sourceResource;
    }

    public static class DeleteEventAnalysisJobRequestSourceResourceKafka extends TeaModel {
        /**
         * <p>The instance ID of the Kafka instance.</p>
         * 
         * <strong>example:</strong>
         * <p>alikafka_post-cn-xxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The region of the Kafka instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The name of the Kafka topic.</p>
         * 
         * <strong>example:</strong>
         * <p>my_topic</p>
         */
        @NameInMap("Topic")
        public String topic;

        public static DeleteEventAnalysisJobRequestSourceResourceKafka build(java.util.Map<String, ?> map) throws Exception {
            DeleteEventAnalysisJobRequestSourceResourceKafka self = new DeleteEventAnalysisJobRequestSourceResourceKafka();
            return TeaModel.build(map, self);
        }

        public DeleteEventAnalysisJobRequestSourceResourceKafka setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DeleteEventAnalysisJobRequestSourceResourceKafka setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DeleteEventAnalysisJobRequestSourceResourceKafka setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

    public static class DeleteEventAnalysisJobRequestSourceResourceRocketMQ extends TeaModel {
        /**
         * <p>The instance ID of the RocketMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rmq-cn-xxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The type of the RocketMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Cloud_5</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The region of the RocketMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The name of the RocketMQ topic.</p>
         * 
         * <strong>example:</strong>
         * <p>my_topic</p>
         */
        @NameInMap("Topic")
        public String topic;

        public static DeleteEventAnalysisJobRequestSourceResourceRocketMQ build(java.util.Map<String, ?> map) throws Exception {
            DeleteEventAnalysisJobRequestSourceResourceRocketMQ self = new DeleteEventAnalysisJobRequestSourceResourceRocketMQ();
            return TeaModel.build(map, self);
        }

        public DeleteEventAnalysisJobRequestSourceResourceRocketMQ setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DeleteEventAnalysisJobRequestSourceResourceRocketMQ setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DeleteEventAnalysisJobRequestSourceResourceRocketMQ setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DeleteEventAnalysisJobRequestSourceResourceRocketMQ setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

    public static class DeleteEventAnalysisJobRequestSourceResource extends TeaModel {
        /**
         * <p>The Kafka data source.</p>
         */
        @NameInMap("Kafka")
        public DeleteEventAnalysisJobRequestSourceResourceKafka kafka;

        /**
         * <p>The RocketMQ data source.</p>
         */
        @NameInMap("RocketMQ")
        public DeleteEventAnalysisJobRequestSourceResourceRocketMQ rocketMQ;

        public static DeleteEventAnalysisJobRequestSourceResource build(java.util.Map<String, ?> map) throws Exception {
            DeleteEventAnalysisJobRequestSourceResource self = new DeleteEventAnalysisJobRequestSourceResource();
            return TeaModel.build(map, self);
        }

        public DeleteEventAnalysisJobRequestSourceResource setKafka(DeleteEventAnalysisJobRequestSourceResourceKafka kafka) {
            this.kafka = kafka;
            return this;
        }
        public DeleteEventAnalysisJobRequestSourceResourceKafka getKafka() {
            return this.kafka;
        }

        public DeleteEventAnalysisJobRequestSourceResource setRocketMQ(DeleteEventAnalysisJobRequestSourceResourceRocketMQ rocketMQ) {
            this.rocketMQ = rocketMQ;
            return this;
        }
        public DeleteEventAnalysisJobRequestSourceResourceRocketMQ getRocketMQ() {
            return this.rocketMQ;
        }

    }

}
