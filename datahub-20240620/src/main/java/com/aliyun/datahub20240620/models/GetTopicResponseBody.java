// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datahub20240620.models;

import com.aliyun.tea.*;

public class GetTopicResponseBody extends TeaModel {
    /**
     * <p>The topic description.</p>
     * 
     * <strong>example:</strong>
     * <p>test_comment</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>1724041098000</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The topic creator.</p>
     * 
     * <strong>example:</strong>
     * <p>1397493986831962</p>
     */
    @NameInMap("Creator")
    public String creator;

    /**
     * <p>Indicates whether multiple versions are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableSchemaRegistry")
    public Boolean enableSchemaRegistry;

    /**
     * <p>Indicates whether the extended mode is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ExpandMode")
    public Boolean expandMode;

    /**
     * <p>The lifecycle.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Lifecycle")
    public Integer lifecycle;

    /**
     * <p>The project name.</p>
     * 
     * <strong>example:</strong>
     * <p>test_project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The data schema for the TUPLE type.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;Type\&quot;:\&quot;STRING\&quot;,\&quot;AllowNull\&quot;:true,\&quot;Name\&quot;:\&quot;str\&quot;},{\&quot;Type\&quot;:\&quot;STRING\&quot;,\&quot;AllowNull\&quot;:true,\&quot;Name\&quot;:\&quot;dt\&quot;}]</p>
     */
    @NameInMap("RecordSchema")
    public String recordSchema;

    /**
     * <p>The topic type.</p>
     * 
     * <strong>example:</strong>
     * <p>TUPLE</p>
     */
    @NameInMap("RecordType")
    public String recordType;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A20A7093-8FE0-058C-BE0C-3C8057D5F1A1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of shards.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ShardCount")
    public Integer shardCount;

    /**
     * <p>The total storage of the topic.</p>
     * 
     * <strong>example:</strong>
     * <p>12252454</p>
     */
    @NameInMap("Storage")
    public Long storage;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The topic name.</p>
     * 
     * <strong>example:</strong>
     * <p>test_topic</p>
     */
    @NameInMap("TopicName")
    public String topicName;

    /**
     * <p>The last update time.</p>
     * 
     * <strong>example:</strong>
     * <p>1724041098000</p>
     */
    @NameInMap("UpdateTime")
    public String updateTime;

    public static GetTopicResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTopicResponseBody self = new GetTopicResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTopicResponseBody setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public GetTopicResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetTopicResponseBody setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public GetTopicResponseBody setEnableSchemaRegistry(Boolean enableSchemaRegistry) {
        this.enableSchemaRegistry = enableSchemaRegistry;
        return this;
    }
    public Boolean getEnableSchemaRegistry() {
        return this.enableSchemaRegistry;
    }

    public GetTopicResponseBody setExpandMode(Boolean expandMode) {
        this.expandMode = expandMode;
        return this;
    }
    public Boolean getExpandMode() {
        return this.expandMode;
    }

    public GetTopicResponseBody setLifecycle(Integer lifecycle) {
        this.lifecycle = lifecycle;
        return this;
    }
    public Integer getLifecycle() {
        return this.lifecycle;
    }

    public GetTopicResponseBody setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public GetTopicResponseBody setRecordSchema(String recordSchema) {
        this.recordSchema = recordSchema;
        return this;
    }
    public String getRecordSchema() {
        return this.recordSchema;
    }

    public GetTopicResponseBody setRecordType(String recordType) {
        this.recordType = recordType;
        return this;
    }
    public String getRecordType() {
        return this.recordType;
    }

    public GetTopicResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTopicResponseBody setShardCount(Integer shardCount) {
        this.shardCount = shardCount;
        return this;
    }
    public Integer getShardCount() {
        return this.shardCount;
    }

    public GetTopicResponseBody setStorage(Long storage) {
        this.storage = storage;
        return this;
    }
    public Long getStorage() {
        return this.storage;
    }

    public GetTopicResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetTopicResponseBody setTopicName(String topicName) {
        this.topicName = topicName;
        return this;
    }
    public String getTopicName() {
        return this.topicName;
    }

    public GetTopicResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

}
