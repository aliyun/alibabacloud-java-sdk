// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datahub20240620.models;

import com.aliyun.tea.*;

public class CreateTopicRequest extends TeaModel {
    /**
     * <p>The description of the topic.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Test</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>Specifies whether to enable multi-version schema. After this feature is enabled, a topic can have multiple schemas. You can select one of the schemas for writing. The consumer automatically parses each record based on the version tag. If the schema for the corresponding version has been deleted, parsing fails.</p>
     * <blockquote>
     * <p>Enabling multi-version schema has the following impacts:</p>
     * </blockquote>
     * <ol>
     * <li>You can no longer use the appendFields operation.</li>
     * <li>You can create, delete, modify, and query schemas.</li>
     * <li>Connectors are created by using the schema of the latest version.</li>
     * </ol>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableSchemaRegistry")
    public Boolean enableSchemaRegistry;

    /**
     * <p>The expansion mode of the topic. After the expansion mode is enabled, shards support horizontal scaling and no longer support merge or split operations. The number of shards can only increase and cannot decrease. After this mode is enabled, you can consume the current topic by using Kafka.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ExpandMode")
    public Boolean expandMode;

    /**
     * <p>The lifecycle of the topic. Unit: days.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Lifecycle")
    public Integer lifecycle;

    /**
     * <p>The project name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xiaowutest</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The schema table structure.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;{\&quot;fields\&quot;:[{\&quot;name\&quot;:\&quot;field_init\&quot;,\&quot;type\&quot;:\&quot;STRING\&quot;,\&quot;notnull\&quot;:\&quot;false\&quot;}]}&quot;</p>
     */
    @NameInMap("RecordSchema")
    public String recordSchema;

    /**
     * <p>The topic type. Valid values:</p>
     * <ol>
     * <li><p>Blob: supports writing a block of binary data as a single record.</p>
     * </li>
     * <li><p>Tuple: supports database-like records where each record contains multiple columns. You must specify RecordSchema because data is transmitted over the network as strings and requires a schema to convert the data into the corresponding types.</p>
     * </li>
     * </ol>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TUPLE</p>
     */
    @NameInMap("RecordType")
    public String recordType;

    /**
     * <p>The number of shards.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("ShardCount")
    public Integer shardCount;

    /**
     * <p>The topic name.</p>
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
