// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datahub20240620.models;

import com.aliyun.tea.*;

public class GetRecordsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("ShardId")
    public String shardId;

    /**
     * <strong>example:</strong>
     * <p>1769065251123</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_topic</p>
     */
    @NameInMap("TopicName")
    public String topicName;

    public static GetRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRecordsRequest self = new GetRecordsRequest();
        return TeaModel.build(map, self);
    }

    public GetRecordsRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public GetRecordsRequest setShardId(String shardId) {
        this.shardId = shardId;
        return this;
    }
    public String getShardId() {
        return this.shardId;
    }

    public GetRecordsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public GetRecordsRequest setTopicName(String topicName) {
        this.topicName = topicName;
        return this;
    }
    public String getTopicName() {
        return this.topicName;
    }

}
