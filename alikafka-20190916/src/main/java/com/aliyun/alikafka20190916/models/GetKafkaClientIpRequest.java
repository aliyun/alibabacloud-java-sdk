// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class GetKafkaClientIpRequest extends TeaModel {
    /**
     * <p>The end time of the query range. The value is a UNIX timestamp in milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1716343502000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The consumer group ID.</p>
     * <blockquote>
     * <p>This parameter is required if Type is set to byGroup.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>group_name</p>
     */
    @NameInMap("Group")
    public String group;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alikafka_post-cn-v0h1fgs2****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The start time of the query range. The value is a UNIX timestamp in milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1716343501000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The topic name.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter is required if Type is set to byTopic.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>topic_name</p>
     */
    @NameInMap("Topic")
    public String topic;

    /**
     * <p>The type of client IP address to query. Valid values:</p>
     * <ul>
     * <li>byInstance: Queries the client IP addresses within a specified time range for the instance. </li>
     * <li>byTopic: Queries the client IP addresses within a specified time range for the topic.</li>
     * <li>byGroup: Queries the client IP addresses within a specified time range for the group.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>byInstance</p>
     */
    @NameInMap("Type")
    public String type;

    public static GetKafkaClientIpRequest build(java.util.Map<String, ?> map) throws Exception {
        GetKafkaClientIpRequest self = new GetKafkaClientIpRequest();
        return TeaModel.build(map, self);
    }

    public GetKafkaClientIpRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetKafkaClientIpRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public GetKafkaClientIpRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetKafkaClientIpRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetKafkaClientIpRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public GetKafkaClientIpRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public GetKafkaClientIpRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
