// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class QueryMessageRequest extends TeaModel {
    /**
     * <p>The beginning of the time range to query. The value of this parameter is a UNIX timestamp in milliseconds.</p>
     */
    @NameInMap("BeginTime")
    public Long beginTime;

    /**
     * <p>The instance ID.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The consumer offset of the partition.</p>
     */
    @NameInMap("Offset")
    public String offset;

    /**
     * <p>The partition ID.</p>
     */
    @NameInMap("Partition")
    public String partition;

    /**
     * <p>The query type. Valid values:</p>
     * <br>
     * <p>*   byOffset: queries messages by offset. If you select this value, you must configure Partition and Offset.</p>
     * <p>*   byTimestamp: queries messages by time. If you select this value, you must configure BeginTime.</p>
     */
    @NameInMap("QueryType")
    public String queryType;

    /**
     * <p>The ID of the region where the resource resides.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The topic name.</p>
     */
    @NameInMap("Topic")
    public String topic;

    public static QueryMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMessageRequest self = new QueryMessageRequest();
        return TeaModel.build(map, self);
    }

    public QueryMessageRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public QueryMessageRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryMessageRequest setOffset(String offset) {
        this.offset = offset;
        return this;
    }
    public String getOffset() {
        return this.offset;
    }

    public QueryMessageRequest setPartition(String partition) {
        this.partition = partition;
        return this;
    }
    public String getPartition() {
        return this.partition;
    }

    public QueryMessageRequest setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }
    public String getQueryType() {
        return this.queryType;
    }

    public QueryMessageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public QueryMessageRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
