// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datahub20240620.models;

import com.aliyun.tea.*;

public class PutRecordsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Records")
    public java.util.List<PutRecordsRequestRecords> records;

    /**
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("ShardId")
    public String shardId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_topic</p>
     */
    @NameInMap("TopicName")
    public String topicName;

    public static PutRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        PutRecordsRequest self = new PutRecordsRequest();
        return TeaModel.build(map, self);
    }

    public PutRecordsRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public PutRecordsRequest setRecords(java.util.List<PutRecordsRequestRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<PutRecordsRequestRecords> getRecords() {
        return this.records;
    }

    public PutRecordsRequest setShardId(String shardId) {
        this.shardId = shardId;
        return this;
    }
    public String getShardId() {
        return this.shardId;
    }

    public PutRecordsRequest setTopicName(String topicName) {
        this.topicName = topicName;
        return this;
    }
    public String getTopicName() {
        return this.topicName;
    }

    public static class PutRecordsRequestRecords extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{&quot;key1&quot;:&quot;val1&quot;,&quot;key2&quot;:&quot;val2&quot;}</p>
         */
        @NameInMap("Attributes")
        public java.util.Map<String, String> attributes;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;aa&quot;, &quot;bb&quot;, &quot;12&quot;, &quot;12.34&quot;]</p>
         */
        @NameInMap("Data")
        public java.util.List<String> data;

        public static PutRecordsRequestRecords build(java.util.Map<String, ?> map) throws Exception {
            PutRecordsRequestRecords self = new PutRecordsRequestRecords();
            return TeaModel.build(map, self);
        }

        public PutRecordsRequestRecords setAttributes(java.util.Map<String, String> attributes) {
            this.attributes = attributes;
            return this;
        }
        public java.util.Map<String, String> getAttributes() {
            return this.attributes;
        }

        public PutRecordsRequestRecords setData(java.util.List<String> data) {
            this.data = data;
            return this;
        }
        public java.util.List<String> getData() {
            return this.data;
        }

    }

}
