// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datahub20240620.models;

import com.aliyun.tea.*;

public class CreateTopicRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Test</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableSchemaRegistry")
    public Boolean enableSchemaRegistry;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ExpandMode")
    public Boolean expandMode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Lifecycle")
    public Integer lifecycle;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xiaowutest</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <strong>example:</strong>
     * <p>&quot;{\&quot;fields\&quot;:[{\&quot;name\&quot;:\&quot;field_init\&quot;,\&quot;type\&quot;:\&quot;STRING\&quot;,\&quot;notnull\&quot;:\&quot;false\&quot;}]}&quot;</p>
     */
    @NameInMap("RecordSchema")
    public String recordSchema;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TUPLE</p>
     */
    @NameInMap("RecordType")
    public String recordType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("ShardCount")
    public Integer shardCount;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>adsb_cat021</p>
     */
    @NameInMap("TopicName")
    public String topicName;

    public static CreateTopicRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTopicRequest self = new CreateTopicRequest();
        return TeaModel.build(map, self);
    }

    public CreateTopicRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateTopicRequest setEnableSchemaRegistry(Boolean enableSchemaRegistry) {
        this.enableSchemaRegistry = enableSchemaRegistry;
        return this;
    }
    public Boolean getEnableSchemaRegistry() {
        return this.enableSchemaRegistry;
    }

    public CreateTopicRequest setExpandMode(Boolean expandMode) {
        this.expandMode = expandMode;
        return this;
    }
    public Boolean getExpandMode() {
        return this.expandMode;
    }

    public CreateTopicRequest setLifecycle(Integer lifecycle) {
        this.lifecycle = lifecycle;
        return this;
    }
    public Integer getLifecycle() {
        return this.lifecycle;
    }

    public CreateTopicRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateTopicRequest setRecordSchema(String recordSchema) {
        this.recordSchema = recordSchema;
        return this;
    }
    public String getRecordSchema() {
        return this.recordSchema;
    }

    public CreateTopicRequest setRecordType(String recordType) {
        this.recordType = recordType;
        return this;
    }
    public String getRecordType() {
        return this.recordType;
    }

    public CreateTopicRequest setShardCount(Integer shardCount) {
        this.shardCount = shardCount;
        return this;
    }
    public Integer getShardCount() {
        return this.shardCount;
    }

    public CreateTopicRequest setTopicName(String topicName) {
        this.topicName = topicName;
        return this;
    }
    public String getTopicName() {
        return this.topicName;
    }

}
